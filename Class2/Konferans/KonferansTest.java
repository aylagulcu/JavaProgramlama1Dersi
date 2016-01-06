package Konferans;

public class KonferansTest {

	public static void main(String[] args) {
	    // Ogrenci nesnesi 4 parametreli constructor ile değerleri alarak yaratılıyor:
		// Önce base class default constructor' u otomatik olarak çalışır ve tutulan static katılımcı sayısı artırılır
	    Ogrenci ogrenci1= new Ogrenci("Ayse Naz", "905323213232", "FSMVU", 50);
	    System.out.println("Tanitim Öğrenci: "+ ogrenci1.kendiniTanit());
	          
	    // Ogretmen nesnesi:
	    Ogretmen ogretmen1= new Ogretmen("Ahmet Bakan", "905553452323", "ITU", 240);
	    ogretmen1.konusmaKonusu= "Java ile baska neler yapabiliriz?";
	    System.out.println("Tanitim öğretmen: "+ ogretmen1.kendiniTanit());
	    
	    // Yönetici nesnesi:
	    Yonetici yonetici1= new Yonetici("Bill Gates", "13334455", "Microsoft", 1000000);
	    yonetici1.konusmaKonusu= " Cloud Computing";
	    System.out.println("Tanıtım yönetici: " +yonetici1.kendiniTanit());
	   

	}
	
}
