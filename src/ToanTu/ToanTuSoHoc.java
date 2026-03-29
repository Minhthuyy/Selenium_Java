package ToanTu;

public class ToanTuSoHoc {
    public  static void main(String[] args) {

        int Price = 12; //Dùng automation để lưu
        //Click để tăng 5 lần
        int totalPrice  = Price * 5; //Dùng automation để lưu lần 2

        //So sánh (Price*5) == totalPrice => True/False => TCs passed/falsed

        int a = 10;
        int b = 20;

        System.out.println(a % b);
        //a++; //Tăng a lên 1 đơn vị, tương ứng a = a + 1
        System.out.println(a);

        b *= 5; //b = b * 5
        System.out.println(b);
   }
}
