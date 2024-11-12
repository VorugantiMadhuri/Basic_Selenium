package Actionsclass;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class MousehoverDoubleclick {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		WebDriver driver =new ChromeDriver();
		driver.get("https://demoapp.skillrary.com/");
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
		WebElement courseTab=driver.findElement(By.id("course"));
		Actions action=new Actions(driver);
		action.moveToElement(courseTab).perform();
		
		driver.findElement(By.xpath("//span/a[text()='Selenium']")).click();
		WebElement quantity=driver.findElement(By.id("quantity"));
		int initialValue=Integer.parseInt(quantity.getAttribute("value"));
		
		WebElement plusbtn=driver.findElement(By.id("add"));
		action.doubleClick(plusbtn).perform();

		int finalValue=Integer.parseInt(quantity.getAttribute("value"));
		if(initialValue+1==finalValue) 
		System.out.println("Pass");
		else
			System.out.println("fail");
		driver.close();
	}
	

}
