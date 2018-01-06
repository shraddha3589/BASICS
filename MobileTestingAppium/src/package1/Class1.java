package package1;

import java.net.MalformedURLException;
import java.net.URL;
import java.time.Duration;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.Dimension;
import org.openqa.selenium.Platform;
import org.openqa.selenium.remote.DesiredCapabilities;

import io.appium.java_client.TouchAction;
import io.appium.java_client.android.AndroidDriver;
import io.appium.java_client.android.AndroidElement;
import io.appium.java_client.remote.AndroidMobileCapabilityType;
import io.appium.java_client.remote.MobileCapabilityType;

public class Class1 {

	public static void main(String[] args) throws MalformedURLException, InterruptedException {
		// TODO Auto-generated method stub
		DesiredCapabilities c = new DesiredCapabilities();
		c.setCapability(MobileCapabilityType.DEVICE_NAME, "3450d8409804");
		c.setCapability("platformName", Platform.ANDROID);
		//c.setBrowserName("chrome");
		//to open mobile web app
		c.setCapability(AndroidMobileCapabilityType.AUTO_GRANT_PERMISSIONS, true);

		c.setCapability("app", "C:\\Users\\User\\Downloads\\Med Helper Pill Reminder_v2.8.6_apkpure.com.apk");
		//to open apk file from desktop

		AndroidDriver<AndroidElement> driver = new AndroidDriver<AndroidElement>(new URL("http://0.0.0.0:4723/wd/hub"),c);
		//driver.get("http://google.com");
		driver.findElementById("android:id/button3").click();
		driver.manage().timeouts().implicitlyWait(30, TimeUnit.SECONDS);
		AndroidElement vitals = driver.findElementByAndroidUIAutomator("Uiselector().text(\"Vitals\")");
		vitals.click();
		//driver.findElementByXPath("//android.widget.TextView[text()='Vitals']").click();
		TouchAction a = new TouchAction(driver);
		Dimension d = driver.manage().window().getSize();
		System.out.println(d);
		a.press(d.width/2, d.height/2).perform();
		Thread.sleep(500);
		a.moveTo(d.width/2,d.height/2-500).perform();
		Thread.sleep(500);
		a.release().perform();
		driver.runAppInBackground(Duration.ofSeconds(30));
		vitals.click();
		driver.openNotifications();
		
	}
}
