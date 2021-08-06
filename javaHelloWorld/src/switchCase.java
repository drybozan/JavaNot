
public class switchCase {

	public static void main(String[] args) {
		char grade = '7';

		switch (grade) {
		case 'A':
			System.out.println("A : Geçtiniz");
			break;

		case 'B':
			System.out.println("B : Geçtiniz");
			break;

		case 'C':
			System.out.println("C : Geçtiniz");
			break;

		case 'D':
			System.out.println("D : Geçtiniz");
			break;

		case 'F':
			System.out.println("F : Kaldýnýz");
			break;
		default:
			System.out.println("Geçersiz not girdiniz.");
		}

	}

}
