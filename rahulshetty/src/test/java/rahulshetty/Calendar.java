package rahulshetty;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

import io.github.bonigarcia.wdm.WebDriverManager;

public class Calendar {

	public static void main(String[] args) throws InterruptedException {
		// TODO Auto-generated method stub

		WebDriverManager.chromedriver().setup();
		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		int i = 0;
		driver.get("https://www.path2usa.com/travel-companion/");
		JavascriptExecutor js = (JavascriptExecutor) driver;
		js.executeScript("window.scrollBy(0,950)");
		Thread.sleep(4000);
		driver.findElement(By.id("form-field-travel_comp_date")).click();

		for (int j = 0; j < 12; j++) {

			WebElement month_name = driver.findElement(By.cssSelector(".cur-month"));

			if (month_name.getText().equalsIgnoreCase("February")) {

			} else {
				while (i <= 2) {
					driver.findElement(By.cssSelector(".flatpickr-next-month svg")).click();
					i++;
					break;
				}

			}
		}
		Thread.sleep(5000);
		java.util.List<WebElement> alldays = driver.findElements(By.cssSelector(".flatpickr-day"));
		for (int i1 = 0; i1 < alldays.size(); i1++) {
			String text = driver.findElements(By.className("flatpickr-day")).get(i1).getText();

			if (text.equalsIgnoreCase("24")) {

				driver.findElements(By.className("flatpickr-day")).get(i1).click();
				break;
			}
		}

		Select select = new Select(driver.findElement(By.id("form-field-travel_comp_date_between")));
		select.selectByIndex(2);

		Select select1 = new Select(driver.findElement(By.id("form-field-travel_comp_airline")));
		select1.selectByVisibleText("Pakistan Airlines");

		Select select2 = new Select(driver.findElement(By.id("form-field-travel_comp_language")));
		select2.selectByVisibleText("Telugu");

		driver.findElement(By.cssSelector(".elementor-button.elementor-size-sm")).click();

	}

}
