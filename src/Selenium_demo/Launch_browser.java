package Selenium_demo;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Launch_browser {
	WebDriver driver;
	String path;
	String exptitle="orangehrmlive",actualtitle;
public void launch() throws InterruptedException
{
	//SET STATIC PATH
//	System.setProperty("webdriver.chrome.driver","E:\\SDET\\AUTOMATION\\chromedriver_win32\\chromedriver.exe");
	
	//SET DYNAMIC PATH
	path=System.getProperty("user.dir")+"\\Driver\\chromedriver.exe";
//	System.out.print(path);
	System.setProperty("webdriver.chrome.driver",path);
		driver=new ChromeDriver();
		
	driver.get("https://opensource-demo.orangehrmlive.com/");
	driver.manage().window().maximize();//it is used for maximize the window
	Thread.sleep(4000);//static  wait
	System.out.println(driver.getTitle());//To check the current title of website
	//System.out.println(driver.getCurrentUrl());//To check the running url
	actualtitle=driver.getTitle();
	if(actualtitle.equals(exptitle))
	{
		System.out.println("U ARE on correct page");
	}
	else
	{
		System.out.println("You are not on Correct Page");
	}
	driver.close();//close only current browser page
	driver.quit();//close all browser
	
}
	public static void main(String[] args) throws InterruptedException {
		// TODO Auto-generated method stub
		Launch_browser obj=new Launch_browser();
		obj.launch();
	}

}
