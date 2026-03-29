package SwitchCase;

public class CauLenhSwitchCase {

    public static void main(String[] args) {

        String browser = "Edge";

        switch (browser) {
            case "chrome":
                System.out.println("Khởi tạo trình duyệt Chrome");
                //WebDriver driver = new ChromeDriver();
                break;
            case "Edge":
                System.out.println("Khởi tạo trình duyệt Edge");
                //WebDriver driver = new EdgeDriver();
                break;
            case "Firefox":
                System.out.println("Khởi tạo trình duyệt Firefox");
                break;
            default:
                System.out.println("Khởi tạo trình duyệt Chrome");
        }
    }
}
