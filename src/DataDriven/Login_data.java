package DataDriven;

import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.IOException;

import org.apache.poi.hssf.usermodel.HSSFCell;
import org.apache.poi.hssf.usermodel.HSSFRow;
import org.apache.poi.hssf.usermodel.HSSFSheet;
import org.apache.poi.hssf.usermodel.HSSFWorkbook;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Login_data {
	String path,username,pass;
	HSSFWorkbook wb;
	HSSFRow row;
	HSSFCell cell;
	WebDriver driver;
	String message;
public void launch() throws IOException {
	path=System.getProperty("user.dir")+"\\Driver\\chromedriver.exe";
	System.setProperty("webdriver.chrome.driver", path);
	driver=new ChromeDriver();
	driver.get("https://opensource-demo.orangehrmlive.com/");
	FileInputStream fi=new FileInputStream ("E:\\SDET\\AUTOMATION\\Utilities\\login.xls"); 
	wb= new HSSFWorkbook(fi);
	HSSFSheet sheet=wb.getSheet("Sheet1");
	for(int i=1;i<=sheet.getLastRowNum();i++)
    {
        username=sheet.getRow(i).getCell(0).getStringCellValue();
        System.out.println("Username is:"+username);
        pass=sheet.getRow(i).getCell(1).getStringCellValue();
        System.out.println("Passwords are:"+pass);
        FileOutputStream os= new FileOutputStream("E:\\SDET\\AUTOMATION\\Utilities\\login.xls");
    	message="Data Imported Sucessfully";
    	sheet.getRow(i).createCell(3).setCellValue(message);
    	wb.write(os);
    	os.close();
    
	driver.manage().window().maximize();
	driver.findElement(By.id("txtUsername")).sendKeys(username);
	driver.findElement(By.id("txtPassword")).sendKeys(pass);
	driver.findElement(By.id("btnLogin")).click();
    }
}

	public static void main(String[] args) throws IOException {
		// TODO Auto-generated method stub
		Login_data obb= new Login_data();
		obb.launch();
	}

}
