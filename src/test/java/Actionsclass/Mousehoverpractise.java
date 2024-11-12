package Actionsclass;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class Mousehoverpractise {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		WebDriver driver =new ChromeDriver();
		driver.get("https://www.myntra.com/");
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
		WebElement homeAndLiving=driver.findElement(By.xpath("//a[text()='Home & Living' and @class=\"desktop-main\"]"));
		Actions action=new Actions(driver);
		action.moveToElement(homeAndLiving).perform();
		driver.findElement(By.xpath("//a[text()='Clocks']")).click();
		String header=driver.findElement(By.cssSelector("h1.title-title")).getText();
		if(header.equalsIgnoreCase("clocks")) {
			System.out.println("pass");
		}
			else {
				System.out.println("fail");
		}
		
		driver.quit();
	}

}
