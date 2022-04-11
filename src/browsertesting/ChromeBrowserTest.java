package browsertesting;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import java.time.Duration;

public class ChromeBrowserTest {

    public static void main(String[] args) {
        //Launching browser
        String baseUrl = "https://opensource-demo.orangehrmlive.com/";
        System.setProperty("webdriver.chrome.driver","drivers/chromedriver.exe");
        WebDriver driver = new ChromeDriver();
        driver.get(baseUrl);

        //Maximize the page
        driver.manage().window().maximize();
        // Implicitly time out
        driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(20));
        //Title
        String title = driver.getTitle();
        System.out.println("Title = " +title);

        //Get current URL
        System.out.println("Current URL = " + driver.getCurrentUrl());
        System.out.println(driver.getPageSource());

        //Find email field element
        driver.findElement(By.id("txtUsername")).sendKeys("rinky@gmail.com");
        driver.findElement(By.name("txtPassword")).sendKeys("rinky123");

        driver.close();

    }

}
