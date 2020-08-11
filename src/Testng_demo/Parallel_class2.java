package Testng_demo;

import org.testng.annotations.Test;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;


public class Parallel_class2 {
	String path;
	WebDriver driver;
	@Test
	public void Login()
	{
		path=System.getProperty("user.dir")+"//Driver//geckodriver.exe";
		System.setProperty("webdriver.gecko.driver", path);
		driver=new FirefoxDriver();
		driver.manage().deleteAllCookies();
		driver.manage().timeouts().implicitlyWait(5, TimeUnit.SECONDS);
		driver.get("https://opensource-demo.orangehrmlive.com/");
	}

}
