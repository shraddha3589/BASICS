package com.testng.execution;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.util.Properties;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.Test;

@Test
public class Runner {

	public void register() throws FileNotFoundException, IOException{
		Properties p = new Properties ();
		p.load(new FileInputStream("config.properties"));
		System.setProperty("webdriver.gecko.driver" , "geckodriver.exe");
		WebDriver driver = new ChromeDriver();
		driver.manage().timeouts().implicitlyWait(30, TimeUnit.SECONDS);
		driver.get(p.getProperty("url"));
		WebElement my_acc = driver.findElement (By.linkText("MY ACCOUNT"));
		my_acc.click();
		WebElement register = driver.findElement(By.xpath("//span[text()='Register']"));
		register.click();
	}
		
			
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub

		
	}

}
