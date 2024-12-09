package basicScripts;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.firefox.FirefoxDriver;

public class Amazonwatch {

	public static void main(String[] args) throws InterruptedException
	{
		System.setProperty("webdriver.gecko.driver", "./Softwares/geckodriver.exe");
		WebDriver driver=new FirefoxDriver();
		driver.manage().window().maximize();
		driver.get("https://www.amazon.in/");
		Thread.sleep(2000);
	WebElement search = driver.findElement(By.xpath("//input[@id='twotabsearchtextbox']"));
		Thread.sleep(1000);
search.sendKeys("wrist watch for men");
WebElement click1= driver.findElement(By.xpath("//input[@id='nav-search-submit-button']"));
click1.click();
WebElement lather= driver.findElement(By.xpath("(//i[@class='a-icon a-icon-checkbox'])[7]"));
Thread.sleep(2000);
lather.click();
WebElement fastrack= driver.findElement(By.xpath("(//i[@class='a-icon a-icon-checkbox'])[20]"));
Thread.sleep(2000);
fastrack.click();
WebElement watch1= driver.findElement(By.xpath("(//img[@class='s-image'])[1]"));
watch1.click();
	}

}
