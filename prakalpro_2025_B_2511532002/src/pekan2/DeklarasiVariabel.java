package pekan2;

public class DeklarasiVariabel {
	/* program java
	 * latian
	 * tentang pendeklarasian variabel
	 */
	static int umur=25; /*variabel dapat langsung diinisiasi */
	public static void main(String[] args) {
		int kode;
		boolean isiDibawahUmur; /* perhatikan penulisan nama variabel */
		kode = 1234; /* pengisian variabel (assigment)*/
		double gaji; /* deklarasi variabel dapat dimana saja */
		gaji = 5500000.23;
		isiDibawahUmur = true;
		System.out.println ("Status:"+isiDibawahUmur) ;
		System.out.println ("kode:"+kode);
		System.out.println ("Umur"+umur);
		System.out.println ("Gaji:"+gaji);
	}

}
