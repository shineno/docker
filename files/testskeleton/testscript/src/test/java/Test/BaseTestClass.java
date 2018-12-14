package Test;

import AppiumSupport.AppiumBaseClass;

import org.junit.After;
import org.junit.AfterClass;
import org.junit.Before;
import org.junit.BeforeClass;

import AppiumSupport.AppiumController;
import PageObjects.AlarmSettingPageAndroid;
import PageObjects.MainPage;
import PageObjects.MainPageAndroid;


public class BaseTestClass extends AppiumBaseClass{

    public static final int NEEDS_NETWORK_DELAY = 1;
    public static final int NEEDS_SWITCH_SCREEN_DELAY = 2000;
    
    protected static MainPage mainPage; 
    protected static AlarmSettingPageAndroid alarmSettingPage;

    @BeforeClass
    public static void setUp() throws Exception {
    	AppiumController.executionOS = AppiumController.OS.ANDROID;
        AppiumController.instance.start();
        
        switch (AppiumController.executionOS) {
            case ANDROID:
            	mainPage = new MainPageAndroid(driver());
            	alarmSettingPage = new AlarmSettingPageAndroid(driver());
            	
                break;
            case IOS:

                break;
        }
    }

    @AfterClass
    public static void tearDown() {
        AppiumController.instance.stop();
    }
    
    public void waitfor(long time){
		try {
			Thread.sleep(time);
		} catch (InterruptedException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
    }
}
