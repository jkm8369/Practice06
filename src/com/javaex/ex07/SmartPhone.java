package com.javaex.ex07;

public class SmartPhone extends MusicPhone {
    
    public void execute(String str){
        
        if("앱".equals(str)) {
        	AppRun();
        } else if("음악".equals(str)) {
        	playMusic();
        } else if("통화".equals(str)) {
        	call();
        }
        
    }
 
    //메소드작성
    
    //메소드작성
    
    public void AppRun() {
    	System.out.println("앱실행");
    }
    
    public void playMusic() {
    	System.out.println("다운로드해서 음악재생");
    }
    
    public void call() {
    	System.out.println("통화기능시작");
    }
    
    
}
