package com.anhtester.TinhTruuTuong;

public class UseAbstractClass extends DemoAbstractClass {
    @Override
    public void enterEmail(String email) {

    }

    @Override
    public void enterPassword(String password) {

    }

    public void testLoginHRM(){
        enterEmail("admin@example.com"); //Khai báo nội dung lại
        enterPassword("123456");
        clickLoginButton(); //Gọi trực tiếp sử dụng
    }

    public static void main(String[] args) {
        UseAbstractClass useAbstractClass = new UseAbstractClass();
        useAbstractClass.testLoginHRM();
    }
}
