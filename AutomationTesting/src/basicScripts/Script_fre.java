package basicScripts;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Script_fre {

	public static void main(String[] args) 
	{
		System.setProperty("webdriver.chrome.driver","./softwares/chromedriver.exe");
		ChromeDriver driver = new ChromeDriver();
		driver.get("file:///C:/Users/panch/OneDrive/Desktop/Selenium/Multiple_frame.html");
		driver.manage().window().maximize();
		WebElement usn = driver.findElement(By.xpath("//input[@type='text']"));
		usn.sendKeys("admin");
		driver.switchTo().frame("F1");
		WebElement mob= driver.findElement(By.xpath("//input[@type='text']"));
		mob.sendKeys("98877664543");
		driver.switchTo().defaultContent();
		driver.switchTo().frame("F2");
		WebElement email= driver.findElement(By.xpath("//input[@type='text']"));
		email.sendKeys("vhgbjk@456");
	}

}
