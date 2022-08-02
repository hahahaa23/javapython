package com.dip.dip.mamber;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;


@Configuration
public class MemberConfig {

	@Bean
	public MemberDao memberDao() {
		return new MemberDao();
	} //자동주입
}
