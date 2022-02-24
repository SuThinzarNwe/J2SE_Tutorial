import java.util.Scanner;

/**
 * <h2>Tutorial9c Class</h2>
 * <p>
 * Process for Displaying Tutorial9c
 * </p>
 * 
 * @author SuThinzarNwe
 *
 */
public class Tutorial9c {
	/**
	 * <h2>main</h2>
	 * <p>
	 * To display user input year is a leap year or not
	 * </p>
	 *
	 * @param args
	 * @return void
	 */
	@SuppressWarnings("resource")
	public static void main(String[] args) {
		int year;
		Scanner input = new Scanner(System.in);
		System.out.println("Enter the year");
		year = input.nextInt();
		if (year % 4 == 0 || year % 100 == 0 || year % 400 == 0) {
			System.out.println("This " + year + " is a leap year");
		} else {
			System.out.println("This " + year + " is not a leap year");
		}

	}
}
