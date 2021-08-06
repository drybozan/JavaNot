
public class ForLoop {

	public static void main(String[] args) {

		for (int i = 1; i < 10; i++) {
			System.out.println(i);
		}
		System.out.println("for döngüsü bitti");

		// WHILE
		int i = 1;
		while (i < 10) {
			System.out.println(i);
			i += 2;
		}
		System.out.println("while döngüsü bitti");

		// DO-WHILE
		int j = 2;
		do {
			System.out.println(j);
			j += 2;
		} while (j < 10);
		System.out.println("do-while döngüsü bitti");

	}

}
