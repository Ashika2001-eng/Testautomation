package testNG;

import org.testng.Reporter;
import org.testng.annotations.Test;

public class Script
{
@Test(invocationCount = 2)
public void Testcase1() 
{
	Reporter.log("hello", true);
}
@Test(invocationCount = 0)
public void Testcase2() 
{
	Reporter.log("hello", true);
}
}
