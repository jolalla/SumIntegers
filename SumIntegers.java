package Pruebas;

/*Given two integers a and b, which can be positive or negative, find the sum of all the numbers in between (including the start and end) 
 * and return it. If the two numbers are equal return a or b.
 * Note: a and b are not ordered!
 */
public class SumIntegers {

	public int GetSum(int a, int b) {
		//First I declare two int variables in which I will store the number and the provisional result
		int result = 0;
		int number = 0;
		
		//If a is greater than b, I will loop through all the integers between them, starting by b and summing 1 in every step of the loop 
		if (a > b) {

			for (int x = b; x <= a; x++) {
				//The number variable will be the x step of the loop, starting from b
				number = x;
				result += number;
				number++;
			}
		//It will be similar if a is greater than b, but starting counting from a
		} else if (a < b) {
			for (int x = a; x <= b; x++) {
				number = x;
				result += number;
				number++;
			}

		}
		//If the two values are similar, the method just return one of them, ie a:
		else {
			result = a;
			
		}

		//Finally the method return the result.
		return result;

	}

}
