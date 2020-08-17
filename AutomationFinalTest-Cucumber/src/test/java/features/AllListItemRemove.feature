Feature: As a user I want to validate that all list item could be removed using the remove button when Toggle All is selected

Scenario: Valid users should be able to remove all list item by selecting toggel all check box
	Given user is on techFios homepage
	When user select toggel all check box
	Then click on remove button to remove all list item
	And validate all list items are removed