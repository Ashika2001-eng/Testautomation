package GenericScript;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Parameters;


public class BasePage 
{
public WebDriver driver;
@Parameters("BrowserName")
@BeforeMethod
public void BrowserName(String BrowserName)
{
	System.setProperty("webdriver.chrome.driver", "./Softwares/chromedriver.exe");
	System.setProperty("webdriver.gecko.driver", "./Softwares/geckodriver.exe");
	if(BrowserName.equals("chrome"))
	{
		driver=new ChromeDriver();	
	}
	else if(BrowserName.equals("fire"))
	{
		driver=new FirefoxDriver();
	}
	driver.manage().window().maximize();
	driver.get("https://www.facebook.com");
}
@AfterMethod
public void closebrowser() throws InterruptedException
{
	Thread.sleep(3000);
	driver.quit();
}
}
