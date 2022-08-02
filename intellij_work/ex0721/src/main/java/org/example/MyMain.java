package org.example;

import org.springframework.context.annotation.AnnotationConfigApplicationContext;

import java.awt.*;
import java.text.Annotation;

public class MyMain {
    public static void main(String[] args) {

        Greeter g1 = new Greeter();
        Greeter g2 = new Greeter();

        System.out.println(g1);
        System.out.println(g2);
        System.out.println(g1==g2);
//원래하던 자바 문법,

        AnnotationConfigApplicationContext acac =
                new AnnotationConfigApplicationContext(AppContext.class);

        Greeter g3  = acac.getBean(Greeter.class);
        Greeter g4  = acac.getBean(Greeter.class);
        //메모리가 부족할때, static영역 많이 언급될때 컴 느려짐.
        //getBean = 객체를 가리키는 통
        System.out.println(g3);
        System.out.println(g4);
        System.out.println(g3==g4);
        //spring 통안에 있는 Greeter객체를 당겨와서 사용, 싱글톤
        // 객체

        acac.close();
    }
}
