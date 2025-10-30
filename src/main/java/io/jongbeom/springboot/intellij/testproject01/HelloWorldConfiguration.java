package io.jongbeom.springboot.intellij.testproject01;

import org.springframework.context.annotation.Bean;
//@Bean 기능 사용을 위한 import
import org.springframework.context.annotation.Configuration;
// 클래스가 하나 이상의 @bean 메서드를 선언함으로서 생성됨
// @bean : 스프링에서 관리하는것들을 spring bean으로 정의


//JDK 16 추가 기능
//getter setter 생성자 자동 생성 기능을 가진 class
record  Person (String name, int age, Address address){};

record  Address (String firstLine, String city){};

@Configuration
public class HelloWorldConfiguration {


    //spring context에 객체 이름 부여
    @Bean
    public String name(){
        return  "JangJongBeom";

    }

    @Bean
    public int age(){
        return  30;

    }

    @Bean
    public Person person(){
        //var person = new Person("Beams",25);
        //person.name();
        //person.age();
        //return  person;
        return new Person("Beams",25,new Address("수성구 수성로","대구 광역시"));
    }

    @Bean
    public Person person2MethodCall(){
        return new Person(name(),age(),address());  // 종속관계 Bean 생성
    }


    @Bean
    public Person person3Parameters(String name, int age,Address address2){  //name, age, address2
        return new Person(name, age, address2);  // 종속관계 Bean 생성
    }



    @Bean(name ="address2") //특성 추가로 Bean 호출명 변경 가능
    public Address address(){
        return  new Address("광진구 광나루로..","서울 특별시");
    }


}
