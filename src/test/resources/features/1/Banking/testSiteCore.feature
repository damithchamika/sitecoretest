Feature: Search product
  Scenario: User Able to Search product
    Given user navigates to the website amazon
    Then type "laptop" in the search textbox
    Then click on search button
    Then click on first results
    Then assert that the laptop price


