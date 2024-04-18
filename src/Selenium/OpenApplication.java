package Selenium;

import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

public class OpenApplication {

	public static void main(String[] args) throws InterruptedException {
		// TODO Auto-generated method stub
		
		System.setProperty("webdriver.chrome.driver", "C:\\Users\\SM\\Documents\\software\\chromedriver-win64\\chromedriver-win64\\chromedriver.exe ");
		WebDriver driver= new ChromeDriver();
		
		driver.get("https://opensource-demo.orangehrmlive.com/");
		driver.manage().window().maximize();
		driver.manage().deleteAllCookies();
		
        Thread.sleep(2000);
		WebElement username = driver.findElement(By.xpath("//input[@name=\"username\"]"));
       // WebElement username=driver.findElement(By.xpath("//input[@placeholder='username']"));
		username.sendKeys("Admin");
		
		
		WebElement password= driver.findElement(By.xpath("//input[@name='password']"));
		password.sendKeys("admin123");
	
		WebElement submit=driver.findElement(By.xpath("//button[@class=\"oxd-button oxd-button--medium oxd-button--main orangehrm-login-button\"]"));
		submit.click();
		
		Thread.sleep(2000);
		
		WebElement buzz = driver.findElement(By.xpath("(//span[@class=\"oxd-text oxd-text--span oxd-main-menu-item--name\"])[12]"));
		buzz.click();
		
		Thread.sleep(2000);
		
		WebElement post=driver.findElement(By.xpath("//textarea[@class=\"oxd-buzz-post-input\"]"));
		post.sendKeys("Hi Ash");
		
		WebElement postt= driver.findElement(By.xpath("//button[@type=\"submit\"]"));
		postt.click();
		
		
	}

}
