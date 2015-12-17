import java.util.Scanner;


public class Metodlar3 {

	public static void main(String[] args) {
		int uzunluk;
		java.util.Scanner klavye= new Scanner(System.in); // System.in ile klavyeden gelen inputu takip edecek bir Scanner objesi yaratılıyor
		System.out.print("Dizi uzunluğunu giriniz...:");
		uzunluk= klavye.nextInt();
		
		int[] dizi= new int[uzunluk];
		for (int i=0; i< uzunluk; i++){
			System.out.printf("Dizinin %d. elemanını giriniz...: ", i);
			dizi[i]= klavye.nextInt();
		} // end for i
		
		klavye.close();
		
		System.out.println("Dizinin orijinal hali:");
		printDizi(dizi);
		
		double ort= ortBul(dizi);
		System.out.println("Dizinin ortalaması...:"+ ort);
		
		System.out.println("Orijinal dizi değiştiriliyor: elamanları 2 katına çıkarılıyor: ");
		ikiKatYap(dizi);

		System.out.println("Yeni bir dizi oluşturuluyor: Dizinin elemanları orjinal dizinin elemanlarının yarısı olacak...");
		double[] yeniDizi= yeniDiziDondur(dizi);
		
		System.out.println("Yeni dizimiz...:");
		printDizi(yeniDizi);
		
		System.out.println("Eski dizimiz...:");
		printDizi(dizi);
		
		
	}

	private static double[] yeniDiziDondur(int[] dizi) {
		double[] d= new double[dizi.length];
		for (int t=0; t< dizi.length; t++){
			d[t]= dizi[t] / 2.0;
		} // end t for
		return d;
	} 

	private static void ikiKatYap(int[] dizi) {
		for (int i=0; i< dizi.length; i++)
			dizi[i]= dizi[i] * 2;
	}

	private static double ortBul(int[] dizi) {
		double ortalama;
		double toplam= 0;
		for (int i=0; i< dizi.length; i++){
			toplam+= dizi[i];
		} // end i for
		ortalama= toplam / dizi.length;
		return ortalama;
	}

	private static void printDizi(int[] dizi) {
		for (int s=0; s< dizi.length; s++){
			System.out.print(dizi[s]+"\t");
		}
		System.out.println();
	} // end void
	
	private static void printDizi(double[] dizi) {
		for (int s=0; s< dizi.length; s++){
			System.out.print(dizi[s]+"\t");
		}
		System.out.println();
	} // end void

}
