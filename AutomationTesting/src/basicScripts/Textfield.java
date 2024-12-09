package basicScripts;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Textfield {

	public static void main(String[] args) throws InterruptedException
	{
		System.setProperty("webdriver.chrome.driver", "./Softwares/chromedriver.exe");
		WebDriver driver=new ChromeDriver();
		driver.manage().window().maximize();
        driver.navigate().to("file:///C:/Users/panch/OneDrive/Desktop/Selenium/Textfield.html");
        List<WebElement> check=driver.findElements(By.xpath("//input[@type='text']"));
        int count=check.size();
       
        Thread.sleep(2000);
        for(int i=count-1;i>=0;i--)
        {
        	if(i%2==0)
        	{
	        WebElement ele1=check.get(i);
	        Thread.sleep(1000);
        	ele1.clear();
        	 }
        }
        
Thread.sleep(1000);
driver.quit();
{
	
}

	}

}
