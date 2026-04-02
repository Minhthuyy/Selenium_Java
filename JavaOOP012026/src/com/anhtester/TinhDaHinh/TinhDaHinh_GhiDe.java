package com.anhtester.TinhDaHinh;

public class TinhDaHinh_GhiDe extends TinhDaHinh_NapChong{

    public static void clickElement(){
        System.out.println("Clicking on element in child class");
    }

    public static void main(String[] args) {
        clickElement();
    }
}
