from unittest import TestCase

import day4

class TestShoppingFunctions(TestCase):

	def test_add_new_item(self):
		result = getAddedItems("apple")
		self.assertEqual(result, "apple added successfully.")
	
	def test_add_duplicate_item(self):
        	items.append("apple")
        	result = getAddedItems("apple")
        	self.assertEqual(result, "apple already exists.")
        	self.assertEqual(items.count("apple"), 1)

	def test_remove_existing_item(self):
        	items.append("banana")
        	result = letRemovedItems("banana")
        	self.assertEqual(result, "banana removed successfully.")
      
	def test_remove_non_existing_item(self):
        	result = letRemovedItems("orange")
        	self.assertEqual(result, "orange is not in the list.")
