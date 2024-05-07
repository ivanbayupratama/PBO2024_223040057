package praktekInheritance;

public class Motor extends Kendaraan {

	private String tipe;
	
	public Motor(String merek, String jenis, String tipe  ) {
		super(jenis, merek);
		setTipe(tipe);
		
	}
	
	public void setTipe(String tipe) {
		this.tipe = tipe;
	}
	
	public String getTipe() {
		return tipe;
	}
	
}
