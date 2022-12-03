package sec01.exam05;

public class SmartTelevisionExample {
    public static void main(String[] args) {

        SmartTelevision tv = new SmartTelevision();

        ReomtControl rc = tv;
        rc.turnOn();
        rc.setVolume(5);
        rc.turnOff();

        Searchable searchable = tv;
        searchable.search("naver.com");
    }
}
