package web_develop_master_package.part2.chap2;

public class Subject {

    String subjectName;
    int score;
    int subjectCode;

    public void setSubject(String subjectName, int score) {
        this.subjectName = subjectName;
        this.score = score;
    }

    public int getScore() {
        System.out.println(score);
        return score;
    }

    public String getSubjectName() {
        System.out.println(subjectName);
        return subjectName;
    }
}
