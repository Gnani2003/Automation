package Testing;

import org.openqa.selenium.*;
import org.openqa.selenium.chrome.ChromeDriver;

public class Practice {

	public static void main(String[] args) throws InterruptedException {
		
		System.setProperty("webdriver.chrome.driver", "C:\\Users\\chinn\\eclipse-workspace\\Automation\\driver\\chromedriver.exe");
		
		WebDriver driver = new ChromeDriver();
		
		driver.manage().window().maximize();
		
		driver.get("https://supplier.meesho.com/panel/v3/new/root/login");
		
		driver.findElement(By.name("emailOrPhone")).sendKeys("9381844141");
		
		driver.findElement(By.name("password")).sendKeys("Gnani@2003");
		
		driver.findElement(By.xpath("//span[@class='MuiTypography-root MuiTypography-button css-bxgd7v'][1]")).click();
		
		//span[@class='MuiTypography-root MuiTypography-button css-bxgd7v'][1]
		
	driver.findElement(By.xpath("//button[@class='MuiButton-root MuiButton-text MuiButton-textPrimary MuiButton-sizeSmall MuiButton-textSizeSmall MuiButtonBase-root css-1nd5tof']")).click();
		
		button[@class='MuiButton-root MuiButton-text MuiButton-textPrimary MuiButton-sizeSmall MuiButton-textSizeSmall MuiButtonBase-root css-1nd5tof']	
		
		driver.findElement(By.xpath("//button[@class='MuiButton-root MuiButton-contained MuiButton-containedPrimary MuiButton-sizeLarge MuiButton-containedSizeLarge MuiButtonBase-root css-1hy7tlh']")).click();
		
		button[@class='MuiButton-root MuiButton-contained MuiButton-containedPrimary MuiButton-sizeLarge MuiButton-containedSizeLarge MuiButtonBase-root css-1hy7tlh']
		
		driver.findElement(By.xpath("//div[@class='MuiBox-root css-155139i']")).click();
		
		div[@class='MuiBox-root css-155139i']
		 
		driver.findElement(By.xpath("//p[@class='MuiTypography-root MuiTypography-body1 css-lgfijk'][1]")).click();
		
		p[@class='MuiTypography-root MuiTypography-body1 css-lgfijk'][1]
		 Thread.sleep(6000);

		
		
		
		driver.get("https://www.amazon.com/ap/signin?openid.pape.max_auth_age=0&openid.return_to=https%3A%2F%2Fwww.amazon.com%2FLogin-Radhika-Roy%2Fdp%2FB0789VYZG4%3Fref_%3Dnav_ya_signin&openid.identity=http%3A%2F%2Fspecs.openid.net%2Fauth%2F2.0%2Fidentifier_select&openid.assoc_handle=usflex&openid.mode=checkid_setup&openid.claimed_id=http%3A%2F%2Fspecs.openid.net%2Fauth%2F2.0%2Fidentifier_select&openid.ns=http%3A%2F%2Fspecs.openid.net%2Fauth%2F2.0");
		
		driver.findElement(By.id("ap_email")).sendKeys("9381844141");
		
		driver.findElement(By.id("continue")).click();
		
		driver.findElement(By.id("ap_password")).sendKeys("20032003");
		
		//driver.findElement(By.id("signInSubmit")).click();
		
		driver.findElement(By.id("continue")).click();
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
	}

}
