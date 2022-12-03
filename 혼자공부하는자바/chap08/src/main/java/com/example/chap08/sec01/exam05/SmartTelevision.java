package com.example.chap08.sec01.exam05;

import com.example.chap08.sec01.exam02.exam04.ReomteControl;

public class SmartTelevision implements ReomtControl, Searchable{
    private int volume;

    @Override
    public void turnOn() {
        System.out.println("TV를 켭니다");
    }

    @Override
    public void turnOff() {
        System.out.println("TV를 끕니다");
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
        System.out.println("현재 TV 보륨:"+this.volume);
    }

    @Override
    public void search(String url) {
        System.out.println(url+"을 검색합니다");
    }
}
