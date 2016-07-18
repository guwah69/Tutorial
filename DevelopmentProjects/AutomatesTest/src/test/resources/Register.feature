Feature: Register New Customers

  Background: 
    Given I am on the Home page
    When click my Account button
    Then I see a welcome message

  @newcustomer
  Scenario Outline: New Customer should be able to register successfully
    When I click Continue button
    Then my account information page loads
    When I enter all the user data in the Registration form
    And I click the continue button
    Then my account is created
    And I log out

    Examples: 
      | FName    | SName | Mobile       | ReMobile     | Password |
      | maxwell  | Test  | 079060909909 | 079060909909 | Pwass    |
      | maxwell1 | Test1 | 079060909909 | 079060909909 | Pwass    |
