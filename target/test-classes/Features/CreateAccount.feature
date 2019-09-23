@regression
Feature: Create an Account and Add Items to wishlist
  As a user
  I want to be able to create account and login
  So that I can add items of choice to my wishlist.


  Background:
    Given I am on the autoPractice Page

  Scenario: Create an Account and Login
    When I click on the login button
    And I enter required details for account creation
      | Field               | Value              |
      | Customer First Name | customer firstName |
      | Customer Last Name  | customer lastName  |
      | Customer Password   | customer password  |
      | Address Line 1      | address line1      |
      | City                | customer city      |
      | State               | customer state     |
      | PostCode            | customer postcode  |
      | Country             | customer country   |
      | Mobile Phone        | mobile no          |
      | Address Alias       | address alias      |
    Then I should be able to successfully create an account with "customer firstName" displayed at the top page
    And I should be navigated to "my account" page