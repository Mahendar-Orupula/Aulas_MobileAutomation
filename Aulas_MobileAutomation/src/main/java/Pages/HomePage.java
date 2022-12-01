package Pages;

import org.openqa.selenium.By;

import Utils.AndriodGestures;
import io.appium.java_client.AppiumBy;
import io.appium.java_client.android.AndroidDriver;

public class HomePage extends AndriodGestures {

public AndroidDriver driver;
//public SchedulePage SP;
	
	public HomePage(AndroidDriver driver) {
		super(driver);
		this.driver=driver;
		//PageFactory.initElements(new AppiumFieldDecorator(driver), this);
	}
	
	/*

	public SchedulePage clickOnScheduleButton() throws InterruptedException {
		Thread.sleep(3000);
		//driver.findElement(By.xpath("//*[@content-desc='Schedule, tab, 1 of 4']")).click();
		driver.findElement(By.xpath("//*[@text='Schedule']")).click();
		
		System.out.println("Clicked on schedule button");
		Thread.sleep(30000);
		return new SchedulePage(driver);
	}
	*/
	public AttendancePage clickOnAttendance() throws InterruptedException
	{
			Thread.sleep(3000);
			String more = driver.findElement(By.xpath("//*[@text='More']")).getText();
			driver.findElement(By.xpath("//*[@text='More']")).click();
			System.out.println("clicked on :" + more + " Button");
			driver.findElement(By.xpath("//android.widget.TextView[@text()='Attendance']")).click();
			System.out.println("clicked on Attendance Button");
			
			return new AttendancePage(driver);
			
		
	}
	public void selectOrganization() throws InterruptedException{
		Thread.sleep(3000);
		String ORGName=driver.findElement(By.xpath("//*[@text='Brigosha']")).getText();
		driver.findElement(By.xpath("//*[@text='Brigosha']")).click();
		System.out.println("Clicked on :"+" "+ORGName);
		Thread.sleep(3000);
		driver.findElement(By.xpath("//*[@text='Next ➞']")).click();
		System.out.println("Clicked on Next Button...");
	}
	public void selectProductionTest() throws InterruptedException {
		Thread.sleep(4000);
		driver.findElement(AppiumBy.androidUIAutomator("new UiScrollable(new UiSelector()).scrollIntoView(text(\"Production testing.\"));"));
		String ORGName=driver.findElement(By.xpath("//*[@text='Production testing.']")).getText();
		//driver.findElement(By.xpath("//*[@text='Brigosha']")).click();
		System.out.println("Clicked on :"+" "+ORGName);
	}
	public AulasCarePage clickOnMoreButton() throws InterruptedException {
		Thread.sleep(3000);
		String more=driver.findElement(By.xpath("//*[@text='More']")).getText();
		driver.findElement(By.xpath("//*[@text='More']")).click();
		//driver.findElement(By.xpath("//android.widget.Button[@content-desc="More, tab, 4 of 4"]/android.widget.TextView[2]")).click();
		System.out.println("clicked on :"+more+" Button");
		return new AulasCarePage(driver);
	}
	public FeePage ClickOnFee() throws InterruptedException {
		Thread.sleep(3000);
		String more=driver.findElement(By.xpath("//*[@text='More']")).getText();
		driver.findElement(By.xpath("//*[@text='More']")).click();
		//driver.findElement(By.xpath("//android.widget.Button[@content-desc="More, tab, 4 of 4"]/android.widget.TextView[2]")).click();
		System.out.println("clicked on :"+more+" Button");
		return new FeePage();
	}
}
