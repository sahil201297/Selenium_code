package TestNG_Grouping;

import org.openqa.selenium.By;
import org.testng.annotations.Test;

public class Home extends Driver {
	String expTitle="OrangeHRM";
	@Test(groups= {"Sanity"})
	public void Forget_Pass()
	{
		driver.findElement(By.linkText("Forgot your password?")).click();
		if(expTitle.equals(driver.getTitle())){
			System.out.println("We are on Forget Password Page");
		}
		else
		{
			System.out.println("We are not on Correct page");
		}
		
	}
}
