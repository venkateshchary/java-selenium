import java.io.IOException;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeOptions;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.Test;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;



public class Wallethubtest {


        public static void main(String[] args) throws IOException, InterruptedException {
                System.setProperty("webdriver.chrome.driver", "/usr/bin/chromedriver");
                ChromeOptions chromeOptions = new ChromeOptions();
                chromeOptions.addArguments("--no-sandbox");
                String URL = "https://wallethub.com/join/light";
                String username = "WITCHER@gmail.com";
                String password = "GERALD@B7";
                String reviews_url = "http://wallethub.com/profile/test_insurance_company/2"   
                WebDriver driver = new ChromeDriver(chromeOptions);
                driver.get(URL);
                Thread.sleep(1000);
                driver.findElement(By.xpath("//input[@placeholder='Email Address']")).sendKeys(username);
                driver.findElement(By.xpath("//input[@placeholder='Password']")).sendKeys(password);
                driver.findElement(By.xpath("//input[@placeholder='Confirm Password']")).sendKeys(password);
                Thread.sleep(3000);
                WebElement cityField = driver.findElement(By.cssSelector("div.full.left.ng-animate-enabled.basic-trans.enter"));
                cityField.click();
                driver.findElement(By.cssSelector("button.btn.blue.touch-element-cl")).click();
                Thread.sleep(10000);
                driver.quit();
        }
}
