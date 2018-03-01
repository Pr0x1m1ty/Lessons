package homework3;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import java.util.List;

public class Bilet {

    public static void main(String[] args) {


        WebDriver driver = new ChromeDriver();

        driver.get("http://liniakino.com/showtimes/aladdin/");
        driver.findElement(By.xpath("//*[@id='closeButton']")).click();
        driver.findElement(By.xpath("//*[@class='showtime-movie']//a[contains(@href,'6203')]/../..//*[@class='showtime-item']/a")).click();


        WebElement iframeElem = driver.findElement(By.xpath("//*[@id='vkino-widget']/iframe"));
        driver.switchTo().frame(iframeElem);

        List<WebElement> seats = driver.findElements(By.xpath("//*[@id='hall-scheme-container']//*[contains(@id,'hseat')]"));
        int countSeats = seats.size();


        List<WebElement> seatsFree = driver.findElements(By.xpath("//*[@id='hall-scheme-container']//*[contains(@class,'seat-color1')]"));
        int countFreeSeats = seatsFree.size();
        double percFree = (double)countFreeSeats / (double)countSeats * 100;


        List<WebElement> ocupiedSeats = driver.findElements(By.xpath("//*[@id='hall-scheme-container']//*[contains(@class,'seat-occupied')]"));
        int countOcupiedSeats = ocupiedSeats.size();
        double percOcup = (double)countOcupiedSeats / (double)countSeats * 100;

        System.out.println("Total seats = " + countSeats);
        System.out.println("Free seats = " + countFreeSeats);
        System.out.println("Ocupied seats = " + countOcupiedSeats);
        System.out.println("% Свободных = " + percFree +"%");
        System.out.println("% Занятых = " + percOcup + "%");





        driver.quit();
    }



}





