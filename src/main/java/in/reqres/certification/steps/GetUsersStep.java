package in.reqres.certification.steps;

import in.reqres.certification.utils.InternetConnection;
import io.restassured.response.Response;
import io.restassured.response.ResponseBody;
import net.serenitybdd.core.Serenity;
import net.serenitybdd.rest.SerenityRest;
import net.thucydides.core.annotations.Step;

import java.util.HashMap;

import static in.reqres.certification.utils.enums.URLReqRes.URI_BASE;
import static in.reqres.certification.utils.enums.URLReqRes.URI_SUFFIX_USERS;

public class GetUsersStep {

    private Response response;

    public GetUsersStep(Response response) {
        this.response = response;
    }

    public GetUsersStep() {
    }

    @Step
    public void checkStatusConnection() {
        InternetConnection internetConnection = new InternetConnection();
        internetConnection.checkInternetConnection();
    }

    @Step
    public void getUsers(){
        response = SerenityRest.given()
                .baseUri(URI_BASE.getValue())
                .basePath(URI_SUFFIX_USERS.getValue()).log()
                .all().get();
    }

    @Step
    public void verifyStatusCode(int statusCode) {
        SerenityRest.lastResponse().then().assertThat().statusCode(statusCode);
    }
}
