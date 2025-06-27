package seleniumbasics;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;

public class Locators extends Base {

	public void idLocator() {
		WebElement messageField = driver.findElement(By.id("single-input-field")); // WebElement is interface
		WebElement button = driver.findElement(By.id("button-one"));
	}

	public void nameLocator() {
		WebElement nameField = driver.findElement(By.name("description"));
		WebElement authorName = driver.findElement(By.name("author"));
	}

	public void classLocator() {
		WebElement classField = driver.findElement(By.className("form-control"));
	}

	public void linkLocator() {
		WebElement linklocator = driver.findElement(By.linkText("check-box-demo.php"));
	}

	public void partiallinkLocator() {
		WebElement partiallink = driver.findElement(By.partialLinkText("check-box-de"));
	}

	public void cssSelectorLocator() {
		// Syntax:
		// tag and id, tag and class, tag and attribute, tag class and attribute
		// tag#id
		// tag[attribute=attribute value]
		// tag.class[attribute type =attribute value]
		// tag.class

		WebElement tagIdLocator = driver.findElement(By.cssSelector(null));
	}

	public void xpathLocator() {
		WebElement absoluteXpath = driver
				.findElement(By.xpath("/html/body/section/div/div/div[2]/div[1]/div/div[2]/form/div[1]/input"));
		
		// tagname[@Attribute='attributevalue'] - Relative xpath syntax
		WebElement relXpath = driver.findElement(By.xpath("//input[@id='single-input-field']"));
		
		//tagname[contains(@attribute,'attributeValue']
		WebElement contains = driver.findElement(By.xpath("//input[contains(@id,'single-input-field')]"));	
		
		//tagname[text()='Value']
		WebElement textValue = driver.findElement(By.xpath("//button[text()='Show Message']"));
		
		WebElement indexValue = driver.findElement(By.xpath("(//input[@type='text'])[1]"));
	
	
	
	
	
	
	}


	public static void main(String[] args) {
		// TODO Auto-generated method stub

	}

}
