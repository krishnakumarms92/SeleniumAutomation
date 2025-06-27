package seleniumbasics;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;

public class FindElementsExample extends Base {
	
	public void findingElements() {			//one or same action in multiple elements/field
		
		driver.navigate().to("https://selenium.qabible.in/check-box-demo.php");
		List<WebElement> findingelement = driver.findElements(By.xpath("//input[@class='check-box-list']"));
		for (WebElement ele : findingelement) {
			ele.click();
		}
	}
		

	public static void main(String[] args) {
		FindElementsExample findelements = new FindElementsExample();
		findelements.initializeBrowser();
		findelements.findingElements();

	}

}

