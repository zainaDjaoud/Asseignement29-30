package Asseignements_29_30_Oct;

import java.time.Duration;

import org.openqa.selenium.By;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.*;

import io.github.bonigarcia.wdm.WebDriverManager;

public class TestNG_Program6 {
public static WebDriver driver;
	
	@BeforeTest 
	
	public void launchBrowser(){
		WebDriverManager.chromedriver().setup ();
		driver =  new ChromeDriver();
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(20));	
	} 
	
	@Test (priority =1)
	 public void setUp(){
		driver.get("https://www.lyft.com/");	
		
	}
	@Test (priority=2 )
	public void signUp() {
		
		driver.findElement(By.xpath("//div[@class='sc-crXcEl dTQqNL']/child::a[1]")). click();
		
	}
	@Test (priority = 3)
	public void EnterPhoneNumber () {
		 driver.findElement(By.id("phone")).sendKeys("267895431");
		
	}
	@Test ( priority=4 )
	public void Keepmesigned(){ 
		
		driver.findElement(By.id("extendTokenLifetime")).click();
		
	}
	@Test (priority= 5)
	public void ClickenNext() {
		
		driver.findElement(By.cssSelector("button.sc-174wt3j-0.sc-174wt3j-1.fuRIOt.caIImg")).click();
		
	}
	@AfterTest
	public void tesrdown() {
		driver.quit();
	}

}



