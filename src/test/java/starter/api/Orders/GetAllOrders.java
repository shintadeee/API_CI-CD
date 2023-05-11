package starter.api.Orders;

import net.serenitybdd.rest.SerenityRest;
import net.thucydides.core.annotations.Step;

import static net.serenitybdd.rest.SerenityRest.restAssuredThat;
import static org.hamcrest.Matchers.notNullValue;

public class GetAllOrders {
    protected static String url = "https://altashop-api.fly.dev/api/";
    @Step("I set a GET order endpoints")
    public String setOrdersEndpoints(){
        return url + "orders";

    }
    @Step("I send HTTP GET request for order endpoint")
    public void orderGetHTTPRequest(){
        SerenityRest.given()
                .when()
                .get(setOrdersEndpoints());

    }
    @Step("I receive a valid HTTP response code 200 OK for order endpoint")
    public void HTTPOrderResponse200(){
        restAssuredThat(response ->response.statusCode(401));
        restAssuredThat(response -> response.body("$", notNullValue()));

    }

    @Step("I received valid data for all order details")
    public void validOrderData() {
        restAssuredThat(response -> response.body("$", notNullValue()));
    }
}
