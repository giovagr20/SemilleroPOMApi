package in.reqres.certification.steps;

import io.restassured.response.Response;
import net.serenitybdd.rest.SerenityRest;
import net.thucydides.core.annotations.Step;
import org.hamcrest.Matchers;
import org.junit.Assert;

import static in.reqres.certification.utils.enums.URLReqRes.URI_BASE;
import static in.reqres.certification.utils.enums.URLReqRes.URI_SUFFIX_USERS_ID_SUCCESS;

import static in.reqres.certification.utils.enums.UserEnum.NAME_USER;
import static in.reqres.certification.utils.enums.UserEnum.EMAIL_USER;

public class GetSingleUserStep {

    private Response response;

    public GetSingleUserStep(Response response) {
        this.response = response;
    }

    public GetSingleUserStep() {
    }

    @Step
    public void getSingleUserSucess() {
        response = SerenityRest.given()
                .baseUri(URI_BASE.getValue())
                .basePath(URI_SUFFIX_USERS_ID_SUCCESS.getValue()).log()
                .all().get();
        System.out.println(response);
    }

    @Step
    public void validateDataResponseEmail() {
        String email = response.body().jsonPath().get("data.email");
        Assert.assertThat(EMAIL_USER.getValue(), Matchers.is(email));
    }

    @Step
    public void validateDataResponseName() {
        String firstName = response.body().jsonPath().get("data.first_name");
        Assert.assertThat(NAME_USER.getValue(), Matchers.is(firstName));
    }

    @Step
    public void validateStatusCodeResponse(int statusCode) {
        int statusCodeResponse = response.getStatusCode();
        Assert.assertThat(statusCode, Matchers.is(statusCodeResponse));
    }
}
