//package stepDefinition;
//
//import java.util.concurrent.TimeUnit;
//
//import org.openqa.selenium.By;
//import org.openqa.selenium.WebDriver;
//import org.openqa.selenium.chrome.ChromeDriver;
//
//import cucumber.api.java.After;
//import cucumber.api.java.Before;
//import cucumber.api.java.en.Given;
//import cucumber.api.java.en.Then;
//import cucumber.api.java.en.When;
//import junit.framework.Assert;
//
//public class simpleDataDrivenStepDefinition {
//	
//	WebDriver driver;
//	@Before()
//	public void setUp() {
//		System.out.println("Launch the browser");
//		System.setProperty("webdriver.chrome.driver", "C:\\Users\\MMeghana\\Downloads\\chromedriver.exe");
//		driver = new ChromeDriver();
//		driver.manage().timeouts().pageLoadTimeout(60, TimeUnit.SECONDS);
//		driver.manage().timeouts().implicitlyWait(60, TimeUnit.SECONDS);
//		driver.get("https://freecrm.co.in/");
//		
//	}
//
//	@After()
//	public void tearDown() {
//		System.out.println("Quit the browser");
//		driver.quit();
//	}
//
//	@Given("^user is already on login page$")
//	public void user_is_already_on_login_page() {
//
//	}
//
//	@When("^title of login page is FreeCRM$")
//	public void title_of_login_page_is_FreeCRM() {
//		String title = driver.getTitle();
//		System.out.println("The Title of the page is : " + title);
//		Assert.assertEquals(title, "Free CRM #1 cloud software for any business large or small");
//
//	}
//
//	@Then("^user enters the username \"([^\"]*)\" and password \"([^\"]*)\"$")
//	public void user_enters_the_username_and_password(String username, String password){
//		driver.findElement(By.xpath("/html/body/div[1]/header/div/nav/div[2]/div/div[2]/ul/a/span[1]")).click();
//		driver.findElement(By.name("email")).sendKeys(username);
//		driver.findElement(By.name("password")).sendKeys(password);
//	}
//
//	@Then("^Click on Login button$")
//	public void click_on_Login_button() {
//		driver.findElement(By.xpath("//*[@id='ui']/div/div/form/div/div[3]")).click();
//	}
//}
