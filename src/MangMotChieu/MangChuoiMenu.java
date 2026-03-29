package MangMotChieu;

public class MangChuoiMenu {
    public static void main(String[] args) {

        String menuList[] = new String[]{"Dashboard", "Customers", "Projects", "Tasks"};

        boolean checkMenu = false;

        for (String menu : menuList) {
            System.out.println(menu);

            if (menu.equals("Customer123")) {
                checkMenu = true;
                break; //Thoát luôn vòng lặp FOR, ko kiểm tra tiếp
            }
        }

        if (checkMenu == true) {
            System.out.println("Có chứa menu Projects.");
        } else {
            System.out.println("KHÔNG tồn tại menu Projects.");
        }
    }
}
