import java.util.Scanner;


public class Metodlar1 {

	// static metod class ismiyle doğrudan çağırılabilir
	public static void main(String[] args) {
		
		// Örnek 1: verilen 2 sayının ortalaması "ortalamabul" isimli bir metod ile hesaplanmaktadır:
		int sayi1, sayi2;
		java.util.Scanner klavye= new Scanner(System.in); // System.in ile klavyeden gelen inputu takip edecek bir Scanner objesi yaratılıyor
		System.out.println("Ortalaması bulunacak sayıları giriniz");
		System.out.print("İlk sayıyı giriniz...: "); 
		sayi1= klavye.nextInt(); // nextInt() metodu System.in ile okunan inputu alıp int olarak çevirip gönderir
		System.out.print("İkinci sayıyı giriniz...: "); 
		sayi2= klavye.nextInt();
		
		double ort= ortalamaBul(sayi1, sayi2); // ortalamaBul metodu çağırılıyor, dönen değer ort değişkenine atanıyor
		System.out.println("Girilen sayıların ortalaması...: "+ ort);


		/*
		// Örnek 2: Aynı isim ve aynı tipte parametreye sahip (aynı "signature") 2 metodun olamayacağı gösterilmektedir
		// Method Signature: Method's name and the parameter types.
		// public static void ortalamaBul(int a, int b){....} metodu compile hatası verir! Deneyiniz.

		
		// Örnek 3: Giriş parametreleri farklı olan yeni "ortalamaBul" metodu yazılmaktadır
		// Method overloading: Methods within a class can have the same name if they have different parameter lists
		double s1, s2;
		System.out.println("Ortalaması bulunacak sayıları giriniz");
		System.out.print("İlk sayıyı giriniz...: "); 
		// Daha önce tanımlanan scanner objesi kullanılıyor:
		s1= klavye.nextDouble(); // System.in ile okunan inputu alıp double olarak çevirip gönderir
		System.out.print("İkinci sayıyı giriniz...: "); 
		s2= klavye.nextDouble();

		System.out.println("Girilen sayıların ortalaması...: "+ ortalamaBul(s1, s2) ); // ortalamaBul metodu çağırılıyor
		
		// Örnek 4: Bir sayının verilen dereceden kuvveti "usAl" metodu ile hesaplanıp ekrana yazdırılmaktadır.
		// usAl metodu sadece 2 int sayi alacak, dönüş değeri yok
		System.out.println("Üs alma işlemi için sayıları giriniz");		
		System.out.print("Sayıyı giriniz...: "); 
		int taban= klavye.nextInt(); // System.in ile okunan inputu alıp double olarak çevirip gönderir
		System.out.print("Üs değerini giriniz giriniz...: "); 
		int kuvvet= klavye.nextInt();
		usAl(taban, kuvvet); // metod sadece çağırılıyor, dönüş değeri yok
		
		
		// Örnek 5: Örnek 4' te metod içinde gönderilen "kuvvet" parametresinin değeri azaltıldı. 
		// Aşağıda metoddaki değişimin gerçek değeri değiştirip değiştirmediği gösterilmektedir:
		// "pass by value"
		taban= 3;
		int us= 2;
		System.out.println("Verilen üs: "+ us);
		usAl(taban, us); // metod çağırıldı
		System.out.println("usAl metodu çalıştırıldıktan sonra ussun değeri: "+us);
		// us değeri değişmedi çünkü primitive type değişken sadece o anki değeri gönderdi.
		
		
		// Örnek 6: Parametre olarak referans tipi olan dizilerin gönderilmesi. Aşağıdaki dizi
		int dizi[] = {2, 5, 7, 8, 1, 0, 3, 9, 4, 6};
		System.out.println("Orijinal dizi");
		for (int i: dizi)
			System.out.print(i+"\t");
		System.out.println();
		
		int carpan= 3;
		diziCarp(dizi, carpan);
		System.out.printf("diziCarp metodundan sonra dizi (carpan olarak verilen değer: %d)\n", carpan);
		for (int i: dizi)
			System.out.print(i+"\t");
		System.out.println();
		
		
		
		// Örnek 7: Rastgele tamsayılardan oluşan (0-100 arası) matris (5*10) oluşturulup ekrana yazdırılmaktadır. 
		// Bu matrisin istenen bir satırının en büyük elemanı "matrisSatirMaxBul" metodu ile bulunup ekrana yazdırılmaktadır:
		// Ancak metod içinde girilen satir numarasının doğruluğunun kontrolu başka bir metod tarafından yaptırılacaktır.
		// matrisSatirMaxBul metodu parametreleri: matris ve satir numarası, dönüş değeri yok
		// kontrol metodu parametreleri: matris ve satir numarası, dönüş değeri boolean

		
		
		*/
		
		// Ödev: Metodlarda parametre olarak String değişken geçilmesi durumunda ne olduğunu araştırınız. 
		// Stringler de diziler gibi referans tipi; aynı şekilde mi çalışıyorlar? 
		// Note: The String class is immutable, so that once it is created a String object cannot be changed.
		
	} // end method main
	


	// toplam metodu 2 int parametre alıyor, 1 double gönderiyor
	public static double ortalamaBul(int a, int b){
		double ortalama; // top is a local variable, scope: this method
		ortalama= (a + b)/ 2.0;
		return ortalama;
	} // en method ortalamaBul

	/*
	// (method signature)toplam metodu 2 int parametre alıyor, dönüş değeri yok
	public static void ortalamaBul(int a, int b){
		double ortalama; // top is a local variable, scope: this method
		ortalama= (a + b)/ 2.0;
		System.out.println("Girilen sayıların ortalaması...: "+ ortalama);
	}
	*/
	
	// toplam metodu 2 double parametre alıyor, 1 double gönderiyor
	public static double ortalamaBul(double a, double b){
		double ortalama; // top is a local variable, scope: this method
		ortalama= (a + b)/ 2;
		return ortalama;
	} // end method ortalamaBul
	
	// usAl metodu 2 int parametre alıyor, geri dönüş değeri yok
	public static void usAl(int sayi, int kuvvet){
		System.out.printf("%d üzeri %d hesaplanıyor...", sayi, kuvvet);
		int sonuc= 1;
		while(kuvvet >0){
			sonuc= sonuc * sayi;
			kuvvet--;
		}
		System.out.printf("Sonuç %d' dir.\n", sonuc);
	} // end method usAl
	
	
	public static void buyukHarfYap(String isim){
		isim= isim + "Istanbul";
	}
	
	private static void diziCarp(int[] sayiDizisi, int c) {
		for (int i=0; i< sayiDizisi.length; i++)
			sayiDizisi[i]= sayiDizisi[i] * c;		
	}
	
	
}
