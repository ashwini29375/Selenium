package Selenium;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class DragAndDroFrame {

	public static void main(String[] args) throws InterruptedException {
		// TODO Auto-generated method stub

		System.setProperty("webdriver.chrome.driver", "C:\\Users\\SM\\Documents\\software\\chromedriver-win64\\chromedriver-win64\\chromedriver.exe ");
		WebDriver driver= new ChromeDriver();
		
		//Mouse Aactions
		
		driver.get("https://www.globalsqa.com/demo-site/draganddrop/#google_vignette");
		driver.manage().window().maximize();
		
		Thread.sleep(10000);
		
	
		
		Actions act=new Actions(driver);
		
		WebElement frame=driver.findElement(By.xpath("//iframe[@class='demo-frame lazyloaded']"));
		driver.switchTo().frame(frame);
		
		WebElement drag1=driver.findElement(By.xpath("//img[@alt='The peaks of High Tatras']"));
		
		
		WebElement drop1=driver.findElement(By.xpath("//div[@id='trash']"));
		
		act.dragAndDrop(drag1, drop1).perform();
		
		
	}

}
