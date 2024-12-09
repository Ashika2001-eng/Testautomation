package basicScripts;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

public class Bustasktest {

	public static void main(String[] args) throws InterruptedException
	{
		System.setProperty("webdriver.gecko.driver", "./Softwares/geckodriver.exe");
		WebDriver driver=new FirefoxDriver();
		driver.manage().window().maximize();
		driver.get("https://busonlineticket.com/booking/bus-tickets.aspx");
		Thread.sleep(2000);
	driver.findElement(By.xpath("//input[@id='txtOriginGeneral']")).click();
	Thread.sleep(1000);
	driver.findElement(By.xpath("(//div[@class='select2-result-label'])[2]")).click();
	driver.findElement(By.xpath("//input[@id='txtDestinationGeneral']")).click();
	Thread.sleep(1000);
	driver.findElement(By.xpath("(//div[@class='select2-result-label'])[2]")).click();
	driver.findElement(By.xpath("//input[@id='txtDepartDateBooking']")).click();
	Thread.sleep(1000);
	driver.findElement(By.xpath("//a[.='21']")).click();
	driver.findElement(By.xpath("//input[@id='txtReturnDateBooking']")).click();
	Thread.sleep(1000);
	driver.findElement(By.xpath("//a[.='28']")).click();
	driver.findElement(By.xpath("//input[@id='btnBusSearchNewGeneral']")).click();//button
	driver.findElement(By.xpath("(//b[.='SELECT'])[1]")).click();
	Thread.sleep(1000);
	driver.findElement(By.xpath("(//small[@class='position-absolute'])[94]")).click();
	driver.findElement(By.xpath("(//small[@class='position-absolute'])[97]")).click();
	Thread.sleep(1000);
	driver.findElement(By.xpath("(//span[.='Proceed'])[2]")).click();//1procced
	driver.findElement(By.xpath("//div[@class='cta-buttons']"));
	driver.findElement(By.xpath("//a[.='OK']")).click();
	Thread.sleep(1000);
	driver.findElement(By.xpath("(//b[.='SELECT'])[3]")).click();
	Thread.sleep(1000);
	driver.findElement(By.xpath("(//small[@class='position-absolute'])[100]")).click();
	Thread.sleep(1000);
driver.findElement(By.xpath("(//small[@class='position-absolute'])[100]")).click();
	driver.findElement(By.xpath("(//span[.='Proceed'])[2]")).click();//return proceed
	driver.findElement(By.xpath("(//input[@autocomplete='any'])[2]")).sendKeys("ashika");//first name
	Thread.sleep(1000);
	driver.findElement(By.xpath("(//input[@autocomplete='any'])[3]")).sendKeys("5646757689");
	driver.findElement(By.xpath("(//input[@autocomplete='any'])[4]")).sendKeys("ashika@123");
	}

}
