package basicScripts;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

public class Https {

	public static void main(String[] args) throws InterruptedException
	{
		System.setProperty("webdriver.chrome.driver", "./Softwares/chromedriver.exe");
		WebDriver driver=new ChromeDriver();
		driver.manage().window().maximize();
        driver.navigate().to("http://106.51.87.42:9007/");
        WebElement usn=driver.findElement(By.id("email"));
        Thread.sleep(2000);
        usn.sendKeys("Fresher@gmail.com");
        WebElement pwd=driver.findElement(By.id("password"));
        Thread.sleep(2000);
        pwd.sendKeys("Fresher@2024");
        WebElement butt=driver.findElement(By.xpath("//button[@type='submit']"));
        Thread.sleep(2000);
        butt.click();
        WebElement pat=driver.findElement(By.xpath("//li[@class='active  root-level']"));
        pat.click();
        WebElement add=driver.findElement(By.xpath("//button[@class='btn btn-primary pull-right']"));
        Thread.sleep(2000);
        add.click();
        WebElement nam=driver.findElement(By.xpath("//input[@type='text' and @name='name']"));
nam.sendKeys("amulya");
WebElement ema=driver.findElement(By.xpath("//input[@name='email']"));
ema.sendKeys("ashikahs13@gmail.com");
WebElement ps=driver.findElement(By.xpath("//input[@name='password']"));
ps.sendKeys("devika212");
WebElement but1=driver.findElement(By.xpath("//input[@type='submit']"));
but1.click();



	}

}
