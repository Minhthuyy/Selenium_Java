package DataCollections;

import java.util.*;

public class SetDemo {
    public static void main(String[] args) {

        //- Lưu trữ giá trị duy nhất, không cho phép trùng lặp
        //- Không cho phép lưu theo vị trí, không có thứ tự

        Set<String> setTabBrowser = new TreeSet<>(Collections.reverseOrder());

        setTabBrowser.add("abc123456");
        setTabBrowser.add("xyz123456789");
        setTabBrowser.add("def123456");
        setTabBrowser.add("ghi12345OIU213291U");

        //iN RA
        for (String tab : setTabBrowser) {
            System.out.println(tab);
        }

//        List<String> list = new ArrayList<>(setTabBrowser); //Chuyển Set thành List
//        Collections.sort(list); //Sắp xếp List theo thứ tự tăng dần
//
//        for (String tab : list) {
//            System.out.println(tab);
//        }


        System.out.println("==================================");
        System.out.println(setTabBrowser.contains("abc123456"));

        System.out.println("==================================");
        System.out.println(setTabBrowser.remove("def123456")); //Xóa phần tử khỏi Set, trả về true nếu xóa thành công, ngược lại trả về false
        for (String tab : setTabBrowser) {
            System.out.println(tab);


        }
    }
}
