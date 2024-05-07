package praktekInheritance;

public class Kendaraan {

		protected String jenis;
		protected String merek;
		
		public Kendaraan(String jenis, String merek) {
			this.jenis= jenis;
			this.merek = merek;
		}
		
		public String getJenis() {
			return jenis;
		}
		
		public String getMerek() {
			return merek;
		}
}
