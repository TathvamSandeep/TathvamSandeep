package pages;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class Logoutpage 
{
public WebDriver driver;
	
	@FindBy(xpath="//*[@class='gb_cb gbii']")
	public WebElement lgclk;
	
	@FindBy(xpath="//*[contains(text(),'Sign out')]")
	public WebElement lgout;
	
	public Logoutpage(WebDriver driver)
	{
		this.driver=driver;
		PageFactory.initElements(driver,this);
	}
	
	public void logsclk()
	{
		lgclk.click();
	}
	
	public void logoutclk()
	{
		lgout.click();
	}
}
