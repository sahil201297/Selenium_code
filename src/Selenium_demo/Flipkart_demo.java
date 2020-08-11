package Selenium_demo;

import java.util.ArrayList;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Flipkart_demo {
	WebDriver driver;
	String path;
	public void launch()
	{
		path=System.getProperty("user.dir")+"//driver//chromedriver.exe";
		System.setProperty("webdriver.chrome.driver", path);
		driver=new ChromeDriver();
		driver.get("https://www.flipkart.com/search?q=sanitizer&sid=g9b%2Cema%2Crhm%2Cjrn&as=on&as-show=on&otracker=AS_QueryStore_OrganicAutoSuggest_1_4_na_na_na&otracker1=AS_QueryStore_OrganicAutoSuggest_1_4_na_na_na&as-pos=1&as-type=RECENT&suggestionId=sanitizer%7CHand+Sanitizer&requestId=686ba4b3-2b53-4367-aab1-7bd97a447c97&as-searchtext=sani");
		ArrayList<WebElement> al= new ArrayList<WebElement>(driver.findElements(By.className("_2cLu-l")));
		for(int i=0;i<al.size();i++)
		{
			System.out.println(al.get(i).getText());
		}
		
		driver.quit();
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Flipkart_demo obj= new Flipkart_demo();
		obj.launch();
	}

}
