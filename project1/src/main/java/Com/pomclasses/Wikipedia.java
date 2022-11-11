package Com.pomclasses;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class Wikipedia 
{
public	WebDriver driver;

@FindBy(xpath="//td[text()='India']")
private WebElement CountryName;

@FindBy(xpath="(//li[contains(text(),'17')])[1]")
private WebElement ReleaseDate2;


public String Method1() {
String Country=	CountryName.getText();
return Country;
}
public String Method4() 
{
	String Date2=ReleaseDate2.getText();
	return Date2;
}

public Wikipedia(WebDriver driver)
{
	this.driver=driver;
	
	PageFactory.initElements(driver, this);
	
}

}
