Feature: Sellapy Admin Login	

Scenario: Verify the admin login
  Given User enters correct URL
  When User enters correct "adegbuyifred@gmail.com" and "developmentteam"
  And Click sign In
  Then User should login successfully
  Then User close the browser
  
Scenario: Verify Add Product feature in backend
  Given User click on product feature
  When User click on add product
  And User clicks on select categories and choose a category
  And User clicks on select subcategories and choose a subcategory
  
Scenario Outline: Add product fields
  Given User is already on add product field
  When User enters "<productName>", "<description>", "<specification>", "<size>" and "<color>"
 
  Examples:
	| productName | description | specification | size | color | 
	| naijashirt  | traditional | male fashion  | L    | White |  
	| naijaskirt  | traditional | female fashion| M    | Red   | 	
  