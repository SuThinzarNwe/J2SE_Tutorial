public class Tutorial03 {
	@SuppressWarnings("unused")
	public static void main(String[] args) {
		int row = 10;
		for (int i = 1; i <= 10; i++) {
			for (int j = 1; j <= i; j++) {
				System.out.print(j);
			}
			System.out.println();
		}
	}
}