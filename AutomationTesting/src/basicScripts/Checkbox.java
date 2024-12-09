package basicScripts;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.firefox.FirefoxDriver;

public class Checkbox {

	public static void main(String[] args)
	{
		System.setProperty("webdriver.gecko.driver", "./Softwares/geckodriver.exe");
		WebDriver driver=new FirefoxDriver();
		driver.manage().window().maximize();
		driver.navigate().to("file:///C:/Users/panch/OneDrive/Desktop/Selenium/Disabled.html");
		WebElement cb=driver.findElement(By.xpath("//input[@type='checkbox']"));
		if(cb.isDisplayed())
		{
		if(cb.isEnabled())
		{
if(cb.isSelected())
{
	System.out.println("it is slected");
	cb.click();
}
else
{
	System.out.println("it is not selected");
}

	}
		else
		{
			System.out.println("cb is diabled");
		}
		}
		else
		{
			System.out.println("cb is not displayed");
		}

	}

}
