package org.example;


import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;


@Configuration
public class AppCtx {

    @Bean
    public Memberservice memberservice(){
        return new Memberservice();
    }

    @Bean
    public MemberDao memberDao1(){
        return new MemberDao();
    }

    @Bean
    public MemberDao memberDao2(){
        return new MemberDao();
    }

    @Bean
    public ChagePwdService chagePwdService(){
        return new ChagePwdService();
    }
}
