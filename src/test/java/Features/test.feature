Feature: Product Search
  As a user I want to search an item using product name so that I can find the results


  Scenario: Search an item using product name
    Given I am on the home page "https://www.next.co.uk"
    When I search an item using product name "Jeans"
    And I click search button
    Then I should be only be seen related results to Jeans

  Scenario: Search an item using Brand name
    Given I am on the home page "https://www.next.co.uk"
    When I search an item using brand name "Nike"
    And I click search button
    Then I should be only be seen related results to Nike
