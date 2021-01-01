@NB
Feature:  As a User , I want to find a yellow boys shoes which brand NewBalance and buy it

  @buy
  Scenario: Buy a shoe for boy kid
    Given On NewBalance home page
    When I show the popUp pass it
    And I search boys shoes
    And  I select the running shoes
    And I select size and color
    Then I show the results

  @custom
  Scenario: Customize a shoe
    Given On NewBalance home page
    When I show the popUp pass it
    And I select custom option
    And I select a model
    Then I see the customize page
