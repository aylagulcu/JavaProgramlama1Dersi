import java.util.Scanner;


public class Metodlar2 {

	// static metod class ismiyle doğrudan çağırılabilir
	public static void main(String[] args) {
		
		// Örnek: Rastgele tamsayılardan oluşan (0-100 arası) matris (5*10) oluşturulup ekrana yazdırılmaktadır. 
		// Bu matrisin istenen bir satırının en büyük elemanı "matrisSatirMaxBul" metodu ile bulunup ekrana yazdırılmaktadır:
		// Ancak metod içinde girilen satir numarasının doğruluğunun kontrolu başka bir metod tarafından yaptırılacaktır.
		// matrisSatirMaxBul metodu parametreleri: matris ve satir numarası, dönüş değeri yok
		// kontrol metodu parametreleri: matris ve satir numarası, dönüş değeri boolean

		int[][] matris= new int[5][10];
		
		// matris oluşturuluyor:
		for (int satir= 0; satir< 5; satir++){
			for (int sutun= 0; sutun< 10; sutun++){
				matris[satir][sutun]= (int)(Math.random() * 100);
			} // end sutun for
		} // end satir for
		
		// matris ekrana yazdırılıyor:
		System.out.println("Matris elemanları:");
		for (int satir= 0; satir< 5; satir++){
			for (int sutun= 0; sutun< 10; sutun++)
				System.out.print(matris[satir][sutun]+"\t");
			System.out.println();
		} // end satir for
		
		System.out.print("En büyük elemanı bulmak istediğiniz satiri giriniz...:");
		java.util.Scanner klavye= new Scanner(System.in); // System.in ile klavyeden gelen inputu takip edecek bir Scanner objesi yaratılıyor
		int satirNo= klavye.nextInt();
		klavye.close(); // scanner klavye takibini bırakıyor
		
		matrisSatirMaxBul(matris, satirNo);
		
	}
		
	private static void matrisSatirMaxBul(int[][] matrisim, int sat) {
		if (kontrolEt(matrisim, sat)){
			int maxDeger= matrisim[sat][0];
			for (int t=1; t< matrisim[sat].length; t++){
				if (matrisim[sat][t] > maxDeger)
					maxDeger= matrisim[sat][t];
			} // end t for
			
			System.out.println("En büyük eleman: "+ maxDeger);
		}
		else
			System.out.println("Satır numarası hatalı olduğu işlem yapılamadı!");
	} // end method diziMaxBul




	private static boolean kontrolEt(int[][] matrisim, int sat) {
		if (sat < 0 || sat >= matrisim.length)
			return false;
		return true; // else yazmaya gerek yok
	}
	
}
