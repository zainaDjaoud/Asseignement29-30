package Asseignements_29_30_Oct;

import java.time.Duration;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.*;
import io.github.bonigarcia.wdm.WebDriverManager;


public class TestNG_Program9 {
	
public static WebDriver driver;
	
	@BeforeTest
public void launchBrowser() {
		WebDriverManager.chromedriver().setup();
		driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(20));	
	}
	
	@Test  (priority = 1)
	public void setUp () {
		driver.get("https://www.shopper.com/");    	
	}
	
	@Test  ( priority=2)
	public void GetStarted (){
	driver.findElement(By.className("_caption")).click();
		
	}
	@Test(priority = 3)
	public void Email() {
		
		driver.findElement(By.name("email")).sendKeys("zan92@gmail.com");
	}
	
	@Test (priority =4 )
	
	public void Password() {
		driver.findElement(By.name("password")).sendKeys("abc@852 ");
	}
	
	@Test ( priority = 5)
	public void Login(){
		driver.findElement(By.className("login_button_text")).click();
	
	}
	@AfterTest 
	public void teardown() {
		driver.quit();
	}
}
