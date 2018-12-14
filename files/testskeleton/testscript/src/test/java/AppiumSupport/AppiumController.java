package AppiumSupport;

import io.appium.java_client.AppiumDriver;
import io.appium.java_client.android.AndroidDriver;
import io.appium.java_client.ios.IOSDriver;
import io.appium.java_client.remote.MobileCapabilityType;
import org.openqa.selenium.remote.DesiredCapabilities;

import java.io.File;
import java.net.MalformedURLException;
import java.net.URL;
import java.util.concurrent.TimeUnit;

public class AppiumController {

    public static OS executionOS = OS.IOS;

    public enum OS {
        ANDROID,
        IOS
    }
    public static AppiumController instance = new AppiumController();
    public static AndroidDriver driver;

    public void start() throws MalformedURLException {
        if (driver != null) {
            return;
        }
        switch(executionOS){
        	
            case ANDROID:
            	DesiredCapabilities capabilities = new DesiredCapabilities();
            	capabilities.setCapability(MobileCapabilityType.PLATFORM_NAME, "Android");
            	capabilities.setCapability(MobileCapabilityType.DEVICE_NAME, "Android");
            	capabilities.setCapability("appPackage", "com.sec.android.app.clockpackage");
            	capabilities.setCapability(MobileCapabilityType.NEW_COMMAND_TIMEOUT, "100");
            	capabilities.setCapability("appActivity", ".ClockPackage");
                driver =  new AndroidDriver(new URL("http://127.0.0.1:4723/wd/hub"), capabilities);
                break;
            case IOS:
                break;
        }
        //driver.manage().timeouts().implicitlyWait(60, TimeUnit.SECONDS);
        
    }

    public void stop() {
        if (driver != null) {
            driver.quit();
            driver = null;
        }
    }
    
}
