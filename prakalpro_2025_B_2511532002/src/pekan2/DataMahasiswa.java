package pekan2;

public class DataMahasiswa {
	public static void main(String[] args) {
		// Deklarasi variabel 
		String nim = "2511532002";
		String nama = "Haliya Isma Husna Putri Ahmadi";
		int umur = 19;
		
		// Konversi
		String umurString = String.valueOf(umur);
		long nimLong = Long.parseLong(nim);
		long hasil = nimLong + umur;
		
		// Cetak hasil sesuai format
		System.out.println ("=== Data Mahasiswa ===");
		System.out.println ("NIM  : " + nim);
		System.out.println ("Nama : " + nama);
		System.out.println ("Umur : " + umur + " tahun");

		System.out.println ("\nUmur (String) : " + umurString);
		System.out.println ("NIM + Umur    : " + hasil);
		
		

	}

}
