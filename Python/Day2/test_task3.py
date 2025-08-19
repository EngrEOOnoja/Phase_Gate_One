from unittest import TestCase
import task2



class TestFunctionList(TestCase):
	def test_that_function_list_exist(self):
		 task2.get_check_score
	def test_that_function_list_valid(self):
		result = task2.get_check_score(100, 90, 100)
		self.assertEqual(result, 'A')
	def test_that_function_list_valid_d(self):
		result = task2.get_check_score(80, 80, 85)
		self.assertEqual(result, 'B')
	def test_that_function_list_valid_e(self):
		result = task2.get_check_score(70, 74, 79)
		self.assertEqual(result, 'C')
	def test_that_function_list_valid_r(self):
		result = task2.get_check_score(60, 64, 63)
		self.assertEqual(result, 'D')
	def test_that_function_list_valid_k(self):
		result = task2.get_check_score(40, 39, 50)
		self.assertEqual(result, 'F')
		
	
		
	

