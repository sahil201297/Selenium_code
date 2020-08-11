package Selenium_demo;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.edge.EdgeDriver;
//import org.openqa.selenium.firefox.FirefoxDriver;



public class Browser {
	WebDriver driver;
String path;
	public void Launch()
	{
//	path=System.getProperty("user.dir")+"//Driver//geckodriver.exe";
//	System.setProperty("webdriver.gecko.driver", path);
//	driver=new FirefoxDriver();
		path=System.getProperty("user.dir")+"//Driver//MicrosoftWebDriver.exe";
		System.setProperty("webdriver.edge.driver", path);
		driver=new EdgeDriver();
	//Deleting Cookies
	driver.manage().deleteAllCookies();
	driver.get("https://opensource-demo.orangehrmlive.com/");
	driver.findElement(By.xpath("//input[@name='txtUsername']")).sendKeys("Admin");
	driver.findElement(By.xpath("//input[@name='txtPassword']")).sendKeys("admin123");
	driver.findElement(By.xpath("//input[@type='submit']")).click();
	}
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Browser oob=new Browser();
		oob.Launch();
	}

}
