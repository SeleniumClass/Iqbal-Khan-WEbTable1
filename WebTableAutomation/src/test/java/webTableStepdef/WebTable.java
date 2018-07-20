package webTableStepdef;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.PageFactory;

import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;    //cntrl F And Cntrl=shift=o
import plPageFactory.WebTablePageFactory;

public class WebTable {
	
	
	WebDriver driver;
//	WebTablePageFactory pf = PageFactory.initElements(driver, WebTablePageFactory.class);
	@Given("^user able to open the browser\\.$")
	public void user_able_to_open_the_browser() throws Throwable {
	    
		System.setProperty("webdriver.chrome.driver",
				"C:\\Users\\15164\\eclipse-workspace\\WebTableAutomation\\Driver\\chromedriver.exe");
		driver=new ChromeDriver();
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
	
		
		}

	@Given("^user able to launch the home page\\.$")
	public void user_able_to_launch_the_home_page() throws Throwable {
	
		driver.get("https://www.premierleague.com/tables");

	    
	}

	@When("^user grab all clubs name$")
	public void user_grab_all_clubs_name() throws Throwable {
	    
		
	WebTablePageFactory pf = PageFactory.initElements(driver, WebTablePageFactory.class);
		Thread.sleep(5000);
		int num = pf.getClub().size();
		//System.out.println(num);
		for (int i = 0; i < num; i++) {
		System.out.println(pf.getClub().get(i).getText());

	}
	}
	@When("^user able to count the number of club$")
	public void user_able_to_count_the_number_of_club() throws Throwable {
	WebTablePageFactory pf = PageFactory.initElements(driver, WebTablePageFactory.class);
		int num = pf.getClub().size();
		System.out.println(num);
	}

	@When("^user able to find the name of the club$")
	public void user_able_to_find_the_name_of_the_club() throws Throwable {
		WebTablePageFactory pf = PageFactory.initElements(driver, WebTablePageFactory.class);
//		
//		for (int i = 0; i < num; i++)
//			if (pf.getClub().get(i).getText().equalsIgnoreCase("chelsea")) {
//				System.out.println("chelsea is there");
//			}
//
//		for (int i = 0; i < num; i++)
//			if (pf.getPosition().get(i).getText().equalsIgnoreCase("6")) {
//
//				System.out.println("Chelsea position number is " + pf.getPosition().get(i).getText());
//
//			}
}

	@When("^user able to find club position number of Chelsea$")
	public void user_able_to_find_club_position_number_of_Chelsea() throws Throwable {
	    
	    
	}

	@Then("^user able to find Chelsea position is number (\\d+) or not$")
	public void user_able_to_find_Chelsea_position_is_number_or_not(int arg1) throws Throwable {
	    
	    
	}


}
