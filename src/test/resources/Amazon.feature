Feature: Buy a Ipad from Amazon

Scenario: I am buying ipad from Amazon

  Given I navigate to "https://www.amazon.com/" page
  When I click to search
  And I search for ipad
  And I should see all ipad models
  When I click on ipad
  And I click on buy now button
  Then I can see signin page

