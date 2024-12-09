package basicScripts;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.remote.server.handler.FindElement;

public class Demoq {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.setProperty("webdriver.gecko.driver", "./Softwares/geckodriver.exe");
		WebDriver driver=new FirefoxDriver();
		driver.manage().window().maximize();
		driver.get("https://demoapps.qspiders.com/ui?scenario=1");
		WebElement name=driver.findElement(By.cssSelector("input[id='name']"));
		name.sendKeys("ashika");
		WebElement email=driver.findElement(By.cssSelector("input[id='email']"));
		email.sendKeys("ashikahs14@gmail.com");
				WebElement psw=driver.findElement(By.cssSelector("input[id='password']"));
		psw.sendKeys("devika@132");
		WebElement cli=driver.findElement(By.xpath("//button[@type='submit']"));
		cli.click();
		
	}

}
