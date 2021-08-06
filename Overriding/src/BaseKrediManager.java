
public class BaseKrediManager {
 public double hesapla(double tutar){
	 return tutar*1.18; //anne class tüm hesapla fonksiyonu çaðrýldýðýnda 1.18 deðeri ile çarpacak miras da dahil
	 //ama miras alan classlardan biri bu fonksiyonu farklý bir þekilde kullanýrsa overridig olur
 }
 
/* public final double hesapla(double tutar){
	 return tutar*1.18; //bu fonksiyonunun overriding olmasýný engeliiyor final sözcüðü
 }*/
}
