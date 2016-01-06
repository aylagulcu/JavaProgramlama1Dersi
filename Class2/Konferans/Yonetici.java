package Konferans;

/*
 *
 * Yonetici class' ı Katilimci class' ının bütün özelliklerini, metodlarını alıyor (inheritance)
 */

public class Yonetici extends Katilimci {

     // Bu class için geçerli özellikler (properties):
    public String konusmaKonusu;
    public int elemanSayisi;
    
    // Constructor overloading: Object yaratılırken alanlara değerler de atanıyor:
    public Yonetici( String ad, String tel, String k, int sayi){
    	
        this.adSoyad= ad;
        this.telefon= tel;
        this.kurum= k;
        this.elemanSayisi= sayi;
    }
    
    
}
