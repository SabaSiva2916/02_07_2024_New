Feature: validation of login fields

  Scenario: Cinema booking tickes
    Given user is bookmyshow in chrome browser
    When user enter "Saba" and "Saba@12#4Ae"
    And user click on login button
    When user select a movie and goes for payment
    And user select the paymeent options
      | debitCard | creditCard | Netbanking | Upi      |  #0th row
      | Platinum  | Platinum   | SBI        | gpay     |  #1th row
      | visa      | visa       | Canara     | amazon   |  #2nd row
      | master    | master     | HDFC       | phonepay |  #3rd row
   And user confirm payment option