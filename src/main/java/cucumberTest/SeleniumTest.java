package cucumberTest;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class SeleniumTest {

/*    Launch the Browser
    Navigate to Home Page
    Click on the LogIn link
    Enter UserName and Password
    Click on Submit button
    Print a successful message
    LogOut from the application
    Print a successful message
    Close the Browser*/
    public static void main(String[] args){

        System.setProperty("webdriver.chrome.driver", "C:\\Users\\akshay\\Downloads\\chromedriver_win32\\chromedriver.exe");
        WebDriver driver = new ChromeDriver();
        driver.get("https://demoqa.com/login");
        driver.findElement(By.id("userName")).sendKeys("Akshay359");
        driver.findElement(By.id("password")).sendKeys("Akshay@359");
        driver.findElement(By.id("login")).click();
        System.out.println("Login Successfully");
        driver.findElement(By.xpath("//div[@class='text-right col-md-5 col-sm-12']//button[@id='submit']")).click();
        System.out.println("logout Successful");





    }
}
