package org.data;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class Snape {

	public static void main(String[] args) {
		System.setProperty("webdriver.chrome.driver","C:\\Users\\ELCOT\\eclipse-workspace\\MouseOver1\\driver\\chromedriver.exe");
		WebDriver a=new ChromeDriver();
		a.get("https://www.snapdeal.com/");
		
		WebElement women=a.findElement(By.xpath("//span[@style='display: inline-block;']"));
		Actions ac= new Actions(a);
		ac.moveToElement(women).perform();
		

	}

}
