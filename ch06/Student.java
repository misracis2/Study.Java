package ch06;

public class Student {

    public int studentNumber;
    public String studentName;
    public int grade;

    public Student(int studentNumber, String studentName, int grade) {
        this.studentNumber = studentNumber;
        this.studentName = studentName;
        this.grade = grade;
    }

    public String showStudentInfo() {
        return studentName + " 학생의 학번은 " + studentNumber + " 학년은 " + grade + "입니다.";
    }
}
