package Fee;

import java.awt.AWTException;
import java.awt.Robot;
import java.io.IOException;
import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.testng.annotations.BeforeSuite;
import org.testng.annotations.Test;

import Android_BaseTest.AulasBaseTest;
import io.appium.java_client.AppiumBy;
import io.appium.java_client.HidesKeyboard;

public class DataOperatorFeeTest extends AulasBaseTest {
	
	public DataOperatorFeeTest()
	{
		super();
	}
	
	
	 @BeforeSuite
      public void doLoginOperation() throws InterruptedException, IOException {
		   
		    initilization();
		    Thread.sleep(8000);
			driver.findElement(By.xpath("//android.widget.TextView[@text='UPDATE NOW']")).click();
			WebElement RESTARTAULAS=driver.findElement(AppiumBy.xpath("//android.widget.TextView[@text='RESTART AULAS']"));
			waitUntil(RESTARTAULAS);
			RESTARTAULAS.click();
		    Thread.sleep(1000);
			for(int i=0;i<7;i++) {
			driver.findElement(By.xpath("/hierarchy/android.widget.FrameLayout/android.widget.LinearLayout/android.widget.FrameLayout/android.widget.LinearLayout/android.widget.FrameLayout/android.widget.FrameLayout/android.view.ViewGroup/android.view.ViewGroup/android.view.ViewGroup/android.widget.FrameLayout/android.view.ViewGroup/android.view.ViewGroup/android.view.ViewGroup/android.view.ViewGroup/android.view.ViewGroup/android.view.ViewGroup/android.view.ViewGroup[10]/android.view.ViewGroup")).click();
			}
			driver.findElement(By.xpath("/hierarchy/android.widget.FrameLayout/android.widget.LinearLayout/android.widget.FrameLayout/android.widget.LinearLayout/android.widget.FrameLayout/android.widget.FrameLayout/android.view.ViewGroup/android.view.ViewGroup/android.view.ViewGroup/android.widget.FrameLayout/android.view.ViewGroup/android.view.ViewGroup/android.view.ViewGroup/android.view.ViewGroup/android.view.ViewGroup/android.view.ViewGroup/android.view.ViewGroup[9]/android.view.ViewGroup/android.widget.TextView")).click();
			driver.findElement(By.className("android.widget.EditText")).sendKeys("9999888866");
			((HidesKeyboard) driver).hideKeyboard();
			Thread.sleep(5000); //
			driver.findElement(By.xpath("//android.widget.TextView[@text='CONTINUE']")).click();
          //  WebElement toast=driver.findElement(AppiumBy.xpath("/hierarchy/android.widget.Toast"));
          //  waitUntil(toast);
		//	String toastMessage = driver.findElement(AppiumBy.xpath("/hierarchy/android.widget.Toast")).getText();
		//	System.out.println(toastMessage);
			WebElement toast=driver.findElement(AppiumBy.xpath("//android.widget.Toast[1]"));
	        waitUntil(toast);
		    String toastMessage = driver.findElement(AppiumBy.xpath("//android.widget.Toast[1]")).getText();
			System.out.println(toastMessage);
			WebElement OTP=driver.findElement(By.className("android.widget.EditText"));
			waitUntil(OTP);
			OTP.sendKeys("592726");
		   ((HidesKeyboard) driver).hideKeyboard();
			driver.findElement(By.xpath("//android.widget.TextView[@text='VERIFY']")).click();
			Thread.sleep(5000);
	     
	     }
	 
	    @Test(priority=1)
		public void validateSettings() throws InterruptedException, AWTException
		{
			Thread.sleep(6000);
			driver.findElement(AppiumBy.accessibilityId("Fee, tab, 3 of 4")).click();
			Thread.sleep(4000);
			driver.findElement(AppiumBy.xpath("/hierarchy/android.widget.FrameLayout/android.widget.LinearLayout/android.widget.FrameLayout/android.widget.LinearLayout/android.widget.FrameLayout/android.widget.FrameLayout/android.view.ViewGroup/android.view.ViewGroup/android.view.ViewGroup/android.widget.FrameLayout/android.view.ViewGroup/android.view.ViewGroup/android.view.ViewGroup/android.view.ViewGroup/android.view.ViewGroup/android.view.ViewGroup[1]/android.widget.FrameLayout/android.view.ViewGroup/android.view.ViewGroup/android.view.ViewGroup/android.widget.FrameLayout/android.view.ViewGroup/android.view.ViewGroup/android.view.ViewGroup/android.view.ViewGroup/android.view.ViewGroup/android.view.ViewGroup[1]/android.view.ViewGroup/android.view.ViewGroup[2]/android.view.ViewGroup[2]/android.view.ViewGroup[1]/android.widget.TextView")).click();
			Thread.sleep(2000);
			driver.findElement(AppiumBy.xpath("//*[@text='Processing fee payable by student']")).click();
			Thread.sleep(2000);
			driver.findElement(AppiumBy.xpath("//android.widget.TextView[@text='Manual']")).click();
			Thread.sleep(2000);
			driver.findElement(AppiumBy.xpath("//android.widget.TextView[@text='SAVE']")).click();
			Thread.sleep(6000);
			//WebElement toastmessage=driver.findElement(AppiumBy.xpath("/hierarchy/android.widget.Toast"));
			//waitUntil(toastmessage);
			
			
		}
	 
