Feature: Search and place the order for products

@OffersPage
Scenario Outline: Search experience for the product search in both home page and offers page

Given User is on GreenCard Landing page 
When user searched with shortName <Name>and extracted with actual name of the product
Then user searched for <Name> shortName in offers page to check if product exist with same name 
And validate product name in offers page matches with Landing page

Examples:
|Name | 
|Tom  |
|Beet |
