package in.reqres.certification.stepdefinitions;

import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;
import in.reqres.certification.models.UserModel;
import in.reqres.certification.steps.PostUserStep;
import net.thucydides.core.annotations.Steps;

import java.util.List;

public class PostUserStepDefinition {

    @Steps
    private PostUserStep postUserStep;

    @When("^the user creates a new client$")
    public void theUserCreatesANewClient(List<UserModel> userModel) {
        postUserStep.postUser(
                userModel.get(0).get_name(),
                userModel.get(0).get_job());
    }

    @Then("^verify status code$")
    public void verifyStatusCode(int statusCode) {
        postUserStep.verifyStatusCode(statusCode);
    }
}
