package DataCollections;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class ListDemo {
    public static void main(String[] args) {

//        - Cho phép lưu trữ giá trị trùng
//        - Dữ liệu có thứ tự vị trí


        //Khai báo List dạng 1
        List<String> listMenu = new ArrayList<>();

        //Khai báo List dạng 2
        ArrayList<String> listMenu3 = new ArrayList<>();

        //Thêm phần tử vào List
        listMenu.add("Dashboard");
        listMenu.add("Customers");
        listMenu.add("Projects");
        listMenu.add("Tasks");
        listMenu.add("Dashboard");
        listMenu.add("Contracts");
        listMenu.add("Projects");

        //Get phần tử tại vị trí chỉ định
        System.out.println("************************************");
        System.out.println(listMenu.get(2)); //Trả về phần tử tại vị trí chỉ định (bắt đầu vị trí là 0)


        //Duyệt hết List
        for (String menu : listMenu) {
            System.out.println(menu);
        }

        System.out.println("==================================");
        listMenu.add("Reports"); //Thêm phần tử mới với giá trị chỉ định

//        //Thêm phần tử mới vào vị trí chỉ định (bắt đầu vị trí là 0)
        listMenu.add(7, "Supports");


        for (String menu : listMenu) {
            System.out.println(menu);
        }

        System.out.println("==================================");
        listMenu.remove("Dashboard"); //Xóa phần tử theo gi trị "Dashboard" khỏi List
        for (String menu : listMenu) {
            System.out.println(menu);
        }


        System.out.println("==================================");
        //Kiểm tra giá trị trong List
        System.out.println("Kiểm tra menu Reports: " + listMenu.contains("Reports")); //Trả về true nếu List có chứa phần tử "Projects", ngược lại trả về false


        System.out.println("************************************");
        //So sánh 2 List
        List<String> listMenu2 = new ArrayList<>();
        listMenu2.add("Dashboard");
        listMenu2.add("Customers");
        listMenu2.add("Projects");
        listMenu2.add("Tasks");
        listMenu2.add("Dashboard");
        listMenu2.add("Contracts");
        listMenu2.add("Projects");


        //Duyệt hết list
        for (String menu : listMenu2) {
            System.out.println(menu);
        }

        System.out.println("************************************");
        System.out.println("So sánh 2 list: " + listMenu.equals(listMenu2)); //Trả về true nếu 2 List có cùng phần tử và cùng thứ tự, ngược lại trả về false


        //Sắp xếp List theo thứ tự tăng dần
        Collections.sort(listMenu);

        for (String menu : listMenu) {
            System.out.println(menu);
        }

    }

}
