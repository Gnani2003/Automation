package Testing;

import org.openqa.selenium.By;
import org.openqa.selenium.chrome.ChromeDriver;

public class Task1Java {

	public static void main(String[] args) throws InterruptedException {

		System.setProperty("webdriver.chrome.driver","C:\\Users\\chinn\\eclipse-workspace\\Automation\\driver\\chromedriver.exe" );
		
		ChromeDriver driver = new ChromeDriver();
		
		driver.manage().window().maximize();
		
		//driver.get("http://greenstech.in/selenium-course-content.html");
		
		
		
		driver.get("https://infinity.icicibank.com/corp/Login.jsp");
		
        driver.findElement(By.xpath("//input[@class='login-input mode-select-userid']")).sendKeys("9381844141");
		
		Thread.sleep(5000);
		
		
		
		
		
		
	}

}
