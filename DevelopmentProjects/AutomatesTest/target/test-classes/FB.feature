Feature: FB login



@fbLogin
  Scenario: I want to login to facebook
    Given That I am on FB home page
    When I enter my username and password
    Then I should be logged in
