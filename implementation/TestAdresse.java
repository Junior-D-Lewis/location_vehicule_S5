package implementation;

import composants.Adresse;

public class TestAdresse {

	public static void main(String[] args) {
		
		Adresse adresse1 = new Adresse();
		Adresse adresse2 = new Adresse(adresse1);
		Adresse adresse3 = new Adresse(3, "24 Rue des iris", 95100, "Argenteuil");
		System.out.println(adresse3.toString());
		System.out.println(adresse2.toString());
		System.out.println(adresse1.toString());
		adresse1.setRue("30 Avenue");
		System.out.println("--------------------------------");
		System.out.println(adresse3.toString());
		System.out.println(adresse2.toString());
		System.out.println(adresse1.toString());
	}

}
