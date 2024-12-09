package basicScripts;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.firefox.FirefoxDriver;

public class Facebooklogin {

	public static void main(String[] args) throws InterruptedException 
	{
		System.setProperty("webdriver.gecko.driver", "./Softwares/geckodriver.exe");
		WebDriver driver=new FirefoxDriver();
		driver.manage().window().maximize();
		driver.navigate().to("https://www.facebook.com");
		WebElement usn=driver.findElement(By.xpath("//input[@id='email']"));
		Thread.sleep(1000);
		WebElement psw=driver.findElement(By.xpath("//input[@id='pass']"));
		Thread.sleep(1000);
		usn.sendKeys("ashikahs@gmail.com");
		psw.sendKeys("9902927433");
		driver.navigate().refresh();
		usn.sendKeys("ashikahs@gmail.com");
		psw.sendKeys("9902927433");
	}

}
