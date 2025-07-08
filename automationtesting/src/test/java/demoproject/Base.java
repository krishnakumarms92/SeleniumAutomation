package demoproject;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;

public class Base 
{
	WebDriver driver;
  @BeforeMethod
  public void beforeMethod() 
  {
	  driver=new ChromeDriver();
	  driver.get("https://www.qabible.in/payrollapp/");
	  driver.manage().window().maximize();
	  
  }

  @AfterMethod
  public void afterMethod() 
  {
	  driver.quit();
  }

}
