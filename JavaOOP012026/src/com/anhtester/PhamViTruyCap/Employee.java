package com.anhtester.PhamViTruyCap;

import java.util.Locale;

public class Employee {

    //Phạm vi truy cập private: chỉ có thể truy cập trong class này

    private  String name;
    private  int age;

    public Employee(String name, int age) {
        this.name = name;
        this.age = age;
    }

    public void getInfo(){
        System.out.println("Name: " + name.toUpperCase());
        System.out.println("Age: " + age);
    }
}
