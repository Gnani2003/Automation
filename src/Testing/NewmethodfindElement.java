package Testing;

import org.openqa.selenium.*;
import org.openqa.selenium.chrome.ChromeDriver;


public class NewmethodfindElement {

	public static void main(String[] args) {
		
	System.setProperty("webdriver.chrome.driver","C:\\Users\\chinn\\eclipse-workspace\\Automation\\driver\\chromedriver.exe" );
	
	WebDriver driver = new ChromeDriver();
	
	driver.manage().window().maximize();
	
	driver.get("https://www.facebook.com/?_rdr");
	
	
	WebElement username = driver.findElement(By.id("email"));
	username.sendKeys("9381844141");
	
	System.out.println(username.getAttribute("value"));
	
	
	WebElement password = driver.findElement(By.id("pass"));
	password.sendKeys("20032003");
	
	System.out.println(password.getAttribute("value"));
	
	WebElement loginbutton = driver.findElement(By.name("login"));
	loginbutton.click();
		
		

	}

}
