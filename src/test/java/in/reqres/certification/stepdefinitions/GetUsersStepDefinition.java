package in.reqres.certification.stepdefinitions;

import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;
import in.reqres.certification.steps.GetUsersStep;
import net.thucydides.core.annotations.Steps;

public class GetUsersStepDefinition {

    @Steps
    GetUsersStep getUsersStep = new GetUsersStep();

    @Given("^the user verify internet connection$")
    public void theUserVerifyInternetConnection() {
        getUsersStep.checkStatusConnection();
    }

    @When("^the user request to get users$")
    public void theUserRequestToGetUsers() {
        getUsersStep.getUsers();
    }

    @Then("^verify status code (\\d+)$")
    public void verifyStatusCode(int statusCode) {
        getUsersStep.verifyStatusCode(statusCode);
    }
}
