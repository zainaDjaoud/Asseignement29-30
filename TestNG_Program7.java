package Asseignements_29_30_Oct;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.*;

import io.github.bonigarcia.wdm.WebDriverManager;

public class TestNG_Program7 {
public static WebDriver driver;
	
	@BeforeTest
public void launchBrowser()  {
		
	WebDriverManager.chromedriver().setup();
	driver = new ChromeDriver();
	driver.manage().window().maximize();
	driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(20));	
	
	}
	@Test (priority=1)
	public void setUp(){
		
		driver.get("https://venmo.com/");
		
	}
	
	@Test (priority= 2)
	public void SendandReceive(){
		driver.findElement(By.className("btn__content")).click();
		
	}
	
	@Test (priority=3)
	public void Login() {
		
		driver.findElement(By.xpath("//div[@class='organisms-navbar-secondContainer']/child::a[1]")).click();
	}	
	@Test (priority=4)
	public void mobilePhone() {
		
		driver.findElement(By.name("phoneEmailUsername")).sendKeys("265897143");
	}
	
	@Test (priority = 5)
	public void Password(){
		
		driver.findElement(By.name("password")).sendKeys("Abc123");
	}
	@AfterTest 
	public void teardown() {
		driver.quit();
	}	

}
