package Selenium_demo;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class NavigateMethod {
	WebDriver driver;
String path;
	public void acc() throws InterruptedException
	{
		path=System.getProperty("user.dir")+"//Driver//chromedriver.exe";
		System.setProperty("webdriver.chrome.driver", path);
		driver=new ChromeDriver();
		driver.manage().deleteAllCookies();//to delete all cookies
		//Provide url of the application through navigate method and we can move back  and forward,refresh pages throgh navigate path
		driver.navigate().to("https://opensource-demo.orangehrmlive.com/");
		Thread.sleep(5000);
		driver.navigate().back();
		Thread.sleep(2000);
		driver.navigate().refresh();
		driver.navigate().forward();
		Thread.sleep(5000);
		driver.quit();
	}
	public static void main(String[] args) throws InterruptedException {
		// TODO Auto-generated method stub
		NavigateMethod  obj= new NavigateMethod();
		obj.acc();
	}

}
