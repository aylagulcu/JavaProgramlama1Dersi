
package javaapplication1;

/*
* Bu class' tan türeyen classlar aşağıdaki bütün özelliklere ve metodlara sahip olurlar.
* Türemiş classlarda bunlar tekrar yazılmaz.
* Aşağıdaki kendiniTanit() metodu, "Katilimci" tipli bir nesnenin istenen özelliklerini gönderir. 
* Bu class' tan türeyen bir class' ın nesnesi üzerinden bu metod çağırıldığında ise gene o nesnenin özellikleri gönderilir.
*/

public class Katilimci {
    
    // referans tipli class değişkenleri default değer olarak "null" değeri alırlar.
    public String adSoyad;
    public String telefon;
    public String kurum;
    
    // metod String tipinde bir değer döndürüyor:
    public String kendiniTanit(){
        String tanitim= adSoyad+" "+ " "+kurum;
        return tanitim;
    }
    
}
