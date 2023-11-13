import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.firefox.FirefoxDriver;

public class Checkbox {

	public static void main(String[] args) throws InterruptedException {
		// TODO Auto-generated method stub
		System.setProperty("webdriver.gecko.driver", "C:\\Users\\002QU9744\\Documents\\SELENIUM\\Drivers\\geckodriver-v0.33.0-win64\\geckodriver.exe"); 
		WebDriver driver = new FirefoxDriver();
		driver.navigate().to("https://www.calculator.net/mortgage-calculator.html");
	
		System.out.println("Check box status: "+ driver.findElement(By.xpath("//span[@class='cbmark']")).isEnabled());
		
		driver.findElement(By.xpath("//span[@class='cbmark']")).click();
		Boolean a=driver.findElement(By.xpath("//span[@class='cbmark']")).isSelected();
		System.out.println(a);
		driver.findElement(By.xpath("//span[@class='cbmark']")).click();
		
		System.out.println("Check box status: "+ driver.findElement(By.xpath("//span[@class='cbmark']")).isEnabled());

	
	}

}
/*
 * package sel;
 * 
 * import org.openqa.selenium.By; import org.openqa.selenium.WebDriver; import
 * org.openqa.selenium.firefox.FirefoxDriver;
 * 
 * public class CheckBoxDemo {
 * 
 * public static void main(String[] args) {
 * System.setProperty("webdriver.gecko.driver",
 * "C:/Software/drivers/geckodriver.exe"); WebDriver driver = new
 * FirefoxDriver();
 * 
 * driver.manage().window().maximize();
 * driver.navigate().to("https://www.calculator.net/mortgage-calculator.html");
 * 
 * System.out.println("Before Clicking Output of isSelected: "+driver.
 * findElement(By.id("caddoptional")).isSelected());
 * 
 * driver.findElement(By.id("caddoptional")).click();
 * System.out.println("After Clicking Output of isSelected: "+driver.findElement
 * (By.id("caddoptional")).isSelected());
 * 
 * System.out.println("Output of isEnbaled: "+driver.findElement(By.id(
 * "caddoptional")).isEnabled());
 * 
 * 
 * }
 * 
 * }
 */