Feature: Orders

  Scenario: Get all orders
    Given I set a GET order endpoints
    When I send HTTP GET request for order endpoint
    Then I receive a valid HTTP response code 200 OK for order endpoint
    And I received valid data for all order details
