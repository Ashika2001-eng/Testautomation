package runnerScript;

import org.testng.annotations.Test;

import GenericScript.BasePage;
import Pageoblject.LoginPage;

public class Testcase01 extends BasePage
{
@Test
public void Login() throws InterruptedException
{
	LoginPage lp=new LoginPage(driver);
	lp.Enterusn();
	lp.Enterpsw();
	lp.Clicklogin();
//	driver.navigate().refresh();
//	Thread.sleep(2000);
//	lp.Enterusn();
//	lp.Enterpsw();
//
	}

}
