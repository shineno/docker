package Test;

import java.util.HashMap;
import java.util.List;

import org.junit.Assert;
import org.junit.Test;
import org.openqa.selenium.By;
import org.openqa.selenium.Dimension;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.logging.LogEntry;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

import io.appium.java_client.TouchAction;
import io.appium.java_client.android.AndroidDriver;
import io.appium.java_client.AppiumDriver;
import io.appium.java_client.MobileElement;
import java.util.logging.Level;

public class TestBuiltinAppDemo extends BaseTestClass {

	 @Test
	 public void test_01() {
	
		  
		 for(int i = 0; i < 10; ++i) {
			 
			 //alarm_floating_btn 를 얻는다.
			 WebElement addBtn = mainPage.getAddAlarm();
			 
			 //alarm_floating_btn 구성요소를 클릭한다.
			 addBtn.click();
			 
			 // 화면 전환하는 속도를 고려해 딜레이를 준다. 
			 waitfor(NEEDS_SWITCH_SCREEN_DELAY);
			 
			//numberpicker_input 를 얻는다.
			 WebElement time = alarmSettingPage.getTime();
			 
			 //시간 정보를 입력한다. 
			 time.sendKeys(new Integer((i+1)*10).toString());
			 
			 //Menu_Done 를 얻는다.
			 WebElement saveBtn = alarmSettingPage.getSaveBtn();
			 saveBtn.click();
			 
			// 화면 전환하는 속도를 고려해 딜레이를 준다. 
			 waitfor(NEEDS_SWITCH_SCREEN_DELAY);
			 
		  } 
          
	 }
	 
	 @Test
	 public void test_02() {
		//화면 사이즈를 얻어온다. 
         Dimension size = this.driver().manage().window().getSize();
        	
         //가로 화면 중앙 좌표 
         int startX = size.width/2; // 예 100 인 경우 50
       	
         //세로 화면 상단 80% 지점 좌표 
         int startY = (int) (size.height *0.80); // 예 100인 경우 80 
       	
         //세로 화면 상단 20% 지점 좌표 
         int endY = (int) (size.height *0.20); // 예 100인 경우 20 
       	
         //스크롤
         new TouchAction(driver()).press(startX, startY).waitAction()
		  .moveTo(startX, endY).release().perform();	
         //화면 전환하는 속도를 고려해 딜레이를 준다
         waitfor(NEEDS_SWITCH_SCREEN_DELAY);
         
         
         //세로 화면 하단 10% 지점 좌표 
	      startY = (int) (size.height *0.10); // 예 100 인 경우 25
	        
	      //세로 화면 상단 90% 지점 좌표 
	      endY = (int) (size.height *0.90);// 예 100 인 경우 90
	        
	      //스크롤 
	      new TouchAction(driver()).press(startX, startY).waitAction()
	      .moveTo(startX, endY).release().perform();
	        
	      //화면 전환하는 속도를 고려해 딜레이를 준다
	      waitfor(NEEDS_SWITCH_SCREEN_DELAY);
		 
	 }
	 
	
}
