Feature:

  Scenario: validate search behaviour based on product type

    Given I am on the next home page

    When I enter "Jeans" as a product

    And I click on search button

    Then I should be able to see "Jeans" as a result title

  Scenario: validate search behaviour based on product type

    Given I am on the next home page

    When I enter "Shirts" as a product

    And I click on search button

    Then I should be able to see "Shirts" as a result title