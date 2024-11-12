package testNG_annotations;

import java.time.Duration;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.AfterClass;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.BeforeMethod;

import pom.LoginPage;

public class BaseClassForLogin {
	protected WebDriver driver;
	protected LoginPage login;

	@BeforeClass
	public void classSetup() {
		driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(0));
	}

	@BeforeMethod
	public void methodsetup() {
		driver.get("https://demoapp.skillrary.com/login.php?type=login");
	}

	@AfterMethod
	public void methodTeardown() {
		System.out.println("After Method");
	}

	@AfterClass
	public void classtearDown() {
		driver.quit();
	}
}
