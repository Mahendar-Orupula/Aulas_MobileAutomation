package AulasCare;

import java.io.IOException;

import org.testng.annotations.BeforeSuite;
import org.testng.annotations.Test;

import com.aventstack.extentreports.ExtentReports;

import Pages.AulasCarePage;
import Pages.HomePage;
import io.appium.java_client.android.AndroidDriver;

public class AulasCare extends Android_BaseTest.AulasBaseTest {
	public AndroidDriver driver;
	
	public HomePage HP;
	public AulasCarePage AC;
	//SP=new SchedulePage(driver);
		//HP=new HomePage(driver);
		//LP=new LoginPage(driver);
		//HomePage HP=LP.Login();
	ExtentReports extent;
	//LoginPage login=new LoginPage(driver);
	/*@BeforeMethod
	public void setloginScreen() {
		Activity activity=new Activity("com.classroom.aulas", "com.classroom.aulas.MainActivity");
		driver.startActivity(activity);
	}*/
	
@BeforeSuite
public void doLoginOperation() throws InterruptedException, IOException {
//	LP.doLogin();
	initilization();
	Thread.sleep(8000);
	LP.checkUpdates();
	HP=LP.Login();
    AC=HP.clickOnMoreButton();
	
	// SP=HP.clickOnScheduleButton();
//	SP.clickOnPlusButton();
	
	/*************Production LoginCode******************/
	/*ConfigureAppium();
	Thread.sleep(8000);
	LP.UpdateProApp();
	 HP=LP.LoginProductionApp();
	 HP.selectProductionTest();
	SP=HP.clickOnScheduleButton();*/
}
@Test(priority=1)
public void checkSupport() throws InterruptedException {
	Thread.sleep(3000);
	//AC.clickOnMoreButton();
	AC.clickOnAulasCare();
	AC.clickOnSupport();
	AC.clickOnViewAll("VIEW ALL");
	AC.doChart("LAKSHMI STUDENT","Hello");
	
	
}
@Test(priority=2)
public void fillVaccinationDetails() throws InterruptedException {
	Thread.sleep(3000);
	AC.clickOnAulasCare();
	AC.clickCovid19("Covid-19 resources");
	AC.clickVaccination();
	AC.registerInBrowser();
	
}
@Test(priority=3)
public void checkFAQs() throws InterruptedException {
	Thread.sleep(3000);
	AC.clickOnAulasCare();
	AC.FAQs("FAQs");
	AC.checkAllFAQs();
	
	
}
@Test(priority=4)
public void fillBasicInfoDetails() throws InterruptedException {
	Thread.sleep(3000);
	AC.clickOnWallet("aulas Wallet");
	AC.clickOnCompleteKYC();
	AC.fillBasicInfo("Mother", "Female");
	AC.fillContactDetails();
	//AC.clickOnProcced();
	AC.upDateDocument();
	
	
	
}

@Test(priority=5)
public void fillAccountDetails() throws InterruptedException {
	Thread.sleep(3000);
	AC.clickAccountDetails();
	AC.enterEmailID();
	AC.enterPhoneNumb();
	
	
}












}