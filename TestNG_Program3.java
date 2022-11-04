package Asseignements_29_30_Oct;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import org.testng.annotations.*;
import io.github.bonigarcia.wdm.WebDriverManager;

public class TestNG_Program3 {
public static WebDriver driver;
	
	@BeforeTest
	public void launchBrowser() {
		
		WebDriverManager.chromedriver().setup();
		driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(20));	
	}
	@Test (priority=1)
	public void setUp() {
		driver.get("https://www.yahoo.com/");
		
	}
	
	@Test (priority=2)
	public void Signin() {
		driver.findElement(By.xpath("//div[@id='ybarAccountProfile']/child::a[1]")).click();
		
	}
	@Test (priority=3)
	public void createAccount() {
		driver.findElement(By.id("createacc")).click();
	}	

	@Test (priority=4)
	public void FirstName() {
		
		driver.findElement(By.id("usernamereg-firstName")).sendKeys("nad");
	}
	@Test (priority=5)
	public void Lastname() {
		
		driver.findElement(By.id("usernamereg-lastName")).sendKeys("oul");
	}
	@AfterTest 
	public void teardown() {
		driver.quit();
	}
}
