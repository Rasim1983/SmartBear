Feature: SmartBear order process


  Scenario: Order verification
    Given User on the login page
    When user enter username "Tester" and password "test"
    Then User is logged into SmartBear Tester account and on Order page
    And User fills out the form as followed:
    And User selects "FamilyAlbum" from product dropdown
    And User enters "4" to quantity
    And User enters "John Wick" to costumer name
    And User enters "Kinzie Ave" to street
    And User enters "Chicago" to city
    And User enters "IL" to state
    And User enters "60056" zip code
    And User selects Visa as card type
    And User enters "1111222233334444" to card number
    And User enters "12/22" to expiration date
    And User clicks process button
    Then User verifies "John Wick" is in the list

  @wip
  Scenario Outline: SmartBearorder process
    Given User on the login page
    When user enter username "Tester" and password "test"
    Then User is logged into SmartBear Tester account and on Order page
    And User fills out the form as followed:
    And User selects "<product>" from product dropdown
    And User enters "<quantity>" to quantity
    And User enters "<customername>" to costumer name
    And User enters "<street>" to street
    And User enters "<city>" to city
    And User enters "<state>" to state
    And User enters "<zip>" zip code
    And User selects Visa as card type
    And User enters "<card number>" to card number
    And User enters "<expiration date>" to expiration date
    And User clicks process button
    Then User verifies "<customer name>" is in the list

    Examples:
      | product | quantity | customername | street     | city    | state | zip   |  | card number  | expiration date | customer name |  |
      | MyMoney | 1        | Ken Adams    | Kinizie st | Chicago | Il    | 60004 |  | 545687898931 | 12/22           | Ken Adams     |  |
