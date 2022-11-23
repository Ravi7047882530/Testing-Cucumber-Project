Feature: place the order for products

@PlaceOrders
Scenario Outline: Search experience for the product search in both home page and offers page

Given User is on GreenCard Landing page 
When user searched with shortName <Name>and extracted with actual name of the product
And Added "3" items of the selected product to cart
Then User proceeds to checkout and validate the <Name> items in checkout page
And verify user has ability to enter promo code and place the order


Examples:
|Name | 
|Tom  | 