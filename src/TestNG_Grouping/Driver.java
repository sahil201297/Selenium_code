package TestNG_Grouping;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.AfterSuite;
import org.testng.annotations.BeforeSuite;

public class Driver {
	public static String path;
	public static WebDriver driver;
	
	@BeforeSuite(groups= {"Smoke"})
	public void Launch_Driver()
	{
		path=System.getProperty("user.dir")+"//Driver//chromedriver.exe";
		System.setProperty("webdriver.chrome.driver", path);
		driver=new ChromeDriver();
		driver.manage().deleteAllCookies();
		driver.manage().timeouts().implicitlyWait(5, TimeUnit.SECONDS);
		driver.get("https://opensource-demo.orangehrmlive.com/");
	}
	@AfterSuite(groups= {"Sanity"})
	public void close_browser()
	{
		driver.close();

	}
}
