package PBO3;

public class LingkaranMain {

	public static void main(String[] args) {
		Lingkaran l1 = new Lingkaran();
		l1.setJari2(5);
		Lingkaran l2 = l1;
		Lingkaran l3 = new Lingkaran();
		l3.setJari2(7);
		System.out.println(l1.getJari2());
		System.out.println(l2.getJari2());
		System.out.println(l3.getJari2());
		l1 = null;
		l2 = null;
		l3 = null;	
	}
	
}
