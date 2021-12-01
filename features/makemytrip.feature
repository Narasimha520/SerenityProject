@Trips
Feature: Search flight details
  I want to use this template for my flight details search

  @OnewayTrip
  Scenario: Search One way flight details
    Given I am on makemytrip
    When I am booking one way search with following information
      | From  | To     | Depart      | AdultPassenger | FairType      |
      | Delhi | Bangalure | 29 Nov 2021 |              3 | SeniorCitizen |
    
    

  @RoundTrip
  Scenario: Search round way flight details
    Given I am on makemytrip
    When I perform roundtrip search
      | From | Bangalure |
      | To   | Delhi  |
   
