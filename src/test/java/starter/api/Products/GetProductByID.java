package starter.api.Products;

import net.serenitybdd.rest.SerenityRest;
import net.thucydides.core.annotations.Step;

import static net.serenitybdd.rest.SerenityRest.restAssuredThat;
import static org.hamcrest.Matchers.equalTo;

public class GetProductByID {
    protected static String url = "https://altashop-api.fly.dev/api/";
    @Step("I set a GET endpoints by ID 13374")
    public String setGetIDEndpoints(){
        return url + "products/13374";

    }
    @Step("I send HTTP GET to the request")
    public void getIDHttpRequest(){
        SerenityRest.given()
                .when()
                .get(setGetIDEndpoints());

    }
    @Step("I receive valid HTTP response code 200 OK")
    public void HTTPGetResponse200(){
        restAssuredThat(response ->response.statusCode(200));
    }

    @Step("I received valid data for single product details by ID 13374")
    public void validDataID() {
        restAssuredThat(response -> response.body("data.ID", equalTo(13374)));
    }
}
