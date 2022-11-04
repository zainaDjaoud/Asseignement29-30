package Asseignements_29_30_Oct;
import java.io.File;
import org.openqa.selenium.By;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.WindowType;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.io.FileHandler;

import io.github.bonigarcia.wdm.WebDriverManager;

public class ScreenShots {

	public static WebDriver driver;

	public static void main(String[] args) throws Exception {
		WebDriverManager.chromedriver().setup();
		driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://www.facebook.com/");
		
		WebElement HomepageScreen = driver.findElement(By.cssSelector("div._8esk"));
		File source = HomepageScreen.getScreenshotAs(OutputType.FILE);
		File destination = new File("C:\\Users\\zynad\\eclipse-workspace\\AUTOMATION_BATCH\\ScreenShot\\ScreenShot1.png");
		FileHandler.copy(source, destination);
		
		driver.switchTo().newWindow(WindowType.TAB);
		driver.navigate().to("https://rediff.com");
		WebElement LogoBar = driver.findElement(By.className("logobar"));
		File source1 = LogoBar.getScreenshotAs(OutputType.FILE);
		File destination1 = new File("C:\\Users\\zynad\\eclipse-workspace\\AUTOMATION_BATCH\\ScreenShot\\ScreenShot2.png");
		FileHandler.copy(source1, destination1);
		
		driver.switchTo().newWindow(WindowType.TAB);
		driver.navigate().to("https://amazon.com");
		WebElement NavigationBar = driver.findElement(By.id("navbar"));
		File source2 = NavigationBar.getScreenshotAs(OutputType.FILE);
		File destination2 = new File("C:\\Users\\zynad\\eclipse-workspace\\AUTOMATION_BATCH\\ScreenShot\\ScreenShot3.png");
		FileHandler.copy(source2, destination2);
		
		driver.switchTo().newWindow(WindowType.TAB);
		driver.navigate().to("https://us.shein.com/?ref=www&rep=dir&ret=us");
		WebElement Homepage = driver.findElement(By.cssSelector("div.c-outermost-ctn.j-outermost-ctn"));
		File source3 = Homepage.getScreenshotAs(OutputType.FILE);
		File destination3 = new File("C:\\Users\\zynad\\eclipse-workspace\\AUTOMATION_BATCH\\ScreenShot\\ScreenShot4.png");
		FileHandler.copy(source3, destination3);
		
		driver.switchTo().newWindow(WindowType.TAB);
		driver.navigate().to("https://www.google.com/");
		WebElement GooglePage = driver.findElement(By.className("L3eUgb"));
		File source4 = GooglePage.getScreenshotAs(OutputType.FILE);
		File destination4 = new File("C:\\Users\\zynad\\eclipse-workspace\\AUTOMATION_BATCH\\ScreenShot\\ScreenShot5.png");
		FileHandler.copy(source4, destination4);
	}
}