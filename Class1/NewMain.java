
package javaapplication1;


public class NewMain {

    /*
    * 1 adet Ogrenci nesnesi (instance of Ogrenci class)
    * 1 adet Ogretmen nesnesi
    * ve 1 adet Yonetici nesnesi oluşturuluyor
    * her bir nesnenin "kendiniTanit()" metodu çağırılıyor.
    */ 
    public static void main(String[] args) {
        
        // Ogrenci nesnesi:
        Ogrenci ogrenci1= new Ogrenci();
       
        ogrenci1.adSoyad="Ayse Naz";
        ogrenci1.kurum= "FSMVU";
        ogrenci1.telefon= "905323213232";
        ogrenci1.basariNotu= 50;
        
        System.out.println("Tanitim Öğrenci: "+ ogrenci1.kendiniTanit());
              
        // Ogretmen nesnesi:
        Ogretmen ogretmen1= new Ogretmen();
        ogretmen1.adSoyad= "Ahmet Bakan";
        ogretmen1.telefon= "905553452323";
        ogretmen1.kurum= "ITU";
        ogretmen1.ogrenciSayisi= 240;
        ogretmen1.konusmaKonusu= "Java ile baska neler yapabiliriz?";
        
        System.out.println("Tanitim öğretmen: "+ ogretmen1.kendiniTanit());
        
        // Yönetici nesnesi:
        Yonetici yonetici1= new Yonetici();
        yonetici1.adSoyad= "Bill Gates";
        yonetici1.telefon= "13334455";
        yonetici1.kurum= "Microsoft";
        yonetici1.elemanSayisi= 1000000;
        yonetici1.konusmaKonusu= " Cloud Computing";
        
        System.out.println("Tanıtım yönetici: " +yonetici1.kendiniTanit());
        
        
    }
    
}
