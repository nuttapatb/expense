Feature: login
  As a user
  I can add and view income and expense
  so that I know how much money I have


  Scenario: Add income
    Given a user has 0 for income
    When I add income amount 1000
    Then I have income amount 1000

  Scenario: Expense
    Given a user has 1000 for income
    When I pay a money amount 200
    Then I have expense amount 200


  Scenario: Check current income
    Given a user has 1000 for income
    When I want to check my current income that is 1000
    Then System show my income amount 1000

  Scenario: Check current expense
    Given a user has 200 for income
    When I pay a money amount 100
    When I want to check my current expense that is 100
    Then System show my current expense amount 100
    Then System show my income amount 100



