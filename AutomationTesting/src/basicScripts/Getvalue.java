package basicScripts;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.firefox.FirefoxDriver;

public class Getvalue {

	public static void main(String[] args) throws InterruptedException 
	{
		System.setProperty("webdriver.gecko.driver", "./Softwares/geckodriver.exe");
		WebDriver driver=new FirefoxDriver();
		driver.manage().window().maximize();
		driver.navigate().to("https://www.facebook.com/");
		WebElement usn=driver.findElement(By.id("email"));
		String val=usn.getCssValue("border-bottom-color");
		System.out.println(val);
		String family=usn.getCssValue("font-family");
		System.out.println(family);
		Thread.sleep(1000);
		driver.quit();

	}

}