	    @Test(priority=2)
		public void validateFeeViewMore() throws InterruptedException
		{
			Thread.sleep(6000);
			driver.findElement(AppiumBy.accessibilityId("Fee, tab, 3 of 4")).click();
			Thread.sleep(4000);
			WebElement ele1=driver.findElement(AppiumBy.xpath("/hierarchy/android.widget.FrameLayout/android.widget.LinearLayout/android.widget.FrameLayout/android.widget.LinearLayout/android.widget.FrameLayout/android.widget.FrameLayout/android.view.ViewGroup/android.view.ViewGroup/android.view.ViewGroup/android.widget.FrameLayout/android.view.ViewGroup/android.view.ViewGroup/android.view.ViewGroup/android.view.ViewGroup/android.view.ViewGroup/android.view.ViewGroup[1]/android.widget.FrameLayout/android.view.ViewGroup/android.view.ViewGroup/android.view.ViewGroup/android.widget.FrameLayout/android.view.ViewGroup/android.view.ViewGroup/android.view.ViewGroup/android.view.ViewGroup/android.view.ViewGroup/android.view.ViewGroup[2]/android.view.ViewGroup/android.widget.ScrollView/android.view.ViewGroup/android.view.ViewGroup[1]/android.widget.HorizontalScrollView/android.view.ViewGroup"));
			Thread.sleep(2000);
			swipeAction(ele1,"left");
			Thread.sleep(4000);
			driver.findElement(AppiumBy.xpath("//android.widget.TextView[@text='VIEW MORE']")).click();
			Thread.sleep(2000);
			driver.findElement(AppiumBy.xpath("//android.widget.EditText[@text='Week']")).click();
			driver.findElement(AppiumBy.xpath("//android.widget.TextView[@text='Months']")).click();
			Thread.sleep(2000);
			driver.findElement(AppiumBy.xpath("//android.widget.EditText[@text='Months']")).click();
			driver.findElement(AppiumBy.xpath("//android.widget.TextView[@text='Week']")).click();
			Thread.sleep(3000);
			//driver.findElement(AppiumBy.id("header-back")).click();
			driver.findElement(AppiumBy.accessibilityId("Go back")).click();
			System.out.println("feeViewMore TestCase is Executed");
		}
		
		@Test(priority=3)
		public void validateGeneratePaymentRequestIndividual() throws InterruptedException
		{
			Thread.sleep(6000);
			driver.findElement(AppiumBy.accessibilityId("Fee, tab, 3 of 4")).click();
			Thread.sleep(4000);
			driver.findElement(AppiumBy.xpath("//android.widget.TextView[@text='Generate Payment Request']")).click();
			Thread.sleep(4000);
			driver.findElement(AppiumBy.xpath("//android.widget.TextView[@text='Select Class']")).click();
			Thread.sleep(2000);
			//driver.findElement(AppiumBy.xpath("//android.widget.TextView[@text='0 - BP8']")).click();
			driver.findElement(AppiumBy.xpath("/hierarchy/android.widget.FrameLayout/android.widget.LinearLayout/android.widget.FrameLayout/android.widget.LinearLayout/android.widget.FrameLayout/android.widget.FrameLayout/android.view.ViewGroup/android.view.ViewGroup/android.view.ViewGroup/android.widget.FrameLayout/android.view.ViewGroup/android.view.ViewGroup/android.view.ViewGroup/android.view.ViewGroup/android.view.ViewGroup/android.widget.ScrollView/android.view.ViewGroup/android.view.ViewGroup[4]/android.widget.ScrollView/android.view.ViewGroup/android.view.ViewGroup[1]/android.widget.TextView")).click();
			Thread.sleep(2000);
			driver.findElement(AppiumBy.xpath("(//android.widget.EditText)[1]")).sendKeys("9");
			Thread.sleep(2000);
			//driver.findElement(AppiumBy.xpath("//android.widget.TextView[@text='student']")).click();
			driver.findElement(AppiumBy.xpath("/hierarchy/android.widget.FrameLayout/android.widget.LinearLayout/android.widget.FrameLayout/android.widget.LinearLayout/android.widget.FrameLayout/android.widget.FrameLayout/android.view.ViewGroup/android.view.ViewGroup/android.view.ViewGroup/android.widget.FrameLayout/android.view.ViewGroup/android.view.ViewGroup/android.view.ViewGroup/android.view.ViewGroup/android.view.ViewGroup/android.widget.ScrollView/android.view.ViewGroup/android.widget.ScrollView/android.view.ViewGroup/android.view.ViewGroup/android.view.ViewGroup[1]/android.widget.TextView")).click();
			Thread.sleep(4000);
			driver.findElement(AppiumBy.xpath("(//android.widget.EditText)[2]")).sendKeys("40");
			Thread.sleep(2000);
			driver.findElement(AppiumBy.xpath("//android.widget.TextView[@text='Set due date']")).click();
			Thread.sleep(2000);
			driver.findElement(AppiumBy.xpath("/hierarchy/android.widget.FrameLayout/android.widget.LinearLayout/android.widget.FrameLayout/android.widget.LinearLayout/android.widget.FrameLayout/android.widget.FrameLayout/android.view.ViewGroup/android.view.ViewGroup/android.view.ViewGroup/android.widget.FrameLayout/android.view.ViewGroup/android.view.ViewGroup/android.view.ViewGroup/android.view.ViewGroup/android.view.ViewGroup/android.view.ViewGroup[2]/android.view.ViewGroup/android.view.ViewGroup[2]/android.widget.HorizontalScrollView/android.view.ViewGroup/android.view.ViewGroup/android.widget.SeekBar/android.view.ViewGroup[2]/android.widget.ImageView")).click();
			Thread.sleep(2000);
			driver.findElement(AppiumBy.xpath("//android.widget.TextView[@text='14']")).click();
			Thread.sleep(2000);
			driver.findElement(AppiumBy.xpath("(//android.widget.EditText)[3]")).sendKeys("Your College Fee ,Make Sure To Pay Before Due Date");
			Thread.sleep(2000);
			driver.findElement(AppiumBy.androidUIAutomator("new UiScrollable(new UiSelector()).scrollIntoView(text(\"SEND REQUEST\"));"));
			Thread.sleep(2000);
			driver.findElement(AppiumBy.xpath("//android.widget.TextView[@text='Yes']")).click();
			Thread.sleep(2000);
			driver.findElement(AppiumBy.xpath("//android.widget.TextView[@text='SEND REQUEST']")).click();
			Thread.sleep(2000);
 
			System.out.println("generatePaymentRequestIndividual TestCase is Executed");
			
		  
		}
		@Test(priority=4)
		public void validateGeneratePaymentRequestClass() throws InterruptedException
		{
			Thread.sleep(1000);
			driver.findElement(AppiumBy.accessibilityId("Fee, tab, 3 of 4")).click();
			Thread.sleep(2000);
			driver.findElement(AppiumBy.xpath("//android.widget.TextView[@text='Generate Payment Request']")).click();
			Thread.sleep(2000);
			driver.findElement(AppiumBy.xpath("//android.widget.TextView[@text='Class']")).click();
			Thread.sleep(2000);
			driver.findElement(AppiumBy.xpath("//android.widget.TextView[@text='Select Class']")).click();
			//driver.findElement(AppiumBy.xpath("//android.widget.TextView[@text='0 - BP8']")).click();
			driver.findElement(AppiumBy.xpath("/hierarchy/android.widget.FrameLayout/android.widget.LinearLayout/android.widget.FrameLayout/android.widget.LinearLayout/android.widget.FrameLayout/android.widget.FrameLayout/android.view.ViewGroup/android.view.ViewGroup/android.view.ViewGroup/android.widget.FrameLayout/android.view.ViewGroup/android.view.ViewGroup/android.view.ViewGroup/android.view.ViewGroup/android.view.ViewGroup/android.widget.ScrollView/android.view.ViewGroup/android.view.ViewGroup[4]/android.widget.ScrollView/android.view.ViewGroup/android.view.ViewGroup[1]/android.widget.TextView")).click();
			Thread.sleep(2000);
			driver.findElement(AppiumBy.xpath("(//android.widget.EditText)[1]")).sendKeys("40");
			Thread.sleep(2000);
			driver.findElement(AppiumBy.xpath("//android.widget.TextView[@text='Set due date']")).click();
			Thread.sleep(2000);
			driver.findElement(AppiumBy.xpath("/hierarchy/android.widget.FrameLayout/android.widget.LinearLayout/android.widget.FrameLayout/android.widget.LinearLayout/android.widget.FrameLayout/android.widget.FrameLayout/android.view.ViewGroup/android.view.ViewGroup/android.view.ViewGroup/android.widget.FrameLayout/android.view.ViewGroup/android.view.ViewGroup/android.view.ViewGroup/android.view.ViewGroup/android.view.ViewGroup/android.view.ViewGroup[2]/android.view.ViewGroup/android.view.ViewGroup[2]/android.widget.HorizontalScrollView/android.view.ViewGroup/android.view.ViewGroup/android.widget.SeekBar/android.view.ViewGroup[2]/android.widget.ImageView")).click();
			Thread.sleep(2000);
			driver.findElement(AppiumBy.xpath("//android.widget.TextView[@text='14']")).click();
			Thread.sleep(2000);
			driver.findElement(AppiumBy.xpath("(//android.widget.EditText)[2]")).sendKeys("Your Exam Fee ,Make Sure To Pay Before Due Date");
			Thread.sleep(2000);
			driver.findElement(AppiumBy.androidUIAutomator("new UiScrollable(new UiSelector()).scrollIntoView(text(\"SEND REQUEST\"));"));
			Thread.sleep(2000);
			driver.findElement(AppiumBy.xpath("//android.widget.TextView[@text='Yes']")).click();
			Thread.sleep(2000);
			driver.findElement(AppiumBy.xpath("//android.widget.TextView[@text='SEND REQUEST']")).click();
			/*
			String toastMessage=driver.findElement(By.xpath("//android.widget.Toast")).getAttribute("name");
			//Assert.assertEquals(toastMessage,"Payment request sent successfully");
			String Expected="Payment request sent successfully";
			if(toastMessage.equals(Expected))
			{
				System.out.println("toastMessage");
			}
			else
			{
				System.out.println("Error");
			}
	        */
			System.out.println("generatePaymentRequestClass TestCase is Executed");
			
		  
		}
		
