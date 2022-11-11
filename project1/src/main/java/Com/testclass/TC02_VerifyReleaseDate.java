package Com.testclass;

import org.testng.Assert;
import org.testng.annotations.Test;

import Com.pomclasses.Imdb;
import Com.pomclasses.Wikipedia;

public class TC02_VerifyReleaseDate extends Baseclass 
{
	@Test

	public void vefityCountryName() {
		Wikipedia k = new Wikipedia(driver);
		String RDate = k.Method4();
		

		driver.navigate().to("https://www.imdb.com/title/tt9389998/");
		Imdb j = new Imdb(driver);
		String RDate2 = j.Method3();

		Assert.assertEquals(RDate,RDate2 );
	}

}

