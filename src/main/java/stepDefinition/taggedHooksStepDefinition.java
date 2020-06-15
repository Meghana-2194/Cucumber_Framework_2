//package stepDefinition;
//
//import cucumber.api.java.After;
//import cucumber.api.java.Before;
//import cucumber.api.java.en.Given;
//import cucumber.api.java.en.Then;
//import cucumber.api.java.en.When;
//
//public class taggedHooksStepDefinition {
//
//	// Global Hooks
//	@Before()
//	public void setUp() {
//		System.out.println("Launch the browser");
//	}
//
//	@After()
//	public void tearDown() {
//		System.out.println("Quit the browser");
//	}
//
//	// Tagged hooks
//	// Only for the first scenarios
//	@Before("@First")
//	public void firstSetUp() {
//		System.out.println("Launch the browser First");
//	}
//
//	@After("@First")
//	public void firstTearDown() {
//		System.out.println("Quit the browser First");
//	}
//
//	// Only for the second scenarios
//	@Before("@Second")
//	public void secondSetUp() {
//		System.out.println("Launch the browser Second ");
//	}
//
//	@After("@Second")
//	public void secondTearDown() {
//		System.out.println("Quit the browser Second");
//	}
//
//	// Only for the Third scenarios
//	@Before("@Third")
//	public void thirdsetUp() {
//		System.out.println("Launch the browser Third ");
//	}
//
//	@After("@Third")
//	public void thirdTearDown() {
//		System.out.println("Quit the browser Third");
//	}
//
//	@Given("^user is already on login page$")
//	public void user_is_already_on_login_page() {
//
//	}
//
//	@When("^title of login page is FreeCRM$")
//	public void title_of_login_page_is_FreeCRM() {
//
//	}
//
//	@Then("^user enters the user name and user enters password$")
//	public void user_enters_the_user_name_and_user_enters_password() {
//
//	}
//
//	@Given("^user clicks on home page icon$")
//	public void user_clicks_on_home_page_icon() {
//
//	}
//
//	@Then("^user should be redirected to home page screen$")
//	public void user_should_be_redirected_to_home_page_screen() {
//
//	}
//
//	@Given("^user clicks on contact  icon$")
//	public void user_clicks_on_contact_icon() {
//
//	}
//
//	@Then("^user should be redirected to contact page$")
//	public void user_should_be_redirected_to_contact_page() {
//
//	}
//
//}
