package all;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Framespractise {

	public static void main(String[] args) throws InterruptedException {
		// TODO Auto-generated method stub
		ChromeDriver driver=new ChromeDriver();
		driver.get("https://www.google.com/");
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
		//By using frame(String or name)
		//driver.switchTo().frame("callout");
		//By using frame(index)
		//driver.switchTo().frame(0);
		//By using frame(index)
		WebElement frame=driver.findElement(By.name("callout"));
		driver.switchTo().frame(frame);
		driver.findElement(By.xpath("//button[text()='Stay signed out']")).click();
		driver.switchTo().defaultContent();
		driver.findElement(By.name("q")).sendKeys("Automation testing jobs for freshers" + Keys.ENTER);
		Thread.sleep(3000);
		driver.quit();
		
	}

}
