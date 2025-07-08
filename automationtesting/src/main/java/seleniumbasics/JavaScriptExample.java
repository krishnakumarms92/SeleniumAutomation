package seleniumbasics;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class JavaScriptExample {
	WebDriver driver;
	public void amazonLink() {
		driver = new ChromeDriver();
		driver.navigate().to("https://www.amazon.in/");
		driver.manage().window().maximize();
		JavascriptExecutor executor = (JavascriptExecutor) driver;	//javascript executor is an interface and is initialized
		//executor.executeScript("window.scrollBy(0,3000)");		//abstract method(scroll pixel)
		//executor.executeScript("window.scrollBy(0,-1500)");
		
		WebElement searchClick = driver.findElement(By.xpath("//input[@id='nav-search-submit-button']"));
		executor.executeScript("arguments[0].click();", searchClick);
	}
	
	
	
	

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		JavaScriptExample js = new JavaScriptExample();
		js.amazonLink();
	}

}
