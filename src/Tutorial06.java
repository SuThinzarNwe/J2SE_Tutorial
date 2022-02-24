/**
 * 
 */

/**
 * <h2>Tutorial06 Class</h2>
 * <p>
 * Process for Displaying Tutorial06
 * </p>
 * 
 * @author SuThinzarNwe
 *
 */
public class Tutorial06 {
	private static final int i = 0;

	/**
	 * <h2>main</h2>
	 * <p>
	 * To display a number pattern
	 * </p>
	 *
	 * @param args
	 * @return void
	 */
	public static void main(String[] args) {
		int row = 7;
		for (int i = 1; i <= row; i++) {
			for (int j = 1; j < i; j++) {
				System.out.print(" ");
			}

			for (int j = i; j <= row; j++) {
				System.out.print(j + " ");
			}
			System.out.println();
		}

		for (int i = row - 1; i >= 1; i--) {
			for (int j = 1; j < i; j++) {
				System.out.print(" ");
			}

			for (int j = i; j <= row; j++) {
				System.out.print(j + " ");
			}
			System.out.println();
		}
	}
}
