
public class methods {

	public static void main(String[] args) {
		sayiBulmaca();

	}

	public static void sayiBulmaca() {
		int[] sayilar = new int[] { 1, 2, 3, 4, 5, 6, 9 };
		int aranacak = 6;
		boolean varMi = false;

		for (int sayi : sayilar) {
			if (sayi == aranacak) {
				varMi = true;
				break;
			}
		}

		if (varMi) {
			mesajVer(aranacak);

		} else {
			System.out.println("Sayi mevcut deðil.");
		}
	}
	public static void mesajVer(int x){
		System.out.println("Sayi mevcuttur: " + x);
	}
}
