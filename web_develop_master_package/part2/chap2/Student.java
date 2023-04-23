package web_develop_master_package.part2.chap2;

public class Student {

    String StudentId;
    String StudentName;

    Subject subject;

    public Subject getSubject() {
        return subject;
    }

    public Student(String studentId, String studentName) {
        this.StudentId = studentId;
        this.StudentName = studentName;

        subject = new Subject();
    }


}
