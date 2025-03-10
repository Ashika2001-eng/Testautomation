package basicScripts;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class DragandDrop {

	public static void main(String[] args) throws InterruptedException 
	{
		System.setProperty("webdriver.chrome.driver", "./Softwares/chromedriver.exe");
		WebDriver driver=new ChromeDriver();
		driver.manage().window().maximize();
        driver.navigate().to("http://www.dhtmlgoodies.com/scripts/drag-drop-custom/demo-drag-drop-3.html#google_vignette");
       WebElement src=driver.findElement(By.id("box2"));
      WebElement dst=driver.findElement(By.id("box102"));
       WebElement src1=driver.findElement(By.id("box3"));
      WebElement dst1=driver.findElement(By.id("box103"));
        Actions a= new Actions(driver);
        Thread.sleep(2000);
        a.dragAndDrop(src, dst).perform();
        Thread.sleep(2000);
        a.dragAndDrop(src1, dst1).perform();
	}

}
