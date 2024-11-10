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
Feature: Registration
  I want to register a new account to clio

  @tag1
  Scenario Outline: Verify the user is able to registration new account on the clio
    Given the clio URL
    When the user input <FirstName> in the fields 
		And the user input <LastName> in the fields
		And the user input <Email> in the fields
		And the user input <PhoneNumber> in the fields
		And the user select <FirmSize> in the field 
		And the user click the Get Started button 
    Then the user sees the verification email on display

    Examples: 
      | FirstName  | LastName | Email             | phoneNumber  | FirmSize |
      | Hilman	   | Muliman  | Muliman@gmail.com | 082117399213 | 2 to 4   |
      