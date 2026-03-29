package DataCollections;

import StaticJava.ConfigData;

import java.util.HashMap;
import java.util.Map;
import java.util.TreeMap;

public class MapDemo {
    public static void main(String[] args) {

        //Dạng key - value

        //Khai báo Map
        Map<String, String> map = new TreeMap<>();

        //Thêm phần tử vào Map
        map.put("browser", "chrome");
        map.put("os", "windows");
        map.put("headless", "true");
        map.put("browser", "edge");
        map.put("screenshot", "true");

        //In dữ liệu trong Map
        //Truy xuất giá trị theo từng key
        System.out.println(map.get("os"));


        System.out.println("======================================");
        //get hết giá trị của key và value
        for (Map.Entry<String, String> entry : map.entrySet()) {
            System.out.println(entry.getKey() + ":" + entry.getValue());
        }

        //xoa phần tử theo key
        System.out.println("======================================");
        map.remove("headless");
        for (Map.Entry<String, String> entry : map.entrySet()) {
            System.out.println(entry.getKey() + ":" + entry.getValue());

        }

        //Kiểm tra Key và Value trong Map
        System.out.println("Check key: " + map.containsKey("headless")); //Trả về true nếu Map có chứa key "headless", ngược lại trả về false
        System.out.println("Check value: " + map.containsValue("edge")); //Trả về true nếu Map có chứa value "edge", ngược lại trả về false

        System.out.println("======================================");
        if (map.containsKey("browser") == true) {
            System.out.println(map.get("browser"));
        } else {
            System.out.println(ConfigData.browser);
        }
    }
}
