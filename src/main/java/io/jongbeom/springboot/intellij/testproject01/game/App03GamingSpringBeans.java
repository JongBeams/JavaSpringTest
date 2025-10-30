package io.jongbeom.springboot.intellij.testproject01.game;

import io.jongbeom.springboot.intellij.testproject01.helloworld.HelloWorldConfiguration;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;

public class App03GamingSpringBeans {

    public static void main(String[] args) {

        try(var context =
                    new AnnotationConfigApplicationContext(GameConfiguration.class)){

            //System.out.println(context.getBean(GamingConsole.class));
            context.getBean(GamingConsole.class).up();

            context.getBean(gameRunner.class).run();
        }




    }
}