		@Test(priority=5)
		public void validateAddOfflinePayment() throws InterruptedException
		{
			Thread.sleep(1000);
			driver.findElement(AppiumBy.accessibilityId("Fee, tab, 3 of 4")).click();
			Thread.sleep(2000);
			driver.findElement(AppiumBy.xpath("//android.widget.TextView[@text='Add Offline Payment']")).click();
			Thread.sleep(4000);
			driver.findElement(AppiumBy.xpath("//android.widget.TextView[@text='Select Class']")).click();
			Thread.sleep(2000);
			//driver.findElement(AppiumBy.xpath("//android.widget.TextView[@text='0 - BP8']")).click();
			driver.findElement(AppiumBy.xpath("/hierarchy/android.widget.FrameLayout/android.widget.LinearLayout/android.widget.FrameLayout/android.widget.LinearLayout/android.widget.FrameLayout/android.widget.FrameLayout/android.view.ViewGroup/android.view.ViewGroup/android.view.ViewGroup/android.widget.FrameLayout/android.view.ViewGroup/android.view.ViewGroup/android.view.ViewGroup/android.view.ViewGroup/android.view.ViewGroup/android.widget.ScrollView/android.view.ViewGroup/android.view.ViewGroup[2]/android.widget.ScrollView/android.view.ViewGroup/android.view.ViewGroup[1]/android.widget.TextView")).click();
			Thread.sleep(2000);
			driver.findElement(AppiumBy.xpath("(//android.widget.EditText)[1]")).sendKeys("9");
			Thread.sleep(2000);
			driver.findElement(AppiumBy.xpath("/hierarchy/android.widget.FrameLayout/android.widget.LinearLayout/android.widget.FrameLayout/android.widget.LinearLayout/android.widget.FrameLayout/android.widget.FrameLayout/android.view.ViewGroup/android.view.ViewGroup/android.view.ViewGroup/android.widget.FrameLayout/android.view.ViewGroup/android.view.ViewGroup/android.view.ViewGroup/android.view.ViewGroup/android.view.ViewGroup/android.widget.ScrollView/android.view.ViewGroup/android.widget.ScrollView/android.view.ViewGroup/android.view.ViewGroup/android.view.ViewGroup[1]/android.widget.TextView")).click();
			//driver.findElement(AppiumBy.xpath("//android.widget.TextView[@text='student']")).click();
			Thread.sleep(2000);
			//driver.findElement(AppiumBy.xpath("(//android.widget.EditText)[2]")).click();
			//Thread.sleep(2000);
			driver.findElement(AppiumBy.xpath("/hierarchy/android.widget.FrameLayout/android.widget.LinearLayout/android.widget.FrameLayout/android.widget.LinearLayout/android.widget.FrameLayout/android.widget.FrameLayout/android.view.ViewGroup/android.view.ViewGroup/android.view.ViewGroup/android.widget.FrameLayout/android.view.ViewGroup/android.view.ViewGroup/android.view.ViewGroup/android.view.ViewGroup/android.view.ViewGroup/android.widget.ScrollView/android.view.ViewGroup/android.view.ViewGroup[3]/android.widget.ScrollView/android.view.ViewGroup/android.view.ViewGroup/android.view.ViewGroup[2]/android.widget.TextView")).click();
			//driver.hideKeyboard();
			//driver.findElement(AppiumBy.androidUIAutomator("new UiScrollable(new UiSelector()).scrollIntoView(text(\"4000\"));"));
			//driver.findElement(AppiumBy.xpath("(//android.widget.TextView[@text='4000'])[1]")).click();
			driver.findElement(AppiumBy.xpath("//android.widget.TextView[@text='Set payment date']")).click();
			Thread.sleep(2000);
			driver.findElement(AppiumBy.xpath("//android.widget.TextView[@text='1']")).click();
			Thread.sleep(2000);
			driver.findElement(AppiumBy.androidUIAutomator("new UiScrollable(new UiSelector()).scrollIntoView(text(\"ADD\"));"));
			Thread.sleep(2000);
			driver.findElement(AppiumBy.xpath("//android.widget.TextView[@text='Yes']")).click();
			Thread.sleep(2000);
			driver.findElement(AppiumBy.xpath("//android.widget.TextView[@text='Cash']")).click();
			Thread.sleep(2000);
			driver.findElement(AppiumBy.xpath("//android.widget.TextView[@text='ADD']")).click();
			/*String captals = "ABCDEFGHIJKLMNOPQRSTUVWXYZ";
			Random rnd = new Random();
			StringBuilder name = new StringBuilder(8);
			for (int n = 0; n < 8; n++)
			{
				name.append(captals.charAt(rnd.nextInt(captals.length())));
			}
			*/
			System.out.println("addOfflinePayment TestCase is Executed");
			
		}	
		
