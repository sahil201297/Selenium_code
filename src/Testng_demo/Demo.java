package Testng_demo;

import org.testng.annotations.AfterClass;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.AfterSuite;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.BeforeSuite;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

public class Demo {
	@BeforeSuite
    public void Driver()
    {
        System.out.println("Driver Code");
    }
	 @AfterSuite
     public void Close_Browser()
     {
         System.out.println("Close Browser Code");
     }
	 @BeforeClass
     public void bef_Class()
     {
         System.out.println("Before Class");
     }
	 @AfterClass
     public void aft_Class()
     {
         System.out.println("After Class");
     }
	 @BeforeMethod
     public void Bef_Method()
     {
         System.out.println("before Method");
     }
     @AfterMethod
     public void Aft_Method()
     {

         System.out.println("After Method");
     }
	 @BeforeTest
     public void Bef_Test()
     {
         System.out.println("Before Test");
     }
     @AfterTest
     public void After_Test()
     {
         System.out.println("After Test");
     }
	@Test(priority=0)
	public void login() 
	{
		System.out.println("login code");
	}
	@Test(priority=1)
	public void logout()
	{
		System.out.println("Logout code");
	}
	@Test(priority=2)
	public void forgetpwd()
	{
		System.out.println("Forget password code");
	}
}
