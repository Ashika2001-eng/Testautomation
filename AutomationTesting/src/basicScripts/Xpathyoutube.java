package basicScripts;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.firefox.FirefoxDriver;

public class Xpathyoutube {

	public static void main(String[] args) 
	{
		System.setProperty("webdriver.gecko.driver", "./Softwares/geckodriver.exe");
		WebDriver driver=new FirefoxDriver();
		driver.manage().window().maximize();
		driver.get("https://www.youtube.com/");
		WebElement  search=driver.findElement(By.cssSelector("input[id='search']"));
		search.sendKeys("songs");
		WebElement  cli=driver.findElement(By.cssSelector("button[id='search-icon-legacy']"));
		cli.click();
	}

}
