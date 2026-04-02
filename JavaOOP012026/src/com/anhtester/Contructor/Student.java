package com.anhtester.Contructor;

public class Student {

    public int id;
    public String name;
    public int age;
    public String gender;

    //Hàm xây dựng có tên trùng với tên Class
    //Không có void, không có kiểu trả về
    //Hàm xây dựng dùng để khởi tạo giá trị ban đầu cho các thuộc tính trong class
    //Hoặc dùng để xử lý trước 1 công việc gì đó: Khởi tạo browser, mở url, kết nối database, connect APT để get token, v.v...

    public Student() {
        //Hàm xây dựng mặc định (default constructor)
        this.id = 001;
        this.name = "Nga";
    }

    public Student(int id, String name) {
        this.id = id;
        this.name = name;
    }

    public Student(int id, String name, int age, String gender) {
        this.id = id;
        this.name = name + " - Lớp: CNTT2026A1";
        this.age = age;
        this.gender = gender;
    }


    public void displayInfo() {
        System.out.println("ID: " + id);
        System.out.println("Name: " + name);
        System.out.println("Age: " + age);
        System.out.println("Gender: " + gender);
    }
}
