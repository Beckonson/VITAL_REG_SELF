Feature: Birth Registration flow

  Background:
  //Given User navigate to VITALREG portal
    When user enter valid email and password
    And clicks on SIGN IN
    Then user is successfully logged in

@regression
  Scenario: New application
    Given user is successfully logged in to start new birth registration
    When user clicks on start new registration
    And user checks on requirement instruction
    And user proceeds to make payment


