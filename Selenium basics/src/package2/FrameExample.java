package package2;

import java.util.Set;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class FrameExample {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
WebDriver driver= new ChromeDriver();
driver.manage().window().maximize();
driver.manage().timeouts().implicitlyWait(30, TimeUnit.SECONDS);
driver.get("https://naukri.com");
Set<String> winids =driver.getWindowHandles();
Object[] ids =winids.toArray();
driver.switchTo().window(ids[1].toString());
driver.close();
driver.switchTo().window(ids[0].toString());



	}
	
}
