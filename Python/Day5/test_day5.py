from unittest import TestCase

import day4

class TestShoppingFunctions(TestCase):

	def test_add_new_item(self):
		result = getAddedItems(1)
		self.assertEqual(result, 1)
	
	def test_add_duplicate_item(self):
        	items.append(1)
        	result = getAddedItems(1)
        	self.assertEqual(result, 1)
        	self.assertEqual(items.count(1), 1)

	def test_remove_existing_item(self):
        	items.append(0)
        	result = letRemovedItems(0)
        	self.assertEqual(result, 0)
      
	def test_remove_non_existing_item(self):
        	result = letRemovedItems(1)
        	self.assertEqual(result, 1)
