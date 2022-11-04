package Asseignements_29_30_Oct;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.*;


import io.github.bonigarcia.wdm.WebDriverManager;

public class TestNG_Program8 {
public static WebDriver driver;
	
	@BeforeTest 
	
	public void launchBrowser() {
		
		WebDriverManager.chromedriver().setup ();
		driver =  new ChromeDriver();
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(20));	
	} 
	
	@Test (priority =1)
	 public void setUp(){
		driver.get("https://www.wish.com/");	
		
	}
	@Test (priority =2 )
	
	public void Firstname() {
		
		driver.findElement(By.name("firstname")).sendKeys("Ayline");
		
	}
	@Test (priority = 3)
	public void LastName () {
		 driver.findElement(By.name("lastname")).sendKeys("Beauty");
		
	}
	@Test ( priority =4 )
public void  Password() {
		
		driver.findElement(By.name("password")).sendKeys("ZN951");
		
	}
	
	@Test (priority= 5)
	public void Continue () {
		driver.findElement(By.xpath("//input[@name='password']/following::div[1]")).click();
		
	}
	@AfterTest
	public void tesrdown() {
		driver.quit();
	}


}
