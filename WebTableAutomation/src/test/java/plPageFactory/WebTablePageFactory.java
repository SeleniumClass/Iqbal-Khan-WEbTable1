package plPageFactory;



import java.util.List;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.How;
import org.openqa.selenium.support.PageFactory;





public class WebTablePageFactory {
	WebDriver driver;
	public  WebTablePageFactory (WebDriver driver) {
	this.driver = driver;
	PageFactory.initElements(driver, this);
		
		
		}
	
	


	@FindBy(how = How.XPATH, using="//*[@class ='tableBodyContainer']/tr/td[3]/a/span[2]")
	private List<WebElement> club;
	
	@FindBy (how = How.XPATH, using = "//* [@class='tableBodyContainer']/tr/td[2]/span")
	private List<WebElement> position;
	
//	@FindBy(how = How.XPATH, using="//* [@class='tableBodyContainer']//tr[1]/td[3]/a/span[2]")
//	private List<WebElement> club;
//	

	


public List<WebElement> getClub() {
		return club;
	}

public List<WebElement> getPosition() {
	return position;
}


//@FindBy(how = How.XPATH, using = "(//*[contains(text(),'Sign Up')])[1]")
//private WebElement signupage;





}