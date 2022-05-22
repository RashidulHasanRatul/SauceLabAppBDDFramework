Feature: Product Page Scenario
  scenario Outline: Validate product info at product page


  Given User is logged in to the application
  Then The product listed with <tittle> and <price>

  Example: Login with invalid username
  |tittle| price |
  | Sauce Labs Bolt T-Shirt |$15.99|

  scenario Outline: Validate product info at product details Page


    Given User is logged in to the application
    Then click on the product tittle <tittle>
    Then The product details page should be displayed with <tittle> ,<price> and <description>


  Example: Login with invalid username
  |tittle| price | description |
  | Sauce Labs Backpack |$29.99|carry.allTheThings() with the sleek, streamlined Sly Pack that melds uncompromising style with unequaled laptop and tablet protection.|