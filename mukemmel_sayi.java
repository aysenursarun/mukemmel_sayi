package mukemmel_sayi;

import java.util.Scanner;

public class mukemmel_sayi {

	public static void main(String[] args) {

		Scanner scan = new Scanner(System.in);
		
		System.out.print("Sayı girin: ");
		int sayi = scan.nextInt();
		int toplam =0;
		
		for(int i =1; i<sayi; i++) {
			if(sayi%i==0) {
				toplam += i;
			}
		}
		
		if(toplam==sayi) {
			System.out.println(sayi + " mükemmel sayıdır.");
		} else {
			System.out.println(sayi + " mükemmel sayı değildir.");
		}
		
		
	}

}
