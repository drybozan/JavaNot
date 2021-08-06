
public class Main {

	public static void main(String[] args) {
BaseKrediManager[] krediManagers= new BaseKrediManager[]{new OgretmenKrediManager(),new TarimKrediManager(),
		new OgrenciKrediManager()}; //polimorfizm

for(BaseKrediManager krediManager:krediManagers){
	System.out.println(krediManager.hesapla(1000.00));
}

	}

}
