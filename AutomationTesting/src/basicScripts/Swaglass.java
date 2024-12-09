package basicScripts;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.firefox.FirefoxDriver;

public class Swaglass {

	public static void main(String[] args) throws InterruptedException
	{
		System.setProperty("webdriver.gecko.driver", "./Softwares/geckodriver.exe");
		WebDriver driver=new FirefoxDriver();
		driver.manage().window().maximize();
		driver.get("https://www.saucedemo.com/v1/");
		Thread.sleep(2000);
		WebElement usn = driver.findElement(By.xpath("//input[@id='user-name']"));
		Thread.sleep(1000);
		usn.sendKeys("standard_user");
		WebElement psw = driver.findElement(By.xpath("//input[@id='password']"));
		psw.sendKeys("secret_sauce");
		WebElement login = driver.findElement(By.xpath("//input[@id='login-button']"));
		Thread.sleep(1000);
		login.click();
		Thread.sleep(1000);
		WebElement all = driver.findElement(By.xpath("(//div[@class='inventory_item_name'])[1]"));
		Thread.sleep(1000);
		String pro1 = all.getText();
		System.out.println(pro1);
		WebElement price1 = driver.findElement(By.xpath("(//div[@class='inventory_item_price'])[1]"));
		Thread.sleep(1000);
		String pri1 = price1.getText();
		String string1 = pri1.toString().replace("$"," ");
		//System.out.println(pri12);output is $29.99 .To convert from $ to string format we use above statement.
		System.out.println(string1);
	WebElement cart= driver.findElement(By.xpath("(//img[@class='inventory_item_img'])[1]"));
		cart.click();
		WebElement cpage= driver.findElement(By.xpath("//div[@class='inventory_details_name']"));
		Thread.sleep(1000);
		String pro2 = cpage.getText();
		System.out.println(pro2);
		WebElement price2 = driver.findElement(By.xpath("//div[@class='inventory_details_price']"));
		Thread.sleep(1000);
		String pri2 = price2.getText();
		String string2 = pri2.toString().replace("$"," ");
		//System.out.println(pri2);
		System.out.println(string2);
		WebElement add= driver.findElement(By.xpath("//button[@class='btn_primary btn_inventory']"));
		Thread.sleep(1000);
		add.click();
		if(pro1==pro2)
		{
			System.out.println("same product name");
		}
		else
		{
			System.out.println("different");
		}
		WebElement hamberger= driver.findElement(By.xpath("//button[.='Open Menu']"));
		hamberger.click();
		WebElement logout= driver.findElement(By.xpath("//a[@id='logout_sidebar_link']"));
		logout.click();
		driver.quit();
		
		
	}

}
