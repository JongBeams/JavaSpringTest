package io.jongbeom.springboot.intellij.testproject01.game;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;



@Configuration
public class GameConfiguration {

    @Bean
    public GamingConsole game(){
        var game = new PacManGame();
        return game;
        //return new PacManGame();
    }

    @Bean
    public gameRunner gamerunner(GamingConsole game){
        var gameRunner = new gameRunner(game);
        return gameRunner;
        //return new gameRunner(game);
    }


}
