import static org.junit.jupiter.api.Assertions.*;

import org.junit.BeforeClass;
import org.junit.jupiter.api.Test;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.edge.EdgeDriver;

class Programcart {
	//System.setProperty("webdriver.Edge.driver","C:\\Users\\002QU9744\\Documents\\SELENIUM\\Drivers\\msedgedriver.exe");
	WebDriver driver = new EdgeDriver();
	
@BeforeClass
void test1() {

driver.get("https://tutorialsninja.com/demo");
driver.manage().window().maximize();
}
@Test
void test2() {
	 driver.findElement(By.name("search")).sendKeys("Iphone");
		//Thread.sleep(3000);
	 driver.findElement(By.cssSelector(".btn.btn-default.btn-lg")).click();

}





}
