package Selenium;

import java.util.Set;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class WindowHandlings {

	public static void main(String[] args) throws InterruptedException {
		// TODO Auto-generated method stub
		
		System.setProperty("webdriver.chrome.driver", "C:\\Users\\SM\\Documents\\software\\chromedriver-win64\\chromedriver-win64\\chromedriver.exe ");
		WebDriver driver= new ChromeDriver();
		
		driver.get("https://www.facebook.com/");
		driver.manage().window().maximize();
		
		WebElement insta=  driver.findElement(By.xpath("//a[@title='Take a look at Instagram']"));
		insta.click();
		
		Thread.sleep(5000);
		String parentID= driver.getWindowHandle();
		System.out.println("Parent ID "+parentID);
		
		Set<String> childId=driver.getWindowHandles();
		for(String ch: childId)
		{
			if(!(parentID.equals(ch)))
			{
				driver.switchTo().window(ch);
			}
		}
		
		WebElement phonenumber=driver.findElement(By.xpath("//input[@name='username']"));
		phonenumber.sendKeys("8605754292");
		
 

	}

}
