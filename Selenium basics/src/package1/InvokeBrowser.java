package package1;

import java.util.concurrent.TimeUnit;

import org.apache.bcel.generic.NEWARRAY;
import org.openqa.selenium.By;
import org.openqa.selenium.Point;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;
//import org.openqa.selenium.firefox.FirefoxDriver;

public class InvokeBrowser {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		WebDriver driver= new ChromeDriver();
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(30,TimeUnit.SECONDS);
		driver.get("http://www.magento.com");
		WebElement my_acc = driver.findElement(By.linkText("MY ACCOUNT"));
		System.out.println(my_acc.getAttribute("href"));
		System.out.println(my_acc.getCssValue("color"));
		System.out.println(my_acc.getTagName());
		System.out.println(my_acc.getText());
		my_acc.click();
		
		WebElement email=driver.findElement(By.name("login[username]"));
		email.clear();
		email.sendKeys("shradha@gmail.com");
		
		//WebElement password=driver.findElement(By.name("login[password]"));
		WebElement password=driver.findElement(By.cssSelector(".input-text.required-entry.validate-name-hyper"));
		password.clear();
		password.sendKeys("Welcome123");
		//password.submit();
				
		WebElement login=driver.findElement(By.id("send2"));
		login.click();
		
		//----------------//
		WebElement reg=driver.findElement(By.xpath("//span[text()='Register']"));
		reg.click();
		
		WebElement comp_p=driver.findElement(By.id("customer_company_type"));
		Select com_pr = new Select(comp_p);
		
		com_pr.selectByVisibleText("Tech Partner");
		

		
		
	
		
//		String url = driver.getCurrentUrl();
//		System.out.println(url);
//		System.out.println(driver.getWindowHandle());
//		System.out.println(driver.getWindowHandles());
//		driver.close();
//		driver.manage().timeouts().implicitlyWait(30,TimeUnit.SECONDS);
//		Point p= driver.manage().window().getPosition();
//		driver.manage().window().setPosition(new Point(p.x+300,p.y+400));
//		driver.navigate().to("https://www.google.com");
		//driver.quit();
	}

}