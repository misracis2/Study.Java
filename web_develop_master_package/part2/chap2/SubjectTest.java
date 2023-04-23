package web_develop_master_package.part2.chap2;

public class SubjectTest {
    public static void main(String[] args) {

        Student lee = new Student("20120202", "Lee");
        lee.getSubject().setSubject("국어", 85);
        lee.getSubject().getSubjectName();
        lee.getSubject().getScore();

        Student kim = new Student("20181245", "Kim");
        kim.getSubject().setSubject("국어", 70);
        kim.getSubject().getSubjectName();
        kim.getSubject().getScore();


    }
}
