package ch04;

public class Student {

    int studentId;
    String studentName;
    String address;

    public void showStudentInfo() {
        System.out.println("학번은 = "+studentId);
        System.out.println("이름은 = "+studentName);
        System.out.println("주소는 = "+address);
    }

    public String getStudentName() {
        return studentName;
    }

    public void setStudentName(String name) {
        studentName = name;
    }
}