		@Test(priority=6)
		public void validateTransactionsTypeofpayment() throws InterruptedException
		{
			Thread.sleep(1000);
			driver.findElement(AppiumBy.accessibilityId("Fee, tab, 3 of 4")).click();
			Thread.sleep(2000);
			driver.findElement(AppiumBy.xpath("//android.widget.TextView[@text='Transactions']")).click();
			Thread.sleep(2000);
			driver.findElement(AppiumBy.xpath("//android.widget.TextView[@text='Type of payment']")).click();
			Thread.sleep(2000);
			driver.findElement(AppiumBy.xpath("//android.widget.SeekBar[@content-desc=\"Bottom Sheet\"]/android.view.ViewGroup[2]/android.view.ViewGroup/android.widget.ScrollView/android.view.ViewGroup/android.view.ViewGroup[1]/android.view.ViewGroup")).click();
			Thread.sleep(2000);
			driver.findElement(AppiumBy.xpath("//android.widget.TextView[@text='APPLY FILTER']")).click();
			Thread.sleep(6000);
			driver.findElement(AppiumBy.xpath("//android.widget.TextView[@text='Type of payment']")).click();
			Thread.sleep(2000);
			driver.findElement(AppiumBy.xpath("//android.widget.SeekBar[@content-desc=\"Bottom Sheet\"]/android.view.ViewGroup[2]/android.view.ViewGroup/android.widget.ScrollView/android.view.ViewGroup/android.view.ViewGroup[2]/android.view.ViewGroup")).click();
			Thread.sleep(2000);
			driver.findElement(AppiumBy.xpath("//android.widget.TextView[@text='APPLY FILTER']")).click();
			Thread.sleep(6000);
			driver.findElement(AppiumBy.xpath("//android.widget.TextView[@text='Type of payment']")).click();
			Thread.sleep(2000);
			driver.findElement(AppiumBy.xpath("//android.widget.TextView[@text='CLOSE']")).click();
			Thread.sleep(2000);
			driver.findElement(AppiumBy.xpath("/hierarchy/android.widget.FrameLayout/android.widget.LinearLayout/android.widget.FrameLayout/android.widget.LinearLayout/android.widget.FrameLayout/android.widget.FrameLayout/android.view.ViewGroup/android.view.ViewGroup/android.view.ViewGroup/android.widget.FrameLayout/android.view.ViewGroup/android.view.ViewGroup/android.view.ViewGroup/android.view.ViewGroup/android.view.ViewGroup/android.view.ViewGroup[1]/android.view.ViewGroup/android.view.ViewGroup[2]/android.view.ViewGroup[1]/android.view.ViewGroup/android.widget.TextView[1]")).click();
			Thread.sleep(1000);
			System.out.println("validateTransactionsTypeofpayment TestCase is Executed");
			
		}
		
