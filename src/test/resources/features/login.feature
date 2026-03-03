Feature: login functionality
  @smoke0
  Scenario: Valid login
    //Given User navigate to VITALREG portal
    When user enter valid email and password
    And clicks on SIGN IN
    Then user is successfully logged in


  @smoke0
  Scenario Outline: Validating invalid login
    Then user enters "<email>" and "<password>" and verify the "<errorMessage>"
    Examples:
      |    email       |      password     |      errorMessage |
      | christy16@yopmail.com |passsss11   |Incorrect credentials supplied|
      | admxyz@gmail.com  |@Test12345   |Incorrect credentials supplied|
