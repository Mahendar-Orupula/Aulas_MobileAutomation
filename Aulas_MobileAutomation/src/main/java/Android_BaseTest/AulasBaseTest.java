package Android_BaseTest;

import java.io.File;
import java.io.FileInputStream;
import java.io.IOException;
import java.net.MalformedURLException;
import java.net.URL;
import java.text.DateFormat;
import java.text.SimpleDateFormat;
import java.time.Duration;
import java.util.Date;
import java.util.Properties;

import org.apache.commons.io.FileUtils;
import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.remote.RemoteWebElement;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.testng.annotations.AfterClass;

import com.google.common.collect.ImmutableMap;

import Pages.LoginPage;
import io.appium.java_client.AppiumBy;
import io.appium.java_client.HidesKeyboard;
import io.appium.java_client.android.AndroidDriver;
import io.appium.java_client.android.options.UiAutomator2Options;
import io.appium.java_client.service.local.AppiumDriverLocalService;
import io.appium.java_client.service.local.AppiumServiceBuilder;

public class AulasBaseTest {
	public AndroidDriver driver;
	public AppiumDriverLocalService builder;
	public LoginPage LP;
	public AppiumDriverLocalService service;
    
	public Properties prop;

	//@BeforeClass
	public void ConfigureAppium() throws IOException {
		// start appium server
		Properties prop=new Properties();
		FileInputStream fis= new FileInputStream("C:\\Users\\Brigosha_Guest\\eclipse-workspace-mobileautomation\\Aulas_MobileAutomation\\src\\main\\java\\config.Properties");
		prop.load(fis);
		String ipAddress =prop.getProperty("ipAddress");
		String port =prop.getProperty("port");
		//convert string to int 
		int portnumber=Integer.parseInt(port);
		builder=startAppiumServer(ipAddress,portnumber);
		// passing mobile details
		UiAutomator2Options options = new UiAutomator2Options();
		options.setDeviceName(prop.getProperty("AndroidDeviceName")); //emulator name 
	
	//	options.setChromedriverExecutable("C:\\Users\\Prabhakar\\Documents\\Drivers\\chromedriver.exe");
		// options.setApp("C:\\Users\\Prabhakar\\Documents\\Appium Testing\\Appium
		// workspace\\Aulas_MobileAutomation\\src\\test\\java\\AppResources\\ApiDemos-debug.apk");
		// options.setApp("C:\\Users\\Prabhakar\\Documents\\Appium Testing\\Appium
		// workspace\\Aulas_MobileAutomation\\src\\test\\java\\AppResources\\General-Store.apk");
		/*options.setApp(
				System.getProperty("user.dir")+"\\src\\test\\java\\AppResources\\app-release (1).apk");*/
		options.setApp("C:\\Users\\Brigosha_Guest\\Documents\\app-release.apk");

		// declare android driver
		// driver=new AndroidDriver(new URL("http://127.0.0.1:4723"), options);
		driver = new AndroidDriver(builder.getUrl(), options);
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
		LP = new LoginPage(driver);
	}

	public AppiumDriverLocalService startAppiumServer(String ipAddress,int port) {
		// to start appium server
		builder = new AppiumServiceBuilder()
				.withAppiumJS(new File(
						"C:\\Users\\Brigosha_Guest\\AppData\\Roaming\\npm\\node_modules\\appium\\build\\lib\\main.js"))
				.withIPAddress(ipAddress).usingPort(port).build();
		//ipAdress=127.0.0.1
		//port=4723
		builder.start();
		return builder;
	}

	
	public void longPress_Action(WebElement ele) {
		((JavascriptExecutor) driver).executeScript("mobile: longClickGesture",
				ImmutableMap.of("elementId", ((RemoteWebElement) ele).getId(), "duration", 2000));
	}

