package implementation;

import composants.Adresse;
import composants.Auto;
import composants.Date;
import composants.Emprunteur;
import composants.Exemplaire;
import composants.Location;
import composants.Vehicule;
import stockage.Locations;

public class TestLocation {

	public static void main(String[] args) {
		
		Date dateDebut = new Date(13, 12, 2021);
		Adresse adresseDrey = new Adresse(1, "3 rue de solidatité", 92120, "MontRouge");
//		Emprunteur emprunteurDrey = new Emprunteur("Tonye", "Andre", adresseDrey);
//		Auto vehiculeDrey = new Auto("Dacia", 2, "Duster");
//		Exemplaire exemplaireDrey = new Exemplaire(vehiculeDrey, 3000);
//		Exemplaire exemplaireD2 = new Exemplaire(vehiculeDrey, 10000);
	//	Location locationDrey = new Location(1, dateDebut, 30, emprunteurDrey, exemplaireDrey);
	//	Location locationD2 = new Location(2, dateDebut, 50, emprunteurDrey, exemplaireDrey);
	//	Location locationD3 = new Location(3, dateDebut, 20, emprunteurDrey, exemplaireDrey);

		Locations locations = new Locations();

	//	locations.insertLocation(locationDrey);
	//	locations.insertLocation(locationD2);
	//	locations.insertLocation(locationD3);

		System.out.println("--------------------------------------------------");

		
	//	System.out.print(exemplaireDrey);
		
	//	locations.updateLocation(locationD3, exemplaireD2);
		
	//	locations.deleteLocation(locationD3);
		
		locations.screen();
		
	//	locationDrey.editFacture(40, 50, 2);
		
	//	locations.afficher();
		
	//	locations.rechercherLocation(exemplaireDrey);

	}

}
