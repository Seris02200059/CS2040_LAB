import java.util.*;

public class StringComparison {

	public static void main(String[] args) {
		String str1;
		String str2;
		Scanner scanner = new Scanner(System.in);

		// string input
		str1 = scanner.nextLine();
		str2 = scanner.nextLine();

		// change strings into lower-case
		str1 = str1.toLowerCase();
		str2 = str2.toLowerCase();

		// use compareTo() to compare the strings
		if (str1.compareTo(str2) < 0) {
			System.out.println(1);
		} else if (str1.equals(str2)) {
			System.out.println(0);
		} else {
			System.out.println(2);
		}
	}
}
