package seleniumbasics;

public class BrowserCommands extends Base {

	public void browserCommands() {
		String Title = driver.getTitle();
		System.out.println(Title);
		String URL = driver.getCurrentUrl();
		System.out.println(URL);
		String pageSource = driver.getPageSource();
		System.out.println(pageSource);
	}

	public static void main(String[] args) {
		BrowserCommands commands = new BrowserCommands();
		commands.initializeBrowser();
		commands.browserCommands();
		

	}

}
