Feature: Gmail login and mail search
  For verification specific email in mailbox
  As a recipient
  I want to login into mailbox and find curtain letter

  Scenario: Login using correct credentials
    Given user enters login page
    When the user enters correct username
    And  and submits username
    And  the user enters correct password
    And  and submits password
    And user click on account dropdown
    Then  user verify that he is logged in

  Scenario: Login using incorrect username
    Given login page for incorrect username
    When enters incorrect username
    Then to get error submits username
    Then see username error message

  Scenario: Login using incorrect password
    Given login for wrong password
    When reach password input enters correct username
    Then click username confirm button
    Then the user enters wrong password
    Then and submits form
    Then see password validation error

  Scenario: Search for mail
    Given user enters login page for mail
    When to able to search mail input correct username
    Then for mail search submits username
    Then enters valid password
    Then to reach mailbox submit valid password
    Then search for letter
    Then enters letter content
    Then verify correctness of mail
    Then hits on profile dropdown
    Then user click on logout button