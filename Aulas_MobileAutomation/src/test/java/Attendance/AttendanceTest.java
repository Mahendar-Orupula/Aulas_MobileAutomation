package Attendance;

import java.io.IOException;
import java.net.MalformedURLException;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebElement;
import org.testng.annotations.BeforeSuite;
import org.testng.annotations.Test;

import Android_BaseTest.AulasBaseTest;
import Pages.AttendancePage;
import Pages.HomePage;
import io.appium.java_client.AppiumBy;
import io.appium.java_client.HidesKeyboard;
import io.appium.java_client.android.AndroidDriver;

public class AttendanceTest extends AulasBaseTest{
/*
	public AndroidDriver driver;
	public AttendancePage AP;
	//LoginClass LC;
	
	public AttendanceTest() {
		super();
	}
	public HomePage HP;
	
	/*
       @BeforeSuite
       public void doLoginOperation() throws InterruptedException, IOException {

	      ConfigureAppium();
	      Thread.sleep(2000);
	      LP.checkUpdates();
	      HP=LP.Login();
	      AP=HP.clickOnAttendance();
	     }

       
       @Test(priority=1)
       public void clickOnClockIn() throws InterruptedException
       {
    	   Thread.sleep(2000);
    	   driver.findElement(By.xpath("//android.widget.TextView[@text()='FORGOT TO CLOCK OUT?']")).click();
		   System.out.println("clicked on Attendance Button"); 
       }
      
	*/
		
	 @BeforeSuite
     public void doLoginOperation() throws InterruptedException, IOException {

		    initilization();
		    Thread.sleep(8000);
			driver.findElement(By.xpath("//android.widget.TextView[@text='UPDATE NOW']")).click();
			Thread.sleep(8000);
		    driver.findElement(By.xpath("//android.widget.TextView[@text='RESTART AULAS']")).click();
		    Thread.sleep(1000);
			for(int i=0;i<7;i++) {
			driver.findElement(By.xpath("/hierarchy/android.widget.FrameLayout/android.widget.LinearLayout/android.widget.FrameLayout/android.widget.LinearLayout/android.widget.FrameLayout/android.widget.FrameLayout/android.view.ViewGroup/android.view.ViewGroup/android.view.ViewGroup/android.widget.FrameLayout/android.view.ViewGroup/android.view.ViewGroup/android.view.ViewGroup/android.view.ViewGroup/android.view.ViewGroup/android.view.ViewGroup/android.view.ViewGroup[10]/android.view.ViewGroup")).click();
			}
			driver.findElement(By.xpath("/hierarchy/android.widget.FrameLayout/android.widget.LinearLayout/android.widget.FrameLayout/android.widget.LinearLayout/android.widget.FrameLayout/android.widget.FrameLayout/android.view.ViewGroup/android.view.ViewGroup/android.view.ViewGroup/android.widget.FrameLayout/android.view.ViewGroup/android.view.ViewGroup/android.view.ViewGroup/android.view.ViewGroup/android.view.ViewGroup/android.view.ViewGroup/android.view.ViewGroup[9]/android.view.ViewGroup/android.widget.TextView")).click();
			driver.findElement(By.className("android.widget.EditText")).sendKeys("9812168599");
			((HidesKeyboard) driver).hideKeyboard();
			Thread.sleep(5000); //
			driver.findElement(By.xpath("//android.widget.TextView[@text='CONTINUE']")).click();
			Thread.sleep(8000);
			driver.findElement(By.className("android.widget.EditText")).sendKeys("592726");
		   ((HidesKeyboard) driver).hideKeyboard();
			driver.findElement(By.xpath("//android.widget.TextView[@text='VERIFY']")).click();
			Thread.sleep(5000);
	     
	     }
	
	 
	 public void clickOnAttendance() throws InterruptedException, MalformedURLException {
		
		Thread.sleep(3000);
		String more = driver.findElement(By.xpath("//*[@text='More']")).getText();
		driver.findElement(By.xpath("//*[@text='More']")).click();
		System.out.println("clicked on :" + more + " Button");
		driver.findElement(By.xpath("//android.widget.TextView[@text='Attendance']")).click();
		System.out.println("clicked on Attendance Button");
		
	}
	
