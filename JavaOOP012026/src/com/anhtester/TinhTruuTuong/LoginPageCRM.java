package com.anhtester.TinhTruuTuong;

public class LoginPageCRM implements LoginActions {

    @Override
    public void enterEmail(String email) {
        System.out.println("Nhập email: " + email);
    }

    @Override
    public void enterPassword(String password) {
        System.out.println("Nhập password: " + password);
    }

    @Override
    public void clickLoginButton() {
        System.out.println("Click vào nút Login" + clickLoginButton();
    }

    public void verifyLoginSuccess(){
        System.out.println("Login Success");
    }

    public void verifyLoginFailed(){
        System.out.println("Login Failed");
    }



}
