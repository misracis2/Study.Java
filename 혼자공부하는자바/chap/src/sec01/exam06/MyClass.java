package sec01.exam06;

public class MyClass {

    ReomteControl rc = new Television();

    MyClass() {

    }
    //생성자의 매개변수로 사용가능
    MyClass(ReomteControl rc){
        this.rc = rc;
        rc.turnOn();
        rc.setVolume(5);
    }
    //메소드의 로컬변수로 사용가능
    void methodA(){
        ReomteControl rc = new Audio();
        rc.turnOn();
        rc.turnOff();

    }

    //메소드의 매개변수로 사용가능
    void methodB(ReomteControl rc) {
        rc.turnOn();
        rc.turnOff();
    }
}
