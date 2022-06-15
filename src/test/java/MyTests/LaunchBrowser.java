package MyTests;

import io.github.bonigarcia.wdm.WebDriverManager;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import java.sql.Driver;

public class LaunchBrowser {
    public static void main(String[] args) {
        System.setProperty("webdriver.chrome.driver","C://Users//CMDQ123//Downloads//chromedriver_win32 (1)//chromedriver.exe");
        WebDriver driver = new ChromeDriver();
        driver.get("https://frontend.nopcommerce.com/");
        //driver.manage().window().maximize();
        WebElement search= driver.findElement(By.id("searchterms"));
        search.sendKeys("phones");
        System.out.println("The tittle of the page is "+driver.getTitle());
        System.out.println("Current url of the page is "+driver.getCurrentUrl());
    }

}
