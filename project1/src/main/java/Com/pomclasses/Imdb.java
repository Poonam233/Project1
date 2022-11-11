package Com.pomclasses;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class Imdb {
	public WebDriver driver;
	
	@FindBy(xpath="//a[@href='/search/title/?country_of_origin=IN&ref_=tt_dt_cn']")
	private WebElement CountryName1;
	
	@FindBy(xpath="(//a[@href='/title/tt9389998/releaseinfo?ref_=tt_dt_rdat'])[1]")
	private WebElement ReleaseDate1;
	
	public String Method2() 
	{
	String Country=	CountryName1.getText();
	return Country;
	}
	
	public String Method3() 
	{
		String Date= ReleaseDate1.getText();
		return Date;
	}
	
	 public Imdb(WebDriver driver)
	 {
		 this.driver=driver;
		 PageFactory.initElements(driver, this);
	 }


	}


