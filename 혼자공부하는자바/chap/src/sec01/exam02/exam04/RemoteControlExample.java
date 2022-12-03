package sec01.exam02.exam04;

public class RemoteControlExample {
    public static void main(String[] args) {
        ReomteControl rc;

        rc = new Television();

        rc.turnOn();
        rc.setVolume(5);
        rc.turnOff();
        //RemoteControl 타입으로 자동타입변환 되었기 때문에 재정의 메소드만 사용할 수 있다
        //Television으로 강제 타입 변환해야 Television타입 메소드 사용 가능
        ((Television) rc).alarm();

    }
}
