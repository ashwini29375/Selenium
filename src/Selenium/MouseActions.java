package Selenium;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class MouseActions {

	public static void main(String[] args) throws InterruptedException {
		// TODO Auto-generated method stub

		

		System.setProperty("webdriver.chrome.driver", "C:\\Users\\SM\\Documents\\software\\chromedriver-win64\\chromedriver-win64\\chromedriver.exe ");
		WebDriver driver= new ChromeDriver();
		
		//Mouse Aactions
		
		driver.get("https://uncodemy.com");
		driver.manage().window().maximize();
		driver.manage().deleteAllCookies();
		Actions act=new Actions(driver);
		
		WebElement category = driver.findElement(By.xpath("//span[@id='categoriesBtn']"));
		act.moveToElement(category).perform();
		
		Thread.sleep(2000);
		WebElement st=driver.findElement(By.xpath("//a[@href='#'][normalize-space()='Software Testing']"));
		
		
		act.moveToElement(st).perform();
		Thread.sleep(2000);
     	WebElement softwareTesting =driver.findElement(By.xpath("//a[@class='has'][normalize-space()='Software Testing']"));
     	softwareTesting.click();
     	
    
		
	}

}
