import org.openqa.selenium.WebDriver;
import org.openqa.selenium.edge.EdgeDriver;
import java.sql.*;
public class Program2 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.setProperty("webdriver.Edge.driver","C:\\Users\\002QU9744\\Documents\\SELENIUM\\Drivers\\msedgedriver.exe");
		 WebDriver driver = new EdgeDriver();
		 driver.get("https://tutorialsninja.com/demo");
		 

	}

}
