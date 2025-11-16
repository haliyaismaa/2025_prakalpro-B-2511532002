package pekan7_25111532002;

import java.util.Scanner;

public class tugasAlproPekan7_2511532002 {

	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);
		Akun akunBaru = new Akun();
		
		System.out.println("===== REGISTRASI AKUN BARU =====");
		System.out.print("Masukkan Username    :  ");
		akunBaru.setUsername(input.nextLine());
		System.out.print("Masukkan Password    :  ");
		akunBaru.setPassword(input.nextLine());
		System.out.print("Masukkan Email       :  ");
		akunBaru.setEmail(input.nextLine());
		System.out.print("Masukkan Pin (Angka) :  ");
		akunBaru.setPinAngka(input.nextInt());
		
		System.out.println("-----------------------------------------");
		System.out.println();
		
		if (!akunBaru.isPasswordValid()) {
			System.out.println("----- REGISTRASI GAGAL -----");
			System.out.println("Password Anda \"" +akunBaru.getPassword()+ "\" tidak valid)");
			System.out.println("Silahkan coba lagi!");
			return;
		}
		if (!akunBaru.isEmailValid()) {
			System.out.println("----- REGISTRASI GAGAL -----");
			System.out.println("Email Anda \"" +akunBaru.getEmail()+ "\" tidak valid)");
			System.out.println("Silahkan coba lagi!");
			return;
		}
		System.out.println("===== REGISTRASI BERHASIL =====");
		System.out.println("Akun untuk \""+akunBaru.getUsername()+ "\" telah berhasil dibuat!");
		System.out.println();
		System.out.println("----- DETAIL AKUN -----");
		System.out.println("Username (Lowercase)   : " +akunBaru.getUsername().toLowerCase());
		System.out.println("Email (Uppercase)      : " +akunBaru.getEmail().toUpperCase());
		System.out.println("id Pengguna (Gabungan) : " +akunBaru.getUsername().concat(String.valueOf(akunBaru.getPinAngka())));
		System.out.println();
		
		System.out.println("----- UJI TIPE DATA (PIN ANDA: "+akunBaru.getPinAngka()+ ") -----");
		System.out.println("PIN (int) +10  = "+(akunBaru.getPinAngka()+10));
		System.out.println("PIN (String) \"10\" = " +(String.valueOf(akunBaru.getPinAngka())+ "10"));
		input.close();
		}
		
}