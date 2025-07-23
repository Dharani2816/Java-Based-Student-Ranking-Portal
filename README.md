#  🎓 Student Marks Processing System (Java)

    A beginner-level Java project that accepts student details, calculates grades and totals, and 
    displays a ranked list of passed students. Ideal for academic practice and learning Java OOP concepts.

---

# ✨ Features

    - ✅ Input for student name, register number, and marks in 5 subjects 

    - 📊 Calculates total marks and assigns grades (O, A+, A, B+, B, F)

    - 🎯 Determines pass/fail based on subject-wise performance 

    - 📈 Computes class average and pass percentage
    
    - 🏆 Displays a clean, sorted rank list for passed students using `printf`

---

## 🛠️ Technologies Used

    - Java (Standard Edition)

    - Console-based input/output (`Scanner`)

    - Arrays, classes, and basic sorting

---

## 📦 How to Run

    1.Compile the Java code:
    
    javac demo.java

    2.Run the program:

    java demo

📂 Project Structure

    ├── demo.java         # Main class with student ranking logic
    └── student class     # Handles student data, grades, and total
🧪 Sample Output

    Enter the no of students: 2
    Enter student 1 name: Alice
    Enter Register no: 1001
    Enter the marks of Alice in Five Subjects:
    90 85 80 75 70

    Enter student 2 name: Bob
    Enter Register no: 1002
    Enter the marks of Bob in Five Subjects:
    95 88 92 90 85

    Student 1 details:
    Total:400
    O A+ A A B+

    Student 2 details:
    Total:450
    O A+ O O A+

    Class Average:85.0
    Pass percentage:100.0%
    No of failures:0

    _______Rank list_______

    Rank  | Student name         | Register No       | Total Marks
    _____________________________________________________________________
    1     | Bob                  | 1002              | 450
    _____________________________________________________________________
    2     | Alice                | 1001              | 400
    _____________________________________________________________________
📌 Notes

    ⚠️ This is a basic, non-optimized version for practice and learning.

    🚫 No exception handling or advanced input validation.

    🧩 Future improvements can include:


👤 Author

    Dharani Kumar

    B.E. Computer Science and Engineering
    
    Madras Institute of Technology (MIT)
