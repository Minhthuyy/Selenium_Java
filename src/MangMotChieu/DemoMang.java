package MangMotChieu;

public class DemoMang {

    public static void main(String[] args) {

        //Khai báo mảng một chiều

        //Mảng kiểu số nguyên (int)

        int mangSoNguyen[] = new int[3]; //Độ dài mảng là 3 phần tử

        //Thêm giá trị vào mảng
        //Vị trí bắt đầu là 0
        mangSoNguyen[0] = 5;
        mangSoNguyen[1] = 10;
        mangSoNguyen[2] = 20;

        System.out.println("Vị trí thứ hai: " + mangSoNguyen[1]);

        //Duyệt mảng dùng vòng lặp FOR
        for (int i = 0; i < mangSoNguyen.length; i++) {
            System.out.println(mangSoNguyen[i]);
        }

        System.out.println("==================================");

        //Vừa khai báo mảng + vừa khởi tạo giá trị cho mảng
        //Không cần quan tâm kích cỡ của mảng ban đầu
        int mang2[] = new int[]{5, 10, 20, 25, 30, 35, 40};

        System.out.println(mang2[4]);

        System.out.println("==================================");

        for (int i = 0; i < mang2.length; i++) {
            System.out.println(mang2[i]);
            //CÒn phải so sánh giá trị trong mảng với giá trị mong muốn từ excel/JSon,...
            //lặp và duyệt để tìm kiếm giá trị trong mảng, nếu có thì trả về vị trí của phần tử đó trong mảng
        }


        System.out.println("==================================");
        for (int bien1 : mang2) {
            System.out.println(bien1);
            //dùng để duyệt mảng, không cần quan tâm đến vị trí của phần tử trong mảng
        }
    }
}
