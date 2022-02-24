
/**
 * <h2>Tutorial05 Class</h2>
 * <p>
 * Process for Displaying Tutorial05
 * </p>
 * 
 * @author SuThinzarNwe
 *
 */
public class Tutorial05 {
	/**
	 * <h2>main</h2>
	 * <p>
	 * To display * triangle
	 * </p>
	 *
	 * @param args
	 * @return void
	 */
	public static void main(String[] args) {
		int row = 6;
		for (int i = 1; i <= row; i++) {
			for (int j = 6; j >= i; j--) {
				System.out.print("*");
			}
			System.out.println(" ");
		}
	}
}
