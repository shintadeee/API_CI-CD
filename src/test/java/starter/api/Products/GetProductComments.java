package starter.api.Products;

import net.serenitybdd.rest.SerenityRest;
import net.thucydides.core.annotations.Step;

import static net.serenitybdd.rest.SerenityRest.restAssuredThat;
import static org.hamcrest.Matchers.notNullValue;

public class GetProductComments {
    protected static String url = "https://altashop-api.fly.dev/api/";
    @Step("I set a GET comment endpoints")
    public String setValidCommentEndpoints(){
        return url + "products/2/comments";

    }
    @Step("I send a HTTP GET request for comment products")
    public void commentGetHTTPRequest(){
        SerenityRest.given()
                .when()
                .get(setValidCommentEndpoints());

    }
    @Step("I receive valid comment HTTP response code is 200 OK")
    public void HTTPCommentResponse200(){
        restAssuredThat(response ->response.statusCode(200));
        restAssuredThat(response -> response.body("$", notNullValue()));

    }

    @Step("I received valid data for comment products")
    public void validCommentData() {
        restAssuredThat(response -> response.body("$", notNullValue()));
    }
}
