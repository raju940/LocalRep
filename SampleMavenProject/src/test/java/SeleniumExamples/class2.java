package SeleniumExamples;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

public class class2 {
	
	@FindBy(name="user")WebElement user;
	@FindBy(name="pass")WebElement pass;
	@FindBy(name="btnSubmit")WebElement Submit;
	
	
	public class2 user()
	{
		user.sendKeys("qatrainer");
		return this;
	}
	public class2 pass() {
		pass.sendKeys("admin123");
		return this;
	}
	public class2 submit()
	{
		Submit.click();
		return this;
	}
	
	

}
