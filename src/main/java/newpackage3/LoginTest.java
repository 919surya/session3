package newpackage3;

import java.util.concurrent.TimeUnit;

import org.junit.After;
import org.junit.Assert;
import org.junit.Before;
import org.junit.Test;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

public class LoginTest {
	

	WebDriver driver;
	@Before
	public void init() {
		
		System.setProperty("webdriver.chrome.driver", "driver\\chromedriver.exe");
		driver =new ChromeDriver();
		driver.manage().window().maximize();
		driver.manage().deleteAllCookies();
		driver.get("https://techfios.com/billing/?ng=admin/");
		driver.manage().timeouts().implicitlyWait(20, TimeUnit.SECONDS);
	}
	@Test
	public void loginTest() {
		/*WebElement USER_NAME_ELEMENT=driver.findElement(By.xpath("//*[@id=\"username\"]"));
		WebElement PASSWORD_ELEMENT=driver.findElement(By.xpath("//*[@id=\"password\"]"));
		WebElement LOGIN_ELEMENT=driver.findElement(By.xpath("/html/body/div/div/div/form/div[3]/button"));
		
		By USER_NAME_FIELD=By.xpath("//*[@id=\"username\"]");
		By PASSWORD_FIELD=By.xpath("//*[@id=\"password\"]");
		By LOGIN_FIELD=By.xpath("/html/body/div/div/div/form/div[3]/button");
		By DASHBOARD_HEADER_FIELD=By.xpath("//*[@id=\"page-wrapper\"]/div[2]/div/h2");
		*/
//		USER_NAME_ELEMENT.clear();
//		USER_NAME_ELEMENT.sendKeys("demo@techfios.com");
//		PASSWORD_ELEMENT.sendKeys("abc123");
//		LOGIN_ELEMENT.click();
		
		/*driver.findElement(USER_NAME_FIELD).sendKeys("demo@techfios.com");
		driver.findElement(PASSWORD_FIELD).sendKeys("abc12345");
		driver.findElement(LOGIN_FIELD).click();
		
		boolean pageTitleDisplayStatus;
		try {
			WebElement DASHBOARD_HEADER_ELEMENT=driver.findElement(By.xpath("//*[@id=\"page-wrapper\"]/div[2]/div/h2"));
			 pageTitleDisplayStatus = true;
		}catch(Exception e) {
			 pageTitleDisplayStatus = false;
			 e.printStackTrace();
			 */
		}
		
//		WebDriverWait wait=new WebDriverWait(driver,10);
//		wait.until(ExpectedConditions.visibilityOfElementLocated(DASHBOARD_HEADER_FIELD));
		
	
		
	//	Assert.assertTrue("page not found !!!",pageTitleDisplayStatus);
		
	}
//	@After
	public void tearDown() {
		driver.close();
		driver.quit();
	}

}
