package StepDefination;

import org.junit.Assert;

import BaseClass.TestBase;
import PageObjectModel.HomePage;
import PageObjectModel.LoginDetailsPage;
import cucumber.api.java.en.*;

public class CustomerDetails extends TestBase {

	@Given("^user open browser$")
	public void user_open_browser() throws Throwable {
		lp.initialization();
	}

	@When("^user open URL \"([^\"]*)\"$")
	public void user_open_URL(String url) throws Throwable {
		logger.info("************ Customer Enter URL **********");
		lp.getDriver(driver, url);
	}

	@When("^user enters Email as \"([^\"]*)\" and Password as \"([^\"]*)\"$")
	public void user_enters_Email_as_and_Password_as(String email, String password) throws Throwable {
		logger.info("************ Customer Enter Un and Pwd **********");
		lp=new LoginDetailsPage();
		lp.login(email, password);

	}

	@Then("^clicks on login button$")
	public void clicks_on_login_button() throws Throwable {
		logger.info("************ Customer Enter in Application **********");
		lp.setlogin();

	}

	@Then("^page Title should be \"([^\"]*)\"$")
	public void page_Title_should_be(String arg1) throws Throwable {
		logger.info("************ Customer validte title after login **********");
		
		Assert.assertEquals(lp.validateTitle(), "Dashboard / nopCommerce administration"); 
	}

	@When("^user click on logout link$")
	public void user_click_on_logout_link() throws Throwable {
		logger.info("************ Customer can Logout **********");
		lp.SetLogout();
	}

	@Then("^pgae title should be \"([^\"]*)\"$")
	public void pgae_title_should_be(String arg1) throws Throwable {
		logger.info("************ Customer can Validate title after logout **********");
		Assert.assertEquals(lp.validateTitle(), "Your store. Login");
	}

	@Then("^close browser$")
	public void close_browser() throws Throwable {
		logger.info("************ Close The Browser **********");
		lp.closeBrowser(driver);
	}
	@Then("^Customer click on CustomerMenu button$")
	public void customer_click_on_CustomerMenu_button() throws Throwable {
		logger.info("************ Customer click on CustomerMenu **********");
		hp=new HomePage(driver);
		hp.clickCustomersMenu();
	}

	@Then("^Customer clicks on customers menu item$")
	public void customer_clicks_on_customers_menu_item() throws Throwable {
		logger.info("************ Customer click on CustomerMenu Item**********");
		hp.clickCustomerMenuItem();
	}

	@Then("^Customer clicks on Addnew button$")
	public void customer_clicks_on_Addnew_button() throws Throwable {
		logger.info("************ Customer clic on Add Button **********");
		hp.clickOnAddbutton();
	}
	@Then("^Enter the details of customer info$")
	public void enter_the_details_of_customer_info() throws Throwable {
		logger.info("************ Enter Email Id **********");
		hp.Enter_email(randomstring()+"@gmail.com");
		logger.info("************ Enter Password **********");
		hp.Enter_password(randomint());
		logger.info("************ Enter Firstname **********");
		hp.Enter_Frist_Name(randomstring());
		logger.info("************ Enter LastName **********");
		hp.Enter_Last_Name(randomstring());
		logger.info("************ Select Gender **********");
		hp.select_gender("Male");
		logger.info("************ Enter DOB **********");
		hp.Enter_DOB("01/02/2020");
		logger.info("************ Enter Company name **********");
		hp.Enter_company_name("ABCDEF");
		logger.info("************ Select the Vendor **********");
		hp.select_vendor("Vendor 1");

	}

	@Then("^click on save button$")
	public void click_on_save_button() throws Throwable {
		logger.info("************ Click on Save Button **********");
		hp.click_save();
	}
	@Then("^Customer can check Email generates$")
	public void customer_can_check_Email_generates() throws Throwable {
		//	   hp.search();
		//	   hp.FcheckBox();
		//	   hp.EditButton();
	}

}
