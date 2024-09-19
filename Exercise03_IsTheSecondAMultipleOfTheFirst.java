/**
 * 
 */
package labExercises;

/**
 * 
 */
public class Exercise03_IsTheSecondAMultipleOfTheFirst {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		isTheSecondAMulitpleOfTheFirst(3, 6);
		isTheSecondAMulitpleOfTheFirst(5, 15);
		isTheSecondAMulitpleOfTheFirst(8, 88);
		isTheSecondAMulitpleOfTheFirst(7, 42);
		
		isTheSecondAMulitpleOfTheFirst(2, 1);
		isTheSecondAMulitpleOfTheFirst(8, 23);
		isTheSecondAMulitpleOfTheFirst(9, 66);
		isTheSecondAMulitpleOfTheFirst(10, 28);

	}
	
	/**
	 * A method to determine if the second Input is a multiple of the first Input
	 * @param num1 - Input 1
	 * @param num2 - Input 2
	 */
	public static void isTheSecondAMulitpleOfTheFirst(int num1, int num2) {

		if (num2 % num1 == 0) {
			System.out.println(num2 + " is a multiple of " + num1);
		} else {
			System.out.println(num2 + " is not a multiple of " + num1);
		}
	}
	
}
