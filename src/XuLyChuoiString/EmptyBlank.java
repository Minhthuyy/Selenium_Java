package XuLyChuoiString;

public class EmptyBlank {
    public static void main(String[] args) {

        String chuoi1 = "";
        String chuoi2 = "                    ";

        if (chuoi2.isEmpty() == true) {
            System.out.println("Rỗng");
        } else {
            System.out.println("Không rỗng");
        }

        if (chuoi2.isBlank() == true) {
            System.out.println("Rỗng");
            System.out.println("Testcase bị failed, tại vì nó không chứa text nào cả");
        } else {
            System.out.println("Không rỗng và có chứa ký tự khác khoảng trắng");
            System.out.println("Testcase passed");
        }
    }
}

//Nếu hệ thống chấp nhân khoảng trắng : isEmpty() - Khi đó nếu isEmpty trả ra true thì testcase failed
//Nếu hệ thống KHÔNG chấp nhận khoảng trắng : isBlank() - Khi đó nếu isBlank trả ra true thì testcase failed
