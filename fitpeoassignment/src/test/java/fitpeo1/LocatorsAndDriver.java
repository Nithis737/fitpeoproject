package fitpeo1;

import java.util.List;

import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.FindBy;

public class LocatorsAndDriver {

	WebDriver driver ;
	Actions slide=new Actions(driver);	
	
	
	public void driver() {

		System.setProperty("webdriver.chrome.driver", "C:\\Users\\NITHIS\\Downloads\\chromedriver-win64\\chromedriver-win64\\chromedriver.exe");
		driver =new ChromeDriver();
		driver.manage().window().maximize();
	}

	public void startwebsite(String webaddress)
	{
		driver.get(webaddress);

	}

	public void pageviewer(WebElement element)
	
	
	{
		JavascriptExecutor js = (JavascriptExecutor)driver;
		js.executeScript("arguments[0].scrollIntoView();",element);

	}


	
	
	String[] CPTnums= {"CPT-99091","CPT-99453","CPT-99454","CPT-99474"};
	
	@FindBy	
	(xpath = "(//a[@style='text-decoration:none'])[6]") 
	WebElement revenuecalculator;

	@FindBy	(id =":r0:") 
	WebElement patientfield;
	
	@FindBy	
	(xpath = "(//span[@class='MuiSlider-root MuiSlider-colorPrimary MuiSlider-sizeMedium css-16i48op']") 
	WebElement scroller;


	@FindBy	
	(xpath = "//input[@class='PrivateSwitchBase-input css-1m9pwf3']") 
 	List <WebElement> CPTcheckboxes;

	@FindBy	
	(xpath = "//p[@class='MuiTypography-root MuiTypography-body1 inter css-1s3unkt']") 
 	List <WebElement> CPTnumbers;

	@FindBy	
	(xpath = "(//p[@class='MuiTypography-root MuiTypography-body1 inter css-1bl0tdj'])[4]") 
	WebElement Totalgross;
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
}
