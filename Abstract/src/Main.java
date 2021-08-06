
public class Main {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		MaleCalculator maleCalculator = new MaleCalculator();
		maleCalculator.hesapla();

		ManGameCalculator manGameCalculator = new ManGameCalculator();
		manGameCalculator.hesapla();

		KidsCalculator kidsCalculator = new KidsCalculator();
		kidsCalculator.hesapla();
		kidsCalculator.gameOver();

		// BaseGameCalculator baseGameCalculator=new BaseGameCalculator();
		// abstract classlar newlenemez

		BaseGameCalculator x = new ManGameCalculator();
		x.hesapla();
	}
}
