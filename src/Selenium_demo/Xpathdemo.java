package Selenium_demo;


import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Xpathdemo {
	WebDriver driver;
	String path;
	public void launch()
	{
		path=System.getProperty("user.dir")+"//driver//chromedriver.exe";
		System.setProperty("webdriver.chrome.driver", path);
		driver=new ChromeDriver();
		driver.get("https://opensource-demo.orangehrmlive.com/");
		driver.findElement(By.xpath("//input[@name='txtUsername']")).sendKeys("Admin");
		driver.findElement(By.xpath("//input[@name='txtPassword']")).sendKeys("admin123");
		driver.findElement(By.xpath("//input[@type='submit']")).click();
//		driver.get("https://www.flipkart.com/mens-tshirts/pr?sid=clo,ash,ank,edy&marketplace=FLIPKART&p[]=facets.discount_range_v1%5B%5D%3D70%25+or+more&restrictLocale=true&fm=personalisedRecommendation%2FC5&iid=R%3Ag%3Bpt%3Ahp%3Buid%3A429af74e-dfe8-6eea-a4bf-58adc35f3d06%3B.cid%3AS_F_N_clo_ash_ank_edy__d_70-100__NONE_ALL%3Bnid%3Aclo_ash_ank_edy_%3Bet%3AS%3Beid%3Aclo_ash_ank_edy_%3Bmp%3AF%3Bct%3Ad%3B&ssid=jtcm94cxu80000001592587095641&otracker=hp_reco_Father%2527s%2BDay%2BSpecial%2BGifts_2_3.dealCard.OMU_Father%2527s%2BDay%2BSpecial%2BGifts_cid%3AS_F_N_clo_ash_ank_edy__d_70-100__NONE_ALL%3Bnid%3Aclo_ash_ank_edy_%3Bet%3AS%3Beid%3Aclo_ash_ank_edy_%3Bmp%3AF%3Bct%3Ad%3B_2&otracker1=hp_reco_SECTIONED_personalisedRecommendation%2FC5_Father%2527s%2BDay%2BSpecial%2BGifts_DESKTOP_HORIZONTAL_dealCard_cc_2_NA_view-all_2&cid=cid%3AS_F_N_clo_ash_ank_edy__d_70-100__NONE_ALL%3Bnid%3Aclo_ash_ank_edy_%3Bet%3AS%3Beid%3Aclo_ash_ank_edy_%3Bmp%3AF%3Bct%3Ad%3B");
//		ArrayList<WebElement> al=new ArrayList<WebElement>(driver.findElements(By.className("_2B_pmu")));
//		for(int i=0;i<al.size();i++)
//		{
//			System.out.println(al.get(i).getText());
//		}
		
		driver.quit();
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Xpathdemo obj=new Xpathdemo();
		obj.launch();
	}

}
