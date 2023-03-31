package rahulshetty;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import io.github.bonigarcia.wdm.WebDriverManager;

public class locators {
	
	public static void main(String[] args) throws InterruptedException {
		WebDriverManager.chromedriver().setup();
		WebDriver driver = new ChromeDriver();
		
		driver.get("https://rahulshettyacademy.com/locatorspractice/");
		
		driver.findElement(By.id("inputUsername")).sendKeys("rahul");
		driver.findElement(By.cssSelector("input[type='password']")).sendKeys("pass");
		driver.findElement(By.cssSelector("button[type='submit']")).click();
		Thread.sleep(2000);
		System.out.println(driver.findElement(By.cssSelector("p.error")).getText());
		driver.findElement(By.linkText("Forgot your password?")).click();
		driver.findElement(By.xpath("//input[@type='text'][1]")).sendKeys("Raju");
        driver.findElement(By.xpath("//input[@placeholder='Email']")).sendKeys("abcd@123");
        driver.findElement(By.xpath("//input[@type='text'][3]")).sendKeys("2765635320");
        Thread.sleep(1000);
        driver.findElement(By.xpath("//div/button[2]")).click();
        Thread.sleep(2000);
        System.out.println(driver.findElement(By.xpath("//p[@class='infoMsg']")).getText());
        driver.findElement(By.xpath("//div/button[1]")).click();
        driver.findElement(By.id("inputUsername")).sendKeys("rahul");
        driver.findElement(By.cssSelector("input[type='password']")).sendKeys("rahulshettyacademy");
        Thread.sleep(2000);
        driver.findElement(By.cssSelector("button[type='submit']")).click();
	}

}
