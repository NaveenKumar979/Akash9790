package org.data;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class Home {

	public static void main(String[] args) {
	System.setProperty("webdriver.chrome.driver","C:\\Users\\ELCOT\\eclipse-workspace\\MouseOver1\\driver\\chromedriver.exe");
	WebDriver a=new ChromeDriver();
	a.get("https://www.homedepot.com/");
	
	WebElement all=a.findElement(By.className("ShoppingLinks__link"));
	Actions ac=new Actions(a);
	ac.moveToElement(all).perform();
	
	
	WebElement heat=a.findElement(By.xpath("//a[@data-level='Heating & Cooling']"));
	ac.moveToElement(heat).perform();
	
	WebElement air=a.findElement(By.xpath("//a[@title='Air Conditioners']"));
	ac.moveToElement(air).perform();
	
	WebElement clickbtn=a.findElement(By.xpath("//a[text()='Portable Air Conditioners']"));
	clickbtn.click();
	}

}
