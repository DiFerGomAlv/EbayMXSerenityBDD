#Author: diego.gomez@sophossolutions.com


Feature: Make Purchase
  Diego as a user wants to enter ebay mexico site and make a purchase

  Scenario: Succesfull purchase
    Given That Diego enters ebay mexico site
    When Diego chooses the product to be bought
    Then Diego can see the item in the shopping cart
