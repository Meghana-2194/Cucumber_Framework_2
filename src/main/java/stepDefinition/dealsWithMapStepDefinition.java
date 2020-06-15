package stepDefinition;

import java.util.Map;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import cucumber.api.DataTable;
import cucumber.api.java.After;
import cucumber.api.java.Before;
import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;

public class dealsWithMapStepDefinition {
	
	// data with map : for parameterization

	public static WebDriver driver;

	@Before()
	public void setUp() {
		System.out.println("Launch the browser");
		System.setProperty("webdriver.chrome.driver", "C:\\Users\\MMeghana\\Downloads\\chromedriver.exe");
		driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.manage().timeouts().pageLoadTimeout(60, TimeUnit.SECONDS);
		driver.manage().timeouts().implicitlyWait(100, TimeUnit.SECONDS);
		driver.get("https://freecrm.co.in/");
	}

	@After()
	public void tearDown() {
		System.out.println("Close the Browser");
		driver.quit();
	}

	@Given("^user is already on login page$")
	public void user_is_already_on_login_page() {

	}

	@Then("^Click on login button$")
	public void click_on_login_button() {
		driver.findElement(By.xpath("//span[contains(text(), 'Log In')]")).click();

	}

	@Then("^user enters the username and password$")
	public void user_enters_the_username_and_password(DataTable credentails) {
		for (Map<String, String> data : credentails.asMaps(String.class, String.class)) {
			driver.findElement(By.name("email")).sendKeys(data.get("username"));
			driver.findElement(By.name("password")).sendKeys(data.get("password"));
		}
	}

	@Then("^Click on submit button$")
	public void click_on_submit_button() {
		WebElement submit = driver.findElement(By.xpath("//div[contains(text(), 'Login')]"));
		JavascriptExecutor js = ((JavascriptExecutor) driver);
		js.executeScript("arguments[0].click();", submit);
	}

	@Then("^user moves to deal pages$")
	public void user_moves_to_deal_pages() {
		driver.findElement(By.xpath("//span[contains(text(),'Deals')]")).click();
		driver.findElement(By.xpath("//i[@class = 'edit icon']")).click();
	}

	@Then("^user enters the deal details$")
	public void user_enters_the_deal_details(DataTable credentails) {
		for (Map<String, String> details : credentails.asMaps(String.class, String.class)) {
			driver.findElement(By.name("title")).sendKeys(details.get("Title"));
			driver.findElement(By.name("probability")).sendKeys(details.get("Probability"));
			driver.findElement(By.name("amount")).sendKeys(details.get("Amount"));
		}
	}

	@Then("^close the deal page$")
	public void close_the_deal_page() {

	}

}
