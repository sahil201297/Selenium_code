package Action;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class file_choose {
	String path;
	WebDriver driver;
public void launch() throws InterruptedException {

	path=System.getProperty("user.dir")+"//driver//chromedriver.exe";
	System.setProperty("webdriver.chrome.driver", path);
	 driver = new ChromeDriver();
	 driver.manage().deleteAllCookies();
	 driver.get("https://opensource-demo.orangehrmlive.com");
	 driver.findElement(By.cssSelector("input#txtUsername")).sendKeys("Admin");
	 driver.findElement(By.cssSelector("input#txtPassword")).sendKeys("admin123");
	 driver.findElement(By.cssSelector("input#btnLogin")).click();
	 driver.findElement(By.id("menu_pim_viewPimModule")).click();
	 driver.findElement(By.id("btnAdd")).click();
	 driver.findElement(By.id("firstName")).sendKeys("Sahil");
	 driver.findElement(By.id("lastName")).sendKeys("Sharma");
	 driver.findElement(By.id("employeeId")).sendKeys("0071");
	 driver.findElement(By.id("photofile")).sendKeys("C:\\Users\\Administrator\\Pictures\\Signature.jpg");
	 driver.findElement(By.id("btnSave")).click();
}
public static void main(String[] args) throws InterruptedException {
	// TODO Auto-generated method stub
file_choose obj=new file_choose();
	obj.launch();
}

}
