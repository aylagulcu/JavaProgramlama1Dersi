package Konferans;

/*
 *
 * Ogretmen class' ı Katilimci class' ının bütün özelliklerini, metodlarını alıyor (inheritance)
 */

public class Ogretmen extends Katilimci{
    
    // Bu class için geçerli özellikler (properties):
    public String konusmaKonusu;
    public int ogrenciSayisi;
    
    // Constructor overloading: Object yaratılırken alanlara değerler de atanıyor:
    public Ogretmen( String ad, String tel, String k, int sayi){
    
        this.adSoyad= ad;
        this.telefon= tel;
        this.kurum= k;
        this.ogrenciSayisi= sayi;
    }
    
}
