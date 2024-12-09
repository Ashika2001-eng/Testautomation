package basicScripts;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

public class Script1 
{
	public static void main(String[] args) 
	{
		System.setProperty("webdriver.chrome.driver", "./Softwares/chromedriver.exe");
		WebDriver driver=new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("file:///C:/Users/panch/OneDrive/Desktop/Selenium/Dropdown.html");
		WebElement option = driver.findElement(By.id("celebraties"));
		Select s=new Select(option);
		List<WebElement> select = s.getOptions();
		int opt = select.size();
		System.out.println(opt);
		
	}
	

}
