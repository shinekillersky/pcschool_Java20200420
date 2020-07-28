package com.myjava.ocp.lab16.user.exception;

public class UserLoginFailException extends UserException {
   
    public UserLoginFailException(String string) {
        super(string);
    }
    
    public void how2do() { // 怎麼辦
        System.out.println("請重新登入");
    }
}
