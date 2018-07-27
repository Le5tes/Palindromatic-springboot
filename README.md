# Palindromatic-springboot

Scenario 1: Returning code ok when palindrome is valid
Given An API to check if I have a palindrome
When the API receives "lkjkl"
Then the status should be 200
And the code should be OK

Scenario 2: Returning code KO when palindrome is not valid
Given An API to check if I have a palindrome
When the API receives "lkjlkj"
Then the status should be 400
And the body should contain "This input is not a palindrome"
