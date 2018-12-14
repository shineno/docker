package PageObjects;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import io.appium.java_client.AppiumDriver;
import io.appium.java_client.MobileElement;
import io.appium.java_client.pagefactory.AppiumFieldDecorator;

public class MainPageAndroid implements MainPage {
	
	@FindBy(xpath="//android.widget.ImageButton[@content-desc=\"알람 추가\"]") 
	private WebElement addAlarm;
	
	public MainPageAndroid(AppiumDriver driver) {
        PageFactory.initElements(new AppiumFieldDecorator(driver), this);   
    }

	
	public WebElement getAddAlarm() {
		return addAlarm;
	}
	

}
