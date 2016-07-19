Feature: Forgot Password

  Background: 
    Given I am on the Home page
    When click my Account button
    Then I see a welcome message
  
  @forgotpsw
  Scenario: User should be able to retrieve password
    And I click The forgot password Link
    And I am dircted to theforgot password page
    When I enter my email address
    And I click Continue button
    Then I should see a confirmation the my password has been sent
    
