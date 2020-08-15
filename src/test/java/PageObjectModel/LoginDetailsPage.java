package PageObjectModel;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.How;
import org.openqa.selenium.support.PageFactory;

import BaseClass.TestBase;

public class LoginDetailsPage extends TestBase{

	@FindBy(how=How.ID,using="Email") WebElement email;
	@FindBy(how=How.ID,using="Password") WebElement password;
	@FindBy(how=How.XPATH,using="//input[@class='button-1 login-button']") WebElement Login;
	@FindBy(how=How.XPATH,using="//a[contains(text(),'Logout')]") WebElement Logout;

	public LoginDetailsPage() {
		PageFactory.initElements(driver, this);
	}
	public String validateTitle() {
		return driver.getTitle();
	}

	public HomePage login(String un ,String pwd) {
		clearAll(email);
		EnterText(email, un);
		clearAll(password);
		EnterText(password, pwd);

		return new HomePage(driver);
	}

	public void setlogin() {
		ClickOnIt(Login);
	}

	public HomePage SetLogout() {
		ClickOnIt(Logout);

		return new HomePage(driver);
	}
}
