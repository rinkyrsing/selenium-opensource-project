package browsertesting;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

import java.time.Duration;

public class FirefoxBrowserTest {
    public static void main(String[] args) {
        //Launching the browser
        System.setProperty("webdriver.gecko.driver","drivers/geckodriver.exe");
        WebDriver driver = new FirefoxDriver();

        String baseUrl = "https://opensource-demo.orangehrmlive.com/";
        driver.get(baseUrl);

        driver.manage().window().maximize();
        driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(20));
        String title = driver.getTitle();
        System.out.println("Title: " + title);

        //Current Url
        System.out.println("Current URL = " + driver.getCurrentUrl());

        System.out.println(driver.getPageSource());

        driver.findElement(By.id("txtUsername")).sendKeys("rinky@gmail.com");
        driver.findElement(By.name("txtPassword")).sendKeys("rinky123");

        //to close
        driver.close();





    }
}
