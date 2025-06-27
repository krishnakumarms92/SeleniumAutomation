package seleniumbasics;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;

public class InputForm extends Base {

	public void enterMessage() {

		driver.navigate().to("https://selenium.qabible.in/simple-form-demo.php");
		WebElement messagebox = driver.findElement(By.id("single-input-field"));

		System.out.println(messagebox.isEnabled()); // to check the field is enabled or not

		messagebox.sendKeys("Hello");
		WebElement showButton = driver.findElement(By.id("button-one"));
		showButton.click();

		// HomeWork
//		WebElement valueA = driver.findElement(By.id("value-a"));
//		WebElement valueB = driver.findElement(By.id("value-b"));
//		WebElement getTotal = driver.findElement(By.id("button-two"));
//		
//		valueA.sendKeys("10");
//		valueB.sendKeys("20");
//		getTotal.click();

		// HomeWork2
		WebElement valueOne = driver.findElement(By.id("value-a"));
		WebElement valueTwo = driver.findElement(By.id("value-b"));
		WebElement getTotalValue = driver.findElement(By.id("button-two"));

		valueOne.sendKeys("Hello");
		valueTwo.sendKeys("Selenium");
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		InputForm form = new InputForm();
		form.initializeBrowser();
		form.enterMessage();

	}

}
