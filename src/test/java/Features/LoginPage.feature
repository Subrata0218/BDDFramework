Feature: Validate OrangeHRM Login Functionality

Scenario: Validate Login With Valid Credentials 

Given User is on Login Page
When user enters username as "Admin"
And user enters password as "admin123"
Then User should be logged in succesfully

#When User enters correct Username
#And User enters correct Password
#Then User should be logged in succesfully
#
#Scenario: Validate Login with Invalid Credentials
#
#Given User is on Login Page

#When User enters Incorrect Username
#And User enters Incorrect Password
#Then User Should not Login Succesfully


