Feature: As a user, I should be able to log out

  Background: User is on the home page
    Given the user is already logged in


    Scenario: The user can log out and ends up on the login page
      When the user clicks the profile menu
      And the user clicks the logout button
      Then the user logout successfully and navigates to login page

  @wip
    Scenario: The user can not go to the home page again by clicking the step back button after successfully logging out.
      When the user logs out and lands on login page
      And the user clicks step back button
      Then the user should NOT be able to navigate back to homepage
