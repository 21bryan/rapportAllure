package steps;

import org.example.pagesObjects.HomePage;
import org.example.pagesObjects.Page;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;

public class HomeStep {
    private HomePage homePage=new HomePage();


    @Given("user in the home page")
    public void userInTheLoginPage(){
        homePage.get("https://ztrain-web.vercel.app/en/home");

    }
    @When("user click avatar in navbar")
    public void clickOnAvatar(){

    }
    @Then("modal is open")
    public void openModal(){

    }
}
