package basicScripts;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.firefox.FirefoxDriver;

public class Delete {

	public static void main(String[] args) throws InterruptedException
	{
		System.setProperty("webdriver.gecko.driver", "./Softwares/geckodriver.exe");
		WebDriver driver=new FirefoxDriver();
		driver.manage().window().maximize();
		driver.navigate().to("file:///C:/Users/panch/OneDrive/Desktop/Selenium/Delete.html");
		WebElement usn=driver.findElement(By.xpath("//input[@type='text']"));
		Thread.sleep(1000);
		usn.sendKeys(Keys.CONTROL+"a");
		Thread.sleep(1000);
		usn.sendKeys(Keys.BACK_SPACE);
	
		

	}

}
