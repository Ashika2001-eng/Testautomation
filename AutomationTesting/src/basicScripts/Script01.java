package basicScripts;

import org.openqa.selenium.chrome.ChromeDriver;

public class Script01 {

	public static void main(String[] args) 
	{
		String key="webdriver.chrome.driver";
		String value="./Softwares/chromedriver.exe";
		System.setProperty(key, value);
		ChromeDriver driver=new ChromeDriver();
		
		driver.get("https://www.youtube.com/");
		
		
	}

}
