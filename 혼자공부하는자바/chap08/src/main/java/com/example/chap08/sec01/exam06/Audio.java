package com.example.chap08.sec01.exam06;

public class Audio implements ReomteControl {

    private int volume;

    @Override
    public void turnOn() {
        System.out.println("Audio를 켭니다");
    }

    @Override
    public void turnOff() {
        System.out.println("Audio를 끕니다");
    }

    @Override
    public void setVolume(int volume) {
        if(volume > ReomteControl.MAX_VOLUME) {
            this.volume = ReomteControl.MAX_VOLUME;
        }else if(volume < ReomteControl.MIN_VOLUME) {
            this.volume = ReomteControl.MIN_VOLUME;
        }else{
            this.volume = volume;
        }
        System.out.println("현재 Audio 보륨:"+this.volume);
    }
}
