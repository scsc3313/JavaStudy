package com.company.template_method;

import javax.naming.NamingException;

public class Authenticator {

    public Auth authenticate(String id, String pw) throws NamingException {
        if(! doAuthenticate(id, pw))
            throw createException();

        return createAuth(id);
    }

    private RuntimeException createException() {
        return new AuthException();
    }

    protected boolean doAuthenticate(String id, String pw) {
        return false;
    }

    protected Auth createAuth(String id) throws NamingException {
        return new Auth(id);
    }


}
