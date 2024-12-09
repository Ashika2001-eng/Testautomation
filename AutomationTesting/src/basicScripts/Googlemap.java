package basicScripts;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.remote.server.handler.FindElement;

public class Googlemap {

	public static void main(String[] args) throws InterruptedException
	{
		System.setProperty("webdriver.gecko.driver", "./Softwares/geckodriver.exe");
		WebDriver driver=new FirefoxDriver();
		driver.manage().window().maximize();
		driver.get("https://www.google.com/maps");
		WebElement  div=driver.findElement(By.xpath("//button[@id='hArJGc']"));
		Thread.sleep(2000);
		div.click();
		WebElement  src=driver.findElement(By.xpath("//input[@style='border: medium; padding: 0px; margin: 0px; height: auto; width: 100%; outline: none;' and @placeholder='Choose starting point, or click on the map...']"));
		Thread.sleep(3000);
		src.sendKeys("qspider rajajinagar");
		WebElement  des=driver.findElement(By.xpath("//input[@ aria-label='Choose destination...']"));
		des.sendKeys("jp nagar metro");
	}

}
