package com.company.nomal;

import com.company.template_method.Auth;

/**
 * Created by HSH on 2016. 1. 5..
 */
public class LdapAuthenticator {

    public Auth authenticate(String id, String pw){
        //사용자 정보로 인증 확인

        // 인증 실패시 인잭션 발생

        // 인증 성공시, 정보 제공
        return new Auth(id);
    }
}
