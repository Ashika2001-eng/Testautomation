package basicScripts;

import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

public class Script03 {

	public static void main(String[] args)
	{
		System.setProperty("webdriver.chrome.driver", "./Softwares/chromedriver.exe");
		System.setProperty("webdriver.gecko.driver", "./Softwares/geckodriver.exe");
		ChromeDriver driver =new ChromeDriver();
		FirefoxDriver drivers=new FirefoxDriver();
	}

}
