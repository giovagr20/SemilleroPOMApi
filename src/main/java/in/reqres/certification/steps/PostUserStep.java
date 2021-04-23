package in.reqres.certification.steps;

import io.restassured.response.Response;
import net.serenitybdd.rest.SerenityRest;
import net.thucydides.core.annotations.Step;

import java.util.HashMap;
import java.util.Map;

import static in.reqres.certification.utils.enums.URLReqRes.URI_BASE;
import static in.reqres.certification.utils.enums.URLReqRes.URI_SUFFIX_USERS;

public class PostUserStep {

    private Map<String, Object> jsonMap = new HashMap<>();
    private Response response;


    @Step
    public void postUser(String name, String job) {
        jsonMap.put("name", name);
        jsonMap.put("job", job);

        response = SerenityRest.given()
                    .contentType("application/json")
                    .baseUri(URI_BASE.getValue())
                    .basePath(URI_SUFFIX_USERS.getValue()).content(jsonMap).log().body()
                .when().post();


        /*----- DELETE -------- */
        response = SerenityRest.given()
                .contentType("application/json")
                .baseUri(URI_BASE.getValue())
                .basePath(URI_SUFFIX_USERS.getValue())
                .when().delete();

        response = SerenityRest.given()
                .contentType("application/json")
                .baseUri(URI_BASE.getValue())
                .basePath(URI_SUFFIX_USERS.getValue()).log()
                .all().delete();

        /*-------- UPDATE ------------*/


    }

    @Step
    public void verifyStatusCode(int statusCode) {
        SerenityRest.lastResponse().then().assertThat().statusCode(statusCode);
    }

}
