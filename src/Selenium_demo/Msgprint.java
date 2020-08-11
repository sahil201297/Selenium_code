package Selenium_demo;

import java.util.ArrayList;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Msgprint {
	WebDriver driver;
	String path;
	public void Launch()
	{
	path=System.getProperty("user.dir")+"//Driver//chromedriver.exe";

	System.setProperty("webdriver.chrome.driver", path);

	driver=new ChromeDriver();
	//Deleting Cookies
	driver.manage().deleteAllCookies();
	
	driver.navigate().to("https://opensource-demo.orangehrmlive.com/");
	driver.manage().window().maximize();
	
//	 driver.findElement(By.id("txtUsername")).sendKeys("Adn");
//	 driver.findElement(By.id("txtPassword")).sendKeys("admin123");
//	 driver.findElement(By.id("btnLogin")).click();
ArrayList<WebElement> al=new ArrayList<WebElement>(driver.findElements(By.className("textInputContainer")));
System.out.println(al.size());
//for(int i=0;i<al.size();i++)
//{
//	System.out.println(al.get(i).getText());
//	System.out.println(al.get(i).getAttribute("href"));
//}
driver.quit();
	}
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Msgprint obb=new Msgprint();
		obb.Launch();
	}

}