	@Test(priority = 1)
	public void validateForgotToClockIn() throws InterruptedException, MalformedURLException {
		Thread.sleep(3000);
		String more = driver.findElement(By.xpath("//*[@text='More']")).getText();
		driver.findElement(By.xpath("//*[@text='More']")).click();
		System.out.println("clicked on :" + more + " Button");
		driver.findElement(By.xpath("//android.widget.TextView[@text='Attendance']")).click();
		System.out.println("clicked on Attendance Button");
		Thread.sleep(3000);
		driver.findElement(AppiumBy.xpath("//*[@text='FORGOT TO CLOCK OUT?']")).click();
		Thread.sleep(1000);
		driver.findElement(AppiumBy.xpath("//*[@text='Select date']")).click();
		Thread.sleep(1000);
	    driver.findElement(AppiumBy.id("android:id/button1")).click();
	    Thread.sleep(3000);
	    driver.findElement(AppiumBy.xpath("/hierarchy/android.widget.FrameLayout/android.widget.LinearLayout/android.widget.FrameLayout/android.widget.LinearLayout/android.widget.FrameLayout/android.widget.FrameLayout/android.view.ViewGroup/android.view.ViewGroup/android.view.ViewGroup/android.widget.FrameLayout/android.view.ViewGroup/android.view.ViewGroup/android.view.ViewGroup/android.view.ViewGroup/android.view.ViewGroup/android.widget.ScrollView/android.view.ViewGroup/android.view.ViewGroup[2]/android.widget.TextView[1]")).click();
	   // driver.findElement(AppiumBy.xpath("//*[@text='Select clock in']")).click();
	    Thread.sleep(3000);
	    driver.findElement(AppiumBy.id("android:id/am_label")).click();
	    Thread.sleep(2000);
		driver.findElement(AppiumBy.accessibilityId("9")).click();
		Thread.sleep(2000);
		driver.findElement(AppiumBy.accessibilityId("0")).click();
		Thread.sleep(2000);
		driver.findElement(AppiumBy.id("android:id/button1")).click();
		Thread.sleep(3000);
		driver.findElement(AppiumBy.xpath("/hierarchy/android.widget.FrameLayout/android.widget.LinearLayout/android.widget.FrameLayout/android.widget.LinearLayout/android.widget.FrameLayout/android.widget.FrameLayout/android.view.ViewGroup/android.view.ViewGroup/android.view.ViewGroup/android.widget.FrameLayout/android.view.ViewGroup/android.view.ViewGroup/android.view.ViewGroup/android.view.ViewGroup/android.view.ViewGroup/android.widget.ScrollView/android.view.ViewGroup/android.view.ViewGroup[3]/android.widget.TextView[1]")).click();
		//driver.findElement(AppiumBy.xpath("//*[@text='Select clock out']")).click();
		Thread.sleep(4000);
	    driver.findElement(AppiumBy.id("android:id/pm_label")).click();
		Thread.sleep(2000);
		driver.findElement(AppiumBy.accessibilityId("6")).click();
		Thread.sleep(2000);
		driver.findElement(AppiumBy.accessibilityId("0")).click();
		Thread.sleep(2000);
		driver.findElement(AppiumBy.id("android:id/button1")).click();
		Thread.sleep(2000);
		driver.findElement(AppiumBy.className("android.widget.EditText")).sendKeys(" forgotten to clock out");
		Thread.sleep(3000);
		driver.findElement(AppiumBy.xpath("//*[@text='MARK']")).click();
		Thread.sleep(2000);
		System.out.println("ForgotToClockOut TestCase is Executed");
	}

