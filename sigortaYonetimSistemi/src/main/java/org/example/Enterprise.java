package org.example;

public class Enterprise extends Account{

    @Override
    public boolean login(String email, String password) throws Exception {
        return super.login(email, password);
    }
}
