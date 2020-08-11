package Selenium_demo;

import java.util.ArrayList;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class TagClass {

		WebDriver driver;
		String path;
		public void Launch()
		{
		path=System.getProperty("user.dir")+"//Driver//chromedriver.exe";

		System.setProperty("webdriver.chrome.driver", path);

		driver=new ChromeDriver();
		//Deleting Cookies
		driver.manage().deleteAllCookies();
		
		driver.navigate().to("https://www.bbc.com/");
		driver.manage().window().maximize();
		ArrayList<WebElement> al=new ArrayList<WebElement>(driver.findElements(By.className("media__link")));
		System.out.println(al.size());
		for(int i=0;i<al.size();i++)
			{
				System.out.println(al.get(i).getText());
//				System.out.println(al.get(i).getAttribute(""));
			}
		driver.quit();
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		TagClass oob=new TagClass();
		oob.Launch();
	}

}
