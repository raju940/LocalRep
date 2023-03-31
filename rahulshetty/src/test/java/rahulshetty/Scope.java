package rahulshetty;

import java.util.Iterator;
import java.util.Set;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import io.github.bonigarcia.wdm.WebDriverManager;

public class Scope {

	public static void main(String[] args) throws InterruptedException {
		// TODO Auto-generated method stub

		WebDriverManager.chromedriver().setup();
		WebDriver driver = new ChromeDriver();
		driver.get("https://www.rahulshettyacademy.com/AutomationPractice/");
//		No.of links in the page
		System.out.println(driver.findElements(By.tagName("a")).size());
//		No.of links in footer region
		WebElement footerdriver = driver.findElement(By.id("gf-BIG"));
		System.out.println(footerdriver.findElements(By.tagName("a")).size());
//      No.of links in the first column
		WebElement columndriver = footerdriver.findElement(By.xpath("//table/tbody/tr/td/ul"));
		                                                   //table[@class='gf-t']/tbody/tr/td[2]
		System.out.println(columndriver.findElements(By.tagName("a")).size());
//		Click on the each link of the column
		for(int i=1;i<columndriver.findElements(By.tagName("a")).size();i++) {
			String clickonlinkTab = Keys.chord(Keys.CONTROL,Keys.ENTER);
			columndriver.findElements(By.tagName("a")).get(i).sendKeys(clickonlinkTab);
			Thread.sleep(5000);
		}
		Set<String> windows = driver.getWindowHandles();
        Iterator<String> it =windows.iterator();
        
        while(it.hasNext()) {
        	driver.switchTo().window(it.next());
        	Thread.sleep(3000);
        	System.out.println(driver.getTitle());
        }
	}

}
