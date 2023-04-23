package web_develop_master_package.part2.chap2;

public class BirthdayTest {
    public static void main(String[] args) {

        Birthday date = new Birthday();
        date.setYear(2023);
        date.setMonth(12);
        date.setDay(22);

        date.showDate();
    }
}
