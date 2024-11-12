import java.io.File;
import java.io.IOException;
import java.time.Duration;

import org.apache.commons.io.FileUtils;
import org.openqa.selenium.By;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Screenshotexample {

	public static void main(String[] args) throws IOException {
		// TODO Auto-generated method stub
		WebDriver driver=new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://www.instagram.com/");
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
		
		WebElement zomztoImg=driver.findElement(By.cssSelector("div.xamitd3"));
		File src=zomztoImg.getScreenshotAs(OutputType.FILE);
		File dest=new File("./ElementScreenshot/instagram.png");
		FileUtils.copyFile(src, dest);
		driver.close();
	}
 
}
