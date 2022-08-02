package org.example;

import org.springframework.context.annotation.AnnotationConfigApplicationContext;

public class Main {
    public static void main(String[] args) {

        System.out.println("Hello world!");

        AnnotationConfigApplicationContext acac
                = new AnnotationConfigApplicationContext(AppCtx.class);
        //AnnotationConfigApplicationContext = 객체담는 통
        //Memberservice, MemberDao가 AnnotationConfigApplicationContext안에 들어있음.

        Memberservice ms = acac.getBean(Memberservice.class);
        ms.regist(); //Memberservice의 regigst호출
        ms.getall(); //Memberservice의 getall호출

        ChagePwdService cs = acac.getBean(ChagePwdService.class);
        cs.chpwd();
        acac.close();
    }
}