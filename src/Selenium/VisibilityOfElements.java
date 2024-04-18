package Selenium;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class VisibilityOfElements {

	public static void main(String[] args) throws InterruptedException {
		// TODO Auto-generated method stub

		System.setProperty("webdriver.chrome.driver", "C:\\Users\\SM\\Documents\\software\\chromedriver-win64\\chromedriver-win64\\chromedriver.exe ");
		WebDriver driver= new ChromeDriver();
		
		driver.get("https://opensource-demo.orangehrmlive.com/");
		driver.manage().window().maximize();
		
        Thread.sleep(2000);
		WebElement username = driver.findElement(By.xpath("//input[@name=\"username\"]"));
       // WebElement username=driver.findElement(By.xpath("//input[@placeholder='username']"));
		username.sendKeys("Admin");
		
		
		WebElement password= driver.findElement(By.xpath("//input[@name='password']"));
		password.sendKeys("admin123");
	
		WebElement submit=driver.findElement(By.xpath("//button[@class=\"oxd-button oxd-button--medium oxd-button--main orangehrm-login-button\"]"));
		
		if(submit.isDisplayed() && submit.isEnabled())
		{
			submit.click();
		}
		
	}

}
