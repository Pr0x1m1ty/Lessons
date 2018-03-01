package homework1;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class LoginToFacebook {

    public static void main(String[] args) {
        WebDriver driver = new ChromeDriver();

        driver.get("https://www.facebook.com/");
        driver.findElement(By.cssSelector("[name = 'email']")).clear();
        driver.findElement(By.cssSelector("[name = 'email']")).sendKeys("proximity88@gmail.com");

        driver.findElement(By.cssSelector("[name = 'pass']")).clear();
        driver.findElement(By.cssSelector("[name = 'pass']")).sendKeys("sato1366613");
        //driver.findElement(By.cssSelector("[name = 'pass']")).sendKeys(Keys.ENTER);

        driver.findElement(By.cssSelector(".uiButton input")).click();

        System.out.println(driver.getTitle());
        driver.close();


    }
}
