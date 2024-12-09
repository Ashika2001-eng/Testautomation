package basicScripts;

import java.io.File;
import java.io.IOException;
import java.util.Date;
import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.io.FileHandler;

public class Alllinkscreenshot {

	public static void main(String[] args) throws IOException, InterruptedException 
	{
		System.setProperty("webdriver.chrome.driver", "./softwares/chromedriver.exe");
		WebDriver driver=new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://www.amazon.com");
	 List<WebElement> links = driver.findElements(By.xpath("//img"));
	int count = links.size();
	 Date d = new Date();
		String d1=d.toString().replace(":", "-");
		System.out.println(d1);
		for(int i=0;i<count;i++) 
		{
			WebElement lin=links.get(i);
			//String copy = lin.getAttribute("href");
			//System.out.println(copy);
			TakesScreenshot ts=(TakesScreenshot)driver;
			File temp = ts.getScreenshotAs(OutputType.FILE);
			File perm=new File("./Screenshots/"+i+""+"amazon.png");
		FileHandler.copy(temp,perm);
		}
		Thread.sleep(1000);
	driver.quit();

	}

}