		@Test(priority=7)
		public void validateTransactionsPaymentDatefilter() throws InterruptedException
		{
			Thread.sleep(4000);
			driver.findElement(AppiumBy.accessibilityId("Fee, tab, 3 of 4")).click();
			Thread.sleep(2000);
			driver.findElement(AppiumBy.xpath("//android.widget.TextView[@text='Transactions']")).click();
			Thread.sleep(2000);
			driver.findElement(AppiumBy.xpath("//android.widget.TextView[@text='Payment Date']")).click();
			Thread.sleep(2000);
			driver.findElement(AppiumBy.xpath("//android.widget.SeekBar[@content-desc=\"Bottom Sheet\"]/android.view.ViewGroup[2]/android.view.ViewGroup/android.widget.ScrollView/android.view.ViewGroup/android.view.ViewGroup[1]/android.view.ViewGroup/android.view.ViewGroup")).click();
			Thread.sleep(2000);
			driver.findElement(AppiumBy.xpath("//android.widget.TextView[@text='APPLY FILTER']")).click();
			Thread.sleep(6000);
			driver.findElement(AppiumBy.xpath("//android.widget.TextView[@text='Payment Date']")).click();
			Thread.sleep(2000);
			driver.findElement(AppiumBy.xpath("//android.widget.SeekBar[@content-desc=\"Bottom Sheet\"]/android.view.ViewGroup[2]/android.view.ViewGroup/android.widget.ScrollView/android.view.ViewGroup/android.view.ViewGroup[2]/android.view.ViewGroup/android.view.ViewGroup")).click();
			Thread.sleep(2000);
			driver.findElement(AppiumBy.xpath("//android.widget.TextView[@text='APPLY FILTER']")).click();
			Thread.sleep(6000);
			driver.findElement(AppiumBy.xpath("//android.widget.TextView[@text='Payment Date']")).click();
			Thread.sleep(2000);
			driver.findElement(AppiumBy.xpath("//android.widget.SeekBar[@content-desc=\"Bottom Sheet\"]/android.view.ViewGroup[2]/android.view.ViewGroup/android.widget.ScrollView/android.view.ViewGroup/android.view.ViewGroup[3]/android.view.ViewGroup/android.view.ViewGroup")).click();
			Thread.sleep(2000);
			driver.findElement(AppiumBy.xpath("//android.widget.TextView[@text='APPLY FILTER']")).click();
			Thread.sleep(6000);
			driver.findElement(AppiumBy.xpath("//android.widget.TextView[@text='Payment Date']")).click();
			Thread.sleep(2000);
			driver.findElement(AppiumBy.xpath("//android.widget.SeekBar[@content-desc=\"Bottom Sheet\"]/android.view.ViewGroup[2]/android.view.ViewGroup/android.widget.ScrollView/android.view.ViewGroup/android.view.ViewGroup[4]/android.view.ViewGroup/android.view.ViewGroup")).click();
			Thread.sleep(2000);
			driver.findElement(AppiumBy.xpath("//android.widget.TextView[@text='APPLY FILTER']")).click();
			Thread.sleep(6000);
			/*
			driver.findElement(AppiumBy.xpath("//android.widget.TextView[@text='Payment Date']")).click();
			Thread.sleep(2000);
			WebElement ScrollUp=driver.findElement(AppiumBy.xpath("//android.widget.SeekBar[@content-desc=\"Bottom Sheet handle, Drag up or down to extend or minimize the Bottom Sheet\"]"));
			Thread.sleep(2000);
			swipeAction(ScrollUp,"down");
			Thread.sleep(4000);
			driver.findElement(AppiumBy.xpath("//android.widget.TextView[@text='Payment Date']")).click();
			Thread.sleep(2000);
			driver.findElement(AppiumBy.xpath("//android.widget.SeekBar[@content-desc=\"Bottom Sheet\"]/android.view.ViewGroup[2]/android.view.ViewGroup/android.widget.ScrollView/android.view.ViewGroup/android.view.ViewGroup[5]/android.view.ViewGroup/android.view.ViewGroup")).click();
			Thread.sleep(2000);
			driver.findElement(AppiumBy.xpath("//android.widget.TextView[@text='APPLY FILTER']")).click();
			Thread.sleep(6000);
			driver.findElement(AppiumBy.xpath("//android.widget.TextView[@text='Payment Date']")).click();
			Thread.sleep(2000);
			driver.findElement(AppiumBy.xpath("//android.widget.SeekBar[@content-desc=\"Bottom Sheet\"]/android.view.ViewGroup[2]/android.view.ViewGroup/android.widget.ScrollView/android.view.ViewGroup/android.view.ViewGroup[6]/android.view.ViewGroup/android.view.ViewGroup")).click();
			Thread.sleep(2000);
			driver.findElement(AppiumBy.xpath("//android.widget.TextView[@text='APPLY FILTER']")).click();
			Thread.sleep(6000);
			*/
			driver.findElement(AppiumBy.xpath("//android.widget.TextView[@text='Payment Date']")).click();
			Thread.sleep(2000);
			driver.findElement(AppiumBy.xpath("//android.widget.TextView[@text='CLOSE']")).click();
			Thread.sleep(2000);
			driver.findElement(AppiumBy.xpath("/hierarchy/android.widget.FrameLayout/android.widget.LinearLayout/android.widget.FrameLayout/android.widget.LinearLayout/android.widget.FrameLayout/android.widget.FrameLayout/android.view.ViewGroup/android.view.ViewGroup/android.view.ViewGroup/android.widget.FrameLayout/android.view.ViewGroup/android.view.ViewGroup/android.view.ViewGroup/android.view.ViewGroup/android.view.ViewGroup/android.view.ViewGroup[1]/android.view.ViewGroup/android.view.ViewGroup[2]/android.view.ViewGroup[1]/android.view.ViewGroup/android.widget.TextView[1]")).click();
			Thread.sleep(1000);
			System.out.println("validateTransactionsPaymentDatefilter TestCase is Executed");
				
			
		}
		
