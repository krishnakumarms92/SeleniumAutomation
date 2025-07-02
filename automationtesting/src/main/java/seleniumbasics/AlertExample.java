package seleniumbasics;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;

public class AlertExample extends Base{

	public void alertSample() {
		
		driver.navigate().to("https://selenium.qabible.in/javascript-alert.php");
		WebElement clickMeAlert1 = driver.findElement(By.xpath("(//button[text()='Click me!'])[1]"));
		clickMeAlert1.click();
		
		driver.switchTo().alert().accept();
	}
	
	public void alertConfirm() {
		driver.navigate().to("https://selenium.qabible.in/javascript-alert.php");
		WebElement clickAlertConfirm = driver.findElement(By.xpath("//button[@class='btn btn-warning']"));
		clickAlertConfirm.click();
		
		driver.switchTo().alert().dismiss();
	}
	
	public void alertPrompt() {
		driver.navigate().to("https://selenium.qabible.in/javascript-alert.php");
		WebElement promptAlert = driver.findElement(By.xpath("//button[@class='btn btn-danger']"));
		promptAlert.click();
		
		driver.switchTo().alert().sendKeys("Hello");
		//driver.switchTo().alert().accept();
	}
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		AlertExample alerts = new AlertExample();
		alerts.initializeBrowser();
		alerts.alertSample();
		alerts.alertConfirm();
		alerts.alertPrompt();

	}

}
