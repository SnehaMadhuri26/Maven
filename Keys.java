import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.firefox.FirefoxDriver;


public class Keys {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.setProperty("webdriver.gecko.driver", "C:\\Users\\002QU9744\\Documents\\SELENIUM\\Drivers\\geckodriver-v0.33.0-win64\\geckodriver.exe"); 
		WebDriver driver = new FirefoxDriver();
		driver.get("https://www.google.com/");
		WebElement element = driver.findElement(By.name("q"));
		element.sendKeys("Selenium WebDriver");
		element.sendKeys(org.openqa.selenium.Keys.ENTER);
		
		//driver.close();

	}

}
//package sel;
//
//import org.openqa.selenium.By;
//import org.openqa.selenium.Keys;
//import org.openqa.selenium.WebDriver;
//import org.openqa.selenium.WebElement;
//import org.openqa.selenium.chrome.ChromeDriver;
//
//public class KeysEx {
//
//	public static void main(String[] args) {
//		System.setProperty("webdriver.chrome.driver", "C:/Software/drivers/chromedriver.exe");
//		WebDriver driver = new ChromeDriver();
//		
//		driver.manage().window().maximize();
//		driver.get("https://www.google.com/");
//		
//		WebElement element = driver.findElement(By.name("q"));
//		
//		element.sendKeys("Selenium WebDriver");
//		element.sendKeys(Keys.ENTER);
//
//	}
//
//}