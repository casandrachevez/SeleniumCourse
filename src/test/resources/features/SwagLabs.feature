  Feature: SwagLabs Login tests
  Scenario: Login with standard_user
    Given I go to "https://www.saucedemo.com/"
    Then I fill username "standard_user"
    Then I fill password "secret_sauce"
    Then I click on loginButton
    Then Just wait 5000

  Scenario: Login with locked_out_user and verify locked out message
      Given I go to "https://www.saucedemo.com/"
      Then I fill username "locked_out_user"
      Then I fill password "secret_sauce"
      Then I click on loginButton
      Then Just wait 3000
      And I validate the error
      Then Just wait 5000


    Scenario: Login with standard_user and verify the text
      Given I go to "https://www.saucedemo.com/"
      Then I fill username "standard_user"
      Then I fill password "secret_sauce"
      Then I click on loginButton
      And I Add Sauce Labs Backpack  to cart
      Then Validate that Add to Cart button now has text "REMOVE"
      And Click Cart button
      Then Just wait 2000
      Then Validate that Sauce Labs Backpack is in your cart section
      Then Just wait 5000
      And Click Continue Shopping button
      And Click Cart button
      Then Just wait 2000
      Then Validate that Sauce Labs Backpack is in your cart section