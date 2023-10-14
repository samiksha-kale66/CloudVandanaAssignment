//Enter a Roman Number as input and convert it to an integer. (Example: IX = 9)

package cloudvandana;

import java.util.HashMap;

public class RomanToInteger {
	
	public static int romanToInt(String roman) {
		HashMap<Character, Integer> romanMap = new HashMap<>();
		romanMap.put('I', 1);
		romanMap.put('V', 5);
		romanMap.put('X', 10);
		romanMap.put('L', 50);
		romanMap.put('C', 100);
		romanMap.put('D', 500);
		romanMap.put('M', 1000);
		
		int result=0;
		int value1=0;
		
		for(int i = roman.length() -1; i>=0; i--) {
			char char1= roman.charAt(i);
			int value2= romanMap.get(char1);
			
			if(value2 < value1) {
				result -= value2;
			} else {
				result += value2;
			}
			value1 = value2;
		}
		return result;
		
	}

	public static void main(String[] args) {
		String romanNum ="II";
		int result= romanToInt(romanNum);
		System.out.println(result);

	}

}
