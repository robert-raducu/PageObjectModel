package selenium.utils;

import java.time.Duration;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.AfterClass;
import org.testng.annotations.BeforeClass;

public class BaseTest {

	public static WebDriver driver;
	public BasePage app;
	
	@BeforeClass(alwaysRun = true)
	public void setup() {
		// TestNG e ft similara cu JUnit
		// Ne ofera functionalitati suplimentare (TestNG)
		// JUnit - teste unitare
		
		//System.set.property("debdriver.chrome.driver"."path to chromedriver.exe");
		driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
		driver.get("https://keybooks.ro/"); //ii permite sa navigheze catre aplicatie 
		app = new BasePage();
	}
	
	
	@AfterClass(alwaysRun = true)
	public void tearDown() throws InterruptedException {
		Thread.sleep(5000); // bad practice, ar trebui sa apuc si eu sa vad ceva 
		//driver.close(); //inchide tabul curent
		driver.quit(); // inchide fereastra de browser
	}
}
