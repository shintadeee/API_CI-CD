package starter.stepdefinitions;

import io.cucumber.java.en.And;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import net.thucydides.core.annotations.Steps;
import starter.api.Products.*;

public class ProductSteps {
    @Steps
    GetAllProducts getAllProducts;

    @Steps
    GetProductByID getProductByID;

    @Steps
    DeleteProduct deleteProduct;

    @Steps
    GetProductRatings getProductRatings;

    @Steps
    GetProductComments getProductComments;

    @Given("I set a GET endpoints")
    public void setGetEndpoints(){getAllProducts.setGetEndpoints();}
    @When("I send HTTP GET request")
    public void getHttpRequest(){getAllProducts.getHttpRequest();}
    @Then("I receive a valid HTTP response code 200 OK")
    public void HttpResponse200(){getAllProducts.HttpResponse200();}
    @And("I received valid data for all product details")
    public void validData(){getAllProducts.validData();}

    @Given("I set a GET endpoints by ID 13374")
    public void setGetIDEndpoints(){getProductByID.setGetIDEndpoints();}
    @When("I send HTTP GET to the request")
    public void getIDHTTPrequest(){getProductByID.getIDHttpRequest();}
    @Then("I receive valid HTTP response code 200 OK")
    public void HTTPGetResponse200(){getProductByID.HTTPGetResponse200();}
    @And("I received valid data for single product details by ID 13374")
    public void validDataID(){getProductByID.validDataID();}

    @Given("I set DELETE endpoints")
    public void setDeleteEndpoint(){deleteProduct.setDeleteEndpoint();}
    @When("I send DELETE HTTP request")
    public void sendDeleteHttpRequest(){deleteProduct.sendDeleteHttpRequest();}
    @Then("I receive valid DELETE HTTP response code 200 OK")
    public void validHttpResponseCode200(){deleteProduct.validHttpResponseCode200();}

    @Given("I set a GET rating endpoints")
    public void setGetRatingEndpoints(){getProductRatings.setGetRatingEndpoints();}
    @When("I send a HTTP GET to the request")
    public void HTTPGetRequest(){getProductRatings.HTTPGetRequest();}
    @Then("I receive valid HTTP response code is 200 OK")
    public void HTTPResponse200(){getProductRatings.HTTPResponse200();}
    @And("I received valid data for rating product")
    public void validDataRating(){getProductRatings.validDataRating();}

    @Given("I set a GET comment endpoints")
    public void setValidCommentEndpoints(){getProductComments.setValidCommentEndpoints();}
    @When("I send a HTTP GET request for comment products")
    public void commentGetHTTPRequest(){getProductComments.commentGetHTTPRequest();}
    @Then("I receive valid comment HTTP response code is 200 OK")
    public void HTTPCommentResponse200(){getProductComments.HTTPCommentResponse200();}
    @And("I received valid data for comment products")
    public void validCommentData(){getProductComments.validCommentData();}

}
