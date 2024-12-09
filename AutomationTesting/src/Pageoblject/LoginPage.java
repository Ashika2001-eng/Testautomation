package Pageoblject;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;


public class LoginPage 
{
@FindBy(id="email")
private WebElement usn;
@FindBy(id="pass")
private WebElement psw;
@FindBy(name="login")
private WebElement login;
 public LoginPage(WebDriver driver)
 {
	 PageFactory.initElements(driver, this);
 }
 public void Enterusn()
 {
	 usn.sendKeys("ashika14@gmail");
 }
 public void Enterpsw()
 {
	 psw.sendKeys("ashika@123");
 }
 public void Clicklogin()
 {
	 login.click();
 }
}
