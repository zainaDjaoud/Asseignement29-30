package Asseignements_29_30_Oct;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import org.testng.annotations.*;

import io.github.bonigarcia.wdm.WebDriverManager;

public class TestNG_Program5 {
	public static WebDriver driver;
	
	@BeforeTest
	
	public void launchBrowser() {
		WebDriverManager.chromedriver().setup();
		driver = new ChromeDriver();
		driver.manage().window().maximize();
	
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(20));
		
	}
	@Test (priority=1)
	public void setUp () {
		driver.get("https://www.rediff.com/");	
		
	}
	@Test (priority=2 )
	public void CreateAccount() {
		driver.findElement(By.xpath("//p[@id='signin_info']/child::a[2]")).click();
	}
	
	@Test  (priority=3)
	public void Fullname() {
		driver.findElement(By.xpath("//table[@id='tblcrtac']/descendant::input[1]")).sendKeys("Berber");
		

	}
	@Test(priority= 4)
	 public void Password  () {
		driver.findElement(By.xpath("//em[@id='eyeiconNew']/preceding::input[1]")).sendKeys("@874Z");;
	}
	@Test (priority =5)
	public void RetapePassword() {
		driver.findElement(By.id("newpasswd1")).sendKeys("@874Z");
	}
	 @AfterTest 
	public void teardown () {
		driver.quit();
	}

}
