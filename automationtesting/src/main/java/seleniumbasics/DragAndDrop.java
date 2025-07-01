package seleniumbasics;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;

public class DragAndDrop extends Base{
	
	public void dragNdrop() {
		
		driver.navigate().to("https://selenium.qabible.in/drag-drop.php");
		WebElement dragLoc = driver.findElement(By.xpath("//span[text()='Draggable n°1']"));
		
		Actions actions = new Actions(driver);		//Mouse actions
		actions.moveToElement(dragLoc).click();		//movetoElement - will move pointer to the region
		actions.doubleClick(dragLoc).perform();
		//actions.moveToElement(dragLoc).doubleClick().perform();   this can also be used
		WebElement dropLoc = driver.findElement(By.id("mydropzone"));
		actions.dragAndDrop(dragLoc, dropLoc).build().perform();
		
	}

	public static void main(String[] args) {
		
		DragAndDrop dragAndDrop = new DragAndDrop();
		dragAndDrop.initializeBrowser();
		dragAndDrop.dragNdrop();

	}

}
