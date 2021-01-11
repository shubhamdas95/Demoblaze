Feature: Navigation smoke test


Scenario: Navigate web application
Given Open Chrome browser and start application
When user clicks on laptops button
 And user clicks on Sony vaio i5
 And user clicks on Add to cart button
Then user accepts pop up confirmation

Scenario: Add more products
Given user navigates back to home page
When user clicks on laptop button
 And user clicks on Dell i7 8gb
 And user clicks on add to cart button
Then user accept pop up confirmation

Scenario: Remove products
Given user navigates to cart section
Then user deletes Dell i7 8gb from cart

Scenario: Complete Purchase
Given user clicks on place order
 When user fills out the details
 And user clicks on Purchase button
Then user clicks on ok button