package seleniumbasics;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.Select;

public class HandlingDropdowns extends Base {

	public void dropDownHandling() {

		driver.navigate().to("https://selenium.qabible.in/select-input.php");

		WebElement selectDropdown = driver.findElement(By.xpath("//select[@id='single-input-field']"));

		// Creating obj for Select class - inbuilt class used to select dropdowns
		Select select = new Select(selectDropdown);

		select.selectByIndex(2); // Select by index

		select.selectByValue("Red"); // Select by value - in dom select the attribute value near value attribute

		select.selectByVisibleText("Green"); // Select by visible text

	}

	public static void main(String[] args) {
		HandlingDropdowns dropdwns = new HandlingDropdowns();
		dropdwns.initializeBrowser();
		dropdwns.dropDownHandling();

	}

}
