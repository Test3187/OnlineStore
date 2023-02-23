package stepDefinition;

import cucumber.api.PendingException;
import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;


public class Test_Steps {
    public static WebDriver driver;

    @Given("^User is on Home Page$")
    public void user_is_on_Home_Page() throws PendingException  {
        // Write code here that turns the phrase above into concrete actions
        System.setProperty("webdriver.chrome.driver", "C://Users//akshay//Downloads//chromedriver_win32//chromedriver.exe");
         driver = new ChromeDriver();
        driver.get("https://demoqa.com/login");

    }

    @When("^User Navigate to LogIn Page$")
    public void user_Navigate_to_LogIn_Page() throws PendingException  {
        // Write code here that turns the phrase above into concrete actions

    }

    @When("^User enters UserName and Password$")
    public void user_enters_UserName_and_Password() throws PendingException  {
        // Write code here that turns the phrase above into concrete actions
        driver.findElement(By.id("userName")).sendKeys("Akshay359");
        driver.findElement(By.id("password")).sendKeys("Akshay@359");
        driver.findElement(By.id("login")).click();
    }

    @Then("^Message displayed Login Successfully$")
    public void message_displayed_Login_Successfully() throws PendingException  {
        // Write code here that turns the phrase above into concrete actions
        System.out.println("Login Successfully");
    }

    @When("^User LogOut from the Application$")
    public void user_LogOut_from_the_Application() throws PendingException  {
        // Write code here that turns the phrase above into concrete actions
        driver.findElement(By.xpath(".//*[@id='account_logout']/a")).click();
    }

    @Then("^Message displayed LogOut Successfully$")
    public void message_displayed_LogOut_Successfully() throws PendingException  {
        // Write code here that turns the phrase above into concrete actions
        System.out.println("LogOut Successfully");

    }



}
