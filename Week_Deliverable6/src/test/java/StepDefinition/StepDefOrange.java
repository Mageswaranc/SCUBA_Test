package StepDefinition;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import io.github.bonigarcia.wdm.WebDriverManager;

public class StepDefOrange {



	WebDriver driver;
	@Given("user is on main Screen")
	public void user_is_on_main_screen() {
		WebDriverManager.chromedriver().setup();
		this.driver = new ChromeDriver();
		driver.get("https://www.rediff.com/");
		driver.manage().window().maximize();
	}

	@When("user click on signin button")
	public void user_click_on_signin_button() {
		driver.findElement(By.xpath("//a[@class='signin']")).click();

	}

	@Then("enters username and password")
	public void enters_username_and_password() throws InterruptedException {
		driver.findElement(By.xpath("//input[@name='login']")).sendKeys("sita123@rediff.com");
		Thread.sleep(3000);
		driver.findElement(By.xpath("//input[@name='passwd']")).sendKeys("janaki123");

	}

	@Then("user click on sign in button.")
	public void user_click_on_sign_in_button() {
		driver.findElement(By.xpath("//input[@name='proceed']")).click();
	}
}