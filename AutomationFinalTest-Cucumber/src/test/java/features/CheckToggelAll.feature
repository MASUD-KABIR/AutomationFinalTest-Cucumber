Feature: As a user I want select all list items when I select toggle all check box

Scenario: Valid users should be able to select all List Items
	Given user is on techFios test webpage
	When user select toggle all check box
	Then all check boxes for list items are selected