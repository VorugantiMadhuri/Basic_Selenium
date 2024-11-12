package all;

import java.time.Duration;
import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Autosuggestions1 {

	public static void main(String[] args) throws InterruptedException {
		// TODO Auto-generated method stub
WebDriver driver=new ChromeDriver();
driver.get("https://www.google.com/");
driver.manage().window().maximize();
driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
driver.findElement(By.name("q")).sendKeys("madhuri");
List<WebElement> list=driver.findElements(By.xpath("//li[contains(.,'adhuri')]"));
for (WebElement e : list) {
	System.out.println(e.getText());

}
Thread.sleep(2000);
list.get(4).submit();
Thread.sleep(3000);
driver.quit();

	}

}
