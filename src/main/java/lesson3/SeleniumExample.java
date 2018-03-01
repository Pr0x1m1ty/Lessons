package lesson3;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class SeleniumExample {

    public static void main(String[] args) {

        WebDriver driver = new ChromeDriver();

        driver.get("https://www.google.com/");
        driver.get("https://www.facebook.com/");
        System.out.println("Current url: " + driver.getCurrentUrl());

        driver.navigate().back();
        System.out.println("After .back() URL: " + driver.getCurrentUrl());

        driver.navigate().forward();
        System.out.println("After .forward() URL: " + driver.getCurrentUrl());




    }

}
