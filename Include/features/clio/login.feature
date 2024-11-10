#Author: your.email@your.domain.com
#Keywords Summary :
#Feature: List of scenarios.
#Scenario: Business rule through list of steps with arguments.
#Given: Some precondition step
#When: Some key actions
#Then: To observe outcomes or validation
#And,But: To enumerate more Given,When,Then steps
#Scenario Outline: List of steps for data-driven as an Examples and <placeholder>
#Examples: Container for s table
#Background: List of steps run before each of the scenarios
#""" (Doc Strings)
#| (Data Tables)
#@ (Tags/Labels):To group Scenarios
#<> (placeholder)
#""
## (Comments)
#Sample Feature Definition Template
@tag
Feature: Login
  I want to login successfully in to clio

  @tag1
  Scenario Outline: Verify users is able the login successfully in to clio
    Given the clio URL
    When the user click the login button
    And the user input <email> in the field
    And the user click the next password button
    And the user input <password> in the field
    And the user click the sign in button
    Then the user sees the dashboard

    Examples: 
      | email 													| password  |
      | deswandiferdiansyah+1@gmail.com | 1111111As |