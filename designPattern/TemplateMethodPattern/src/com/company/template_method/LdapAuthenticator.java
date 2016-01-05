package com.company.template_method;

/**
 * Created by HSH on 2016. 1. 5..
 */
public class LdapAuthenticator extends Authenticator {

    @Override
    public Auth authenticate(String id, String pw) {
        return super.authenticate(id, pw);
    }

    @Override
    protected boolean doAuthenticate(String id, String pw) {
        return IdapClient.authenticate(id, pw);
    }

    @Override
    protected Auth createAuth(String id) {
        return new Auth(id);
    }
}
