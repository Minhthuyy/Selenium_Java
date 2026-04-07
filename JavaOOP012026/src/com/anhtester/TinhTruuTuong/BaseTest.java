package com.anhtester.TinhTruuTuong;

public class BaseTest implements BrowserFactory, CommonActions{


    private String driver;
    private boolean headless;
    private boolean incognito;

    public BaseTest(boolean incognito, boolean headless, String driver) {
        this.incognito = incognito;
        this.headless = headless;
        this.driver = driver;
    }

    public String getDriver() {
        return driver;
    }

    @Override
    public void createBrowser() {
        System.out.println("Tạo browser mặc định: " + driver);
    }

    @Override
    public void createBrowser(String browserName) {
        System.out.println("Tạo browser: " + browserName);
    }

    @Override
    public void closeBrowser() {
        System.out.println("Đóng browser: " + driver);
    }

    @Override
    public void setupWindowSize(String width, String height) {
        System.out.println("Thiết lập kích thước cửa sổ: " + width + "x" + height);
    }

    @Override
    public void clickElement() {

    }

    @Override
    public void clickElement(String elementName) {

    }

    @Override
    public void setText(String text, String elementName) {

    }

    @Override
    public String getText(String element) {
        return "";
    }

    @Override
    public void selectDropdown(String dropdownName, String option) {

    }
}
