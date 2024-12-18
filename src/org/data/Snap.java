package org.data;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class Snap {

	public static void main(String[] args) {
		System.setProperty("webdriver.chrome.driver","C:\\Users\\ELCOT\\eclipse-workspace\\MouseOver1\\driver\\chromedriver.exe");
		WebDriver a= new ChromeDriver();
		a.get("https://www.snapdeal.com/");
		
		Actions ac=new Actions(a);
		WebElement mobile=a.findElement(By.xpath("//span[text()='Mobile & Accessories']"));
		ac.moveToElement(mobile).perform();
		
		WebElement clickc=a.findElement(By.xpath("//span[text()='Printed Back Covers']"));
		clickc.click();
		
		

	}

}
