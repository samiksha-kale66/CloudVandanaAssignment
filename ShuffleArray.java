//Create an array with the values (1, 2, 3, 4, 5, 6, 7) and shuffle it.

package cloudvandana;

import java.util.Arrays;
import java.util.Collections;
import java.util.List;

public class ShuffleArray {

	public static void main(String[] args) {
		Integer [] myArray= {1,2,3,4,5,6,7};
		List<Integer> myList= Arrays.asList(myArray);
		Collections.shuffle(myList);
		myArray = myList.toArray(new Integer[0]);
		System.out.println(Arrays.toString(myArray));
		

	}

}
