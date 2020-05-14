import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.AfterSuite;
import org.testng.annotations.BeforeSuite;
import org.testng.annotations.Test;

public class LoginTest {
	
	public static WebDriver driver;
	
	@BeforeSuite
	public void setUp() throws InterruptedException
	{
		driver=new ChromeDriver();
		
	}
	@Test
	public void doLogin() throws InterruptedException
	{
		
		driver.get("https://gmail.com");
		Thread.sleep(10000);
		driver.findElement(By.id("identifierId")).sendKeys("ayushsharma09@gmail.com");
		driver.findElement(By.xpath("//span[text()='Next']")).click();
		driver.findElement(By.id("SignIn")).click();
	}
	@AfterSuite
	public void tearDown()
	{
		driver.quit();
	}

}
