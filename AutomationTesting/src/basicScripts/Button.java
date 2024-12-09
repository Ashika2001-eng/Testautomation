package basicScripts;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.firefox.FirefoxDriver;

public class Button {

	public static void main(String[] args)
	{
		System.setProperty("webdriver.gecko.driver", "./Softwares/geckodriver.exe");
		WebDriver driver=new FirefoxDriver();
		driver.manage().window().maximize();
		driver.get("https://demoapps.qspiders.com/ui/button?sublist=0");
				
		WebElement yes=driver.findElement(By.xpath("//button[@id='btn']"));
		yes.click();
		WebElement no=driver.findElement(By.xpath("//button[@id='btn3']"));
	no.click();
				WebElement b1=driver.findElement(By.xpath("//button[@id='btn4']"));
		b1.click();
		WebElement b2=driver.findElement(By.xpath("//button[@id='btn5']"));
		b2.click();
		WebElement b3=driver.findElement(By.xpath("//button[@id='btn6']"));
		b3.click();
		WebElement b4=driver.findElement(By.xpath("//button[@id='btn7']"));
		b4.click();
		driver.quit();
	}

}
