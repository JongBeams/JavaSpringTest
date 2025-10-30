package io.jongbeom.springboot.intellij.testproject01;

import io.jongbeom.springboot.intellij.testproject01.game.PacManGame;
import io.jongbeom.springboot.intellij.testproject01.game.gameRunner;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;

public class App02GamingBasicJava {

    public static void main(String[] args) {
        // 1. 스프링 컨텍스트(Context) 실행

        var context = new AnnotationConfigApplicationContext(HelloWorldConfiguration.class);
        // HelloWorldConfiguration class를 컨택스트 하기 위한 구현체
        // 빈을 등록·스캔하고 애플리케이션 컨텍스트를 부팅

        // 2. 스프링 프레임워크가 구성을 관리하도록 설정
        // 설정방식 1. 설정(Configuration) 클래스 생성 - @Configuration
        // 설정방식 2. 설정(Configuration) 클래스에 name -@Bean 메서드 생성
        // 설정방식 3. 설정(Configuration) 클래스를 사용하여 스프링 컨텍스트(Context) 실행

        //spring에서 Bean 이름 검색하여 호출
        System.out.println(context.getBean("name"));
        System.out.println(context.getBean("age"));


        System.out.println(context.getBean("person"));
        System.out.println(context.getBean("address2"));
        
        //Class로도 호출 가능
        System.out.println(context.getBean(Address.class));

        System.out.println(context.getBean("person2MethodCall"));

        System.out.println(context.getBean("person3Parameters"));





    }
}
