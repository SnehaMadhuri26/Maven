 import org.openqa.selenium.firefox.FirefoxDriver;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
public class FindallElements {

	public static void main(String[] args) throws InterruptedException {
		// TODO Auto-generated method stub
		System.setProperty("webdriver.gecko.driver",
				 "C:\\Users\\002QU9744\\Documents\\SELENIUM\\Drivers\\geckodriver-v0.33.0-win64\\geckodriver.exe"); 
		WebDriver driver = new FirefoxDriver();
		driver.get("https://www.calculator.net/");
		List<WebElement> links = driver.findElements(By.tagName("a"));
		System.out.println("No. of links present: "+links.size());
		
		for(int i=1;i<links.size();i++)
		{
			System.out.println("Name of the link: "+links.get(i).getText());
		
			
		}
		Thread.sleep(8000);
		driver.manage().window().maximize();
		driver.navigate().to("https://www.calculator.net/mortgage-calculator.html");
		
		System.out.println("Before Clicking Output of isSelected: "+driver.findElement(By.id("caddoptional")).isSelected());
		
		driver.findElement(By.id("caddoptional")).click();
		System.out.println("After Clicking Output of isSelected: "+driver.findElement(By.id("caddoptional")).isSelected());
		
		System.out.println("Output of isEnbaled: "+driver.findElement(By.id("caddoptional")).isEnabled());
		
	}

}
/*
 * package sel;
 * 
 * import java.util.List;
 * 
 * import org.openqa.selenium.By; import org.openqa.selenium.WebDriver; import
 * org.openqa.selenium.WebElement; import
 * org.openqa.selenium.firefox.FirefoxDriver;
 * 
 * public class FindAllElements {
 * 
 * public static void main(String[] args) {
 * 
 * System.setProperty("webdriver.gecko.driver",
 * "C:/Software/drivers/geckodriver.exe"); WebDriver driver = new
 * FirefoxDriver();
 * 
 * driver.manage().window().maximize();
 * driver.get("https://www.calculator.net/");
 * 
 * List<WebElement> links = driver.findElements(By.tagName("a"));
 * System.out.println("No of Links: "+links.size()); for(int
 * i=1;i<links.size();i++) {
 * System.out.println("Name of the link is: "+links.get(i).getText()); } }
 * 
 * }
 */