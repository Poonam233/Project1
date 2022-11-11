package Com.testclass;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.Assert;
import org.testng.annotations.Test;

import Com.pomclasses.Imdb;
import Com.pomclasses.Wikipedia;

public class TC01_VerifyCountryName extends Baseclass {
	@Test

	public void vefityCountryName() {
		Wikipedia k = new Wikipedia(driver);
		String Country1 = k.Method1();

		driver.navigate().to("https://www.imdb.com/title/tt9389998/");
		Imdb j = new Imdb(driver);
		String Country2 = j.Method2();

		Assert.assertEquals(Country1, Country2);
	}

}
