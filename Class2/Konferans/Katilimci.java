package Konferans;
/*
* Bu class' tan türeyen classlar aşağıdaki bütün özelliklere ve metodlara sahip olurlar.
* Türemiş classlarda bunlar tekrar yazılmaz.
* Aşağıdaki kendiniTanit() metodu, "Katilimci" tipli bir nesnenin istenen özelliklerini gönderir. 
* Bu class' tan türeyen bir class' ın nesnesi üzerinden bu metod çağırıldığında ise gene o nesnenin özellikleri gönderilir.
*/

public class Katilimci {
    
    // referans tipli class değişkenleri default değer olarak "null" değeri alırlar.
	// Aşağıdaki değişkenler public tanımlanmış ancak doğrusu: sadece metodlar public tanımlanmalı.
    public String adSoyad;
    public String telefon;
    public String kurum;
    
    // primitive tipli, class değişkenleri default değer olarak tipin default değerini alırlar. 
    // Burada int 0 alır, gene de 0 atayarak başlatmak daha doğrudur.
    private static int katilimciSayisi= 0;
    
    public Katilimci(){
    	katilimciSayisi++;
    	System.out.println("Yeni bir katılımcı eklendi. Toplam atılımcı sayısı: " + katilimciSayisi);
    }
    
    // metod String tipinde bir değer döndürüyor:
    public String kendiniTanit(){
        String tanitim= adSoyad+" "+ " "+kurum;
        return tanitim;
    }
    
}
