package TestNG_Grouping;

import org.openqa.selenium.By;
import org.testng.annotations.Test;


public class Login extends Driver {
		@Test(groups= {"Smoke"},enabled = false)
	public void login() 
		{

			driver.findElement(By.xpath("//input[@name='txtUsername']")).sendKeys("Admin");
			 driver.findElement(By.xpath("//input[@name='txtPassword']")).sendKeys("admin123");
			 driver.findElement(By.xpath("//input[@type='submit']")).click();
		}	
		@Test(dependsOnMethods = "Login",groups= {"Sanity"})
		public void logout()
		{
			driver.findElement(By.linkText("Welcome Admin")).click();
			driver.findElement(By.linkText("Logout")).click();
		}
	}

//https://mkyong.com/maven/how-to-install-maven-in-windows/
