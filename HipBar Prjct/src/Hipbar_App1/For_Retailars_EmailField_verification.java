package Hipbar_App1;


import java.io.File;
import java.io.IOException;

import org.apache.commons.io.FileUtils;
import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.testng.Assert;
import org.testng.annotations.Test;

public class For_Retailars_EmailField_verification 
{
	WebDriver driver;

	@Test(priority=1)
	public void EmailField_Verification() throws InterruptedException, IOException
	{
	driver=new FirefoxDriver();	
	driver.get("https://www.hipbar.com/");
	Thread.sleep(2000);
	driver.manage().window().maximize();
	Thread.sleep(2000);
	driver.findElement(By.xpath(".//*[@id='snp-bld-step-1']/form/div[1]/button")).click();
	Thread.sleep(2000);
	driver.findElement(By.xpath(".//*[@id='c-button--slide-left']")).click();
	Thread.sleep(2000);
	driver.findElement(By.xpath(".//*[@id='c-menu--slide-left']/ul/li[3]/a")).click();
	for(int i=1;i<=35;i++)
	{
		driver.findElement(By.tagName("body")).sendKeys(Keys.DOWN);
	}
	Thread.sleep(2000);
	driver.findElement(By.name("input_1")).sendKeys("raja");
	Thread.sleep(2000);
	driver.findElement(By.name("input_2")).sendKeys("pyroferus");
	Thread.sleep(2000);
	
	driver.findElement(By.name("input_3")).sendKeys("rajapyro");
	Thread.sleep(2000);
	driver.findElement(By.id("gform_submit_button_3")).click();
	Thread.sleep(2000);
	
   try
   {
	   System.out.println(driver.findElement(By.xpath(".//*[@id='field_3_3']/div[2]")).getText());
		  System.out.println("Email field verification is pass");
		       
   }
   catch(Throwable t)
   {
	   System.out.println("Email field verification is fail");
  	 File scrFile = ((TakesScreenshot)driver).getScreenshotAs(OutputType.FILE);
     
  	 FileUtils.copyFile(scrFile, new File("E:\\School_Web_prjct\\Hipbar\\Error_Email_filed.jpg"),true); 

	   Assert.assertTrue(false);
	   
   }
   driver.close();
   
	}
}
