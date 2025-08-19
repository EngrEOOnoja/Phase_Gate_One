from unittest import TestCase
import task2



class TestFunctionList(TestCase):
	def test_that_function_list_exist(self):
		 task2.get_check_score
	def test_that_function_list_valid(self):
		result = task2.get_check_score(50, 25)
		self.assertEqual(result, 0)
	def test_that_function_list_valid_d(self):
		result = task2.get_check_score(70, 25)
		self.assertEqual(result, 20)
	def test_that_function_list_valid_e(self):
		result = task2.get_check_score(40, 25)
		self.assertEqual(result, 10)
		
	
		
	
