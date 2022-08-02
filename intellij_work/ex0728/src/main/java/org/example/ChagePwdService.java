package org.example;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;

public class ChagePwdService {

    @Autowired
    private MemberDao memberDao;

    public void chpwd(){memberDao.update();}


}


