package Action;

import java.util.Iterator;
import java.util.Set;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

public class Window_assign {
	String path;
	WebDriver driver;
	String istid,secondid;
	WebDriverWait wait;
	
	public void launch() throws InterruptedException 
	{
		path=System.getProperty("user.dir")+"//driver//chromedriver.exe";
		System.setProperty("webdriver.chrome.driver", path);
		 driver = new ChromeDriver();
		 wait=new WebDriverWait(driver,1);//Explicit Wait
		 driver.manage().timeouts().pageLoadTimeout(5,TimeUnit.SECONDS);//Implicit wait
//		driver.manage().timeouts().implicitlyWait(2,TimeUnit.NANOSECONDS);//Implicit wait
		driver.get("http://demo.automationtesting.in/Windows.html");
		driver.manage().window().maximize();
//		driver.findElement(By.linkText("Open New Seperate Windows")).click();
		wait.until(ExpectedConditions.elementToBeClickable(By.linkText("Open New Seperate Windows"))).click();
//		Thread.sleep(3000);
		driver.findElement(By.className("btn-primary")).click();
		 Set<String> all=driver.getWindowHandles();
         Iterator<String> it=all.iterator();
         istid=it.next();
         System.out.println("First window Id is:"+istid);
		secondid=it.next();
		System.out.println("Second window Id is:"+secondid);
         driver.switchTo().window(secondid);
        // Thread.sleep(2000);
         System.out.println(driver.getTitle());
         driver.close();
		driver.quit();
	}
	public static void main(String[] args) throws InterruptedException {
		// TODO Auto-generated method stub
		Window_assign obb=new Window_assign();
		obb.launch();

}
}