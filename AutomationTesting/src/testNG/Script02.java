package testNG;

import org.testng.Reporter;
import org.testng.annotations.Test;

public class Script02 
{
	@Test
	public void Testcase1()
	{
		Reporter.log("Hello", true);
	}
	@Test
	public void Testcase2() 
	{
	Reporter.log("Goodmorning", true);
	}
}
