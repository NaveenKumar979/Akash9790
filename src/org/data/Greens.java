package org.data;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class Greens {

	public static void main(String[] args) {
		System.setProperty("webdriver.chrome.driver","C:\\Users\\ELCOT\\eclipse-workspace\\MouseOver1\\driver\\chromedriver.exe");
		WebDriver a=new ChromeDriver();
		a.manage().window().maximize();
		a.manage().timeouts().implicitlyWait(10,TimeUnit.SECONDS);
		a.manage().deleteAllCookies();
		a.get("http://greenstech.in/selenium-course-content.html");
		
		WebElement course=a.findElement(By.xpath("//div[@class='header-browse-greens']"));
		
		Actions ac=new Actions(a);
		ac.moveToElement(course).perform();
		
		
		WebElement test=a.findElement(By.xpath("//p[@class='course-desc']"));
		ac.moveToElement(test).perform();
		
		WebElement btnclick=a.findElement(By.xpath("//span[text()='Selenium Certification Training']"));
		btnclick.click();
	}

}
