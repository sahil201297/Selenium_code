package Action;

import java.util.Iterator;
import java.util.Set;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Window_alert {
	String path;
	WebDriver driver;
	String aid,bid;
	public void launch() throws InterruptedException 
	{
		path=System.getProperty("user.dir")+"//driver//chromedriver.exe";
		System.setProperty("webdriver.chrome.driver", path);
		 driver = new ChromeDriver();
		driver.get("http://www.popuptest.com/goodpopups.html");
		driver.findElement(By.linkText("Good PopUp #3")).click();
		Thread.sleep(2000);
		 Set<String> handler=driver.getWindowHandles();
         Iterator<String> it=handler.iterator();
         aid=it.next();
         System.out.println("Parent Id is:"+aid);

         bid=it.next();
         System.out.println("Child Window Id is:"+bid);
         driver.switchTo().window(bid);
         Thread.sleep(2000);
         System.out.println(driver.getTitle());
         driver.close();
		
	}

	public static void main(String[] args) throws InterruptedException {
		// TODO Auto-generated method stub
		Window_alert obj= new Window_alert();
		obj.launch();
	}

}
