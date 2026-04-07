package com.anhtester.TinhTruuTuong;

public abstract class DemoAbstractClass {

    //Giống interface - Khi có dùng từ khoá abstract
    abstract public void enterEmail(String email);
    abstract public void enterPassword(String password);

    //Khác interface
    public void clickLoginButton(){
        System.out.println("Click vào nút login");
    }
}
