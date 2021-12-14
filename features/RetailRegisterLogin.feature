@Register
Feature: Register user in retail page
  I want to use this template for register user and login user

  @RegisterUser
  Scenario: Register a new user in retail page
    Given I am on Registration page
    When I am Registering the user by entering the required details
    Then  User registerd successully
    
  @LoginUser
  Scenario: Login user to retail page
    Given I am on login page
    When I enter the user name and password click on Login button
    Then  User logged in successfully in retail page
      
   
