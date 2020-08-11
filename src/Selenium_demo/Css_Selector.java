package Selenium_demo;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Css_Selector {
	String path,text;
	WebDriver driver;
	
public void Launch()
{
	path=System.getProperty("user.dir")+"//Driver//chromedriver.exe";
	System.setProperty("webdriver.chrome.driver", path);
	driver=new ChromeDriver();
	driver.get("https://opensource-demo.orangehrmlive.com/");
	driver.findElement(By.cssSelector("input#txtUsername")).sendKeys("Admin");
	driver.findElement(By.cssSelector("input#txtPassword")).sendKeys("admin");
	driver.findElement(By.cssSelector("input#btnLogin")).click();
	
	
	
}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Css_Selector oo=new Css_Selector();
		oo.Launch();
	}

}
