Feature: Validate End to End Functionality

  Scenario: verify login,searching,add to cart and logout testcase
    Given enter url
    When enter valid mail "akshay1234@gmail.com" and Password "Akshay@123" and login
    Then Search required item "Socks", select and Add to cart
    Then Logout

    
 