package PageObjects;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import io.appium.java_client.AppiumDriver;
import io.appium.java_client.MobileElement;
import io.appium.java_client.pagefactory.AppiumFieldDecorator;

public class AlarmSettingPageAndroid implements AlarmSettingPage {

	@FindBy(id="android:id/numberpicker_input") 
	private WebElement time;
	
	@FindBy(id="com.sec.android.app.clockpackage:id/Menu_Done") 
	private WebElement saveBtn;

	
	public AlarmSettingPageAndroid(AppiumDriver driver) {//
        PageFactory.initElements(new AppiumFieldDecorator(driver), this);   
    }


	public WebElement getTime() {
		return time;
	}
	
	public WebElement getSaveBtn() {
		return saveBtn;
	}

}
