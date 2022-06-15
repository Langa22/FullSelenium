package MyTests;

import io.github.bonigarcia.wdm.WebDriverManager;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import java.util.List;

public class Navigate {
    public static void main(String[] args) throws InterruptedException {
        WebDriverManager.chromedriver().setup();
        WebDriver driver = new ChromeDriver();
        driver.manage().window().maximize();
        //driver.get("https://www.snapdeal.com");
        driver.get("https://www.amazon.com");
        WebElement e= driver.findElement(By.xpath("//*[@id=\"twotabsearchtextbox\"]"));
        //e.sendKeys("cell phones");
        WebElement footer=driver.findElement(By.xpath("//*[@id=\"navFooter\"]//a"));
        System.out.println(footer.getText());

        List<WebElement> footer1=driver.findElements(By.xpath("//*[@id=\"navFooter\"]//a"));
        System.out.println(footer1.size());
        for(WebElement ele:footer1){
            System.out.println(ele.getText());
        }
        /*driver.navigate().back();//Navigate back to snapdeal
        driver.navigate().forward();//Navigating forward to amazon
        driver.navigate().refresh();//Refreshing the page.
        //driver.wait(1000);
        driver.quit();*/
    }
}
