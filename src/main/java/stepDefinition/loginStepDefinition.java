//package stepDefinition;
//
//import java.util.concurrent.TimeUnit;
//
//import org.openqa.selenium.By;
//import org.openqa.selenium.WebDriver;
//import org.openqa.selenium.chrome.ChromeDriver;
//
//import cucumber.api.java.en.Given;
//import cucumber.api.java.en.Then;
//import cucumber.api.java.en.When;
//import junit.framework.Assert;
//
//public class loginStepDefinition {
//
//	WebDriver driver;
//	// need to define the steps
//
//	@Given("^user is already on login page$")
//	// method name
//	public void user_is_already_on_login_page() {
//		System.setProperty("webdriver.chrome.driver", "C:\\Users\\MMeghana\\Downloads\\chromedriver.exe");
//		driver = new ChromeDriver();
//		driver.manage().timeouts().pageLoadTimeout(50, TimeUnit.SECONDS);
//		driver.manage().timeouts().implicitlyWait(50, TimeUnit.SECONDS);
//		driver.get("https://freecrm.co.in/");
//	}
//
//	@When("^title of login page is FreeCRM$")
//	public void title_of_login_page_is_FreeCRM() {
//		String title = driver.getTitle();
//		System.out.println("The Title of the page is : " + title);
//		Assert.assertEquals(title, "Free CRM #1 cloud software for any business large or small");
//	}
//
//	@Then("^user enters the user name and user enters password$")
//	public void user_enters_the_user_name_and_user_enters_password() {
//		driver.findElement(By.xpath("/html/body/div[1]/header/div/nav/div[2]/div/div[2]/ul/a/span[1]")).click();
//		driver.findElement(By.name("email")).sendKeys("buddy6jar@gmail.com");
//		driver.findElement(By.name("password")).sendKeys("Buddy6jar!");
//
//	}
//
//	@Then("^users clicks on login button$")
//	public void users_clicks_on_login_button() {
//		driver.findElement(By.xpath("//*[@id='ui']/div/div/form/div/div[3]")).click();
//
//	}
//
//	@Then("^user is on home page$")
//	public void user_is_on_home_page() {
//		String title1 = driver.getTitle();
//		System.out.println("HomePage title: " + title1);
//		Assert.assertEquals(title1, "Cogmento CRM");
//	}
//
//}
