package Testng_demo;

import org.openqa.selenium.By;
import org.testng.annotations.Test;

public class Login extends Driver {
	@Test
public void login() 
	{

		driver.findElement(By.xpath("//input[@name='txtUsername']")).sendKeys("Admin");
		 driver.findElement(By.xpath("//input[@name='txtPassword']")).sendKeys("admin123");
		 driver.findElement(By.xpath("//input[@type='submit']")).click();
	}	
	@Test
	public void logout()
	{
		driver.findElement(By.linkText("Welcome Admin")).click();
		driver.findElement(By.linkText("Logout")).click();
	}
}