	@Test(priority = 2)
	public void validateViewProfilePage() throws InterruptedException, MalformedURLException {
		Thread.sleep(3000);
		String more = driver.findElement(By.xpath("//*[@text='More']")).getText();
		driver.findElement(By.xpath("//*[@text='More']")).click();
		System.out.println("clicked on :" + more + " Button");
		driver.findElement(By.xpath("//android.widget.TextView[@text='Attendance']")).click();
		System.out.println("clicked on Attendance Button");
	    Thread.sleep(3000);
	    driver.findElement(By.xpath("//*[@text='VIEW PROFILE']")).click();
	    Thread.sleep(1000);
	    driver.findElement(AppiumBy.xpath("//*[@text='Mark Attendance']")).click();
	    Thread.sleep(1000);
		driver.findElement(AppiumBy.xpath("//*[@text='Select date']")).click();
		Thread.sleep(1000);
	    driver.findElement(AppiumBy.id("android:id/button1")).click();
	    Thread.sleep(3000);
	    driver.findElement(AppiumBy.xpath("/hierarchy/android.widget.FrameLayout/android.widget.LinearLayout/android.widget.FrameLayout/android.widget.LinearLayout/android.widget.FrameLayout/android.widget.FrameLayout/android.view.ViewGroup/android.view.ViewGroup/android.view.ViewGroup/android.widget.FrameLayout/android.view.ViewGroup/android.view.ViewGroup/android.view.ViewGroup/android.view.ViewGroup/android.view.ViewGroup/android.widget.ScrollView/android.view.ViewGroup/android.view.ViewGroup[2]/android.widget.TextView[1]")).click();
	   // driver.findElement(AppiumBy.xpath("//*[@text='Select clock in']")).click();
	    Thread.sleep(4000);
	    driver.findElement(AppiumBy.id("android:id/am_label")).click();
	    Thread.sleep(2000);
		driver.findElement(AppiumBy.accessibilityId("9")).click();
		Thread.sleep(2000);
		driver.findElement(AppiumBy.accessibilityId("0")).click();
		Thread.sleep(2000);
		driver.findElement(AppiumBy.id("android:id/button1")).click();
		Thread.sleep(3000);
		driver.findElement(AppiumBy.xpath("/hierarchy/android.widget.FrameLayout/android.widget.LinearLayout/android.widget.FrameLayout/android.widget.LinearLayout/android.widget.FrameLayout/android.widget.FrameLayout/android.view.ViewGroup/android.view.ViewGroup/android.view.ViewGroup/android.widget.FrameLayout/android.view.ViewGroup/android.view.ViewGroup/android.view.ViewGroup/android.view.ViewGroup/android.view.ViewGroup/android.widget.ScrollView/android.view.ViewGroup/android.view.ViewGroup[3]/android.widget.TextView[1]")).click();
		//driver.findElement(AppiumBy.xpath("//*[@text='Select clock out']")).click();
		Thread.sleep(4000);
	    driver.findElement(AppiumBy.id("android:id/pm_label")).click();
		Thread.sleep(2000);
		driver.findElement(AppiumBy.accessibilityId("6")).click();
		Thread.sleep(2000);
		driver.findElement(AppiumBy.accessibilityId("0")).click();
		Thread.sleep(2000);
		driver.findElement(AppiumBy.id("android:id/button1")).click();
		Thread.sleep(2000);
		driver.findElement(AppiumBy.className("android.widget.EditText")).sendKeys(" forgotten to clock out");
		Thread.sleep(3000);
		driver.findElement(AppiumBy.xpath("//*[@text='MARK']")).click();
		Thread.sleep(4000);
		//Attendance by time sheet calendar
	    //	driver.findElement(AppiumBy.xpath("/hierarchy/android.widget.FrameLayout/android.widget.LinearLayout/android.widget.FrameLayout/android.widget.LinearLayout/android.widget.FrameLayout/android.widget.FrameLayout/android.view.ViewGroup/android.view.ViewGroup/android.view.ViewGroup/android.widget.FrameLayout/android.view.ViewGroup/android.view.ViewGroup/android.view.ViewGroup/android.view.ViewGroup/android.view.ViewGroup/android.view.ViewGroup[3]/android.widget.ScrollView/android.view.ViewGroup/android.view.ViewGroup[2]")).click();
		driver.findElement(AppiumBy.xpath("(//*[@text='DOWNLOAD REPORT'])[1]")).click();
		Thread.sleep(2000);
		driver.findElement(AppiumBy.xpath("(//*[@text='Last week'])[1]")).click();
		Thread.sleep(2000);
		driver.findElement(AppiumBy.xpath("(//*[@text='DOWNLOAD'])[1]")).click();
		Thread.sleep(2000);
		driver.findElement(AppiumBy.xpath("(//*[@text='CANCEL'])[1]")).click();
		Thread.sleep(4000);
		driver.findElement(AppiumBy.xpath("//android.widget.Button[@content-desc=\"Attendance, back\"]/android.widget.ImageView")).click();
		Thread.sleep(2000);
		System.out.println("ViewProfileMarkAttendance TestCase is Executed");
		/*
		WebElement ele=driver.findElement(By.xpath("//*[@text='Attendance by schedule']"));
		JavascriptExecutor js = (JavascriptExecutor) driver;
		Thread.sleep(2000);
		js.executeScript("arguments[0].scrollIntoView(true);", ele);
		Thread.sleep(4000);
		driver.findElement(AppiumBy.xpath("(//*[@text='DOWNLOAD REPORT'])[1]")).click();
		Thread.sleep(2000);
		driver.findElement(AppiumBy.xpath("(//*[@text='2'])[1]")).click();
		for(int i=0;i<2;i++) {
		Thread.sleep(2000);
		driver.findElement(AppiumBy.xpath("//android.widget.Button[@content-desc=\"Attendance, back\"]/android.widget.ImageView")).click();
		}
		System.out.println("ViewProfileMarkAttendance TestCase is Executed");
        */

	}
	@Test(priority=3)
	public void validateMyAttendancePage() throws InterruptedException
	{
		Thread.sleep(3000);
		String more = driver.findElement(By.xpath("//*[@text='More']")).getText();
		driver.findElement(By.xpath("//*[@text='More']")).click();
		System.out.println("clicked on :" + more + " Button");
		driver.findElement(By.xpath("//android.widget.TextView[@text='Attendance']")).click();
		System.out.println("clicked on Attendance Button");
	    Thread.sleep(3000);
		for(int i=0;i<2;i++) {
		Thread.sleep(4000);
		driver.findElement(By.xpath("/hierarchy/android.widget.FrameLayout/android.widget.LinearLayout/android.widget.FrameLayout/android.widget.LinearLayout/android.widget.FrameLayout/android.widget.FrameLayout/android.view.ViewGroup/android.view.ViewGroup/android.view.ViewGroup/android.widget.FrameLayout/android.view.ViewGroup/android.view.ViewGroup/android.view.ViewGroup/android.view.ViewGroup/android.view.ViewGroup/android.view.ViewGroup[2]/android.view.ViewGroup[2]/android.view.ViewGroup/android.view.ViewGroup/android.widget.ScrollView/android.view.ViewGroup/android.view.ViewGroup[1]/android.view.ViewGroup[1]/android.widget.TextView"));
		}
		Thread.sleep(1000);
		driver.findElement(AppiumBy.androidUIAutomator("new UiScrollable(new UiSelector()).scrollIntoView(text(\"Attendance summary\"));"));
		Thread.sleep(1000);
	    driver.findElement(AppiumBy.xpath("//*[@text='Attendance summary']")).click();
		Thread.sleep(2000);
		driver.findElement(AppiumBy.xpath("//android.widget.Button[@content-desc=\"Attendance, back\"]/android.widget.ImageView")).click();
		Thread.sleep(2000);
		driver.findElement(AppiumBy.androidUIAutomator("new UiScrollable(new UiSelector()).scrollIntoView(text(\"Attendance summary\"));"));
		Thread.sleep(1000);
	    driver.findElement(AppiumBy.xpath("//*[@text='Holidays']")).click();
		Thread.sleep(2000);
		driver.findElement(AppiumBy.xpath("//android.widget.Button[@content-desc=\"Attendance, back\"]/android.widget.ImageView")).click();
		Thread.sleep(1000);
	    driver.findElement(AppiumBy.xpath("//*[@text='Upcoming Leave/Request']")).click();
		Thread.sleep(2000);
		driver.findElement(AppiumBy.xpath("//android.widget.Button[@content-desc=\"Attendance, back\"]/android.widget.ImageView")).click();
		
	}








	
	
	}
	
	