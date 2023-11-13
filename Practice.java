

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
public class Practice {
	public static void main(String[] args) throws InterruptedException {
		System.setProperty("webdriver.chrome.driver","C:\\Users\\002QU9744\\Documents\\SELENIUM\\Drivers\\chromedriver-win64\\chromedriver-win64\\chromedriver.exe"); 
		WebDriver driver = new ChromeDriver();
		
		
		//System.setProperty("webdriver.gecko.driver", "C:/Software/drivers/geckodriver.exe");
		//WebDriver driver = new FirefoxDriver();
		
		//System.setProperty("webdriver.edge.driver", "C:/Software/drivers/msedgedriver.exe");
		//WebDriver driver = new EdgeDriver();
		driver.get("https://petstore.octoperf.com/");
		driver.manage().window().maximize();
		//Thread.sleep(3000);
		//driver.findElement(By.linkText("Enter the Store")).click();
		/*
		 * Thread.sleep(3000); driver.findElement(By.partialLinkText("Sign")).click();
		 * Thread.sleep(3000); driver.findElement(By.name("username")).sendKeys("j2ee");
		 * Thread.sleep(3000); driver.findElement(By.name("password")).clear();
		 * Thread.sleep(3000); driver.findElement(By.name("password")).sendKeys("j2ee");
		 * Thread.sleep(3000); driver.findElement(By.name("signon")).click();
		 * Thread.sleep(3000);
		 */
		driver.findElement(By.tagName("a")).click();
		Thread.sleep(3000);
		driver.findElement(By.xpath("/html/body/div[2]/div[2]/div/div/a")).click();
		Thread.sleep(3000);
		driver.findElement(By.xpath("//div[@id='Catalog']/table/tbody/tr[2]/td/a")).click();
		Thread.sleep(3000);
		driver.findElement(By.xpath("//div[@id='QuickLinks']/a[2]")).click();
		Thread.sleep(3000);
		driver.findElement(By.xpath("//td[text()='Chihuahua']")).click();
		Thread.sleep(3000);
		driver.findElement(By.xpath("//img[@src=\"../images/sm_cats.gif\"]")).click();
		//driver.quit();

		}

}
