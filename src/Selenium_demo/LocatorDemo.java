package Selenium_demo;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class LocatorDemo {
	WebDriver driver;
	String path;
	WebElement Uname,Pass,Login;
	String expurl="https://opensource-demo.orangehrmlive.com/index.php/auth/requestPasswordResetCode",actualurl;
	public void Launch()
	{
	path=System.getProperty("user.dir")+"//Driver//chromedriver.exe";

	System.setProperty("webdriver.chrome.driver", path);

	driver=new ChromeDriver();
	//Deleting Cookies
	driver.manage().deleteAllCookies();
	
//	driver.navigate().to("https://www.facebook.com/");
	driver.navigate().to("https://opensource-demo.orangehrmlive.com/");
	driver.manage().window().maximize();
	//Locate elements By Id
//	driver.findElement(By.id("email")).sendKeys("sahil2210@ymail.com");
//	driver.findElement(By.id("pass")).sendKeys("");
//	driver.findElement(By.id("loginbutton")).click();
	
//	 driver.findElement(By.id("txtUsername")).sendKeys("Admin");
//	 driver.findElement(By.id("txtPassword")).sendKeys("admin123");
//	 driver.findElement(By.id("btnLogin")).click();
//	 driver.quit();
	 
//Locate element by name
	 Uname=driver.findElement(By.name("txtUsername"));
	 if(Uname.isDisplayed())
	 {
	 Uname.sendKeys("Adm");
	 }
	 Pass=driver.findElement(By.name("txtPassword"));
	 Pass.sendKeys("admin123");
	 Login=driver.findElement(By.name("Submit"));
	 Login.click(); 
	}
	public void forgetpass() throws InterruptedException
	{
	actualurl=driver.getCurrentUrl();
	if(actualurl.equals(expurl))
	{
		System.out.println("you are on correct page");
	}
	else {
		System.out.println("Something is missing");
	}
		//Working with linkText locator
//		driver.findElement(By.linkText("Forgot your password?")).click();
		//Working with partialLinkText
		driver.findElement(By.partialLinkText("pass")).click();
		Thread.sleep(4000);
	}
	public void close()
	{
		driver.quit();
	}
	public static void main(String[] args) throws InterruptedException {
		// TODO Auto-generated method stub
		LocatorDemo obj= new LocatorDemo();
		obj.Launch();
		obj.forgetpass();
		obj.close();
	}

}