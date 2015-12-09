
public class TekBoyutluDiziler {

	public static void main(String[] args) {
		
		// Konu: Tek boyutlu diziler üzerinde işlemler
		
		// Örnek 1: 10 elemanlı bir dizi elemanları verilerek oluşturulmakta ve ekrana yazdırılmaktadır:
		int[] dizi= {2, 14, 8, 70, 5, 49, 78 ,11, 12, 78};
		for (int i= 0; i< dizi.length; i++){
			System.out.print(dizi[i]+"\t"); // elemanlar arası bir tab boşluk bırakılıyor
		} // end i for
		System.out.println(); 
		
		
		
		// Örnek 2: 0-1 arası rastgele ondalık sayılardan oluşan 50 elemanlık bir dizi oluşturulmakta ve 
		// her satırda 5 eleman olacak şekilde ekrana yazdırılmaktadır:
		// dizi oluşturuluyor:
		double[] dizim= new double[50]; // eleman sayısı
		for (int i=0; i< dizim.length; i++){
			dizim[i]= (Math.random()); // Math.random() metodu 0 ile 1 arası rastgele double sayı döndürür
		} // end i for
	
		// dizi elemanları ekrana yazdırılıyor:
		System.out.println("Dizi elemanları:");
		for (int i= 0; i< dizim.length; i++){
			if (i % 5 == 0)
				System.out.println();
			System.out.print(dizim[i]+"\t");
		} // end i for
		System.out.println();
		
		
		
		// Örnek 3: 0-100 arası rastgele tamsayılardan oluşan 10 elemanlık bir dizi yaratılmakta, 
		// elemanlar ekrana yazdırılmakta ve en büyük değer bulunup bu değer ile elemanın indisi ekrana yazdırılmaktadır:
		// Dizi yaratılıyor:
		int[] dizi3= new int[10]; // eleman sayısı
		for (int i=0; i< dizi3.length; i++){
			dizi3[i]= (int) (Math.random()*100); // Math.random() metodu 0 ile 1 arası rastgele double sayı döndürür, *100 ile (0-100) arasına getirir
			// (int) ile (casting) double sayı int değere çeviriliyor
		} // end i for
		// Dizinin elemanları ekrana yazdırılıyor:
		for (int p=0; p< dizi3.length; p++)
			System.out.print(dizi3[p]+"\t");
		System.out.println();
		
		// Dizinin en büyük elemanı bulunuyor:
		int maxIndex= 0; // 0. eleman en büyük kabul ediliyor
		int maxDeger= dizi3[0]; // 0. elemanın değeri en büyük sayı kabul ediliyor
		for (int k=1; k< dizi3.length; k++){
			if (dizi3[k] > maxDeger){ // k. sayı en büyük kabul edilen sayıdan büyük mü?
				maxDeger= dizi3[k];
				maxIndex= k; // 
			}
		} // end k for
		System.out.printf("Dizinin en büyük elemanı %d. elemandır, bu sayı %d'dir", maxIndex, maxDeger);
		// printf ile formatlı çıkış yapılıyor
		
		
		
		// Örnek 4: Örnek 3' teki dizi ters çevirilerek yeni bir dizi oluşturulmaktadır (son eleman 0.sırada olacak)
		int[] dizi3Ters= new int[dizi3.length]; // eleman sayısı dizi3 ile aynı olmalı		
		
		// Yöntem 1: q isimli bir yardımcı sayaç kullanılıyor
		int q= 0;
		for (int k= dizi3Ters.length-1; k>=0; k--){
			dizi3Ters[k]= dizi3[q];
			q++;
		} // end 
		
		/*
		// Yöntem 2: yardımcı sayaç kullanmadan
		for (int k=0; k< dizi3Ters.length; k++){
			dizi3Ters[k]= dizi3[dizi3.length-1-k];
		} // end k for
		*/
		
		// Ekrana yazdırılıyor
		System.out.println("Orijinal Dizi:");	
		for (int t= 0; t< dizi3.length; t++)
			System.out.print(dizi3[t]+"\t");
		System.out.println();
		
		System.out.println("Yeni Ters Dizi:");
		for (int t= 0; t< dizi3Ters.length; t++)
			System.out.print(dizi3Ters[t]+"\t");
		System.out.println();
		
		
		// Örnek 5: 2 adet 10 elemanlı dizi oluşturulmaktadır. (Elemanlar 0-100 arası rastgele tamsayılardan oluşuyor)
		// Bu iki dizinin aynı indexteki elemanlarının ortalamasından oluşan yeni bir dizi oluşturulmaktadır:
		int uzunluk= 10;
		int[] d1= new int[uzunluk];
		int[] d2= new int[uzunluk];
		for (int i=0; i< d1.length; i++){
			d1[i]= (int)(Math.random()*100);
			d2[i]= (int)(Math.random()*100);
		} // end i for
		
		// Üçüncü dizi yaratılıyor:
		double[] c= new double[uzunluk];
		for (int y=0; y< c.length; y++)
			c[y]= (d1[y]+d2[y]) / 2.0; // 2.0 kullanıldığı için double bölme yapılıyor. Double operand olmazsa integer bölme yapılır, hatalı olur!
		
		System.out.println("Dizi1\tDizi2\tDiziOrtalama");
		for (int t=0; t< uzunluk;t++){
			System.out.println(d1[t]+"\t"+d2[t]+"\t"+c[t]);
		}
		
		
		// Örnek 6: String tipinde dizi yaratılıyor
		String[] isimler= new String[3];
		isimler[0]= "Ahmet";
		isimler[1]= "Ali";
		isimler[2]= "Elif";
		
		// Alternatif: 	String[] isimler= {"Ahmet", "Ali", "Elif"};
		
		for (int a=0; a< isimler.length; a++)
			System.out.println("Isim "+ (a+1)+ ": "+ isimler[a]);
		
	
		
		
		
		// Ödev : Örnek 3' teki dizinin elemanlarını büyükten küçüğe sıralayınız.


	}

}
