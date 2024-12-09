package basicScripts;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.firefox.FirefoxDriver;

public class Script13 {

	public static void main(String[] args) throws InterruptedException {
		System.setProperty("webdriver.gecko.driver", "./Softwares/geckodriver.exe");
		WebDriver driver=new FirefoxDriver();
		driver.manage().window().maximize();
		driver.get("https://www.facebook.com/");
		WebElement  ele=driver.findElement(By.id("email"));
		ele.sendKeys("Ashika");
		Thread.sleep(2000);
		WebElement  ele1=driver.findElement(By.name("pass"));
		ele1.sendKeys("Ashika@1hdgjdj23");
		Thread.sleep(2000);
		WebElement  ele2=driver.findElement(By.name("login"));
		Thread.sleep(2000);
		ele2.click();
	}

}
