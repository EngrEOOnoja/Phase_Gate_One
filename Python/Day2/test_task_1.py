from unittest import TestCase
import task_1



class TestFunctionList(TestCase):
	def test_that_function_list_exist(self):
		 task_1.get_checkAgeDoubled
	def test_that_function_list_valid(self):
		result = task_1.get_checkAgeDoubled(50, 25)
		self.assertEqual(result, 0)
	def test_that_function_list_valid_d(self):
		result = task_1.get_checkAgeDoubled(70, 25)
		self.assertEqual(result, 20)
	def test_that_function_list_valid_e(self):
		result = task_1.get_checkAgeDoubled(40, 25)
		self.assertEqual(result, 10)
		
	
		
	