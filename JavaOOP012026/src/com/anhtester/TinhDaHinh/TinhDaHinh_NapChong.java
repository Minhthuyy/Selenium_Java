package com.anhtester.TinhDaHinh;

public class TinhDaHinh_NapChong {

    public static void clickElement(){
        System.out.println("Clicking on element");6
    }

    public static void clickElement(double second){
        System.out.println("Clicking on element with timeout" + second);
    }

    public static void clickElement(String elementName){
        System.out.println("Clicking on element " + elementName);
    }

    public static void clickElement(String elementName, double second){
        System.out.println("Clicking on element " + elementName + "with timeout " + second);
    }

    public static void setText(String text, double second) {
        System.out.println("Set text on element: " + text + "with timeout" + second);
    }

    public static String setText() {
        System.out.println("Get text on element");
        return "";
    }

    public static String getText() {
        System.out.println("Get text on element");
        return "";
    }

}
