package seleniumbasics;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;

public class Frames extends Base{
	
	public void framesExample() {
		driver.navigate().to("https://demo.guru99.com/test/guru99home/");
		WebElement iFrameLoc = driver.findElement(By.xpath("//iframe[@id='a077aa5e']"));
		driver.switchTo().frame(iFrameLoc);
		WebElement frameLoc = driver.findElement(By.xpath("//img[@src='Jmeter720.png']"));
		frameLoc.click();
		
	}

	public static void main(String[] args) {
		Frames frames = new Frames();
		frames.initializeBrowser();
		frames.framesExample();

	}

}
