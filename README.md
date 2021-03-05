# checklists-java
An all-in-one checklist program for Java

Checklists supported: ShoppingList, TodoList, and GoalList

Checklists coming soon: Teams and TeamList

A ShoppingList is a simple list of items that reminds a user what they need to purchase on a shopping trip. It is associated with a single user. ShoppingList is no longer its own class but is an instance of a Checklist. 

A TodoList contains a list of tasks to complete. For TodoLists, the list itself, as well as each item, can optionally have a numerical priority associated with it that distinguishes how important it is compared to other list/items. TodoList items can also have an optional deadline or a suggested range of date/times within which to complete the item. A TodoList is associated with a single user. TodoList is no longer its own class but is an instance of an AdvancedList.

A GoalList contains a list of goals a single user has. GoalLists are like TodoLists except GoalList items (goals) can be composed of sub-items, whose sub-items can have sub-items and so on, and a user may only have one GoalList. 
