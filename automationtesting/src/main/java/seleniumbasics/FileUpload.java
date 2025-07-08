package seleniumbasics;

import java.awt.AWTException;
import java.awt.Robot;
import java.awt.Toolkit;
import java.awt.datatransfer.StringSelection;
import java.awt.event.KeyEvent;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class FileUpload {
	WebDriver driver;

	public void uploadFile() {

		driver = new ChromeDriver();
		driver.get("https://the-internet.herokuapp.com/upload");
		driver.manage().window().maximize();
		WebElement chooseFile = driver.findElement(By.id("file-upload"));
		chooseFile.sendKeys("C:\\Users\\admin\\OneDrive\\Desktop\\Test.docx"); //file location on desktop
		WebElement uploadButton = driver.findElement(By.id("file-submit")); //upload button path
		uploadButton.click();

	}

	public void roboClassFileUpload() throws AWTException {

		driver = new ChromeDriver();
		driver.get("https://www.ilovepdf.com/pdf_to_word");
		driver.manage().window().maximize();
		WebElement pdfClick = driver.findElement(By.xpath("//a[@id='pickfiles']"));
		pdfClick.click();
		
		//string selection class is used to perform keyboard actions
		StringSelection selection = new StringSelection("C:\\Users\\admin\\OneDrive\\Desktop\\Test.pdf");
		
		//Copy the item
		Toolkit.getDefaultToolkit().getSystemClipboard().setContents(selection,null);
		
		//Robot class object creation
		Robot robot = new Robot();
		robot.delay(2000);
		robot.keyPress(KeyEvent.VK_CONTROL);
		robot.keyPress(KeyEvent.VK_V);
		robot.keyRelease(KeyEvent.VK_CONTROL);
		robot.keyRelease(KeyEvent.VK_V);
		robot.keyPress(KeyEvent.VK_ENTER);
		robot.keyRelease(KeyEvent.VK_ENTER);
		
	}

	public static void main(String[] args) throws AWTException {
		FileUpload uploads = new FileUpload();
		//uploads.uploadFile();
		uploads.roboClassFileUpload();

	}

}
