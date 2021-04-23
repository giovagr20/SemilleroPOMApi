package in.reqres.certification.stepdefinitions;

import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;
import in.reqres.certification.steps.GetSingleUserStep;
import net.thucydides.core.annotations.Steps;
import org.hamcrest.Matchers;
import org.junit.Assert;

import static in.reqres.certification.utils.enums.UserEnum.NAME_USER;

public class GetSingleUserStepDefinition {

    @Steps
    GetSingleUserStep getSingleUserStep;

    @When("^the user requests to single user$")
    public void theUserRequestsToSingleUser() {
        getSingleUserStep.getSingleUserSucess();
    }

    @When("^the user requests wrong single user$")
    public void theUserRequestsWrongSingleUser() {
    }

    @Then("^the user validates response (\\d+)$")
    public void theUserValidatesResponse(int statusCode) {
        getSingleUserStep.validateStatusCodeResponse(statusCode);
        getSingleUserStep.validateDataResponseEmail();
        getSingleUserStep.validateDataResponseName();
    }

}
