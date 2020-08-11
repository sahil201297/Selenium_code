package Selenium_demo;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;


public class Facebok_reg {
	String path;
	WebDriver driver;
	public void launch() throws InterruptedException
	{
		path=System.getProperty("user.dir")+"//Driver//chromedriver.exe";
		System.setProperty("webdriver.chrome.driver", path);
		driver=new ChromeDriver();
		driver.manage().deleteAllCookies();
		driver.get("https://www.facebook.com/");
		driver.findElement(By.cssSelector("input#u_0_m")).sendKeys("Sahil");
		driver.findElement(By.cssSelector("input#u_0_o")).sendKeys("Sharma");
		driver.findElement(By.cssSelector("input#u_0_r")).sendKeys("123456789");
		driver.findElement(By.cssSelector("input#password_step_input")).sendKeys("12345");
		Select day=new Select(driver.findElement(By.id("day")));
		day.selectByVisibleText("20");
		List<WebElement>dsize=day.getOptions();
		int al=dsize.size();
		for(int i =0;i<al;i++) 
		{
			System.out.println(day.getOptions().get(i).getText());
		}
		Select mon=new Select(driver.findElement(By.id("month")));
		mon.selectByVisibleText("Dec");
		List<WebElement>msize=mon.getOptions();
		int al1=msize.size();
		for(int i =0;i<al1;i++) 
		{
			System.out.println(mon.getOptions().get(i).getText());
		}
		Select year=new Select(driver.findElement(By.id("year")));
		year.selectByValue("1997");
		List<WebElement>ysize=year.getOptions();
		int al2=ysize.size();
		for(int i =0;i<al2;i++) 
		{
			System.out.println(year.getOptions().get(i).getText());
		}
		driver.findElement(By.id("u_0_7")).click();
//		driver.findElement(By.xpath("//div[@type='submit']")).click();
//		driver.findElement(By.cssSelector("div._1lch")).click();
		driver.findElement(By.id("u_0_12")).click();
		Thread.sleep(5000);
		driver.close();
	}

	public static void main(String[] args) throws InterruptedException {
		// TODO Auto-generated method stub
		Facebok_reg obj= new Facebok_reg();
		obj.launch();
	}

}
