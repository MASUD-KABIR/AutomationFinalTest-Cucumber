Feature: As a user I want to remove single list item when a single checkbox is selected by clicking the remove button 

Scenario: Valid users should be able to remove selected single list item
	Given user goes to techFios test webpage
	When user select single check box
	Then click on remove button to remove single list item
	And validate single list item is removed