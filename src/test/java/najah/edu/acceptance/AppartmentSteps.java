package najah.edu.acceptance;
import static org.junit.Assert.assertTrue;
import java.util.Scanner;
import java.util.logging.Logger;

import org.junit.Assert;

import io.cucumber.java.en.And;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import mainclasses.Apartment;
import mainclasses.Building;
import mainclasses.admin;
import mainclasses.main;
import mainclasses.owner;
import mainclasses.user;
public class AppartmentSteps {
    static boolean b = false;
    static boolean flag;
    
   

	owner own=new owner();
    @Given("the owner is logged in to the system with email and password")
    public void theOwnerIsLoggedInToTheSystemWithEmailAndPassword() {
    
owner.checkowner(own.email,own.password);
    }




    @Given("the owner is logged in to the System")
    public void theOwnerIsLoggedInToTheSystem() {
       user.signup(own);
       
 	 

    }


    @Then("the system should read a new input")
    public void theSystemShouldReadANewInput() {
       // Assert.assertTrue(main.addNewApartmentChoice); 

    }



   



    @Given("the owner enter invalid numeric input")
    public void theOwnerEnterInvalidNumericInput() {
        // Write code here that turns the phrase above into concrete actions
        //Assert.assertTrue(main.addNewApartmentChoice); 
    }


    

    @Given("the dashboard will be printed")
    public void theDashboardWillBePrinted() {
    	main.TenantDashboard();
    }




  
    @Given("the owner has a choice list with two choices \\(add new appartment and dashboard)")
    public void theOwnerHasAChoiceListWithTwoChoicesAddNewAppartmentAndDashboard() {
        
    }
    @When("the owner selects {string}")
    public void theOwnerSelects(String string) {
      if(string.equals("add")) {
    	  Apartment.addApartment();
      }
      else
    	  main.TenantDashboard();
    }
    @When("the system store this appartment")
    public void theSystemStoreThisAppartment() {
    
    }






    @When("the owner selects add new apartment")
    public static void theOwnerSelectsAddNewApartment() {
        Assert.assertTrue(main.addNewApartmentChoice); 
    }
 
    @And("add a photo with an invalid format")
    public static void addAPhotoWithAnInvalidFormat() {
        Assert.assertFalse(flag);
    }

    @And("enter invalid numeric input")
    public static void enterInvalidNumericInput(String s) {
        Assert.assertFalse(owner.digitsValidator(s));
    }
         
    @And("enter invalid yesNo input")
    public static void enterInvalidYesNoInput(String s) {
        Assert.assertFalse(owner.yesNoValidator(s));
    }       
    
    @And("the owner enter valid information")
    public static void theOwnerEnterValidInformation() {
        Assert.assertTrue(main.validInformation = true );
    }    
    


    @Then("the system should display an error message")
    public void theSystemShouldDisplayAnErrorMessage() {
    	Assert.assertFalse(flag);
    }



    @When("the owner selects Dashboard")
    public static void theOwnerSelectsDashboard() {
        Assert.assertTrue(main.dashboardChoice= true );
    }

   @When("the owner selects modify")
    public static void theOwnerSelectsModify() {
       Assert.assertTrue(main.modifyChoice= true );
    }   












}






