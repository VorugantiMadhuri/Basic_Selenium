package popups;

import java.time.Duration;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;

public class Notificationspopup {

	public static void main(String[] args) throws InterruptedException {
		// TODO Auto-generated method stub
		ChromeOptions opt=new ChromeOptions();
//		opt.addArguments("--incognito-");	
//		opt.addArguments("--disable-geolocation");
//		opt.addArguments("--disable-notifications");
		WebDriver driver=new ChromeDriver(opt);
		driver.manage().window().maximize();
		driver.get("https://www.ixigo.com/");
		Thread.sleep(6000);
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
		driver.quit();

	}

}
