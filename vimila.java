/**
 * 
 */
package vimila;

/**
 * @author vimila
 *
 */
public class vimila { // BERIKAN PENJELASAN

	/**
	 * @param args
	 */
	static String Praktikum = "Tugas 1"; // BERIKAN PENJELASAN 
	public static void main(String[] args) { // BERIKAN PENJELASAN
		// TODO Auto-generated method stub

		System.out.println("Laporan 1");
		test(); // BERIKAN PENJELASAN
		biodata(); // BERIKAN PENJELASAN
		penjumlahan(); // BERIKAN PENJELASAN
		pengurangan(); // BERIKAN PENJELASAN
		perkalian(); // BERIKAN PENJELASAN
		pembagian(); // BERIKAN PENJELASAN
		
		
	}
	public static void test() // BERIKAN PENJELASAN
	{
		System.out.println(Praktikum); // BERIKAN PENJELASAN
	}
	//pemanggilan biodata
	public static void biodata()
	
	{
		String nama ="Vimila Muntihana"; // BERIKAN PENJELASAN
		String nim  ="60200112088"; // BERIKAN PENJELASAN
		String matakuliah ="PBO";
		String jurusan ="Tekhnik Informatika";
		System.out.println("Nama"+":" + nama + "\nNIM "+ ":" + nim + "\nPraktikum "+matakuliah + "\njurusan "+":"+jurusan);
	}
	//penjumlahan
	public static void penjumlahan() // BERIKAN PENJELASAN
	{
		int i =23; // BERIKAN PENJELASAN
		int j =20; // BERIKAN PENJELASAN
		System.out.print("hasil penjumlahan "  +i + "+" + j + "=");
		System.out.print(i+j); // BERIKAN PENJELASAN
		
	}
	//pengurangan
	public static void pengurangan() // BERIKAN PENJELASAN
	{
		int l =16;
		int k =30;
		System.out.print("\nhasil pengurangan "  +l+ "-" +k+ "=");
		System.out.print(l-k);
		
		
	}
	//perkalian
		public static void perkalian() // BERIKAN PENJELASAN
		{
			int m =34;
			int n =11;
			System.out.print("\nhasil perkalian "  +m+ "*" +n+ "=");
			System.out.print(m*n);
			
			
		}
		//pembagian
		public static void pembagian() // BERIKAN PENJELASAN
		{
			float g =68;
			float h =20;
			System.out.print("\nhasil pembagian " +g+ "/" +h+ "=");
			System.out.print(g/h);
			
			
		}
}
