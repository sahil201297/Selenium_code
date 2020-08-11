package Selenium_demo;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
//import org.openqa.selenium.support.ui.Select;

public class User_page {
	WebDriver driver;
	String path;
	public void launch()
	{
		path=System.getProperty("user.dir")+"//Driver//chromedriver.exe";
		System.setProperty("webdriver.chrome.driver", path);
		driver=new ChromeDriver();
		driver.manage().deleteAllCookies();
		driver.manage().window().maximize();
		driver.get("https://opensource-demo.orangehrmlive.com/");
		driver.findElement(By.cssSelector("input#txtUsername")).sendKeys("Admin");
		driver.findElement(By.cssSelector("input#txtPassword")).sendKeys("admin123");
		driver.findElement(By.cssSelector("input#btnLogin")).click();
		driver.manage().timeouts().implicitlyWait(5, TimeUnit.SECONDS);
		driver.findElement(By.id("menu_admin_viewAdminModule")).click();
		//SYSTEM USER
//		driver.findElement(By.id("searchSystemUser_userName")).sendKeys("Admin");
//		Select user_role=new Select (driver.findElement(By.id("searchSystemUser_userType")));
//		user_role.selectByVisibleText("Admin");
//		Select status=new Select(driver.findElement(By.id("searchSystemUser_status")));
//		status.selectByVisibleText("Enabled");
//		driver.findElement(By.id("searchBtn")).click();
//		driver.findElement(By.id("resetBtn")).click();
		//Qualification--_Membership
		driver.findElement(By.linkText("Qualifications")).click();
		driver.findElement(By.id("menu_admin_membership")).click();
		driver.findElement(By.id("btnAdd")).click();
		driver.findElement(By.id("btnCancel")).click();
		driver.findElement(By.id("btnAdd")).click();
		driver.findElement(By.id("membership_name")).sendKeys("abcd");
		driver.findElement(By.id("btnSave")).click();
		driver.findElement(By.id("ohrmList_chkSelectRecord_1")).click();
		driver.findElement(By.id("btnDelete")).click();
		driver.findElement(By.xpath("/html/body/div[1]/div[3]/div[3]/div[3]/input[2]")).click();
		
		
	}
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		User_page obb=new User_page();
		obb.launch();
	}

}
