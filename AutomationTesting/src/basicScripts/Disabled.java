package basicScripts;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.firefox.FirefoxDriver;

public class Disabled {

	public static void main(String[] args)
	{
		System.setProperty("webdriver.gecko.driver", "./Softwares/geckodriver.exe");
		WebDriver driver=new FirefoxDriver();
		driver.manage().window().maximize();
		driver.navigate().to("file:///C:/Users/panch/OneDrive/Desktop/Selenium/Disabled.html");
		WebElement usn=driver.findElement(By.xpath("(//input[@type='text'])[1]"));
		if(usn.isDisplayed())
		{
		if(usn.isEnabled())
		{
usn.sendKeys("admin");

	}
		else
		{
			System.out.println("usn is diabled");
		}

}
		else
		{
			System.out.println("usn is not displayed");
		}
}
	}