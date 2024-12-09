package basicScripts;

import javax.xml.xpath.XPath;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

public class Frame1 {

	public static void main(String[] args) throws InterruptedException
	{
		System.setProperty("webdriver.gecko.driver","./Softwares/geckodriver.exe");
		WebDriver driver= new FirefoxDriver();
		driver.manage().window().maximize();
		driver.get("https://demoapps.qspiders.com/ui/frames/multiple?sublist=2");
		WebElement f1= driver.findElement(By.xpath("(//iframe)[1]"));
		Thread.sleep(2000);
		driver.switchTo().frame("f1");
		WebElement email=driver.findElement(By.xpath("//input[@id='email']"));
		Thread.sleep(2000);
		email.sendKeys("dgfdyt@4354");
		WebElement psw=driver.findElement(By.xpath("//input[@id='email']"));
		Thread.sleep(2000);
		psw.sendKeys("hj267");
		WebElement conf=driver.findElement(By.xpath("//input[@id='confirm-password']"));
		Thread.sleep(2000);
		conf.sendKeys("hj267");
		driver.switchTo().defaultContent();
		WebElement f2= driver.findElement(By.xpath("//iframe)[2]"));
		driver.switchTo().frame("f2");
		WebElement usn=driver.findElement(By.xpath("//input[@id='username']"));
		Thread.sleep(2000);
		usn.sendKeys("amulya");
		WebElement psw1 =driver.findElement(By.xpath("//input[@id='password']"));
		Thread.sleep(2000);
		psw1.sendKeys("amul23");
	}

}
