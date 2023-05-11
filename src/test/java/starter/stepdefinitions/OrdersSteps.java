package starter.stepdefinitions;

import io.cucumber.java.en.And;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import net.thucydides.core.annotations.Steps;
import starter.api.Orders.GetAllOrders;

public class OrdersSteps {
    @Steps
    GetAllOrders getAllOrders;

    @Given("I set a GET order endpoints")
    public void setOrdersEndpoints(){getAllOrders.setOrdersEndpoints();}
    @When("I send HTTP GET request for order endpoint")
    public void orderGetHTTPRequest(){getAllOrders.orderGetHTTPRequest();}
    @Then("I receive a valid HTTP response code 200 OK for order endpoint")
    public void HTTPOrderResponse200(){getAllOrders.HTTPOrderResponse200();}
    @And("I received valid data for all order details")
    public void validOrderData(){getAllOrders.validOrderData();}
}

