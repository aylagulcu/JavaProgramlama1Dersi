
public class KarakterTipi {

	public static void main(String[] args) {
		
		// Konu: Karakter veri tipi tanımlanamsı, koşul ve döngülerle kullanımı
		
		// Unicode is a character encoding scheme. A 16-bit Unicode takes a value from \u0000 to \uFFFF.
		// Example: The Unicodes for the Greek letters alfa, beta and gamma are: \u03b1 \u03b2 \u03b4. 
		// In Linux Press Ctrl-Shift-U (an underlined u is displayed) → type the code → Enter.
		
		// Örnek 1: Asagidaki 3 değişik "char" tipindeki değişkene değişik yollarla aynı karakter atanmaktadır:
		char myChar= 'A';
		char otherChar1= 65; // Ascii code value in decimal
		char otherChar2= '\u0041'; // Character A's Unicode is 0041
		System.out.println(myChar+ "\t"+ otherChar1+ "\t"+ otherChar2);
		
		// Örnek 2: İki karakter tipi değişkenden değeri büyük olan ekrana yazdırılıyor
		char karakter1= 'T'; // decimal değerler de verilebilir
		char karakter2= 'Z';
		System.out.println("Karakter tipi değişkenlerin değerleri: "+ karakter1+" ve "+karakter2);
		System.out.print("Büyük olan karakter: ");
		if (karakter1> karakter2)
			System.out.println(karakter1);
		else
			System.out.println(karakter2);
		
		
		// Ornek 3: Aşağıda A harfinden itibaren 15 karakter for döngüsü ile ekrana yazılıyor:
		System.out.println("A harfinden itibaren takip eden 15 harf:");
		// Yöntem1: Başlangıç ve bitiş karakterleri ile:
		for (char y= 'A'; y<= 'O'; y++){
			System.out.print(y+"\t");
		}
		System.out.println();
		
		// Yöntem2: Başlangıç ve bitiş karakterlerin unicode değerleri ile:
		for (char y= '\u0041'; y< '\u0050'; y++){
			System.out.print(y+"\t");
		}
		System.out.println();
		
		// Yöntem 3: Sadece başlangıç karakteri ve bir sayaç kullanımı ile 
		char x= 'A'; // '\u0041' olarak unicode değerinden de başlatılabilir
		for (int i=0; i< 15; i++){
			System.out.print(x+"\t");
			x++;
		} // end i for
		System.out.println();

		
		
		// Ödev: Örnek 3'te "for" döngüsü ile yapılan işlemleri "while" döngüsü ile yapınız.
		
		
	}

}
