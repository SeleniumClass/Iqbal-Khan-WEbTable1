package webTableBrowser;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.PageFactory;
import org.testng.annotations.Test;

import plPageFactory.WebTablePageFactory;

public class Browserinitialize {

	//public static void main(String[] args) throws InterruptedException {
	
	@Test
		public void test1() throws InterruptedException {

		System.setProperty("webdriver.chrome.driver",
				"C:\\Users\\15164\\eclipse-workspace\\WebTableAutomation\\Driver\\chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
		driver.get("https://www.premierleague.com/tables");

		WebTablePageFactory pf = PageFactory.initElements(driver, WebTablePageFactory.class);
		Thread.sleep(5000);

		// grab all club name club count
		// List<WebElement> club = driver.findElements("")
		// List<WebElement> position = driver.findElements("")

		int num = pf.getClub().size();
		System.out.println(num);
		for (int i = 0; i < num; i++) {
			System.out.println(pf.getClub().get(i).getText());

		}

		
		for (int i = 0; i < num; i++)
			if (pf.getClub().get(i).getText().equalsIgnoreCase("chelsea")) {
				System.out.println("chelsea is there");
			}

		for (int i = 0; i < num; i++)
			if (pf.getPosition().get(i).getText().equalsIgnoreCase("6")) {

				System.out.println("Chelsea position number is " + pf.getPosition().get(i).getText());

			}

	}

}
