import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class IsEnabledMethod{

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		WebDriver driver= new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://www.instagram.com/");
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
		
		WebElement loginbtn=driver.findElement(By.xpath("//button[@type=\"submit\"]"));
		if(loginbtn.isEnabled())
			loginbtn.click();
		else
			System.out.println("disabled");
		
		driver.findElement(By.name("username")).sendKeys("fsdgfhgfgf");
		driver.findElement(By.name("password")).sendKeys("dgfhggf");
		if(loginbtn.isEnabled()) {
			loginbtn.click();
		System.out.println("Enabled");
		}
		else
			System.out.println("disabled");
		driver.quit();
	}

}
