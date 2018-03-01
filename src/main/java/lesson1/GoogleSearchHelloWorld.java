package lesson1;


import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class GoogleSearchHelloWorld {
    public static void main(String[] args) throws InterruptedException {
        //System.setProperty("webdriver.chrome.driver", "/Users/paulpuntus/webDrivers/chromedriver");
        WebDriver driver = new ChromeDriver();

        driver.get("https://www.google.com" );
        driver.findElement(By.cssSelector("[name='q']")).clear();
        driver.findElement(By.cssSelector("[name='q']")).sendKeys("Hello World!");
        driver.findElement(By.cssSelector("[name='q']")).sendKeys(Keys.ENTER);

        driver.findElement(By.cssSelector(".g h3 a")).click();

        System.out.println(driver.getTitle());
        Thread.sleep(4000);
        driver.close();




    }

}
