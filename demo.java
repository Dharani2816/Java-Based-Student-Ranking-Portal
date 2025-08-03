//Program to create a student grade management site
import java.util.Scanner;

class demo {

    public static void main(String args[]) {
        Scanner scanner = new Scanner(System.in);
        int n;
        System.out.print("Enter the no of students:");
        n = scanner.nextInt();
        student[] s = new student[n];
        for (int i = 0; i < n; i++) {
            s[i] = new student(i + 1, scanner);
        }
        double class_avg = 0.0;
        for (int i = 0; i < n; i++) {
            class_avg += (float) s[i].get_total();
        }
        class_avg /= (double) 5 * n;
        int nop = 0;
        for (int i = 0; i < n; i++) {
            if (s[i].isPass()) {
                nop++;
            }
        }
        int nof = n - nop;
        double pp = (double) nop / n;
        pp = pp * 100.0;

        int[][] rank = new int[n][2];
        String arr[] = new String[n];
        for (int i = 0; i < n; i++) {
            if (s[i].isPass()) {
                rank[i][0] = s[i].get_total();
                rank[i][1] = s[i].regNo;
                arr[i] = s[i].name;
            } else {
                rank[i][0] = 0;
                rank[i][1] = 0;
            }
        }
        int temp1, temp2;
        String temp3;
        for (int i = 0; i < n; i++) {
            for (int j = i + 1; j < n; j++) {
                if (rank[i][0] < rank[j][0]) {
                    temp1 = rank[i][0];
                    temp2 = rank[i][1];
                    rank[i][0] = rank[j][0];
                    rank[i][1] = rank[j][1];
                    rank[j][0] = temp1;
                    rank[j][1] = temp2;
                    temp3 = arr[i];
                    arr[i] = arr[j];
                    arr[j] = temp3;
                }
            }
        }

        for (int i = 0; i < n; i++) {
            System.out.println("Student " + (i + 1) + " details:");
            System.out.println("Total:" + s[i].get_total());
            s[i].displayGrade();
            System.out.println();
        }
        System.out.println("Class Average:" + class_avg);
        System.out.println("Pass percentage:" + pp + "%");
        System.out.println("No of failures:" + nof);

        System.out.println();
        System.out.println("_______Rank list_______");
        System.out.println();
        System.out.printf("%-6s| %-20s| %-18s| %-12s\n", "Rank", "Student name", "Register No", "Total Marks");
        System.out.println("_____________________________________________________________________");

        for (int i = 0; i < n; i++) {
            if (rank[i][1] != 0) {
                System.out.printf("  %-4d| %-20s| %-18d| %-12d\n", (i + 1), arr[i], rank[i][1], rank[i][0]);
                System.out.println("_____________________________________________________________________");
            }
        }

    }
}

class student {

    String name;
    int regNo;
    int marks[] = new int[5];
    int total;
    String grade[] = new String[5];
    boolean pf;

    student(int a, Scanner scanner) {
        total = 0;
        scanner.nextLine();
        System.out.print("Enter student " + a + " name:");
        name = scanner.nextLine();
        System.out.print("Enter Register no:");
        regNo = scanner.nextInt();
        System.out.println("Enter the marks of  " + name + " in Fithe subjects :");
        for (int i = 0; i < 5; i++) {
            int b;
            System.out.print("Subject "+(i+1)+" : ");
            b = scanner.nextInt();
            if (b >= 0 && b <= 100) {
                marks[i] = b;
            } else {
            
                while(! ((b >= 0 && b <= 100)))
               { System.out.print("Re enter Enter marks between 0-100:");
                b = scanner.nextInt();
                marks[i] = b;
            }
            }
            total += marks[i];
        }
        for (int i = 0; i < 5; i++) {
            if (marks[i] > 90 && marks[i] <= 100) {
                grade[i] = "O";
            } else if (marks[i] > 80 && marks[i] <= 90) {
                grade[i] = "A+";
            } else if (marks[i] > 70 && marks[i] <= 80) {
                grade[i] = "A";
            } else if (marks[i] > 60 && marks[i] <= 70) {
                grade[i] = "B+";
            } else if (marks[i] > 50 && marks[i] <= 60) {
                grade[i] = "B";
            } else {
                grade[i] = "F";
            }
        }

    }

    int get_total() {
        return total;
    }

    void displayGrade() {
        for (int i = 0; i < 5; i++) {
            System.out.print(grade[i] + " ");
        }
        System.out.println();
    }

    boolean isPass() {
        pf = true;
        for (int i = 0; i < 5; i++) {
            if (grade[i].equals("F")) {
                pf = false;
            }
        }
        return pf;
    }
}
