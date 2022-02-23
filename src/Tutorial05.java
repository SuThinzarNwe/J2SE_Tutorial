
public class Tutorial05 {
	public static void main(String[] args) {
		int row = 6;
		for (int i = 1; i <= row; i++) {
			for (int j = 6; j >= i; j--) {
				System.out.print("*");
			}
			System.out.println();
		}
	}
}
