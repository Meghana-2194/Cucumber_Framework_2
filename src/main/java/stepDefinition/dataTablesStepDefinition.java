//package stepDefinition;
//
//import java.util.List;
//import java.util.concurrent.TimeUnit;
//
//import org.openqa.selenium.By;
//import org.openqa.selenium.JavascriptExecutor;
//import org.openqa.selenium.WebDriver;
//import org.openqa.selenium.WebElement;
//import org.openqa.selenium.chrome.ChromeDriver;
//import org.openqa.selenium.interactions.Actions;
//import org.testng.annotations.AfterMethod;
//import org.testng.annotations.AfterTest;
//import org.testng.annotations.BeforeMethod;
//import org.testng.annotations.BeforeTest;
//
//import cucumber.api.DataTable;
//import cucumber.api.java.After;
//import cucumber.api.java.Before;
//import cucumber.api.java.en.Given;
//import cucumber.api.java.en.Then;
//import cucumber.api.java.en.When;
//import junit.framework.Assert;
//
//public class dataTablesStepDefinition {
//
//	public static WebDriver driver;
//
//	@Before()
//	public void setUp() {
//		System.out.println("Launch the browser");
//		System.setProperty("webdriver.chrome.driver", "C:\\Users\\MMeghana\\Downloads\\chromedriver.exe");
//		driver = new ChromeDriver();
//		driver.manage().timeouts().pageLoadTimeout(60, TimeUnit.SECONDS);
//		driver.manage().timeouts().implicitlyWait(100, TimeUnit.SECONDS);
//		driver.get("https://freecrm.co.in/");
//
//	}
//
//	@After()
//	public void tearDown() {
//		System.out.println("Close the Browser");
//		driver.quit();
//
//	}
//
//	@Given("^user is already on login page$")
//	public void user_is_already_on_login_page() {
//		driver.findElement(By.xpath("/html/body/div[1]/header/div/nav/div[2]/div/div[2]/ul/a/span[1]")).click();
//	}
//
//	@Then("^Click on login button$")
//	public void click_on_login_button() {
//		
//	}
//
//	@Then("^user enters the username and password$")
//	public void user_enters_the_username_and_password(DataTable credentials) {
//		List<List<String>> dataTables = credentials.raw();
//		driver.findElement(By.name("email")).sendKeys(dataTables.get(0).get(0));
//		driver.findElement(By.name("password")).sendKeys(dataTables.get(0).get(1));
//
//	}
//
//	@Then("^Click on submit button$")
//	public void click_on_submit_button() {
//		WebElement submit = driver.findElement(By.xpath("//div[contains(text(), 'Login')]"));
//		JavascriptExecutor js = ((JavascriptExecutor) driver);
//		js.executeScript("arguments[0].click();", submit);
//
//	}
//
//	@Then("^user moves to deal pages$")
//	public void user_moves_to_deal_pages() {
//		driver.findElement(By.xpath("//span[contains(text(),'Deals')]")).click();
//		driver.findElement(By.xpath("//i[@class = 'edit icon']")).click();
//	}
//
//	@Then("^user enters the deal details$")
//	public void user_enters_the_deal_details(DataTable credentials) {
//		List<List<String>> dealData = credentials.raw();
//		driver.findElement(By.name("title")).sendKeys(dealData.get(0).get(0));
//		driver.findElement(By.name("probability")).sendKeys(dealData.get(0).get(1));
//		driver.findElement(By.name("amount")).sendKeys(dealData.get(0).get(2));
//	}
//
//	@Then("^close the deal page$")
//	public void close_the_deal_page() {
//		System.out.println("Close the deal Page");
//	}
//}
