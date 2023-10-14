//Check if the input is pangram or not. (A pangram is a sentence that contains all the alphabets from A to Z).

package cloudvandana;

import java.util.HashSet;
import java.util.Scanner;
import java.util.Set;

public class Pangram {

	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		System.out.println("Enter a sentence to check if it is a pangram: ");
		String input= scanner.nextLine().toLowerCase();
		
		if(isPangram(input)) {
			System.out.println("The input is Pangram.");
		}
		else {
			System.out.println("The input is not a Pangram.");
		}
		scanner.close();

	}

	private static boolean isPangram(String input) {
		Set<Character> alphabetSet =new HashSet<>();
		for(char ch='a'; ch <='z'; ch++) {
			alphabetSet.add(ch);
		}
		for(char ch : input.toCharArray()) {
			if(Character.isLetter(ch)){
				alphabetSet.remove(ch);
			}
		}
		return alphabetSet.isEmpty();
	}

}
