package Testing;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Display {

	public static void main(String[] args) {

		System.setProperty("webdriver.chrome.driver","C:\\Users\\chinn\\eclipse-workspace\\Automation\\driver\\chromedriver.exe" );
	
		ChromeDriver driver = new ChromeDriver();
		
		driver.manage().window().maximize();
		
	driver.get("https://www.facebook.com/?_rdr");
	
		//displayed = verifying logo is visible or not
		
		WebElement logo = driver.findElement(By.xpath("//img[@class='fb_logo _8ilh img']"));
	    
		boolean display = logo.isDisplayed();
	System.out.println(display);
		
		//enabled = verifying button is enabled or not
		
	WebElement loginButton = driver.findElement(By.id("u_0_5_0h"));
	
	boolean button = loginButton.isEnabled();
		System.out.println(loginButton);
	
		
       
		

		
		
		
		
		
		
		
	}

}
