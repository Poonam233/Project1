package Com.testclass;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;

import Com.pomclasses.Wikipedia;
import io.github.bonigarcia.wdm.WebDriverManager;

public class Baseclass 
{
	public WebDriver driver;
	@BeforeMethod
	public void SetupMethod() 
	{
		WebDriverManager.chromedriver().setup();
		driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(20,TimeUnit.SECONDS);
		driver.get("https://en.wikipedia.org/wiki/Pushpa:_The_Rise");
	
	}
	@AfterMethod
	public void tearDownMethod() {
		driver.quit();
	}
}
