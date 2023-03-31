package SeleniumExamples;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;
import org.testng.annotations.Test;

import io.github.bonigarcia.wdm.WebDriverManager;

public class Amazon {
	@Test
	public void f() {

		WebDriverManager.chromedriver().setup();
		WebDriver driver = new ChromeDriver();
		driver.get("https://www.amazon.in/");
		driver.manage().window().maximize();
		driver.findElement(By.id("nav-search-dropdown-card")).click();

		List<WebElement> lst = driver
				.findElements(By.xpath("/html/body/div[1]/header/div/div[1]/div[2]/div/form/div[1]/div/div/select"));

		for (int i = 0; i < lst.size(); i++) {

			String lsts = lst.get(i).getText();
			System.out.println(lsts);

		}

		WebElement lst2 = driver.findElement(By.id("nav-link-accountList"));

		Actions action = new Actions(driver);
		action.moveToElement(lst2).perform();

		List<WebElement> mouselist = driver.findElements(By.id("nav-al-container"));
		for (WebElement alllist : mouselist) {
			System.out.println(alllist.getText());

		}

	}
}
