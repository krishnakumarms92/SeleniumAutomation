package seleniumbasics;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;

public class CheckBoxAndRadioButtons extends Base{

	public void checkBox()
	{
		driver.navigate().to("https://selenium.qabible.in/check-box-demo.php");
		WebElement checkbox = driver.findElement(By.id("gridCheck"));
		
		System.out.println(checkbox.isSelected());	//to check if the element is selected or not - returns boolean
		checkbox.click();
			
		
	}
	
	//HomeWork
	public void radioButton() {
		driver.navigate().to("https://selenium.qabible.in/radio-button-demo.php");
		WebElement demoMale = driver.findElement(By.id("inlineRadio1"));
		demoMale.click();
		
	}
	
	public static void main(String[] args) {
				
		CheckBoxAndRadioButtons btns = new CheckBoxAndRadioButtons();
		btns.initializeBrowser();
		btns.checkBox();
		btns.radioButton();
	}

}
