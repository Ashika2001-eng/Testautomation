package basicScripts;

import org.openqa.selenium.Alert;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class alertPopup {

	public static void main(String[] args) throws InterruptedException 
	{
		System.setProperty("webdriver.chrome.driver", "./Softwares/chromedriver.exe");
		WebDriver driver=new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://demoapps.qspiders.com/ui/alert/prompt?sublist=2");
		Thread.sleep(2000);
		WebElement ele=driver.findElement(By.xpath("//button[.='Prompt Alert Box']"));
		ele.click();
		Alert popup=driver.switchTo().alert();
		popup.sendKeys("yes");
		//String msg=popup.getText();
	//	System.out.println(msg);
		popup.accept();
		//popup.dismiss();
//driver.quit();-pp
	}

}
