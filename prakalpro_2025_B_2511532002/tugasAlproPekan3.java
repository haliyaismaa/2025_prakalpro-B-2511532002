package pekan3;

import java.util.Scanner;

public class tugasAlproPekan3 {

	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);
		
		//Input
		System.out.println("Masukkan jari-jari tabung: ");
		double r =input.nextDouble();
		System.out.println("Masukkan tinggi tabung: ");
		double t = input.nextDouble();
		
		//Hitung Volume Tabung (V=3.14.r.r.t)
		double Volume = 3.14 * r * r * t;
		
		//Output
		System.out.println("=== Hasil Volume Tabung ===");
		System.out.println("Volume Tabung = " + Volume);

	}

}
