
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.edge.EdgeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

public class New {

	public static void main(String[] args) throws InterruptedException {
		// TODO Auto-generated method stub
		/*
		 * System.setProperty("webdriver.chrome.driver",
		 * "C:\\Users\\002QU9744\\Documents\\SELENIUM\\Drivers\\chromedriver-win64\\chromedriver-win64\\chromedriver.exe"
		 * ); WebDriver driver = new ChromeDriver();
		 */

		
		/*
		 * System.setProperty("webdriver.gecko.driver",
		 * "C:\\Users\\002QU9744\\Documents\\SELENIUM\\Drivers\\geckodriver-v0.33.0-win64\\geckodriver.exe"
		 * ); WebDriver driver = new FirefoxDriver();
		 */
		 
		 System.setProperty("webdriver.Edge.driver","C:\\Users\\002QU9744\\Documents\\SELENIUM\\Drivers\\msedgedriver.exe");
		 WebDriver driver = new EdgeDriver();
		 driver.get("https://petstore.octoperf.com/");
			
			  driver.get("https://www.amazon.in/"); driver.manage().window().maximize();
			  
			  driver.findElement(By.className("nav-line-2")).click(); Thread.sleep(3000);
			  driver.findElement(By.className("a-button-input")).click();
			  driver.findElement(By.id("ap_email")).sendKeys("7780161373");
			  driver.findElement(By.className("a-button-input")).click();
			  driver.findElement(By.name("password")).sendKeys("722000");
			  driver.findElement(By.id("signInSubmit")).click();
			  driver.findElement(By.id("twotabsearchtextbox")).sendKeys("Lakme cream");
			  driver.findElement(By.id("nav-search-submit-button")).click();
			  driver.findElement(By.className("_bXVsd_image_1pfbQ")).click();
			  
			  driver.close();
			 





	}

}
