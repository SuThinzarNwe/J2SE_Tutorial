
/**
 * <h2>Tutorial02 Class</h2>
 * <p>
 * Process for Displaying Tutorial02
 * </p>
 * 
 * @author SuThinzarNwe
 *
 */

public class Tutorial02 {
	/**
	 * <h2>main</h2>
	 * <p>
	 * To display odd number between 1 to 10
	 * </p>
	 *
	 * @param args
	 * @return void
	 */
	public static void main(String[] args) {
		for (int odd = 1; odd <= 10; odd++) {
			if (odd % 2 != 0) {
				System.out.println(odd);
			}
		}
	}
}
