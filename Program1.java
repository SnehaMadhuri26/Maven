 import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.edge.EdgeDriver;

public class Program1 {

	public static void main(String[] args) throws InterruptedException {
		// TODO Auto-generated method stub
		 System.setProperty("webdriver.Edge.driver","C:\\Users\\002QU9744\\Documents\\SELENIUM\\Drivers\\msedgedriver.exe");
		 WebDriver driver = new EdgeDriver();
		 driver.get("https://tutorialsninja.com/demo");
		 driver.manage().window().maximize();
		 driver.findElement(By.name("search")).sendKeys("Iphone");
			//Thread.sleep(3000);
		 driver.findElement(By.cssSelector(".btn.btn-default.btn-lg")).click();
		 driver.findElement(By.xpath("//a[text()='iPhone']")).click();
		String a= driver.findElement(By.xpath("//div[@id='content']//div//div[2]/h1")).getText();
		if(a.equals("iPhone"))
		{
			System.out.println("Yes, it is correct");
			
		}
		String b=driver.findElement(By.xpath("//div[@id='content']//div//div[2]//ul[2]//li/h2")).getText();
		if(b.equals("$123.20"))
		{
			System.out.println("Yes, it is correct");	
		}
		driver.findElement(By.name("quantity")).clear();
		driver.findElement(By.name("quantity")).sendKeys("2");
		driver.findElement(By.id("button-cart")).click();
		System.out.println(driver.findElement(By.xpath("//div[@id='product-product']//div")).getText());
		driver.findElement(By.xpath("//div[@id='cart']/button")).click();
		String c=driver.findElement(By.xpath("//div[@id='cart']//ul//li//table//tbody//tr//td[4]")).getText();
	if(c.equals("$246.40"))
	{
			System.out.println("Yes, it is correct");
	}
		driver.findElement(By.xpath("//div[@id='cart']//a[@href='https://tutorialsninja.com/demo/index.php?route=checkout/cart']//strong")).click();
		driver.findElement(By.xpath("//div[@id='content']//i[@class=\"fa fa-times-circle\"]")).click();
		
		driver.close();
		 

	}

}
