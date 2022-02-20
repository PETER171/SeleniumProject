package Demo;

import org.testng.annotations.Test;
import java.sql.Driver;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.Test;
import org.testng.reporters.jq.Main;

public class FirstExample {
	
	@Test
	public static void test1() throws InterruptedException {
		//String path = System.getProperty("user.dir");
		System.setProperty("webdriver.chrome.driver","C:\\Users\\Peter Khambule\\Documents\\SeleniumPractice\\SeleniumPractice\\Drivers\\Chrome\\chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		//driver.manage().timeouts().implicitlyWait(30,TimeUnit.SECONDS);
		driver.get("https://www.w3schools.com/");
		
		driver.manage().window().maximize();
		driver.findElement(By.id("navbtn_tutorials")).click();
		Thread.sleep(3000);
		driver.findElement(By.linkText("Learn HTML")).click();
		Thread.sleep(3000);
		driver.findElement(By.linkText("HTML Forms")).click();
		Thread.sleep(3000);
		//driver.findElement(By.linkText("Try it Yourself »")).click();
		driver.quit();
		//driver.close();
		
	}
		
	
}
