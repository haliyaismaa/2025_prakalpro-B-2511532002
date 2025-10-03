package pekan4;

import java.util.Scanner;

public class tugasAlproPekan4_2511532002 {

	public static void main(String[] args) {
		Scanner sc= new Scanner(System.in);
		
		//Input 
		System.out.println("Nama Pembeli: ");
		String nama =  sc.nextLine();
		System.out.println("Jumlah Tiket: ");
		int jumlah = sc.nextInt();
		System.out.println("Hari (1=Senin-Kamis, 2=Jumat, 3=Sabtu-Minggu): ");
		int hari = sc.nextInt();
		System.out.println("Waktu (1=Pagi, 2=Siang, 3=Malam): ");
		int waktu = sc.nextInt();
		System.out.println("Studio (1=Reguler, 2=Deluxe, 3=Premium): ");
		int studio = sc.nextInt();
		
		//Harga Dasar per Studio
		double hargaDasar = 0;
		switch (studio) {
			case 1: hargaDasar = 40000; break;
			case 2: hargaDasar = 50000; break;
			case 3: hargaDasar = 70000; break;
		}
		
		// Biaya Hari
		double biayaHari = 0;
		switch (hari) {
			case 1: biayaHari = 0; break;
			case 2: biayaHari = 0.1; break;
			case 3: biayaHari = 0.3; break;
		}
		
		//Biaya Waktu
		double biayaWaktu = 0;
		switch (waktu) {
			case 1: biayaWaktu = 0; break;
			case 2: biayaWaktu = 0.1; break;
			case 3: biayaWaktu = 0.2; break;
		}
		
		// Hitung Harga Per Tiket
		double hargaPerTiket = hargaDasar + (hargaDasar * biayaHari) + (hargaDasar * biayaWaktu);
		double subtotal = hargaPerTiket * jumlah;
		
		//Diskon
		double diskon = (jumlah >= 5) ? subtotal * 0.2 : 0;
		double total = subtotal - diskon;
		
		// Output
		System.out.println("\n===== PEMBELIAN TIKET BIOSKOP =====");
		System.out.println("Nama Pebeli     : " + nama);
		System.out.println("Jumlah Tiket    : " + jumlah);
		System.out.println("Hari            : " + (hari==1 ? "Senin-Kamis" : hari==2 ? "Jumat" : "Sabtu-Minggu"));
		System.out.println("Waktu Tayang    : " + (waktu==1 ? "Pagi" : waktu==2 ? "Siang" : "Malam"));
		System.out.println("Jenis Studio    : " + (studio==1 ? "Reguler" : studio==2 ? "Deluxe" : "Premium"));
		System.out.println("-------------------------------------");
		System.out.println("Harga Dasar     : Rp" + (int)hargaDasar + "/tiket");
		System.out.println("Biaya Hari      : +" + (int)(biayaHari*100) + "%");
		System.out.println("Biaya Waktu     : +" + (int)(biayaWaktu*100) + "%");
		System.out.println("Harga per Tiket : RP" + (int)hargaPerTiket);
		System.out.println("Subtutol        : Rp " + (int)subtotal);
		System.out.println("Diskon          : Rp " + (int)diskon);
		System.out.println("-------------------------------------");
		System.out.println("TOTAL BAYAR     : Rp " + (int)total);
		}
				

	}

