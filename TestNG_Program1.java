package Asseignements_29_30_Oct;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.*;

import io.github.bonigarcia.wdm.WebDriverManager;

public class TestNG_Program1  {
	
	public static WebDriver driver;
	
	@BeforeTest 
	
	public void launchBrowser()  {
		WebDriverManager.chromedriver().setup ();
		driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(20));
		
	}
	@Test (priority = 1)
	 public void setUp () {
		driver.get("https://www.facebook.com/");	
		
	}
	@Test (priority =2 )
	public void CreateNewAccount() {
		
		driver.findElement(By.linkText("Create new account")). click();
		
	}
	@Test (priority=3)
	public void EnterFirstname () {
		 driver.findElement(By.name("firstname")).sendKeys("zaina");
		
	}
	@Test ( priority=4 )
	public void EnterLastname () { 
		
		driver.findElement(By.name("lastname")).sendKeys("Ould");
		
	}
	@Test (priority= 5)
	public void EnterEmailAdress () {
		
		driver.findElement(By.name("reg_email__")).sendKeys("zaina19@icloud.com");
		
	}
	@AfterTest
	public void tesrdown() {
		driver.quit();
	}

}
