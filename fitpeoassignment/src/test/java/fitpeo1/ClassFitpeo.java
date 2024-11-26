package fitpeo1;

import static org.testng.Assert.assertEquals;

import org.testng.annotations.Test;

public class ClassFitpeo  
{

	LocatorsAndDriver driverfitpeo=new LocatorsAndDriver();

	@Test
	public void Fitpeohomepage() 
	{	
		driverfitpeo.driver();
		driverfitpeo.startwebsite("https://www.fitpeo.com");
	}

	@Test
	public void revenueCalculatorPage() 
	{	
		driverfitpeo.revenuecalculator.click();
	}

	@Test
	public void SliderSection() 
	{	

		driverfitpeo.pageviewer(driverfitpeo.scroller);
	}

	@Test
	public void AdjustTheSlider() 
	{	

		driverfitpeo.slide.dragAndDropBy(driverfitpeo.scroller, 0, 41);



		String patientnumber= driverfitpeo.patientfield.getAttribute("value");

		assertEquals(patientnumber, "820");

	}

	@Test
	public void UpdateAndValidateTheTextField() 
	{

		driverfitpeo. patientfield.click();
		driverfitpeo. patientfield.sendKeys("560");


		assertEquals(driverfitpeo. scroller.getAttribute("aria-valuenow"),"560");
	}


	@Test
	public void CPTcodes() 

	{
		for (int i = 1; i <driverfitpeo. CPTnumbers.size(); i++) 
		{
			for (int j = 0; j <driverfitpeo. CPTnums.length; j++)
			{
				if(driverfitpeo. CPTnumbers.get(i).getText().trim()== driverfitpeo .CPTnums[j]) 
				{
					driverfitpeo. CPTcheckboxes.get(i).click();
				}
			}
		} 

		assertEquals(driverfitpeo. Totalgross.getText(),"110700");			

	}

}