	public void scrollToEndAction() {
		boolean canScrollMore;
		do {
			canScrollMore = (Boolean) ((JavascriptExecutor) driver).executeScript("mobile: scrollGesture", ImmutableMap
					.of("left", 100, "top", 100, "width", 200, "height", 200, "direction", "down", "percent", 3.0));

		} while (canScrollMore);

	}

	public void swipeAction(WebElement ele, String direction) {
		((JavascriptExecutor) driver).executeScript("mobile: swipeGesture", ImmutableMap.of("elementId",
				((RemoteWebElement) ele).getId(), "direction", direction, "percent", 0.75));
	}

	public Double getFormatedAmount(String amount) {
		Double prize = Double.parseDouble(amount.substring(1));
		return prize;

	}

	public void waitUntil(WebElement ele) {
		WebDriverWait wait = new WebDriverWait(driver, Duration.ofSeconds(100));
		//wait.until(ExpectedConditions.visibilityOfElementLocated(By.xpath("//android.widget.TextView[@text='RESTART AULAS']")));
		wait.until(ExpectedConditions.visibilityOf(ele));
		
	}
	
	public String getScreenShotpath(String testcase) throws IOException {
		
		File source=driver.getScreenshotAs(OutputType.FILE);
		String destination=System.getProperty("user.dir")+"\\reports"+testcase+".png";
		/*File DestFile=new File(destination);
		FileUtils.copyFile(source, DestFile);*/
		FileUtils.copyFile(source,new File(destination));
		
		return destination;
	}
	
	
	public void scrollAndClick(String visibleText) {
		driver.findElement(AppiumBy.androidUIAutomator("new UiScrollable(new UiSelector().scrollable(true).instance(0)).scrollIntoView(new UiSelector().textContains(\""+visibleText+"\").instance(0))")).click();
	        }
	   
public void generateCurrentDate() {
	 DateFormat dateFormat = new SimpleDateFormat("MM/dd/yyyy ");
	 
	 //get current date time with Date()
	 Date date = new Date();
	 
	 // Now format the date
	 String date1= dateFormat.format(date);
	 
	 // Print the Date
	 System.out.println(date1);
	}

public void initilization() throws MalformedURLException, InterruptedException {
	// CODE TO START SERVER
	// AndroidDriver , IOSDriver
	//Appium code -> Appium Server -> Mobile
	//C:\\Users\\Brigosha_Guest\\AppData\\Roaming\\npm\\node_modules\\appium\\build\\lib\\main.js
	service=new AppiumServiceBuilder().withAppiumJS(new File("C:\\Users\\Brigosha_Guest\\AppData\\Roaming\\npm\\node_modules\\appium\\build\\lib\\main.js"))
			   .withIPAddress("127.0.0.1").usingPort(4723).build();
	service.start();
	UiAutomator2Options options = new UiAutomator2Options();
	//options.setDeviceName("Pixel XL API 30");
	options.setDeviceName("Xiaomi 21091116AI");
	options.setApp("C:\\Users\\Brigosha_Guest\\Documents\\app-release.apk");
	
	 driver = new AndroidDriver(new URL("http://127.0.0.1:4723"), options);
     driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(30));
     Thread.sleep(3000);
     //Actual automation
     //Xpath, id, accessibilityId, classname, androidUIAutomator.
    // Login();

}

public void Login(String username,String password) throws InterruptedException 
{
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
	driver.findElement(By.className("android.widget.EditText")).sendKeys(prop.getProperty(username));
	((HidesKeyboard) driver).hideKeyboard();
	Thread.sleep(5000); //
	driver.findElement(By.xpath("//android.widget.TextView[@text='CONTINUE']")).click();
	Thread.sleep(8000);
	driver.findElement(By.className("android.widget.EditText")).sendKeys(prop.getProperty(password));
   ((HidesKeyboard) driver).hideKeyboard();
	driver.findElement(By.xpath("//android.widget.TextView[@text='VERIFY']")).click();
	Thread.sleep(5000);
}

/*
	@AfterClass
	public void tearDown() {
		driver.quit();
		builder.stop();

	}
	*/
}
