package tests;

import java.awt.Robot;
import java.awt.Toolkit;
import java.awt.datatransfer.StringSelection;
import java.awt.event.KeyEvent;
import java.io.File;
import java.io.IOException;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.WebDriverWait;

import pages.Composmailpage;
import pages.Homepage;
import pages.Loginpage;
import pages.Logoutpage;
import pages.Mailboxpage;

import jxl.Sheet;
import jxl.Workbook;
import jxl.read.biff.BiffException;
import jxl.write.Label;
import jxl.write.WritableSheet;
import jxl.write.WritableWorkbook;

public class RunnerClass 
{
	public static void main(String[] args) throws Exception
	{
		//Open Excel file for test data reading
		File f=new File("gmaildatatest.xls");
		Workbook rwb=Workbook.getWorkbook(f);
		Sheet rsh=rwb.getSheet(0);
		int nour=rsh.getRows();
		int nouc=rsh.getColumns();
		//Open same excel file for results writing
		WritableWorkbook wwb=Workbook.createWorkbook(f,rwb);
		WritableSheet wsh=wwb.getSheet(0);
		//Data driven testing in POM
		for(int i=1;i<nour;i++)
		{
			String u=rsh.getCell(0,i).getContents();
			String uc=rsh.getCell(1,i).getContents();
			String p=null;
			String pc=null;
			if(uc.equalsIgnoreCase("valid"))
			{
				p=rsh.getCell(2,i).getContents();
				pc=rsh.getCell(3,i).getContents();
			}
			//Launch site
			System.setProperty("webdriver.chrome.driver",
								     "D:\\MyStudy\\Testing\\TestingSoftwares\\Selenium\\NewSelenium\\Selenium\\BrowserDriver\\chromedriver.exe");           
			ChromeDriver driver=new ChromeDriver();
			driver.get("http://www.gmail.com");
			driver.manage().window().maximize();
			Thread.sleep(5000);
			//create objects to page classes
			Homepage hp=new Homepage(driver);
			Loginpage lp=new Loginpage(driver);
			Mailboxpage mp=new Mailboxpage(driver);
			Composmailpage cp=new Composmailpage(driver);
			Logoutpage lop=new Logoutpage(driver);
			//Fill user-id and click next
			hp.filluid(u);
			hp.clickuidnext();
			Thread.sleep(5000);
			try
			{
			//User-id validations
			try
				{
					if(u.length()==0 && hp.uidblankerr.isDisplayed())
					{
						Label l=new Label(nouc,i,"Test passed for blank uid");
						wsh.addCell(l);
					}
					else if(uc.equalsIgnoreCase("invalid") && hp.uidinvaliderr.isDisplayed())
					{
						Label l=new Label(nouc,i,	"Test passed for invalid uid");
						wsh.addCell(l);
					}
					else if(uc.equalsIgnoreCase("valid") && 	lp.pwd.isDisplayed())
					{
						//Enter password and click next
						lp.fillpwd(p);
						lp.clickpwd();
						Thread.sleep(20000);
						//Password validations
						if(p.length()==0 && lp.pwdblankerr.isDisplayed())
						{
							Label l=new Label(nouc,i,	"Test passed for blank pwd");
							wsh.addCell(l);
							}
							else if(pc.equalsIgnoreCase("invalid") && lp.pwdinvaliderr.isDisplayed())
							{
								Label l=new Label(nouc,i,	"Test passed for invalid pwd");
								wsh.addCell(l);
							}
							else if(pc.equalsIgnoreCase("valid") &&	cp.compose.isDisplayed())
							{
								Label l=new Label(nouc,i,	"Test passed for valid pwd");
								wsh.addCell(l);
							}
							else
							{
								Label l=new Label(nouc,i,"Test failed for pwd");
								wsh.addCell(l);
							}
						}
						else
						{
							Label l=new Label(nouc,i,"Test failed for userid");
							wsh.addCell(l);
						}
					}
					catch(Exception ex)
					{
						Label l=new Label(nouc,i,"Test interrupted");
						wsh.addCell(l);
					}
			//Send Mail with Attachment
			cp.compclk();
			//driver.findElement(By.xpath("//*[Contains(text(),'Compose')]")).click();
			Thread.sleep(5000);
			cp.comptosnd("Tathvamsandeep@gmail.com");
			Thread.sleep(5000);
			cp.compsub("FileAttachment");
			Thread.sleep(5000);
			cp.comptomsg("Hi");
			Thread.sleep(5000);
			cp.compattchfl();
			Thread.sleep(5000);
			//File Upload
			String sf="C:\\Users\\Public\\Pictures\\birds.jpg";
			StringSelection ssc= new StringSelection(sf);
			Toolkit.getDefaultToolkit().getSystemClipboard().setContents(ssc,null);
			Robot r=new Robot();
			r.keyPress(KeyEvent.VK_CONTROL);
			r.keyPress(KeyEvent.VK_V);
			r.keyRelease(KeyEvent.VK_V);
			r.keyRelease(KeyEvent.VK_CONTROL);
			Thread.sleep(8000);
			r.keyPress(KeyEvent.VK_ENTER);
			r.keyRelease(KeyEvent.VK_ENTER);
			Thread.sleep(20000);
			//Send
			cp.clksend();
			//Signout
			lop.logsclk();
			Thread.sleep(5000);
			lop.logoutclk();
			Thread.sleep(8000);
			//Close site
			driver.close();
		}
		catch(Exception xx)
		{
			System.out.println("Exception Occured");
		}
	}
		//Save and close excel file
		wwb.write(); //save
		wwb.close();
		rwb.close();
	}
}