@Regression
Feature: Online Slots
  As a user want to verify i am on Online Slots

  Scenario: User to navigate to Online Slots
    Given I am on home page
    And I verify I am on home page
    When I accept Necessary cookies only
    And I click online slots
    Then I Verify text 'Play Online Slots at Virgin Games'
