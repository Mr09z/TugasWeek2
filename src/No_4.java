import java.util.Scanner;

public class No_4 {

	public static void main(String[] args) {
		
			int sisa,jarakPerLiter;
	 
			Scanner scan = new Scanner(System.in);
			System.out.println("Masukkan sisa BBM dalam tangki (liter)  :  ");
			sisa = scan.nextInt();
			System.out.println("Masukkan konsumsi BBM kendaraan (km/liter) :  ");
			jarakPerLiter = scan.nextInt();
			System.out.println("Kendaraan anda dapat menempuh jarak " + sisa*jarakPerLiter  + " kilometer dengan sisa BBM yang ada di tangki");
	}
	
	static double hitungSisaJarak(double sisa, double jarakPerLiter) {
		double sisaJarak = sisa * jarakPerLiter;
		return sisaJarak;
	}
}