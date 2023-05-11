package starter.stepdefinitions;

import io.cucumber.java.en.And;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import net.thucydides.core.annotations.Steps;
import starter.api.Categories.DeleteCategory;
import starter.api.Categories.GetAllCategories;

public class CategoriesSteps {
    @Steps
    GetAllCategories getAllCategories;

    @Steps
    DeleteCategory deleteCategory;

    @Given("I set a GET product category endpoints")
    public void setGetCategoriesEndpoints(){getAllCategories.setGetCategoriesEndpoints();}
    @When("I send category HTTP GET request")
    public void categoriesGetHTTPRequest(){getAllCategories.categoriesGetHTTPRequest();}
    @Then("I receive a valid category HTTP response code 200 OK")
    public void HTTPCategoriesResponse200(){getAllCategories.HTTPCategoriesResponse200();}
    @And("I received valid data for all product category details")
    public void validCategoriesData(){getAllCategories.validCategoriesData();}

    @Given("I set DELETE product categories endpoints by ID 11349")
    public void setDeleteValidEndpoint(){deleteCategory.setDeleteValidEndpoint();}
    @When("I send DELETE HTTP request for the categories endpoint")
    public void categoryDeleteHttpRequest(){deleteCategory.categoryDeleteHttpRequest();}
    @Then("I receive valid DELETE HTTP response code 200 OK for the categories endpoint")
    public void validHttpDeleteResponse200(){deleteCategory.validHttpDeleteResponse200();}
}
