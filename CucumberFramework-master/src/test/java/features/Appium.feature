#Author: Harish
Feature: Validate Different Options

  @appium
  Scenario: Validate Custom View
    Given I open the application
    When I tap on scan
    Then I validate welcome screen
