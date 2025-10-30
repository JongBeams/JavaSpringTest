package io.jongbeom.springboot.intellij.testproject01.game;

public class PacManGame implements GamingConsole {

    public  void up(){
        System.out.println("go up!");
    }

    public  void down(){
        System.out.println("go down!");
    }

    public  void left(){
        System.out.println("go left!");
    }

    public  void right(){
        System.out.println("go right!");
    }
}
