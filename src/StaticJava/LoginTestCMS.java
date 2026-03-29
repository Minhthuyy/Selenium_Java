package StaticJava;

import PhuongThuc.Page.LoginPage;

public class LoginTestCMS {

    //public String browser = "Chrome";

    public void test01_LoginSuccess() {

        System.out.println(ConfigData.browser);
        System.out.println(ConfigData.window_size);

        System.out.println("Test success");
        LoginPage loginPage = new LoginPage();
        loginPage.loginSuccess("admin@example.com", "123456");

    }

    public void test02_LoginFailedWithEmailInvalid() {

        System.out.println(ConfigData.browser);
        System.out.println(ConfigData.window_size);

        System.out.println("Test Fail");
        LoginPage loginPage = new LoginPage();
        loginPage.loginSuccess("admin123@example.com", "123456");

    }
}
