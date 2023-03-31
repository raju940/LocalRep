package SeleniumExamples;

import java.time.Duration;
import java.util.Iterator;
import java.util.List;
import java.util.Set;

import javax.swing.plaf.synth.SynthStyle;

import org.openqa.selenium.Alert;
import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.ui.Select;
import org.testng.Assert;
import org.testng.asserts.SoftAssert;

import io.github.bonigarcia.wdm.WebDriverManager;

public class Exammmm {

	public static void main(String[] args) {

		WebDriverManager.chromedriver().setup();
		WebDriver driver = new ChromeDriver();

//		driver.get("https://www.amazon.in/");
//
//		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(5));
//
//		driver.findElement(By.id("twotabsearchtextbox")).sendKeys("iwatch");
//		driver.findElement(By.id("nav-search-submit-button")).click();
//
//		System.out.println(driver.findElement(By.cssSelector(".a-size-medium.a-color-base.a-text-normal")).getText());
//		driver.findElement(By.cssSelector(".a-size-medium.a-color-base.a-text-normal")).click();
//
//		Set<String> windows = driver.getWindowHandles();
//		Iterator<String> it = windows.iterator();
//		String parentid = it.next();
//		String childid = it.next();
//		driver.switchTo().window(childid);

		driver.manage().window().maximize();
		driver.get("https://www.hyrtutorials.com/p/alertsdemo.html");

		driver.findElement(By.partialLinkText("Selenium Practice")).click();

//		Assertions
		SoftAssert asserts = new SoftAssert();
		String actual = "https://www.hyrtutorials.com/p/alertsdemo.html#";
		String expected = driver.getCurrentUrl();
		asserts.assertEquals(actual, expected, "Wrong");
		asserts.assertAll();

//		gettext
		List<WebElement> lis = driver.findElements(By.xpath("//*[contains(@name,'Main Menu')]/div/ul/li[4]/ul/li/a"));
		for (WebElement li : lis) {

			String names = li.getText();
			System.out.println(names);
			if (names.contains("Alert")) {
				li.click();
				break;
			}
		}

//		Alerts
		driver.findElement(By.id("alertBox")).click();
		Alert alert = driver.switchTo().alert();
		System.out.println(alert.getText());
		alert.accept();

		driver.findElement(By.id("confirmBox")).click();
		System.out.println(alert.getText());
		alert.accept();

		driver.findElement(By.id("promptBox")).click();
		System.out.println(alert.getText());
		alert.sendKeys("Raju");
		alert.accept();

//		JavascriptExecutor
		JavascriptExecutor js = (JavascriptExecutor) driver;
		js.executeScript("window.scrollBy(0,1000)");

//	    Actions	
		Actions a = new Actions(driver);
		a.moveToElement(driver.findElement(By.xpath("//a[text()='Tutorials']"))).build().perform();
		a.moveToElement(driver.findElement(By.xpath("//*[contains(@id,'LinkList210')]/ul/li[4]"))).build().perform();

//	    Select DropDown	
		List<WebElement> list = driver.findElements(By.xpath("//*[contains(@id,'LinkList210')]/ul/li[4]/ul/li/a"));
		for (WebElement li2 : list) {
			String namess = li2.getText();
			System.out.println(namess);
			if (namess.equalsIgnoreCase("dropdowns")) {
				li2.click();
				break;
			}
		}
		WebElement drop = driver.findElement(By.id("course"));
		Select select = new Select(drop);
		select.selectByIndex(1);

	}

}
