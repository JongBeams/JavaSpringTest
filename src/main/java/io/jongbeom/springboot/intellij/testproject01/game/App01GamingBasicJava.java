package io.jongbeom.springboot.intellij.testproject01.game;

public class App01GamingBasicJava {

    public static void main(String[] args) {
        //var game = new MarioGame();
        //var game = new superContraGame();
        var game = new PacManGame();    //1: 객체생성

        //var gameRunner = new gameRunner(marioGame);
        var gameRunner = new gameRunner(game);
        // 2.객체 생성 + 종속성 연결
        // game(GamingConsole)은 gameRunner 클래스의 의존성
        gameRunner.run();





    }
}
