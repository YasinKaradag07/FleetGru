
Feature: FleetGru App Login Feature
  User Story:
  As a user, I should be able to login with correct credentials to different
  accounts. And dashboard should be displayed.

  Accounts are: truck driver, sales manager, store manager

  Background:
    Given the user is on the login page

    Scenario Template: user is able to login with valid credentials as a truck driver verification
      When the truck driver user enters username "<username>"
      And the truck driver user enters password "<password>"
      And the truck driver user clicks enter or login button
      Then the truck driver user can see Quick Launchpad page

      Examples: Truck drivers role

        | username |  | password    |
        | user1    |  | UserUser123 |
        | user11   |  | UserUser123 |
        | user21   |  | UserUser123 |
        | user31   |  | UserUser123 |
        | user41   |  | UserUser123 |
        | user151  |  | UserUser123 |
        | user161  |  | UserUser123 |
        | user171  |  | UserUser123 |
        | user181  |  | UserUser123 |
        | user191  |  | UserUser123 |
        | user200  |  | UserUser123 |


  Scenario Template: user is able to login with valid credentials as a store manager and sales manager verification
    When the sales manager or store manager user enters username "<username>"
    And the sales manager or store manager user enters password "<password>"
    And the sales manager or store manager user clicks enter or login button
    Then the sales manager or store manager user can see Dashboard page

    Examples: store manager and sales manager role

      | username        |  | password    |
      | storemanager51  |  | UserUser123 |
      | storemanager61  |  | UserUser123 |
      | storemanager71  |  | UserUser123 |
      | storemanager81  |  | UserUser123 |
      | storemanager91  |  | UserUser123 |
      | storemanager201 |  | UserUser123 |
      | storemanager211 |  | UserUser123 |
      | storemanager221 |  | UserUser123 |
      | storemanager231 |  | UserUser123 |
      | storemanager241 |  | UserUser123 |
      | storemanager250 |  | UserUser123 |
      | salesmanager101 |  | UserUser123 |
      | salesmanager111 |  | UserUser123 |
      | salesmanager121 |  | UserUser123 |
      | salesmanager131 |  | UserUser123 |
      | salesmanager141 |  | UserUser123 |
      | salesmanager251 |  | UserUser123 |
      | salesmanager261 |  | UserUser123 |
      | salesmanager271 |  | UserUser123 |
      | salesmanager281 |  | UserUser123 |
      | salesmanager291 |  | UserUser123 |
      | salesmanager300 |  | UserUser123 |

  @wip
    Scenario Template: "Invalid username or password." should be displayed for invalid
    (valid username-invalid password and invalid username-valid password) credentials

      When the user enters username "<invalidUsername>" and password "<invalidPassword>"
      And the user clicks enter or login button
      Then the user should see warning message

    Examples: Invalid credentials

      |invalidUsername|  |invalidPassword|
      |user500         |  |UserUser123     |
      |user1           |  |UserUser125     |
      |salesmanager5   |  |UserUser123     |
      |salesmanager300 |  |UserUser125     |
      |storemanager51  |  |UserUser321     |
      |storemanager45  |  |UserUser123     |
