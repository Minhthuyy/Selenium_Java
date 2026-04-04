package com.anhtester.TinhKeThua;

public class Student extends Person {

    private String address;
    private float weight;

    public Student(String name, int age, String address, float height, float weight) {
        super(name, age, height); //Gọi constructor của lớp cha (Person)
    }


    //2 hàm này của class Student
    public String getAddress(){
        return address;
    }

    public Float getWeight(){
        return weight;
    }

    public void testGetInfoOfStudent() {
        Person person = new Person("Anhtester", 30, 1.75f);
        person.getInfo();

        getInfo(); //Gọi phương thức của lớp cha (Person)
    }


    public void testTinhDiemTrungBinh(){
        getInfo();
    }



}
