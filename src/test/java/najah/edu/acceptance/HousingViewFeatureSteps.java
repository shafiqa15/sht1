package najah.edu.acceptance;

import static org.junit.Assert.assertFalse;

import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import mainclasses.admin;
import mainclasses.owner;
import mainclasses.user;

public class HousingViewFeatureSteps {
	   admin admin1;
       owner owner;
		  
	   static user user;
		
	  static boolean flag_housing;

	public HousingViewFeatureSteps(admin adm1,user user2,owner own1) {
		admin1=adm1;
		user=user2;
		owner=own1;
		
	}
	
	
	@Given("the tenant is logged in")
	public void theTenantIsLoggedIn() {
		
		assertFalse(flag_housing);
		
	}
	@When("the tenant accesses the housing view")
	public void theTenantAccessesTheHousingView() {
		
		
		
		
	  
	}
	@Then("the tenant can see the list of available housing options")
	public void theTenantCanSeeTheListOfAvailableHousingOptions() {

	}



}
