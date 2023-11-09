package org.example;

import java.util.ArrayList;
import java.util.List;

public abstract class Account {
    User user;
    AuthenticationStatus status=AuthenticationStatus.FAIL;
    List<Insurance> sigortas= new ArrayList<>();


    public final void showUserInfo(){

    }
    public boolean login(String email, String password) throws Exception {
        if(user.getEmail().equals(email) && user.getSifre().equals(password)){
            status=AuthenticationStatus.SUCCESS;
        }else {
            throw new Exception("Kullanıcı adı veya şifreniz yanlış !");
        }
        return true;
    }
}
