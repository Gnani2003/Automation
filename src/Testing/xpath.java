package Testing;

import org.openqa.selenium.*;

import org.openqa.selenium.chrome.ChromeDriver;

public class xpath {

	public static void main(String[] args) {
		
		System.setProperty("webdriver.chrome.driver", "C:\\Users\\chinn\\eclipse-workspace\\Automation\\driver\\chromedriver.exe");
		
		WebDriver driver = new ChromeDriver();
		
		driver.manage().window().maximize();
		
//		driver.get("https://www.flipkart.com/account/login?ret=%2F");
//		
//		//input[@class='r4vIwl BV+Dqf']
//		
//		driver.findElement(By.xpath("//input[@class='r4vIwl BV+Dqf']")).sendKeys("9381844141");
//		
//		//tagname[text()='textvalue']
//		
//		driver.findElement(By.xpath("//button[contains(text(),'Request)]']")).click();
//		
//		//tagname[contains(text(), 'partial text')]
//		
//		//button[contains(text(),'OTP')]
//		
		
		driver.get(null);
		
		
	}

}
