package basicScripts;

import java.util.ArrayList;
import java.util.Set;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

public class Fetchandclose 
{

	public static void main(String[] args) throws InterruptedException
	{
		System.setProperty("webdriver.gecko.driver", "./Softwares/geckodriver.exe");
		WebDriver driver=new FirefoxDriver();
		driver.manage().window().maximize();
driver.get("https://demoapps.qspiders.com/ui/browser/multipleTabs?sublist=3");
Thread.sleep(1000);
 driver.findElement(By.id("browserButton2")).click();
 Set<String> wins = driver.getWindowHandles();
 ArrayList<String> arr=new ArrayList<String>(wins);
int count=wins.size();
for(int i=0;i<count;i++)
{
	String win=arr.get(i);
	driver.switchTo().window(win);
	String title=driver.getTitle();
	System.out.println(title);
	Thread.sleep(1000);
	driver.close();
}

	}

}
