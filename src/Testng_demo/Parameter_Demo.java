package Testng_demo;

import org.testng.annotations.Parameters;
import org.testng.annotations.Test;

public class Parameter_Demo {
@Test
@Parameters({"firstname","pswd"})

public void login(String fname,String pswd)
{
	System.out.println(fname);
	System.out.println(pswd);
}
}
