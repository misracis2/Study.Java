package sec01.exam02.exam04;

public interface ReomteControl {
    int MAX_VOLUME = 10;
    int MIN_VOLUME = 0;


    void turnOn();
    void turnOff();
    void setVolume(int volume);
}
