package pekan6_2511532002;

import java.util.Random;
import java.util.Scanner;

public class tugasAlproPekan6_2511532002 {

	public static void main(String[] args) {
		Scanner scan = new Scanner (System.in);
		Random rand = new Random();
		
		String answer;
		int dadu1, dadu2;
		int tries=0;
		int sum=0;
		boolean running=true;
		
		System.out.println("===== Permainan Lempar Dadu =====");
		do {
		dadu1 = rand.nextInt (6)+1;
		dadu2 = rand.nextInt (6)+1;
		sum = dadu1+dadu2;
		tries++;
		
		System.out.println(dadu1+ " + "+ dadu2+ " = "+sum);
		
		if (sum==7) {
			System.out.println("Tebakan Anda Benar!");
			System.out.println("Anda menang setela "+ tries+ " percobaan!");
			running = false;
			
		} else {
			System.out.println("Tebakan Anda Salah");
			System.out.println("Apakah lanjut? (Iya/Tidak)");
			answer= scan.nextLine();
			
			if (answer.equalsIgnoreCase ("tidak")) {
				System.out.println("Anda gagal!");
				running = false;
			}
		}
	} while (running);
	scan.close();
	}
}

