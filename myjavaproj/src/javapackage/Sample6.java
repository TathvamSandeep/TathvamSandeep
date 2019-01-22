package javapackage;

import org.openqa.selenium.By;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

public class Sample6 
{
	//Data Members
	public ChromeDriver driver;
	public WebDriverWait w;
	//Constructor Method
	public Sample6()
	{
		System.setProperty("webdriver.chrome.driver","D:\\MyStudy\\Testing\\TestingSoftwares\\Selenium\\chromedriver.exe");
		driver=new ChromeDriver();
		w=new WebDriverWait(driver,100);
	}
	//Operational Methods
	public void Launch(String u) throws Exception
	{
		driver.get(u);
		driver.manage().window().maximize();
		Thread.sleep(5000);
	}
	public void emailid()
	{
		driver.findElement(By.xpath("//*[@name='identifier']")).sendKeys("18peednas");
		w.until(ExpectedConditions.visibilityOfElementLocated(By.xpath("//*[@id='identifierNext']")));
		driver.findElement(By.xpath("//*[@id='identifierNext']")).click();
	}
	public void password()
	{
		w.until(ExpectedConditions.visibilityOfElementLocated(By.xpath("//*[@name='password']")));
		driver.findElement(By.xpath("//*[@name='password']")).sendKeys("s1n4e5p81");
		w.until(ExpectedConditions.visibilityOfElementLocated(By.xpath("//*[@id='passwordNext']")));
		driver.findElement(By.xpath("//*[@id='passwordNext']")).click();
		w.until(ExpectedConditions.visibilityOfElementLocated(By.xpath("//*[contains(text(),'COMPOSE')]")));
		driver.findElement(By.xpath("//*[contains(text(),'COMPOSE')]")).isDisplayed();
	}
	public void close()
	{
		driver.close();
	}
}
