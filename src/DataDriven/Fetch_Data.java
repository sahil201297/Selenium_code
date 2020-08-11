package DataDriven;

import java.io.FileInputStream;
import java.io.IOException;

import org.apache.poi.hssf.usermodel.HSSFCell;
import org.apache.poi.hssf.usermodel.HSSFRow;
import org.apache.poi.hssf.usermodel.HSSFSheet;
import org.apache.poi.hssf.usermodel.HSSFWorkbook;


public class Fetch_Data {
	String path,username,pass;
	HSSFWorkbook wb;
	HSSFRow row;
	HSSFCell cell;
public void fetch() throws IOException 
{

	FileInputStream fi=new FileInputStream ("E:\\SDET\\AUTOMATION\\Utilities\\login.xls"); 
	wb= new HSSFWorkbook(fi);
	HSSFSheet sheet=wb.getSheet("Sheet1");
//	System.out.println(sheet.getLastRowNum());
	for(int i=1;i<=sheet.getLastRowNum();i++)
    {
        username=sheet.getRow(i).getCell(0).getStringCellValue();
        System.out.println("Username is:"+username);
        pass=sheet.getRow(i).getCell(1).getStringCellValue();
        System.out.println("Passwords are:"+pass);
    }
	
//	HSSFRow row=sheet.getRow(3);
//	HSSFCell cell=row.getCell(0);
//	HSSFCell cel=row.getCell(1);
//	
//	System.out.println(cell.getStringCellValue());
//	System.out.println(cel.getStringCellValue());	
	
}
	public static void main(String[] args) throws IOException {
		// TODO Auto-generated method stub
Fetch_Data obb= new Fetch_Data();
obb.fetch();
	}

}
