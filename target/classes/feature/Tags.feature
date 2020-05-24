Feature: Amazon test

@regression @Smoke @e2e
Scenario: I log in to amazon
Given I am on amazon

@regression @Smoke
Scenario: I select and Item
Given I select an item

@Smoke @e2e
Scenario: I add another item 
Given I add another item

@Smoke @e2e
Scenario: I change quantity
Given I change quanity

@e2e @regresison 
Scenario: I add my address
Given I add my address

@e2e @regression
Scenario: I pay for it
Given I pay for it


