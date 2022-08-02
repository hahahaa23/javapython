package com.dip.org.member;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;
import org.springframework.stereotype.Service;

@Service
public class MemberService {
	
	@Autowired
	private MemberDao memberDao;

	public void newMember(MemberDto memberDto) {
		//MainController클래스의 ms.newMember(new MemberDto("홍길동","aa@naver.com","1234"));
		//new MemberDto에 ctrl + 1하면 생성가능
//		memberDao.getSelectByEmail(memberDto.getEmail());
		memberDao.insert(memberDto);
		
	}
	public void printMember() {
		memberDao.selectall()
		.forEach(m->System.out.println(m));
	}
	
	

}
