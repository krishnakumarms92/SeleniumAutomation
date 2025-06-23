package seleniumbasics;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Base {
	WebDriver driver; // globally declared

	public void initializeBrowser() {
		driver = new ChromeDriver();
		driver.get("https://selenium.qabible.in/index.php");
		driver.manage().window().maximize();

	}

	public void quitAndClose() {
		// driver.close(); will close the current window(page)
		driver.quit(); // will close multiple windows(pages)
	}

	public static void main(String[] args) {
		Base base = new Base();
		base.initializeBrowser();
		base.quitAndClose();

	}

}
