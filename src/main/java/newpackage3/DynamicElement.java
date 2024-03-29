package newpackage3;

import java.util.concurrent.TimeUnit;

import org.junit.After;
import org.junit.Before;
import org.junit.Test;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class DynamicElement {
	
	WebDriver driver;
	@Before
	public void init() {
		
		System.setProperty("webdriver.chrome.driver", "driver\\chromedriver.exe");
		
		driver =new ChromeDriver();
		driver.manage().window().maximize();
		driver.manage().deleteAllCookies();
		driver.get("https://www.cnn.com/");
		driver.manage().timeouts().implicitlyWait(20, TimeUnit.SECONDS);
	}
	@Test
	public void locateElement() {
		driver.findElement(By.xpath(" //section[@class='body tabcontent active']/descendant::span [1]")).click();
//		//section[@class='body tabcontent active']/descendant::span[1]
//		//section[@class='body tabcontent active']/descendant::span[1]
		
	}
//	@After
	public void tearDown() {
		driver.close();
		driver.quit();
	}

}
