package Testing;

import org.openqa.selenium.*;
import org.openqa.selenium.chrome.ChromeDriver;

public class Automation {

	public static void main(String[] args) throws InterruptedException {
		// TODO Auto-generated method stub

		
		 System.setProperty("webdriver.chrome.driver", "C:\\Users\\chinn\\eclipse-workspace\\Automation\\driver\\chromedriver.exe" );
		 
		 WebDriver driver = new ChromeDriver();
		 
		 driver.manage().window().maximize();
		 
		// driver.manage().deleteAllCookies();
		 
		 driver.get("https://courses.ultimateqa.com/users/sign_in");
		 
	  driver.findElement(By.id("user[email]")).sendKeys("99999999");
		
	   driver.findElement(By.id("user[password]")).sendKeys("125555");
		
		driver.findElement(By.xpath("//button[@class='button button-primary g-recaptcha']")).click();
		//driver.findElement(By.linkText("Forgot Password?")).click();
		
		//driver.findElement(By.partialLinkText("Forgot")).click();
		 
		
		 
		 
	}

}



//Thread.sleep(3000);

// System.out.println(driver.getTitle());
 
//	 Dimension d = new Dimension (300,300);
 
// driver.manage().window().setSize(d);
 
//	driver.close();
 
// driver.quit();