package pom;

import java.time.Duration;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class LoginPagetest {

	public static void main(String[] args) throws InterruptedException {
		// TODO Auto-generated method stub
		WebDriver driver=new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://demoapp.skillrary.com/login.php?type=login");
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
		
		LoginPage login=new LoginPage(driver);
		login.setEmail("admin");
		login.setPassword("admin");
		login.loginCheckbox();
		login.logibBtn();
		
		Thread.sleep(2000);
		driver.quit();

	}

}