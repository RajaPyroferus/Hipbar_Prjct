package Hipbar_App;

import java.net.MalformedURLException;
import java.net.URL;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.remote.DesiredCapabilities;
import org.openqa.selenium.remote.RemoteWebDriver;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.Test;

public class Browse_Drinks_Scenerio 
{
	WebDriver driver;
	
	//drinks Application
	@BeforeClass
	public void setup() throws MalformedURLException
	{
	DesiredCapabilities capabilities = new DesiredCapabilities();
	capabilities.setCapability("deviceName","0123456789ABCDEF");
	capabilities.setCapability("VERSION", "4.2.2");
	capabilities.setCapability("platformName","Android");
	              // Here we mention the app's package name, to find the package name we  have to convert .apk file into java class files
	capabilities.setCapability("appPackage","in.hipbar.hipbar_user_app");
	              //Here we mention the activity name, which is invoked initially as app's first page.
	capabilities.setCapability("appActivity","in.hipbar.hipbar_user_app.UI.Activities.SplashScreenActivity");
	//capabilities.setCapability("app-wait-activity","LoginActivity,NewAccountActivity");

	driver = new RemoteWebDriver(new URL("http://127.0.0.1:4723/wd/hub"), capabilities);

	}

@Test
public void BrowsDrinks()
{
	driver.findElement(By.id("in.hipbar.hipbar_user_app:id/ll_browse")).click();
}
	
	
}
