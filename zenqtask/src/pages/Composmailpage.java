package pages;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class Composmailpage 
{
	WebDriver driver;
	
	@FindBy(xpath="//*[contains(text(),'Compose')]")
	public WebElement compose;
	
	@FindBy(name="to")
	public WebElement comto;
	
	@FindBy(name="subjectbox")
	public WebElement comsubox;
	
	@FindBy(xpath="(//*[@aria-label='Message Body'])[2]")
	public WebElement compmsg;
	
	@FindBy(xpath="//*[@data-tooltip='Attach files']")
	public WebElement compattch;
	
	@FindBy(xpath="//*[contains(text(),'Send')]")
	public WebElement compsnd;
	
	public Composmailpage(WebDriver driver)
	{
		this.driver=driver;
		PageFactory.initElements(driver,this);
	}
	
	public void compclk()
	{
		compose.click();
	}
	
	public void comptosnd(String x)
	{
		comto.sendKeys(x);
	}
	
	public void compsub(String x)
	{
		comsubox.sendKeys(x);
	}
	
	public void comptomsg(String x)
	{
		compmsg.sendKeys(x);
	}
	
	public void compattchfl()
	{
		compattch.click();
	}
	
	public void clksend()
	{
		compsnd.click();
	}
}
