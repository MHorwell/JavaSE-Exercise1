package main;

public class ExerciseOne {
	
	public static void main(String[] args) {
		
		printWord("Matt");
		System.out.println(helloWorldMethod());
		System.out.println(sumOrMultiply(2, 4, true));
		System.out.println(sumOrMultiply(0, 4, false));
		
		int [] arrayint = new int[10];
		int j = 0;
		for (int a = 0; a < arrayint.length; a++) {
			arrayint[a] = j;
			j += 5; {
			System.out.println(sumOrMultiply(arrayint[a], 0, false));
			}
		}
		
	}
	
	public static void printWord(String word) {
		System.out.println(word);
	}
	
	public static String helloWorldMethod() {
		String helloWorld = "Hello World!";
		return helloWorld;
	}
	
	
	public static int sumOrMultiply(int numOne, int numTwo, boolean sumNumbers) {
		if (numOne == 0 && numTwo != 0){
			return (numTwo);
		}
		else if (numTwo == 0 && numOne != 0){
			return (numOne);
		}
		else if(sumNumbers == true) {
				return numOne + numTwo;
		} else {
				return numOne * numTwo;
		}
		
	}
	
	
	

}
