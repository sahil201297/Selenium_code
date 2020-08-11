package Selenium_demo;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Contains_demo {
	WebDriver driver;
	String path;
	public void launch()
	{
		path=System.getProperty("user.dir")+"//driver//chromedriver.exe";
		System.setProperty("webdriver.chrome.driver", path);
		driver=new ChromeDriver();
		driver.get("https://opensource-demo.orangehrmlive.com/");
		driver.findElement(By.xpath("//input[contains(@name,'txtUsername')]")).sendKeys("Admin");
//		driver.findElement(By.xpath("//input[@name='txtPassword']")).sendKeys("admin123");
//		driver.findElement(By.xpath("//input[contains(@type,'sub')]")).click();
		driver.findElement(By.xpath("//input[contains(@id,'txtPassword')]")).sendKeys("Admin");
		driver.findElement(By.className("button")).click();
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Contains_demo obb=new Contains_demo();
		obb.launch();
	}

}
