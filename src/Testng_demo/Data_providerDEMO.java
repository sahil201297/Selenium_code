package Testng_demo;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.DataProvider;
import org.testng.annotations.Test;

public class Data_providerDEMO {
	String path;
	WebDriver driver;
	@DataProvider(name="Logindata")
	public Object[][] demo()
	{
		Object[][] userdata=new Object[3][2];
		userdata[0][0]="admin";
		userdata[0][1]="ad";
		
		userdata[1][0]="admin";
		userdata[1][1]="a123";
		
		userdata[2][0]="Admin";
		userdata[2][1]="admin123";
		
		return userdata;
		
	}
	@Test(dataProvider="Logindata")
	public void Login(String uname,String pass)
	{
		path=System.getProperty("user.dir")+"//Driver//chromedriver.exe";
		System.setProperty("webdriver.chrome.driver", path);
		driver=new ChromeDriver();
		driver.manage().deleteAllCookies();
		driver.get("https://opensource-demo.orangehrmlive.com/");
		driver.findElement(By.cssSelector("input#txtUsername")).sendKeys(uname);
		driver.findElement(By.cssSelector("input#txtPassword")).sendKeys(pass);
		driver.findElement(By.cssSelector("input#btnLogin")).click();
//		System.out.println("Username is:"+uname);
//		System.out.println("Password is:"+pass);		
	}

}
