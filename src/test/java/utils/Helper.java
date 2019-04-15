package utils;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

public class Helper {
    private static WebDriver driver;

    public Helper(WebDriver webDriver) {
        this.driver = webDriver;
    }

    public static void login(String username, String password){
        // click authentication button
        driver.findElement(By.xpath("/html/body/header/nav/ul[1]/li[1]/div/a[1]")).click();

        sleep(2000);

        // enter username
        driver.findElement(By.xpath("//*[@id=\"modal-txt-signin-email\"]")).sendKeys(username);

        // enter password
        driver.findElement(By.xpath("//*[@id=\"modal-txt-signin-password\"]")).sendKeys(password);

        // press login button
        driver.findElement(By.xpath("//*[@id=\"modal-theLoginForm\"]/button")).click();
    }

    public static void sleep(int time) {
        try {
            Thread.sleep(time);
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
    }

}
