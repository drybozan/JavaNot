
public class KrediUI {
	public void KrediHesapla (BaseKrediManager baseKrediManager){//BaseKrediManager annedir. Direk anneyi verip
		//çocuklarından istediğimizi yollayabilirz main classında 
		//BaseKrediManager baseKrediManager=new OgretmenKredimanager();
		//BaseKrediManager baseKrediManager=new TarimKredimanager();  POLİMORPHİSM
		baseKrediManager.Hesapla();
	}

}
