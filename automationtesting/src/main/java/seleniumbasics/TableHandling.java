package seleniumbasics;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;

public class TableHandling extends Base {

	public void readFullTableData() {

		driver.navigate().to("https://selenium.qabible.in/table-pagination.php");

		WebElement fullTable = driver.findElement(By.xpath("//table[@id='dtBasicExample']"));
		System.out.println(fullTable.getText());

	}

	public void singleRowSelection() {
		driver.navigate().to("https://selenium.qabible.in/table-pagination.php");
		WebElement singleRow = driver.findElement(By.xpath("//table[@id='dtBasicExample']/tbody/tr[2]")); // tablebody/tablerow[index
																											// position]
		System.out.println("Single row selected is: "+ singleRow.getText());

	}

	public void selectData() {
		driver.navigate().to("https://selenium.qabible.in/table-pagination.php");
		WebElement singleData = driver.findElement(By.xpath("//table[@id='dtBasicExample']/tbody/tr[2]/td[3]")); 
		// tablebody/tablerow[index position]/tableData[index position]
		System.out.println("Single data of the table: "+ singleData.getText());
	}

	public void selectColumnData() {
		driver.navigate().to("https://selenium.qabible.in/table-pagination.php");
		List<WebElement> columnData = driver.findElements(By.xpath("//table[@id='dtBasicExample']/tbody/tr/td[3]"));
		for(WebElement ele:columnData) {
			System.out.println("column value is: "+ ele.getText());
		}
	}
	public void searchParticularData() {
		
		String input = "Senior Javascript Developer";
		driver.navigate().to("https://selenium.qabible.in/table-pagination.php");
		List<WebElement> myData = driver.findElements(By.xpath("//table[@id='dtBasicExample']/tbody/tr[4]/td[2]"));
		for (WebElement findElement : myData) {
			if(findElement.getText().equals(input)) {
				System.out.println(findElement.getText());
			}
			
		}
		
	}
	public static void main(String[] args) {

		TableHandling table = new TableHandling();
		table.initializeBrowser();
		table.readFullTableData();
		System.out.println("********************  *********************  *********************");
		table.singleRowSelection();
		System.out.println("********************  *********************  *********************");
		table.selectData();
		System.out.println("********************  *********************  *********************");
		table.selectColumnData();
		System.out.println("********************  *********************  *********************");
		table.searchParticularData();
	}

}
