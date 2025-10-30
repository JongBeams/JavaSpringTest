package io.jongbeom.springboot.intellij.testproject01.helloworld;

import org.springframework.context.annotation.AnnotationConfigApplicationContext;

import java.util.Arrays;

public class App02GamingBasicJava {

    public static void main(String[] args) {
        // 1. 스프링 컨텍스트(Context) 실행

        //try를 이용한 예외 처리 및 컨텍스트 닫기 자동화
        //catch를 사용한 예외 처리는 나중에 진행
        try(var context = new AnnotationConfigApplicationContext(HelloWorldConfiguration.class)){

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
            //address3 생성으로 Bean 내 Address가 2개라 실행 불가능
            System.out.println(context.getBean(Person.class));
            //HelloWorldConfiguration에서 Bean 우선순위 부여로 실행 가능

            //Spring Bean 내에서 메소드 호출 가능
            System.out.println(context.getBean("person2MethodCall"));

            //Spring Bean 자동연결 확인
            System.out.println(context.getBean("person3Parameters"));

            //정의된 모든 bean 이름 반환
            Arrays.stream(context.getBeanDefinitionNames()).forEach(System.out::println);  //stream, 메서드 참조 활용

            //정의된 모든 bean 갯수 반환
            System.out.println("count : "+ context.getBeanDefinitionCount());

            //프라이머리 등록
            System.out.println(context.getBean("person4Parameters"));

            //qualifier 의존도 주입
            System.out.println(context.getBean("person5qualifier"));


        }





    }
}
