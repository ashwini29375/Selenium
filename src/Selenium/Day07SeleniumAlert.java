package Selenium;

import org.openqa.selenium.Alert;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Day07SeleniumAlert {

	public static void main(String[] args) throws InterruptedException {
		// TODO Auto-generated method stub
		
		System.setProperty("webdriver.chrome.driver", "C:\\Users\\SM\\Documents\\software\\chromedriver-win64\\chromedriver-win64\\chromedriver.exe ");
		WebDriver driver= new ChromeDriver();
		
		//alert-popup
		
		driver.get("https://mail.rediff.com/cgi-bin/login.cgi");
		driver.manage().window().maximize();
		driver.manage().deleteAllCookies();
		
		driver.findElement(By.xpath("//input[@type=\"submit\"]")).click();
		
		Alert alert = driver.switchTo().alert();
		Thread.sleep(2000);
		System.out.println(alert.getText());
		alert.accept();
		
		
     //	Alert-popup(Ok Button)--------
		
		   driver.get("https:/www.selenium.dev/documentation/webdriver/interactions/alerts/");
		   driver.manage().window().maximize();
		   driver.manage().deleteAllCookies();
		   Thread.sleep(3000);
		   WebElement clickonOK = driver.findElement(By.xpath("//a[text()=\"See an example alert\"]"));
		   clickonOK.click();
		   Alert alertt=driver.switchTo().alert();
		   Thread.sleep(2000);

		  System.out.println(alertt.getText());  //it will get text from alert box and print
		  alert.accept();
		  
	//Confirmation-popup(Ok & Cancel Button)-----------
		  
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		


//		driver.get("https://demoqa.com/alerts");
//		driver.manage().window().maximize();
//		
//		
//		//Alert popup with OK Button
//		
//		WebElement Button1= driver.findElement(By.xpath("//button[@id=\"alertButton\"]"));
//		Thread.sleep(3000);
//		Button1.click();
//		Alert alert = driver.switchTo().alert();
//		System.out.println(alert.getText());
//		Thread.sleep(3000);
//		alert.accept();
//		 
		   
	
	}

}
