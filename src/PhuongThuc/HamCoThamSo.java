package PhuongThuc;

public class HamCoThamSo {
    public int cong2so(int number1, int number2) {
        return number1 + number2;
    }

    public void loginTestValidCredentical(String email, String password) {
        System.out.println("Navigate to url...");
        System.out.println("Enter email: " + email);
        System.out.println("Enter password: " + password);
        System.out.println("Click Login button");
        System.out.println("Verify login success");
    }

    public void loginTestWithEmailInvalid(String email, String password) {
        System.out.println("Navigate to url...");
        System.out.println("Enter email: " + email);
        System.out.println("Enter password: " + password);
        System.out.println("Click Login button");
        System.out.println("Verify login failed");
    }


    public static void main(String[] args) {

        HamCoThamSo object1 = new HamCoThamSo();
        System.out.println(object1.cong2so(25, 10));

        object1.loginTestValidCredentical("abc@gmail.com", "123456789");
        System.out.println("==========================");
        object1.loginTestWithEmailInvalid("abc@", "123");
        System.out.println("==========================");

    }
}


//Cách đặt tên hàm trong java phù hợp cho test auto
//cách gọi hàm sử dụng ở tab khacs
//cho tôi những checklist
//ca