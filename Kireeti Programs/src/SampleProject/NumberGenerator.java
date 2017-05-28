package SampleProject;

import java.util.Scanner;

public class NumberGenerator {
	static int firstNumber = 0;
	static int secondNumber = 0;

	public static void main(String[] args) {

		Scanner scan = new Scanner(System.in);
		int inputNumber = scan.nextInt();
		scan.close();
		int number  = findFactor(inputNumber);
		if(number != -1) {
			for(int i = 0;i < number; i++)
				System.out.print(2);
			for(int i = number; i < inputNumber; i++)
				System.out.print(3);
		}else {
			System.out.println("Invalid Input");
		}
	}

	private static int findFactor(int inputNumber) {
		int i = 2;
		while (i <= inputNumber) {
			if(i % 2 == 0 && (inputNumber - i) % 3 == 0) {
				return (inputNumber - i);
//			}else if(i % 3 == 0 && (inputNumber - i) % 2 == 0) {
//				return i;
			}
			i++;
		}
		return -1;
	}

}
