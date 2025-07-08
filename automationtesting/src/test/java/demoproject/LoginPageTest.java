package demoproject;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.testng.annotations.Test;

public class LoginPageTest extends Base
{
  @Test
  public void verifyUserIsAbleToLogin() throws InterruptedException 
  {
	  WebElement username = driver.findElement(By.xpath("//input[@id='loginform-username']"));
	  WebElement password = driver.findElement(By.xpath("//input[@id='loginform-password']"));
	  WebElement loginButton = driver.findElement(By.xpath("//button[@name='login-button']"));
	  username.sendKeys("carol");
	  password.sendKeys("1q2w3e4r");
	  loginButton.click();
	  Thread.sleep(4000);
  }
}
