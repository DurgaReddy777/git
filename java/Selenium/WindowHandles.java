package Selenium;

import java.util.Iterator;
import java.util.Set;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class WindowHandles {
	public static void main(String[] args) {
		System.setProperty("webdriver.chrome.driver", "C:\\Users\\OMR\\eclipse-workspace\\MavenProject1\\drivers\\chromedriver.exe");
		WebDriver driver=new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://www.naukri.com/");
		String s=driver.getWindowHandle();
		Set<String> s1=driver.getWindowHandles();
		/*System.out.println("parent:"+s);
		for(String k:s1) {
			System.out.println(k);
		}
		Iterator<String> itr=s1.iterator();
		while(itr.hasNext()) {
			String child=itr.next();
			if(!s.equals(child)) {
				driver.switchTo().window(child);
			}
		}
		driver.switchTo().window(s);*/
		
		
		
	}

}
