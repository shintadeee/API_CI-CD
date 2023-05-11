Feature: Products

  Scenario: Get all products
    Given I set a GET endpoints
    When I send HTTP GET request
    Then I receive a valid HTTP response code 200 OK
    And I received valid data for all product details

  Scenario: Get product by ID
    Given I set a GET endpoints by ID 13374
    When I send HTTP GET to the request
    Then I receive valid HTTP response code 200 OK
    And I received valid data for single product details by ID 13374

  Scenario: Delete product
    Given I set DELETE endpoints
    When I send DELETE HTTP request
    Then I receive valid DELETE HTTP response code 200 OK

  Scenario: Get product ratings
    Given I set a GET rating endpoints
    When I send a HTTP GET to the request
    Then I receive valid HTTP response code is 200 OK
    And I received valid data for rating product

  Scenario: Get product comments
    Given I set a GET comment endpoints
    When I send a HTTP GET request for comment products
    Then I receive valid comment HTTP response code is 200 OK
    And I received valid data for comment products
