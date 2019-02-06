/*
 * author		: Yu Chenghui
 * matric no.	: A0194474U
 */

import java.util.*;

public class Palindrome {
	/* use this method to check whether the string is palindrome word or not
	 * 		PRE-Condition  :
	 * 		POST-Condition :
	 */
	public static boolean isPalindrome(String word) {
		int length = word.length();
		boolean flag = true;
		for (int i = 0; i < length / 2; i++) {
			if (word.charAt(i) == word.charAt(length - i - 1)) {
				continue;
			} else {
				flag = false;
				break;
			}
		}
		return flag;
	}

	public static void main(String[] args) {
		// declare the necessary variables
		String str1;
		String str2;
		String word;
		boolean flag;

		// declare a Scanner object to read input
		Scanner sc = new Scanner(System.in);

		// read input and process them accordingly
		str1 = sc.nextLine();
		str2 = sc.nextLine();

		// simulate the problem
		word = str1 + str2;
		flag = isPalindrome(word);

		// output the result
		if (flag) {
			System.out.println("YES");
		} else {
			System.out.println("NO");
		}

	}
}
