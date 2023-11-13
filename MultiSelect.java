import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.edge.EdgeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.support.ui.Select;

public class MultiSelect {

	public static void main(String[] args) throws InterruptedException {
		// TODO Auto-generated method stub
//		System.setProperty("webdriver.chrome.driver",
//				  "C:\\Users\\002QU9744\\Documents\\SELENIUM\\Drivers\\chromedriver-win64\\chromedriver-win64\\chromedriver.exe" );
//		
//		WebDriver driver = new ChromeDriver();

		 System.setProperty("webdriver.Edge.driver","C:\\Users\\002QU9744\\Documents\\SELENIUM\\Drivers\\msedgedriver.exe");
		 WebDriver driver = new EdgeDriver();
//	driver.get("https://demoqa.com/select-menu");
//	WebElement options=driver.findElement(By.xpath("//div[@class=' css-1wa3eu0-placeholder']"));
//	options.click();
//	Thread.sleep(8000);
//	driver.close();
	driver.manage().window().maximize();
	driver.get("https://demoqa.com/select-menu");
	
	//Selecting tyhe multiselect element
	Select select = new Select(driver.findElement(By.id("cars")));
	
	//getting the list of all the options
	List<WebElement> options = select.getOptions();
	for(WebElement option: options) {
		System.out.println(option.getText());
	}

	//Using isMultiple() to verify the element is multi-select. if yes go to next step else exit
	if(select.isMultiple()) {
		//selecting the option BY Index
		System.out.println("Selecting option by Index: ");
		select.selectByIndex(2);
		Thread.sleep(8000);
		
		//select option by value
		System.out.println("Selecting option by value: ");
		select.selectByValue("saab");
		Thread.sleep(8000);
		
		//select option by visible text
		System.out.println("Selecting option by visible text");
		select.selectByVisibleText("Audi");
		Thread.sleep(3000);
		
		//get list of selected options
		List<WebElement> SelectedOptions = select.getAllSelectedOptions();
		for(WebElement SelectedOption: SelectedOptions) {
			System.out.println(SelectedOption.getText());
		}
		
		//Deselect by index
		select.deselectByIndex(3);
		Thread.sleep(3000);
		//Deselect by visible text
		select.deselectByVisibleText("Opel");
		Thread.sleep(3000);
		
		//validate both are deselected
		List<WebElement> SelectedOptionsAfterDeselect = select.getAllSelectedOptions();
		for(WebElement SelectedOptionAfterDeselect: SelectedOptionsAfterDeselect) {
			System.out.println("After Deselection Options left: "+SelectedOptionAfterDeselect.getText());
		}
		
		//Deselect all values
		select.deselectAll();
	

	}

}}














//package sel;
//
//import java.util.List;
//
//import org.openqa.selenium.By;
//import org.openqa.selenium.WebDriver;
//import org.openqa.selenium.WebElement;
//import org.openqa.selenium.chrome.ChromeDriver;
//import org.openqa.selenium.support.ui.Select;
//
//public class MultiSelect {
//
//	public static void main(String[] args) throws InterruptedException {
//		System.setProperty("webdriver.chrome.driver", "C:/Software/drivers/chromedriver.exe");
//		WebDriver driver = new ChromeDriver();
//		
//		driver.manage().window().maximize();
//		driver.get("https://demoqa.com/select-menu");
//		
//		//Selecting tyhe multiselect element
//		Select select = new Select(driver.findElement(By.id("cars")));
//		
//		//getting the list of all the options
//		List<WebElement> options = select.getOptions();
//		for(WebElement option: options) {
//			System.out.println(option.getText());
//		}
//
//		//Using isMultiple() to verify the element is multi-select. if yes go to next step else exit
//		if(select.isMultiple()) {
//			//selecting the option BY Index
//			System.out.println("Selecting option by Index: ");
//			select.selectByIndex(2);
//			Thread.sleep(3000);
//			
//			//select option by value
//			System.out.println("Selecting option by value: ");
//			select.selectByValue("saab");
//			Thread.sleep(3000);
//			
//			//select option by visible text
//			System.out.println("Selecting option by visible text");
//			select.selectByVisibleText("Audi");
//			Thread.sleep(3000);
//			
//			//get list of selected options
//			List<WebElement> SelectedOptions = select.getAllSelectedOptions();
//			for(WebElement SelectedOption: SelectedOptions) {
//				System.out.println(SelectedOption.getText());
//			}
//			
//			//Deselect by index
//			select.deselectByIndex(3);
//			Thread.sleep(3000);
//			//Deselect by visible text
//			select.deselectByVisibleText("Opel");
//			Thread.sleep(3000);
//			
//			//validate both are deselected
//			List<WebElement> SelectedOptionsAfterDeselect = select.getAllSelectedOptions();
//			for(WebElement SelectedOptionAfterDeselect: SelectedOptionsAfterDeselect) {
//				System.out.println("After Deselection Options left: "+SelectedOptionAfterDeselect.getText());
//			}
//			
//			//Deselect all values
//			select.deselectAll();
//			Thread.sleep(3000);
//			driver.quit();
//		}
//	}
//
//}