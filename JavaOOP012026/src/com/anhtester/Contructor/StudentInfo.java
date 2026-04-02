package com.anhtester.Contructor;

public class StudentInfo {
    public static void main(String[] args) {

        Student student1 = new Student(111, "Thuý", 26, "Nữ");
        student1.displayInfo();


        System.out.println("-----------------------------");

        Student student2 = new Student();
        student2.displayInfo();

        System.out.println("-----------------------------");

        Student student3 = new Student(222, "An", 25, "Nữ");
        student3.displayInfo();

        System.out.println("-----------------------------");

        Student student4 = new Student(333, "Cường");
        student4.displayInfo();



    }
}
