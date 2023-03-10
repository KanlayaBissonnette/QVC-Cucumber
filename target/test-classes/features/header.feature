Feature: Homepage


  Background: Landing home page
    Given Navigate to hsn.com


    Scenario: verify user can see sub tabs under Fashion tabs
      When user hovers on Fashion
      Then user can see Apparel Text

    Scenario: verify search item
      When user enter item name in seach bar
      And click search button
      Then Item text is displayed



