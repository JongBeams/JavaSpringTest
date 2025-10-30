package io.jongbeom.springboot.intellij.testproject01;

import org.springframework.boot.SpringApplication;
import io.jongbeom.springboot.intellij.testproject01.game.MarioGame;
import io.jongbeom.springboot.intellij.testproject01.game.gameRunner;

public class AppGamingBasicJava {

    public static void main(String[] args) {
        var marioGame = new MarioGame();
        var gameRunner = new gameRunner(marioGame);
        gameRunner.run();


    }
}
