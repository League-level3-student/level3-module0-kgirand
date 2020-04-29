package _03_More_Array_Fun;

import java.util.Random;

public class MoreArrayFun {
	//1. Create a main method to test the other methods you write.
	public static void main(String[] args) {
		String s[] = new String[10]; 
		printString(String s[10]);
	
	}
	//2. Write a method that takes an array of Strings and prints all the Strings in the array.
	public void printStrings(String s[]) {
		for(int i = 0; i < s.length; i++) {
			System.out.println(s[i]);
		}
	}
	
	
	//3. Write a method that takes an array of Strings and prints all the Strings in the array
	//   in reverse order.
	public void reverseStrings(String s[]) {
	for(int i = s.length; i>0; i--) {
		System.out.println(s[i]);
	}
	}
	//4. Write a method that takes an array of Strings and prints every other String in the array.
	for(int i =0; i < s.length; i+=2) {
		System.out.println(s[i]);
	}
	
	//5. Write a method that takes an array of Strings and prints all the Strings in the array
	//   in a completely random order. Almost every run of the program should result in a different order.
	
}
