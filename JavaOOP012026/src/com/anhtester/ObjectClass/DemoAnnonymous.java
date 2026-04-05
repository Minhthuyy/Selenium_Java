package com.anhtester.ObjectClass;

import com.anhtester.Contructor.LoginPage;

public class DemoAnnonymous {

    public static void main(String[] args) {


        new LoginPage().loginCRM("customer@example.com", "123456");
        new LoginPage().verifyLoginFailed();

        LoginPage loginPage = new LoginPage();
        loginPage.loginCRM("customer@example.com", "123456");
        loginPage.verifyLoginFailed();

    }
}
