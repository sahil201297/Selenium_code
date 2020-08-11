package Testng_demo;

import org.openqa.selenium.By;
import org.testng.annotations.Test;

public class Home_page extends Driver {
	String expTitle="OrangeHRM";
	@Test
	public void Forget_Pass()
	{
		driver.findElement(By.linkText("Forgot your password?")).click();
		if(expTitle.equals(driver.getTitle())){
			System.out.println("We are on Forget Password Page");
		}
		else
		{
			System.out.println("We are not on Correc page");
		}
		
	}
}
