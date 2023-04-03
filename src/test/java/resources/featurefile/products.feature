# It consists of functional test cases in the form of cucumber feature files written in gherkin format
Feature:  Products and services functionality
  As a user I would like to know what products and services Keysight is providing

  Scenario: Verify user is able to check all products and services
    Given I am on Home page of Keysight site
    When  I click on Products and Services from top tab menu
    And   I mousehoover on software tab
    And   I click on Test automation software
    Then  I verify 'Optimize Test Plans and Increase Test Efficiency' text


















