package Asseignements_29_30_Oct;

import java.time.Duration;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import org.testng.annotations.*;

import io.github.bonigarcia.wdm.WebDriverManager;

public class TestNG_Program2 {
	public static WebDriver driver;
	
	@BeforeTest
	public void launchBrowser(){
		WebDriverManager.chromedriver(). setup();
		driver = new ChromeDriver();
		
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(20));
		
	}
	@Test (priority=1)
	public void setUp () {
		driver.get("https://www.bjs.com/");    
		
	}
	@Test  ( priority=2)
	public void Signin() 
	{
		driver.findElement(By.cssSelector("span.login-state.ml-1")).click();
		
	}
	@Test(priority=3)
	public void EmailAdress() {
		
		driver.findElement(By.id("emailLogin")).sendKeys("zaina19@icloud.com");
	}
	@Test (priority=4 )
	
	public void Password() {
		driver.findElement(By.id("inputPassword")).sendKeys("@1234");
	}
	@Test ( priority =5)
	public void ShowPassword() {
		driver.findElement(By.className("eyeOn")).click();
	}
	@AfterTest 
	public void teardown() {
		driver.quit();
	}

}
