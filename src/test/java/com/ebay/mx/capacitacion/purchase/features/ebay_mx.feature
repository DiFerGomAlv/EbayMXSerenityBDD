#Author: diego.gomez@sophossolutions.com


Feature: Make Purchase
  Diego as a user wants to enter ebay mexico site and make a purchase

#  Scenario: Succesfull purchase
#    Given That Diego enters ebay mexico site
#    When Diego chooses the product to be bought
#    Then Diego can see the item in the shopping car
    
  Scenario: Succesfull purchase
    Given That Diego enters ebay mexico site
    When Diego chooses the product to be bought
    | type        | id |
		| PS4 Dualshock 4 Negro | 312685557290 |
		#| fridge | 323863753868 | 
    Then Diego can see the item in the shopping cart
   	| type        | id |
		| PS4 Dualshock 4 Negro | 312685557290 |
		#| fridge | 323863753868 |
