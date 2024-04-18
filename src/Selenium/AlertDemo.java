package Selenium;

import org.openqa.selenium.Alert;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class AlertDemo {

	public static void main(String[] args) throws InterruptedException {
		// TODO Auto-generated method stub

		System.setProperty("webdriver.chrome.driver", "C:\\Users\\SM\\Documents\\software\\chromedriver-win64\\chromedriver-win64\\chromedriver.exe ");
		WebDriver driver= new ChromeDriver();
		
		//alert-popup:OK
		
		driver.get("https://demo.automationtesting.in/Alerts.html");
		driver.manage().window().maximize();
		driver.manage().deleteAllCookies();
		
		driver.findElement(By.xpath("//button[@class='btn btn-danger']")).click();
		
		Alert alert = driver.switchTo().alert();
		Thread.sleep(2000);
		System.out.println(alert.getText());
		alert.accept();
		
		//confirmation box Ok/cancel
		Thread.sleep(2000);
		driver.findElement(By.xpath("//a[normalize-space()='Alert with OK & Cancel']")).click();
		driver.findElement(By.xpath("//button[@class='btn btn-primary']")).click();
		Thread.sleep(2000);
		Alert alt= driver.switchTo().alert();
		System.out.println(alt.getText());
		alert.accept();
		
		//Alert box with sendkeys
				Thread.sleep(2000);
				driver.findElement(By.xpath("//a[normalize-space()='Alert with Textbox']")).click();
				driver.findElement(By.xpath("//button[@class='btn btn-info']")).click();
				Thread.sleep(2000);
				Alert alt1= driver.switchTo().alert();
				System.out.println(alt.getText());
				alt1.sendKeys("Automation Testing user 123");
				alert.accept();
		
	}

}
