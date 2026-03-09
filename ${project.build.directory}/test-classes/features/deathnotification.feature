Feature: Death Notification Flow

  Background:
  //Given User navigate to VITALREG portal
    When user enter valid email and password
    And clicks on SIGN IN
    Then user is successfully logged in
  @regression
    Scenario: Death notification
      Given user is successfully logged in to start new death registration
      When user clicks on start new death registration
      And user checks on requirement instructions
      And user provides Particulars of Deceased