		@Test(priority=8)
		public void validateTransactionsInvoiceDownload() throws InterruptedException
		{
			Thread.sleep(4000);
			driver.findElement(AppiumBy.accessibilityId("Fee, tab, 3 of 4")).click();
			Thread.sleep(2000);
			driver.findElement(AppiumBy.xpath("//android.widget.TextView[@text='Transactions']")).click();
			Thread.sleep(2000);
			driver.findElement(AppiumBy.xpath("//android.widget.TextView[@text='Download']")).click();
			Thread.sleep(2000);
			driver.findElement(AppiumBy.xpath("/hierarchy/android.widget.FrameLayout/android.widget.LinearLayout/android.widget.FrameLayout/android.widget.LinearLayout/android.widget.FrameLayout/android.widget.FrameLayout/android.view.ViewGroup/android.view.ViewGroup/android.view.ViewGroup/android.widget.FrameLayout/android.view.ViewGroup/android.view.ViewGroup/android.view.ViewGroup/android.view.ViewGroup/android.view.ViewGroup/android.view.ViewGroup[2]/android.widget.ScrollView/android.view.ViewGroup/android.view.ViewGroup[1]")).click();
			Thread.sleep(2000);
			driver.findElement(AppiumBy.xpath("//android.widget.TextView[@text='DOWNLOAD']")).click();
			Thread.sleep(8000);
			driver.findElement(AppiumBy.accessibilityId("Go back")).click();
			Thread.sleep(2000);
			driver.findElement(AppiumBy.xpath("/hierarchy/android.widget.FrameLayout/android.widget.LinearLayout/android.widget.FrameLayout/android.widget.LinearLayout/android.widget.FrameLayout/android.widget.FrameLayout/android.view.ViewGroup/android.view.ViewGroup/android.view.ViewGroup/android.widget.FrameLayout/android.view.ViewGroup/android.view.ViewGroup/android.view.ViewGroup/android.view.ViewGroup/android.view.ViewGroup/android.view.ViewGroup[2]/android.view.ViewGroup[4]/android.widget.ScrollView/android.view.ViewGroup/android.widget.ScrollView/android.view.ViewGroup/android.view.ViewGroup[1]/android.view.ViewGroup")).click();
			Thread.sleep(2000);
			driver.findElement(AppiumBy.xpath("//android.widget.TextView[@text='Download']")).click();
			Thread.sleep(8000);
			driver.findElement(AppiumBy.xpath("/hierarchy/android.widget.FrameLayout/android.widget.LinearLayout/android.widget.FrameLayout/android.widget.LinearLayout/android.widget.FrameLayout/android.widget.FrameLayout/android.view.ViewGroup/android.view.ViewGroup/android.view.ViewGroup/android.widget.FrameLayout/android.view.ViewGroup/android.view.ViewGroup/android.view.ViewGroup/android.view.ViewGroup/android.view.ViewGroup/android.view.ViewGroup[1]/android.view.ViewGroup/android.view.ViewGroup[2]/android.view.ViewGroup[1]/android.view.ViewGroup")).click();
			Thread.sleep(2000);
			driver.findElement(AppiumBy.xpath("/hierarchy/android.widget.FrameLayout/android.widget.LinearLayout/android.widget.FrameLayout/android.widget.LinearLayout/android.widget.FrameLayout/android.widget.FrameLayout/android.view.ViewGroup/android.view.ViewGroup/android.view.ViewGroup/android.widget.FrameLayout/android.view.ViewGroup/android.view.ViewGroup/android.view.ViewGroup/android.view.ViewGroup/android.view.ViewGroup/android.view.ViewGroup[1]/android.view.ViewGroup/android.view.ViewGroup[2]/android.view.ViewGroup[1]/android.view.ViewGroup/android.widget.TextView[1]")).click();
			Thread.sleep(1000);
			System.out.println("validateTransactionsInvoiceDownload TestCase is Executed");
			
		}
		
