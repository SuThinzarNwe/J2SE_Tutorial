import java.util.Scanner;

/**
 * <h2>Tutorial09 Class</h2>
 * <p>
 * Process for Displaying Tutorial09
 * </p>
 * 
 * @author SuThinzarNwe
 *
 */
public class Tutorial09a {
	@SuppressWarnings("resource")
	public static void main(String[] args) {
		int userNum;
		Scanner num = new Scanner(System.in);
		System.out.println("Enter any number");
		userNum = num.nextInt();
		if (userNum > 0) {
			System.out.println("Your input number is positive");
		} else {
			System.out.println("Your input number is negative");
		}
	}
}
