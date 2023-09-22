Feature: Login Feature
  Verify if user is able to Login in to the  rediff site


  Scenario: Login as a authenticated user
    Given user is  on homepage
    When user navigates to Login Page
    And user enters username and Password and signin to application
    Then success message is displayed
    
   