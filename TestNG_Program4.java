package Asseignements_29_30_Oct;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

import io.github.bonigarcia.wdm.WebDriverManager;

public class TestNG_Program4 {
	
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
		driver.get("https://www.walgreens.com/");	
		
	}
	@Test (priority=2)
	public void Account() {
		driver.findElement(By.cssSelector("span.inner-focus.hide-on-mobile.truncate")).click();
	}
	@Test (priority=3)
	public void Register() {
		driver.findElement(By.id("pf-dropdown-register")).click();
	}
	@Test (priority=4)
	public void Firstname () {
		driver.findElement(By.id("wag-RXUser-firstname")).sendKeys("Nad");;
	}
	@Test (priority=5)
	public void Lastname() {
		driver.findElement(By.id("wag-RXUser-lastname")).sendKeys("jad");
	}
	@AfterTest 
	public void teardown() {
		driver.quit();
	}


}
