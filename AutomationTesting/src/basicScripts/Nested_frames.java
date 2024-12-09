package basicScripts;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Nested_frames {

	public static void main(String[] args) throws InterruptedException
	{
		System.setProperty("webdriver.chrome.driver","./softwares/chromedriver.exe");
		ChromeDriver driver = new ChromeDriver();
		driver.get("file:///C:/Users/panch/OneDrive/Desktop/Selenium/Frame4.html");
		driver.manage().window().maximize();
		WebElement usn = driver.findElement(By.xpath("//input[@type='text']"));
		usn.sendKeys("admin");
		Thread.sleep(2000);
		driver.switchTo().frame(0);
		WebElement pwd = driver.findElement(By.xpath("//input[@type='text']"));
		pwd.sendKeys("admin@123");
		Thread.sleep(2000);
		driver.switchTo().frame(0);
		WebElement mobile = driver.findElement(By.xpath("//input[@type='text']"));
		mobile.sendKeys("9980246102");
		Thread.sleep(2000);
		driver.switchTo().frame(0);
		WebElement email = driver.findElement(By.xpath("//input[@type='text']"));
		email.sendKeys("admin123@gmail.com");
		Thread.sleep(2000);
		driver.quit();
	}

}
