package io.jongbeom.springboot.intellij.testproject01;

import io.jongbeom.springboot.intellij.testproject01.game.PacManGame;
import io.jongbeom.springboot.intellij.testproject01.game.superContraGame;
import org.springframework.boot.SpringApplication;
import io.jongbeom.springboot.intellij.testproject01.game.MarioGame;
import io.jongbeom.springboot.intellij.testproject01.game.gameRunner;

public class AppGamingBasicJava {

    public static void main(String[] args) {
        //var game = new MarioGame();
        //var game = new superContraGame();
        var game = new PacManGame();

        //var gameRunner = new gameRunner(marioGame);
        var gameRunner = new gameRunner(game);
        gameRunner.run();


    }
}
