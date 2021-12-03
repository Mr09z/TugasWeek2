import java.util.Scanner;

public class No_3 {

	public static void main(String[] args)  {
			double j,w;
			 
			Scanner scan = new Scanner(System.in);
			System.out.println("Masukan Jarak(Kilometer) :  ");
			j = scan.nextDouble();
			System.out.println("Masukan waktu(jam) :  ");
			w = scan.nextDouble();
			System.out.println("Kecepatan rata-rata adalah=  " +j/w + "km/jam");
	
	
	
	}

	
		public static double hitungKecepatan (double j, double w) {
			int kecepatan;
			System.out.println(j/w);
			
			System.out.println("Kecepatan rata-rata adalah=  " +j/w + "km/jam");
			return 0;
			
			
	}
}