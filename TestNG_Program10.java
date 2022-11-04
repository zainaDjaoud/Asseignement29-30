package Asseignements_29_30_Oct;

import java.time.Duration;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.*;
import io.github.bonigarcia.wdm.WebDriverManager;


public class TestNG_Program10 {
	
public static WebDriver driver;
@BeforeTest
	public void launchBrowser(){
		WebDriverManager.chromedriver(). setup();
		driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(20));	
	}
	@Test ( priority=1)
	public void setUp()  {
		driver.get("https://www.netflix.com/");    
		
	}
	@Test  ( priority=2)
	public void Signin  () {
		driver.findElement(By.cssSelector("a.authLinks.redButton")).click();
		
	}
	@Test(priority=3)
	public void EmailAdress ()  {
		
		driver.findElement(By.id("id_userLoginId")).sendKeys("nina9@gmail.com");
	}
	@Test (priority=4 )
	
	public void Password() {
		driver.findElement(By.name("password")).sendKeys("Nn987");
	}
	@Test ( priority = 5)
	public void SignIn  () {
		driver.findElement(By.cssSelector("button.btn.login-button.btn-submit.btn-small")).click();
		}
	@AfterTest 
	public void teardown() {
		driver.quit();
	}


}
