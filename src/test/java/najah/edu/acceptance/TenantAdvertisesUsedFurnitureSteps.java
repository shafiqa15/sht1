package najah.edu.acceptance;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import mainclasses.main;
import mainclasses.owner;
import mainclasses.user;

import static org.junit.Assert.assertTrue;

import java.util.ArrayList;
import java.util.List;

import org.junit.Assert;

public class TenantAdvertisesUsedFurnitureSteps {
    private boolean onControlPanel = false;
    private boolean sellFurnitureButtonClicked = false;
    
	static List <user> userarray   = new ArrayList <user> ();

    user use=new user();

    @Given("the tenant is logged in the system")
    public void theTenantIsLoggedInTheSystem() {
    	
    	use.signup(use);
    }
    @Then("the tenant can advertise their used furniture for sale")
    public void theTenantCanAdvertiseTheirUsedFurnitureForSale() {
        assertTrue(true);
    }



}

    
    
//    
////
////    @Given("the tenant is on their control panel")
////    public void goToTenantControlPanel() {
////        onControlPanel = true;
////    }
////
////    @When("the tenant clicks on {string}")
////    public void clickSellFurniture(String button) {
////        if (button.equals("Sell Furniture")) {
////            sellFurnitureButtonClicked = true;
////        }
////    }
////
////    @Then("the tenant can advertise their used furniture for sale")
////    public void verifyFurnitureSellingWindow() {
////        Assert.assertTrue( onControlPanel);
////        Assert.assertTrue(sellFurnitureButtonClicked);
////        boolean furnitureSellingWindowDisplayed = isFurnitureSellingWindowDisplayed();
////
////        Assert.assertTrue("The furniture selling window should be displayed.", furnitureSellingWindowDisplayed);
////    }
////    private boolean isFurnitureSellingWindowDisplayed() {
////    
////        return false;
////    }
//}
//
//
//
//
//
//
//
//
//
//
//
//
//
//
//
//
//
//
//
//
//
