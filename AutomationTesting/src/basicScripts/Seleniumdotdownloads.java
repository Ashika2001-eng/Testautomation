package basicScripts;

import java.awt.AWTException;
import java.awt.Robot;
import java.awt.event.KeyEvent;
import java.util.ArrayList;
import java.util.Set;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.interactions.Action;
import org.openqa.selenium.interactions.Actions;

public class Seleniumdotdownloads {

	public static void main(String[] args) throws InterruptedException, AWTException 
	{
		System.setProperty("webdriver.gecko.driver", "./Softwares/geckodriver.exe");
		WebDriver driver=new FirefoxDriver();
		driver.manage().window().maximize();
driver.navigate().to("https://www.selenium.dev/");
Thread.sleep(2000);
 driver.findElement(By.xpath("//span[.='Downloads']")).click();
 Thread.sleep(1000);
 WebElement link1 = driver.findElement(By.xpath("(//a[@class='card-link'])[1]"));
 WebElement link2 =driver.findElement(By.xpath("(//a[@class='card-link'])[4]"));
 Thread.sleep(1000);
 WebElement link3 =driver.findElement(By.xpath("(//a[@class='card-link'])[10]"));
 WebElement link4 =driver.findElement(By.xpath("(//a[@class='card-link'])[13]"));
 Thread.sleep(1000);
 Actions a = new Actions(driver);
 Thread.sleep(1000);
 a.contextClick(link1).perform();
 Robot r= new Robot();
 
	Thread.sleep(1000);
	
 ArrayList<WebElement> arr=new ArrayList<WebElement>();
 Thread.sleep(1000);
 arr.add(link1);
 arr.add(link2);
 arr.add(link3);
 arr.add(link4);
int count=arr.size();
for(int i=0;i<count;i++)
 {
	 WebElement win = arr.get(i);
	 Thread.sleep(1000);
	 a.contextClick().perform();
	 r.keyPress(KeyEvent.VK_DOWN);
	r.keyRelease(KeyEvent.VK_DOWN);
	Thread.sleep(1000);
	 r.keyPress(KeyEvent.VK_ENTER);
		r.keyRelease(KeyEvent.VK_ENTER);
	}
 Set<String> wind = driver.getWindowHandles();
 for(String win:wind)
 {
	 WebDriver get = driver.switchTo().window(win);
	 Thread.sleep(1000);
	 String title=driver.getTitle();
	 System.out.println(title);
	 driver.close();
	 
 }
	}

}
