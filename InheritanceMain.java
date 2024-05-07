package praktekInheritance;

public class InheritanceMain {
	public static void main (String[] args) {
		Motor X = new Motor("Suzuki Satria FU 150" , "Sepeda Motor" , "Underbone 4-Tak");
		System.out.println(X.getMerek()+
					" - "+X.getJenis()+
					" - "+X.getTipe());
	}
}