		@Test(priority=9)
		public void validateTransactionsAddOfflinePayment() throws InterruptedException
		{
			Thread.sleep(4000);
			driver.findElement(AppiumBy.accessibilityId("Fee, tab, 3 of 4")).click();
			Thread.sleep(2000);
			driver.findElement(AppiumBy.xpath("//android.widget.TextView[@text='Transactions']")).click();
			Thread.sleep(2000);
			driver.findElement(AppiumBy.xpath("//android.widget.TextView[@text='Add']")).click();
			Thread.sleep(6000);
			driver.findElement(AppiumBy.xpath("//android.widget.TextView[@text='Select Class']")).click();
			Thread.sleep(2000);
			driver.findElement(AppiumBy.xpath("/hierarchy/android.widget.FrameLayout/android.widget.LinearLayout/android.widget.FrameLayout/android.widget.LinearLayout/android.widget.FrameLayout/android.widget.FrameLayout/android.view.ViewGroup/android.view.ViewGroup/android.view.ViewGroup/android.widget.FrameLayout/android.view.ViewGroup/android.view.ViewGroup/android.view.ViewGroup/android.view.ViewGroup/android.view.ViewGroup/android.widget.ScrollView/android.view.ViewGroup/android.view.ViewGroup[2]/android.widget.ScrollView/android.view.ViewGroup/android.view.ViewGroup[1]")).click();
			Thread.sleep(2000);
			driver.findElement(AppiumBy.xpath("(//android.widget.EditText)[1]")).sendKeys("9");
			Thread.sleep(2000);
			driver.findElement(AppiumBy.xpath("/hierarchy/android.widget.FrameLayout/android.widget.LinearLayout/android.widget.FrameLayout/android.widget.LinearLayout/android.widget.FrameLayout/android.widget.FrameLayout/android.view.ViewGroup/android.view.ViewGroup/android.view.ViewGroup/android.widget.FrameLayout/android.view.ViewGroup/android.view.ViewGroup/android.view.ViewGroup/android.view.ViewGroup/android.view.ViewGroup/android.widget.ScrollView/android.view.ViewGroup/android.widget.ScrollView/android.view.ViewGroup/android.view.ViewGroup/android.view.ViewGroup[1]/android.widget.TextView")).click();
			Thread.sleep(2000);
			driver.findElement(AppiumBy.xpath("/hierarchy/android.widget.FrameLayout/android.widget.LinearLayout/android.widget.FrameLayout/android.widget.LinearLayout/android.widget.FrameLayout/android.widget.FrameLayout/android.view.ViewGroup/android.view.ViewGroup/android.view.ViewGroup/android.widget.FrameLayout/android.view.ViewGroup/android.view.ViewGroup/android.view.ViewGroup/android.view.ViewGroup/android.view.ViewGroup/android.widget.ScrollView/android.view.ViewGroup/android.view.ViewGroup[3]/android.widget.ScrollView/android.view.ViewGroup/android.view.ViewGroup/android.view.ViewGroup[1]")).click();
			Thread.sleep(2000);
			driver.findElement(AppiumBy.xpath("//android.widget.TextView[@text='Set payment date']")).click();
			Thread.sleep(2000);
			driver.findElement(AppiumBy.xpath("//android.widget.TextView[@text='1']")).click();
			Thread.sleep(2000);
			driver.findElement(AppiumBy.androidUIAutomator("new UiScrollable(new UiSelector()).scrollIntoView(text(\"ADD\"));"));
			Thread.sleep(2000);
			driver.findElement(AppiumBy.xpath("//android.widget.TextView[@text='Yes']")).click();
			Thread.sleep(2000);
			driver.findElement(AppiumBy.xpath("//android.widget.TextView[@text='Cash']")).click();
			Thread.sleep(2000);
			driver.findElement(AppiumBy.xpath("//android.widget.TextView[@text='ADD']")).click();
			Thread.sleep(2000);
			driver.findElement(AppiumBy.xpath("/hierarchy/android.widget.FrameLayout/android.widget.LinearLayout/android.widget.FrameLayout/android.widget.LinearLayout/android.widget.FrameLayout/android.widget.FrameLayout/android.view.ViewGroup/android.view.ViewGroup/android.view.ViewGroup/android.widget.FrameLayout/android.view.ViewGroup/android.view.ViewGroup/android.view.ViewGroup/android.view.ViewGroup/android.view.ViewGroup/android.view.ViewGroup[1]/android.view.ViewGroup/android.view.ViewGroup[2]/android.view.ViewGroup[1]/android.view.ViewGroup/android.widget.TextView[1]")).click();
			Thread.sleep(1000);
			System.out.println("validateTransactionsAddOfflinePayment TestCase is Executed");	
			
		}
		
		
		@Test(priority=10)
		public void validateAllStudentsOverview() throws InterruptedException
		{
			Thread.sleep(4000);
			driver.findElement(AppiumBy.accessibilityId("Fee, tab, 3 of 4")).click();
			Thread.sleep(2000);
			driver.findElement(AppiumBy.xpath("//android.widget.TextView[@text='All Students']")).click();
			Thread.sleep(2000);
			driver.findElement(AppiumBy.xpath("/hierarchy/android.widget.FrameLayout/android.widget.LinearLayout/android.widget.FrameLayout/android.widget.LinearLayout/android.widget.FrameLayout/android.widget.FrameLayout/android.view.ViewGroup/android.view.ViewGroup/android.view.ViewGroup/android.widget.FrameLayout/android.view.ViewGroup/android.view.ViewGroup/android.view.ViewGroup/android.view.ViewGroup/android.view.ViewGroup/android.view.ViewGroup[2]/android.widget.ScrollView/android.view.ViewGroup/android.widget.HorizontalScrollView[1]/android.view.ViewGroup/android.view.ViewGroup[1]/android.view.ViewGroup/android.view.ViewGroup")).click();
			Thread.sleep(2000);
			driver.findElement(AppiumBy.xpath("//*[@text='VIEW MORE']")).click();
			Thread.sleep(2000);
			driver.findElement(AppiumBy.xpath("//android.widget.EditText[@text='Week']")).click();
			Thread.sleep(1000);
			driver.findElement(AppiumBy.xpath("//android.widget.TextView[@text='Months']")).click();
			Thread.sleep(2000);
			driver.findElement(AppiumBy.xpath("//android.widget.EditText[@text='Months']")).click();
			Thread.sleep(1000);
			driver.findElement(AppiumBy.xpath("//android.widget.TextView[@text='Week']")).click();
			Thread.sleep(3000);
			driver.findElement(AppiumBy.accessibilityId("Go back")).click();
			Thread.sleep(2000);
			/*
			WebElement ele1=driver.findElement(AppiumBy.xpath("/hierarchy/android.widget.FrameLayout/android.widget.LinearLayout/android.widget.FrameLayout/android.widget.LinearLayout/android.widget.FrameLayout/android.widget.FrameLayout/android.view.ViewGroup/android.view.ViewGroup/android.view.ViewGroup/android.widget.FrameLayout/android.view.ViewGroup/android.view.ViewGroup/android.view.ViewGroup/android.view.ViewGroup/android.view.ViewGroup/android.view.ViewGroup[2]/android.widget.ScrollView/android.view.ViewGroup/android.view.ViewGroup[1]/android.widget.HorizontalScrollView/android.view.ViewGroup/android.view.ViewGroup[2]"));
			Thread.sleep(2000);
			swipeAction(ele1,"left");
			
			driver.findElement(AppiumBy.xpath("/hierarchy/android.widget.FrameLayout/android.widget.LinearLayout/android.widget.FrameLayout/android.widget.LinearLayout/android.widget.FrameLayout/android.widget.FrameLayout/android.view.ViewGroup/android.view.ViewGroup/android.view.ViewGroup/android.widget.FrameLayout/android.view.ViewGroup/android.view.ViewGroup/android.view.ViewGroup/android.view.ViewGroup/android.view.ViewGroup/android.view.ViewGroup[2]/android.widget.ScrollView/android.view.ViewGroup/android.view.ViewGroup[2]/android.widget.ScrollView/android.view.ViewGroup/android.view.ViewGroup[1]/android.view.ViewGroup")).click();
			Thread.sleep(2000);
			driver.findElement(AppiumBy.accessibilityId("Go back")).click();
			Thread.sleep(2000);
			*/
			driver.findElement(AppiumBy.xpath("/hierarchy/android.widget.FrameLayout/android.widget.LinearLayout/android.widget.FrameLayout/android.widget.LinearLayout/android.widget.FrameLayout/android.widget.FrameLayout/android.view.ViewGroup/android.view.ViewGroup/android.view.ViewGroup/android.widget.FrameLayout/android.view.ViewGroup/android.view.ViewGroup/android.view.ViewGroup/android.view.ViewGroup/android.view.ViewGroup/android.view.ViewGroup[1]/android.view.ViewGroup/android.view.ViewGroup[2]/android.view.ViewGroup[1]/android.view.ViewGroup/android.widget.TextView[1]")).click();
			Thread.sleep(2000);
			driver.findElement(AppiumBy.accessibilityId("Go back")).click();
			Thread.sleep(2000);
			System.out.println("validateTransactionsInvoiceDownload TestCase is Executed");
			
		}
		@Test(priority=11)
		public void validateRecentActivities() throws InterruptedException
		{
			Thread.sleep(4000);
			driver.findElement(AppiumBy.accessibilityId("Fee, tab, 3 of 4")).click();
			Thread.sleep(2000);
			driver.findElement(AppiumBy.xpath("/hierarchy/android.widget.FrameLayout/android.widget.LinearLayout/android.widget.FrameLayout/android.widget.LinearLayout/android.widget.FrameLayout/android.widget.FrameLayout/android.view.ViewGroup/android.view.ViewGroup/android.view.ViewGroup/android.widget.FrameLayout/android.view.ViewGroup/android.view.ViewGroup/android.view.ViewGroup/android.view.ViewGroup/android.view.ViewGroup/android.view.ViewGroup[1]/android.widget.FrameLayout/android.view.ViewGroup/android.view.ViewGroup/android.view.ViewGroup/android.widget.FrameLayout/android.view.ViewGroup/android.view.ViewGroup/android.view.ViewGroup/android.view.ViewGroup/android.view.ViewGroup/android.view.ViewGroup[2]/android.view.ViewGroup/android.widget.ScrollView/android.view.ViewGroup/android.widget.ScrollView/android.view.ViewGroup/android.view.ViewGroup/android.view.ViewGroup")).click();
			Thread.sleep(2000);
			driver.findElement(AppiumBy.accessibilityId("Go back")).click();
			Thread.sleep(2000);
			driver.findElement(AppiumBy.xpath("//*[@text='VIEW ALL']")).click();
			Thread.sleep(2000);
			driver.findElement(AppiumBy.xpath("/hierarchy/android.widget.FrameLayout/android.widget.LinearLayout/android.widget.FrameLayout/android.widget.LinearLayout/android.widget.FrameLayout/android.widget.FrameLayout/android.view.ViewGroup/android.view.ViewGroup/android.view.ViewGroup/android.widget.FrameLayout/android.view.ViewGroup/android.view.ViewGroup/android.view.ViewGroup/android.view.ViewGroup/android.view.ViewGroup/android.view.ViewGroup[2]/android.view.ViewGroup[2]")).click();
			Thread.sleep(2000);
			driver.findElement(AppiumBy.xpath("//android.widget.SeekBar[@content-desc=\"Bottom Sheet\"]/android.view.ViewGroup[2]/android.view.ViewGroup/android.widget.ScrollView/android.view.ViewGroup/android.view.ViewGroup[1]/android.view.ViewGroup")).click();
			Thread.sleep(2000);
			driver.findElement(AppiumBy.xpath("//android.widget.TextView[@text='APPLY FILTER']")).click();
			Thread.sleep(6000);
			driver.findElement(AppiumBy.xpath("/hierarchy/android.widget.FrameLayout/android.widget.LinearLayout/android.widget.FrameLayout/android.widget.LinearLayout/android.widget.FrameLayout/android.widget.FrameLayout/android.view.ViewGroup/android.view.ViewGroup/android.view.ViewGroup/android.widget.FrameLayout/android.view.ViewGroup/android.view.ViewGroup/android.view.ViewGroup/android.view.ViewGroup/android.view.ViewGroup/android.view.ViewGroup[2]/android.view.ViewGroup[2]")).click();
			Thread.sleep(2000);
			driver.findElement(AppiumBy.xpath("//android.widget.TextView[@text='CLOSE']")).click();
			Thread.sleep(2000);
			driver.findElement(AppiumBy.xpath("/hierarchy/android.widget.FrameLayout/android.widget.LinearLayout/android.widget.FrameLayout/android.widget.LinearLayout/android.widget.FrameLayout/android.widget.FrameLayout/android.view.ViewGroup/android.view.ViewGroup/android.view.ViewGroup/android.widget.FrameLayout/android.view.ViewGroup/android.view.ViewGroup/android.view.ViewGroup/android.view.ViewGroup/android.view.ViewGroup/android.view.ViewGroup[1]/android.view.ViewGroup/android.view.ViewGroup[2]/android.view.ViewGroup/android.view.ViewGroup/android.view.ViewGroup[2]/android.widget.TextView")).click();
			Thread.sleep(2000);
			driver.findElement(AppiumBy.className("android.widget.EditText")).sendKeys("Mahi Student");
			Thread.sleep(2000);
			driver.findElement(AppiumBy.xpath("/hierarchy/android.widget.FrameLayout/android.widget.LinearLayout/android.widget.FrameLayout/android.widget.LinearLayout/android.widget.FrameLayout/android.widget.FrameLayout/android.view.ViewGroup/android.view.ViewGroup/android.view.ViewGroup/android.widget.FrameLayout/android.view.ViewGroup/android.view.ViewGroup/android.view.ViewGroup/android.view.ViewGroup/android.view.ViewGroup/android.view.ViewGroup[1]/android.view.ViewGroup/android.view.ViewGroup[2]/android.view.ViewGroup/android.view.ViewGroup/android.view.ViewGroup[2]/android.widget.TextView")).click();
			Thread.sleep(2000);
			driver.findElement(AppiumBy.xpath("/hierarchy/android.widget.FrameLayout/android.widget.LinearLayout/android.widget.FrameLayout/android.widget.LinearLayout/android.widget.FrameLayout/android.widget.FrameLayout/android.view.ViewGroup/android.view.ViewGroup/android.view.ViewGroup/android.widget.FrameLayout/android.view.ViewGroup/android.view.ViewGroup/android.view.ViewGroup/android.view.ViewGroup/android.view.ViewGroup/android.view.ViewGroup[1]/android.view.ViewGroup/android.view.ViewGroup[2]/android.view.ViewGroup/android.view.ViewGroup/android.view.ViewGroup[1]/android.widget.TextView")).click();
			Thread.sleep(6000);
			driver.findElement(AppiumBy.xpath("/hierarchy/android.widget.FrameLayout/android.widget.LinearLayout/android.widget.FrameLayout/android.widget.LinearLayout/android.widget.FrameLayout/android.widget.FrameLayout/android.view.ViewGroup/android.view.ViewGroup/android.view.ViewGroup/android.widget.FrameLayout/android.view.ViewGroup/android.view.ViewGroup/android.view.ViewGroup/android.view.ViewGroup/android.view.ViewGroup/android.view.ViewGroup[1]/android.view.ViewGroup/android.view.ViewGroup[2]/android.view.ViewGroup/android.view.ViewGroup/android.view.ViewGroup[1]/android.widget.TextView")).click();
			Thread.sleep(2000);
			System.out.println("validateTransactionsInvoiceDownload TestCase is Executed");
			
		}
	

}

