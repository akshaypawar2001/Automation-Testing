Feature: Validate End to End Functionality

  Scenario: verify find flights
    Given Enter url
    When valid departure place "Boston"  and Destination  "London" And select flight accordingly
    Then fill necessary details name "Akshay Pawar" And address "Park Avenue street beacon hill" 
    Then city "Boston" And state "Massachusetts" 
    Then zipcode "02108" And cardtype "American Express"
    Then credit card number "9247639472123" And  credit card month ""  
    Then credit card year "2023" And name on card "Akshay P" and purchase flight
