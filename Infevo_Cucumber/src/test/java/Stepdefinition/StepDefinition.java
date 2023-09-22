package Stepdefinition;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

import io.cucumber.java.en.And;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;

public class StepDefinition {
WebDriver driver;
@Given("user is  on homepage")
public void user_is_on_homepage() {
	System.setProperty("webdriver.gecko.driver", "C:\\Users\\kbnav\\Documents\\javaselenium\\geckodriver.exe");
	WebDriver driver=new FirefoxDriver();
	this.driver=driver;

	driver.manage().window().maximize();  
	driver.get("https://mail.rediff.com/");
}

@When("user navigates to Login Page")
public void user_navigates_to_login_page() {

	 driver.findElement(By.className("signin")).click();

}

@And("user enters username and Password")
public void user_enters_username_and_password() {
	driver.findElement(By.name("login")).sendKeys("Navya");
	driver.findElement(By.id("password")).sendKeys("123");
	driver.findElement(By.name("proceed")).click();;

}

@Then("success message is displayed")
public void success_message_is_displayed() {
	System.out.println("success msg is displayed");
}
}
