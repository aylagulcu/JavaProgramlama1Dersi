package Konferans;

/*
 *
 * Ogrenci class' ı Katilimci class' ının bütün özelliklerini, metodlarını alıyor (inheritance)
 */


public class Ogrenci extends Katilimci{
    
    // Bu class için geçerli bir özellik (property):
    public int basariNotu;
    
    // default constructor:
    public Ogrenci(){
    	System.out.println("Yeni bir öğrenci eklendi");
    }
    
    // Constructor overloading: Object yaratılırken alanlara değerler de atanıyor:
    public Ogrenci( String ad, String tel, String k, int not){
    	
        this.adSoyad= ad;
        this.telefon= tel;
        this.kurum= k;
        this.basariNotu= not;
    }

    
}
