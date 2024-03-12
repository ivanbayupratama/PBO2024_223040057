package PBO4;

public class Matakuliah {
	private String kode;
	private String nama;
	private String index;
	private int sks;
	
	// Konstruktor
	
	
	public Matakuliah(String kode,String nama,String index, int sks) {
		
		super();
		this.kode = kode;
		this.nama = nama;
		this.index = index;
		this.sks = sks;
	}
	
	public double nilaiIndex() {
	//Berdasarkan index matakuliah
	// A = 4, AB = 3.5, B = 3, BC = 2.5, C = 2, D = 1, E = 0
		double nilaiIndex = 0;
		switch(index) {
		case "A":
			nilaiIndex = 4;
		case "AB":
			nilaiIndex= 3.5; 
		case "B":
			nilaiIndex= 3;
		case "BC":
			nilaiIndex= 2.5;
		case "C":
			nilaiIndex= 2.0;
		case "D":
			nilaiIndex= 1;
		case "E" :
			nilaiIndex = 0;
		default :
		System.out.println("Index tidak memenuhi kriteria");	
		
		}
		return nilaiIndex;
	}
	
	public void hitungIPK() {
		
	}
	
	public String display() {
		return kode + " - "+ nama + " - " + index + " - " + sks;
	}
}
