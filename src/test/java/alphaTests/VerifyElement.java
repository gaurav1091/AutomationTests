package alphaTests;

import org.junit.Assert;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.Test;

public class VerifyElement {
	
	@Test
	public void identifyTest()
	{
		System.setProperty("webdriver.chrome.driver", "C:\\Users\\GauravArora\\Desktop\\Chrome Driver\\chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		driver.get("https://gauravarora1091.azurewebsites.net/MavenWebProject/");
		String text = driver.findElement(By.xpath("//*[contains(text(), 'QA Engineer')]")).getText();
		Assert.assertTrue(text.contains("work"));
		driver.quit();
		
		
	}

}
