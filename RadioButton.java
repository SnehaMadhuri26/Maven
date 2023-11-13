import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

public class RadioButton {

	public static void main(String[] args) throws InterruptedException {
		// TODO Auto-generated method stub
		System.setProperty("webdriver.gecko.driver", "C:\\Users\\002QU9744\\Documents\\SELENIUM\\Drivers\\geckodriver-v0.33.0-win64\\geckodriver.exe"); 
		WebDriver driver = new FirefoxDriver();
		driver.get("https://www.calculator.net/mortgage-payoff-calculator.html");
		Boolean c=driver.findElement(By.xpath("//*[text()='Payback altogether']")).isSelected();
		System.out.println(c);
driver.findElement(By.xpath("//*[text()='Payback altogether']")).click();
Boolean b=driver.findElement(By.xpath("//*[text()='Payback altogether']")).isSelected();

System.out.println(b);
	}

}
/*
 * driver.manage().window().maximize(); driver.navigate().to(
 * "https://www.calculator.net/mortgage-payoff-calculator.html");
 * 
 * System.out.println("The output of isSelected before Click: "+driver.
 * findElement(By.id("cpayoff1")).isSelected()); //Click on Radio Button
 * driver.findElement(By.id("cpayoff1")).click();
 * System.out.println("The output of isSelected after Click: "+driver.
 * findElement(By.id("cpayoff1")).isSelected());
 */