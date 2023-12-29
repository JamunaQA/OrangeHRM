package stepDefinition;

import org.junit.Assert;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;

public class LoginOrangeHRM {

	 WebDriver driver;
		@Given("user is on login page")
		public void user_is_on_login_page() throws InterruptedException {
		   driver = new ChromeDriver();
		   driver.get("https://opensource-demo.orangehrmlive.com/web/index.php/auth/login");
		   Thread.sleep(3000);
		    
		}
		@When("The user enters the valid user name and password")
		public void the_user_enters_the_valid_user_name_and_password() {
		    driver.findElement(By.xpath("//input[@name='username']")).sendKeys("Admin");
		    driver.findElement(By.xpath("//input[@name='password']")).sendKeys("admin123");
		    
		}
		@When("Clicks on the login button")
		public void clicks_on_the_login_button() throws InterruptedException {
		   driver.findElement(By.xpath("//button[contains(@class,'login-button')]")).click();
		   Thread.sleep(3000);
		}
		@Then("the user navigated to home page")
		public void the_user_navigated_to_home_page() {
		  boolean title =  driver.findElement(By.xpath("//span[contains(@class,\"header-breadcrumb\")]")).isDisplayed();
		  Assert.assertTrue(title);
		}




	}


