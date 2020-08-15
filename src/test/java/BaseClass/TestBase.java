package BaseClass;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.util.Properties;
import java.util.concurrent.TimeUnit;

import org.apache.commons.lang.RandomStringUtils;
import org.apache.log4j.Level;
import org.apache.log4j.Logger;
import org.apache.log4j.PropertyConfigurator;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.ie.InternetExplorerDriver;
import org.openqa.selenium.safari.SafariDriver;

import PageObjectModel.HomePage;
import PageObjectModel.LoginDetailsPage;



public class TestBase extends ElementExtension{
	public static  Properties prop;
	public static WebDriver driver;
	public HomePage hp;
	public LoginDetailsPage lp;
	public static Logger logger;

	public   TestBase() {

		try {
			//object creation for logger
			logger=Logger.getLogger("testBase");
			PropertyConfigurator.configure("log.properties");



			prop=new Properties();
			FileInputStream fls=new FileInputStream("E:\\EclipseProjectExe\\projectMaven\\config.properties");
			prop.load(fls);
		} 

		catch (FileNotFoundException e) {
			e.printStackTrace();
		}
		catch (IOException e) {
			e.printStackTrace();
		}
	}
	/*
	public void atend(Scenario scenario) {
		if(scenario.isFailed()) {
			scenario.write("This is failure message");
			byte[] screenshot = ((TakesScreenshot) driver).getScreenshotAs(OutputType.BYTES);
			 
			
			scenario.embed(screenshot, "image/png");
		}
	}
	*/
	public static String randomstring() {
	String	generateString2=RandomStringUtils.randomAlphabetic(4);
		return (generateString2);
	}
	public static String randomint() {
		String generateint=RandomStringUtils.randomNumeric(6);
		return (generateint);
	}
	

	public static void initialization() {
		String brsr = prop.getProperty("browser");
		try {
			if(brsr.equalsIgnoreCase("chrome")) {
				System.setProperty("webdriver.chrome.driver", prop.getProperty("chrome_path"));
				driver = new ChromeDriver();
				logger.info("************ Lanchink on chrome browser **********");
			}
			else if (brsr.equalsIgnoreCase("firefox")) {
				logger.info("************ Launching Firefox Browser  ************");
				driver = new FirefoxDriver();
			}
			else if (brsr.equalsIgnoreCase("IE")) {
				logger.info("************ Launching IE Browser  ************");
				driver = new InternetExplorerDriver();	
			}

		} catch (IllegalStateException e) {
			e.printStackTrace();
		}

		driver.manage().window().maximize();

		driver.manage().timeouts().pageLoadTimeout(30, TimeUnit.SECONDS);

		driver.manage().timeouts().implicitlyWait(30, TimeUnit.SECONDS);



	}
}
