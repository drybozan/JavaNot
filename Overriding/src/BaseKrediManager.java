
public class BaseKrediManager {
 public double hesapla(double tutar){
	 return tutar*1.18; //anne class t�m hesapla fonksiyonu �a�r�ld���nda 1.18 de�eri ile �arpacak miras da dahil
	 //ama miras alan classlardan biri bu fonksiyonu farkl� bir �ekilde kullan�rsa overridig olur
 }
 
/* public final double hesapla(double tutar){
	 return tutar*1.18; //bu fonksiyonunun overriding olmas�n� engeliiyor final s�zc���
 }*/
}
