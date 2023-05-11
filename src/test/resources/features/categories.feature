Feature: Categories

  Scenario: Get all categories
    Given I set a GET product category endpoints
    When I send category HTTP GET request
    Then I receive a valid category HTTP response code 200 OK
    And I received valid data for all product category details

  Scenario: Delete category
    Given I set DELETE product categories endpoints by ID 11349
    When I send DELETE HTTP request for the categories endpoint
    Then I receive valid DELETE HTTP response code 200 OK for the categories endpoint
