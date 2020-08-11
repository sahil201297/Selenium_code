package Action;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class DragandDrop {
	String path;
	WebDriver driver;

	public void Launch() throws InterruptedException
	{
	path = System.getProperty("user.dir") + "//Driver//chromedriver.exe";
	System.setProperty("webdriver.chrome.driver", path);
	driver = new ChromeDriver();
	// Launch application
			driver.get("https://jqueryui.com/droppable/");
			driver.switchTo().frame(0);
			Actions act=new Actions(driver);
			Thread.sleep(5000);
//			act.clickAndHold(driver.findElement(By.id("draggable"))).moveToElement(driver.findElement(By.id("droppable"))).release().build().perform();
			act.dragAndDrop(driver.findElement(By.id("draggable")), driver.findElement(By.id("droppable"))).release().build().perform();
	}
	public static void main(String[] args) throws InterruptedException {
		// TODO Auto-generated method stub
		DragandDrop obb=new DragandDrop();
		obb.Launch();
	}

}
