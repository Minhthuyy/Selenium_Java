package Variables;

public class DemoVariable2 {

    public String name = "Minh Thúy"; //Biến toàn cục

    public static int age = 26; //đây là biến static

//    Đây là cấu trúc của 1 hàm
    public void getInfo1(){
        String address = "Huế"; //Biến local

        System.out.println(address);
        System.out.println(name);
    }

    public void getInfo2(){
        String address = "Hà Nội"; //Biến local
        System.out.println(address);
        System.out.println(name);
    }

    public static void main(String[] args) {
        System.out.println(age); //gọi trực tiếp
        System.out.println(DemoVariable2.age); //Gọi thông qua tên Class

        //Phải thông qua đối tượng Class thì mới gọi thông qua biến toàn cục
        DemoVariable2 demo2 = new DemoVariable2();
        demo2.getInfo1();
        demo2.getInfo2();
        System.out.println(demo2.name);

    }


}
