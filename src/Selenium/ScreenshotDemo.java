package Selenium;

import java.io.File;
import java.io.IOException;

import org.apache.commons.io.FileUtils;
import org.openqa.selenium.By;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class ScreenshotDemo {

	public static void main(String[] args) throws InterruptedException, IOException {
		// TODO Auto-generated method stub
		
		System.setProperty("webdriver.chrome.driver", "C:\\Users\\SM\\Documents\\software\\chromedriver-win64\\chromedriver-win64\\chromedriver.exe ");
		WebDriver driver= new ChromeDriver();
		
//		driver.manage().deleteAllCookies();
		driver.get("https://opensource-demo.orangehrmlive.com/");
		driver.manage().window().maximize();
		
		
        Thread.sleep(2000);
        
		WebElement username = driver.findElement(By.xpath("//input[@name=\"username\"]"));
       // WebElement username=driver.findElement(By.xpath("//input[@placeholder='username']"));
		username.sendKeys("Admin");
		
		
		WebElement password= driver.findElement(By.xpath("//input[@name='password']"));
		password.sendKeys("admin123");
	
		WebElement submit=driver.findElement(By.xpath("//button[@class=\"oxd-button oxd-button--medium oxd-button--main orangehrm-login-button\"]"));
		Thread.sleep(2000);
		
		TakesScreenshot ts= (TakesScreenshot) driver;	
		File src = ts.getScreenshotAs(OutputType.FILE);
		File dest= new File("C:\\Users\\SM\\Documents\\software\\Screenshots\\Beforelogin.png");
		FileUtils.copyFile(src, dest);
		
		submit.click();
		Thread.sleep(2000);
		
		File src1 = ts.getScreenshotAs(OutputType.FILE);
		File dest1= new File("C:\\Users\\SM\\Documents\\software\\Screenshots\\Afterlogin.png");
		FileUtils.copyFile(src1, dest1);
		
		Thread.sleep(2000);
		
		WebElement buzz = driver.findElement(By.xpath("(//span[@class=\"oxd-text oxd-text--span oxd-main-menu-item--name\"])[12]"));
		buzz.click();
		
		Thread.sleep(2000);
		
		WebElement post=driver.findElement(By.xpath("//textarea[@class=\"oxd-buzz-post-input\"]"));
		post.sendKeys("Hi Ash");
		Thread.sleep(2000);
		
		File src2 = ts.getScreenshotAs(OutputType.FILE);
		File dest2= new File("C:\\Users\\SM\\Documents\\software\\Screenshots\\BeforePost.png");
		FileUtils.copyFile(src2, dest2);
		
		
		
		WebElement postt= driver.findElement(By.xpath("//button[@type=\"submit\"]"));
		postt.click();
		Thread.sleep(2000);
		File src3 = ts.getScreenshotAs(OutputType.FILE);
		File dest3= new File("C:\\Users\\SM\\Documents\\software\\Screenshots\\AfterPost.png");
		FileUtils.copyFile(src3, dest3);
		
		
	}

}
