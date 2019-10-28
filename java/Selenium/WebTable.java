package Selenium;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class WebTable {
	public static void main(String[] args) {
		System.setProperty("webdriver.chrome.driver", "C:\\Users\\OMR\\eclipse-workspace\\MavenProject1\\drivers\\chromedriver.exe");
		WebDriver driver=new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://www.toolsqa.com/automation-practice-table/");
		List<WebElement> tRows=driver.findElements(By.tagName("tr"));
		//int r=tRows.size()/2;
		for(int i=0;i<tRows.size();i++) {
			WebElement row=tRows.get(i);
			List<WebElement> tData=row.findElements(By.tagName("td"));
			for(int j=2;j<tData.size()-3;j++) {
				WebElement data=tData.get(j);
				String s=data.getText();
				System.out.println(s);
				
			}
		}
		
	}

}
