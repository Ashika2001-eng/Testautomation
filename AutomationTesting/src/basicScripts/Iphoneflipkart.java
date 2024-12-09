package basicScripts;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

public class Iphoneflipkart {

	public static void main(String[] args) throws InterruptedException
	{
		System.setProperty("webdriver.gecko.driver", "./Softwares/geckodriver.exe");
		WebDriver driver=new FirefoxDriver();
		driver.manage().window().maximize();
driver.navigate().to("https://www.flipkart.com/");
Thread.sleep(1000);
 driver.findElement(By.xpath("//input[@class='Pke_EE']")).sendKeys("iphone11");
driver.findElement(By.xpath("//button[@type='submit']")).click();
Thread.sleep(1000);
driver.findElement(By.xpath("(//div[@class='KzDlHZ'])[1]")).click();
driver.findElement(By.xpath("//button[@class='QqFHMw vslbG+ In9uk2']")).click();
driver.findElement(By.xpath("//a[@class='wsejfv']")).click();




	}

}
