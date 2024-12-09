package Framework;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

public class GenericScript
{
WebDriver driver;
@BeforeMethod
public void Browsersetup() 
{
	System.setProperty("webdriver.gecko.driver", "./softwares/geckodriver.exe");
	driver=new FirefoxDriver();
	driver.manage().window().maximize();
	driver.get("https://www.facebook.com");
	}
@AfterMethod
public void close()
{
	driver.quit();
}
}
