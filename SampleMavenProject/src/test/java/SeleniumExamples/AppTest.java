package SeleniumExamples;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.Test;

import io.github.bonigarcia.wdm.WebDriverManager;

public class AppTest 
{
    
    @Test
    public void VerifyLogin()
    {
        WebDriverManager.chromedriver().setup();
        WebDriver driver = new ChromeDriver();
               
        double salary = 5000;
        double year = 5;
        double total = salary*year*15/26;      
        double round = Math.round(total*100)/100.0;
        System.out.println(round);
      
        driver.get("https://www.moneycontrol.com/personal-finance/tools/gratuity-calculator.html");
        driver.findElement(By.id("wzrk-confirm")).click();
        driver.findElement(By.xpath("//*[@id=\"InvestingPlanning\"]/div[3]/ul/li/div[3]/span[1]")).click();
        driver.findElement(By.id("salary")).sendKeys("5000");
        driver.findElement(By.id("year")).sendKeys("5");
        driver.findElement(By.id("month")).sendKeys("6");
        driver.findElement(By.id("graduity_calc_btn")).click();
             
        String abc = driver.findElement(By.id("graduity_amt")).getText();
        String rep =abc.replace(",", "");
        Double a = Double.parseDouble(rep);  
        System.out.println(a);
        
        if(round==a) {
    	    System.out.println("Same");
        }else {
       	    System.out.println("Not Same");
        }   
        driver.close();
    }
}
