Feature: User can Login to application


Scenario: validate application details
Given user open browser
When user open URL "https://admin-demo.nopcommerce.com/login"
When user enters Email as "admin@yourstore.com" and Password as "admin"
Then clicks on login button
And page Title should be "Dashboard / nopCommerce administration"
And Customer click on CustomerMenu button
And Customer clicks on customers menu item
And Customer clicks on Addnew button
And Enter the details of customer info
And click on save button
And Customer can check Email generates 
When user click on logout link
Then  pgae title should be "Your store. Login"
And close browser