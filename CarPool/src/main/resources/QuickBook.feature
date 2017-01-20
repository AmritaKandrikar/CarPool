Feature: Share my Ride
Story as per customer   
Scenario: valid post with success msg
Given user "Amrita" enter details like "vasai" as source and "Andheri" as destination and time "5:30 am"
And email id is "amrita.kandriakr@infrasoftech.com " and phone number is "1234567890"
When click on "Share"
Then data got save and message "Posting as successfull." get dispay with "Ok" button 
And Clicking on "Ok" button go to home page 

Scenario: Fail With Msg
Given user " " enter details like "Origin" as source and "Destination" as destination and time "5:30 am"
And email id is "amrita.kandriakr@infrasoftech.com " and phone number is "1234567890"
When click on "Share"
Then Error message "Posting was fail." get dispay with "Try again" button 
And Clicking on "Try Again" button go to home page 