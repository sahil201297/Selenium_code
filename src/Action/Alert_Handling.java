package Action;

import org.openqa.selenium.Alert;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Alert_Handling {
	String path;
	WebDriver driver;
public void launch() throws InterruptedException {

	path=System.getProperty("user.dir")+"//driver//chromedriver.exe";
	System.setProperty("webdriver.chrome.driver", path);
	 driver = new ChromeDriver();
	 driver.get("https://mail.rediff.com/cgi-bin/login.cgi");
	 driver.findElement(By.id("login1")).sendKeys("admin");
	 driver.findElement(By.name("proceed")).click();
	 Alert al=driver.switchTo().alert();
	 System.out.println(al.getText());
	 Thread.sleep(5000);
	 al.accept();
		
}
	public static void main(String[] args) throws InterruptedException {
		// TODO Auto-generated method stub
		Alert_Handling obj=new Alert_Handling();
		obj.launch();
	}

}
