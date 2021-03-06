Feature: To book a hotel with Adacitin Website

Scenario: To login the website providing username and password
		Given enter the url of the website
		When user enters "Rukmangathan" as username
		And user enters "9884531556" as password
		And user click login button
		Then user validate the login button

Scenario: To search the hotel with all user needs provided
		When select location of the hotel
		And  select hotel type
		And select room type
		And select number of rooms
		And enter "24/06/2021" as Check in date
		And enter "25/06/2021" as Check out date
		And select no of adults
		And select number of childrens
		Then click search button
		
Scenario: to select hotel 
		When Select the hotel
		Then click continue button
	
Scenario: to proceed booking for hotel with payment
		When Enter "Rukmangathan" as firstname
		And enter "vignesh" as lastname
		And enter "1jdxkdhdwhd" as billing address
		And enter "1234567891011121" as card number
		And select card type
		And select exp month
		And select exp year
		And enter  cvv num
		Then click book now button			 
		
Scenario: to take screenshot of confirmation page and logout of website
When take screenshot after  confirmation done
Then click logout button 