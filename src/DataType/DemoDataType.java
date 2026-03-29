package DataType;

public class DemoDataType {
    public static void main(String[] args) {

        String name = "Selenium Java";
        String gioiTinh = "Nam";
        String kiTuChuoi = "&";

        char kiTu1 = '#';
        char kiTu2 = '@';
        char kiTu3 = '&';
        char kiTu4 = '$';

        //Kiểu dữ liệu chỉ lưu SỐ NGUYÊN
        byte number1 = 0;
        short number2 = 32000;
        int number3 = 2100000000; //Thường dùng trong test auto
        long number4 = 3000000000L;


        //Kiểu dữ liệu chỉ lưu SỐ THỰC
        float laiSuatNganHang = 5.2F;
        double soPi = 3.14963590759; //Thường dùng trong test auto

        //Kiểu dữ liệu ĐÚNG SAI
        boolean check = true;
        boolean result = false;
        String actual = "Login successfully";
        String expected = "Login success";
        boolean checkCondition = actual.equals(expected);

        //Kiểu kí tự -> char chỉ lưu 1 kí tự. Xài khi setup cờ bật/cờ tắt
        char kiTu = 'a';
        char isDeleted = '1';

        //ví dụ so sánh chuỗi kí tự
        boolean checkGia  = ((String.valueOf(number2) + kiTu4).equals("32000$")); //ép char về chuỗi + kí tự -> so sánh chuỗi thì dùng equal
        System.out.println(checkGia);

        System.out.println(number1 + number2);
        System.out.println(number2);
        System.out.println(number3);
        System.out.println(number4);
        System.out.println(laiSuatNganHang);
        System.out.println(soPi);
        System.out.println(checkCondition);

    }

}
