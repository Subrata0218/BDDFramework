package StepDefination;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import io.cucumber.java.en.And;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import io.github.bonigarcia.wdm.WebDriverManager;

public class LoginPageStepDef {
	WebDriver driver;

	 

	//we have to convert each line in feature file

	//to a method 

	 

	@Given("User is on Login Page")

	public void user_is_on_Login_Page() {

	WebDriverManager.chromedriver().setup();

	driver=  new ChromeDriver();

	driver.get("https://opensource-demo.orangehrmlive.com/");

	}

	 

//	@When("User enters correct Username")
//
//	public void user_enters_correct_username() {
//
//	    driver.findElement(By.id("txtUsername")).sendKeys("Admin");
//
//	}
//
//
//
//	@And("User enters correct Password")
//
//	public void user_enters_correct_password() {
//
//	    driver.findElement(By.id("txtPassword")).sendKeys("admin123");
//
//	}
//
//
//
//	@Then("User should be logged in succesfully")
//
//	public void user_should_be_logged_in_successfully() {
//
//	    driver.quit();
//
//	}
//	@When("User enters Incorrect Username")
//	
//	public void User_enters_Incorrect_Username() {
//		driver.findElement(By.id("txtUsername")).sendKeys("Admin123");
//		
//	}
//	
//	@And("User enters Incorrect Password")
//	public void User_enters_Incorrect_Password() {
//		driver.findElement(By.id("txtPassword")).sendKeys("7*&^");
//	}
//	
//	@Then("User Should not Login Succesfully")
//	public void User_Should_not_Login_Succesfully(){
//		driver.quit();
//	}
	
	@When("user enters username as {username}")
	public void user_enters_password_as(String username) {
		driver.findElement(By.id("txtUsername")).sendKeys(username);
	    throw new io.cucumber.java.PendingException();
	}
	@And("user enters password as {password}")
	public void User_enters_Password_as(String password) {
		driver.findElement(By.id("txtPassword")).sendKeys(password);
		throw new io.cucumber.java.PendingException();
	}
	@Then("User should be logged in succesfully")
	public void User_should_be_logged_in_succesfully () {
		driver.quit();
	}
}
