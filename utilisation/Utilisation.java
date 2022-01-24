package utilisation;

import java.util.Scanner;

import composants.Adresse;
import composants.Auto;
import composants.Date;
import composants.Emprunteur;
import composants.Exemplaire;
import composants.Location;
import composants.Moto;
import composants.Vehicule;
import stockage.Emprunteurs;
import stockage.Flotte;
import stockage.Locations;
import stockage.Vehicules;

public class Utilisation {

	public static void main(String[] args) {

		// Creation nos conteneurs 

		// Creation de la liste d'emprunteur qui correspond au conteneur d'emprunteur

		Emprunteurs emprunteurs = new Emprunteurs();

		// Creation de la liste d'exemplaire : la Flotte

		Flotte flotte = new Flotte();

		// Creation de la liste de vehicule qui correspond au conteneur de vehicule

		Vehicules vehicules = new Vehicules();

		// Creation de la liste de location  qui correspond au conteneur de location

		Locations locations = new Locations();

		// Creation des Motos

		Vehicule m1 = new Moto("adiva", 100, vehicules);
		Vehicule m2 = new Moto("askoll", 100, vehicules);
		Vehicule m3 = new Moto("avinton", 100, vehicules);
		Vehicule m4 = new Moto("bfg", 100, vehicules);
		Vehicule m5 = new Moto("bmw", 100, vehicules);
		Vehicule m6 = new Moto("borelli", 100, vehicules);
		Vehicule m7 = new Moto("bajaj", 100, vehicules);
		Vehicule m8 = new Moto("cagiva", 100, vehicules);
		Vehicule m9 = new Moto("Adiva", 100, vehicules);
		Vehicule m10 = new Moto("faucon", 100, vehicules);
		Vehicule m11 = new Moto("harley davidson", 100, vehicules);
		Vehicule m12 = new Moto("halford", 100, vehicules);
		Vehicule m13 = new Moto("ligier", 100, vehicules);
		Vehicule m14 = new Moto("masai", 100, vehicules);
		Vehicule m15 = new Moto("peugeot", 100, vehicules);
		Vehicule m16 = new Moto("polaris", 100, vehicules);
		Vehicule m17 = new Moto("razzo", 100, vehicules);
		Vehicule m18 = new Moto("rumi", 100, vehicules);
		Vehicule m19 = new Moto("scorpa", 100, vehicules);
		Vehicule m20 = new Moto("volta", 100, vehicules);

		// Creation des voitures de luxes

		Vehicule luxe1 = new Auto("Lamborghini", 2, "Aventador", vehicules);
		Vehicule luxe2 = new Auto("Ferrari", 2, "Portofinio", vehicules);
		Vehicule luxe3 = new Auto("Bugatti", 2, "Chiron", vehicules);
		Vehicule luxe4 = new Auto("Maserati", 2, "Quattroporte", vehicules);
		Vehicule luxe5 = new Auto("Bentley", 2, "Mulsanne", vehicules);
		Vehicule luxe6 = new Auto("Aston Martin", 2, "Valkyrie", vehicules);
		Vehicule luxe7 = new Auto("Rolls-Royce", 2, "Phantom", vehicules);
		Vehicule luxe8 = new Auto("Porsche", 2, "Cayenne", vehicules);
		Vehicule luxe9 = new Auto("Lotus", 2, "Elise", vehicules);
		Vehicule luxe10 = new Auto("Lamborghini", 2, "Urus", vehicules);
		Vehicule luxe11 = new Auto("Ferrari", 2, "Pista", vehicules);
		Vehicule luxe12 = new Auto("Maserati", 2, "MC20", vehicules);
		Vehicule luxe13 = new Auto("Lamborghini", 2, "Huracan", vehicules);
		Vehicule luxe14 = new Auto("Ferrari", 2, "Spider", vehicules);
		Vehicule luxe15 = new Auto("Bugatti", 2, "Veyron", vehicules);

		// Creation des voitures standards

		Vehicule standard1 = new Auto("Citroën", 1, "2CV", vehicules);
		Vehicule standard2 = new Auto("Ford", 1, "Mustang I", vehicules);
		Vehicule standard3 = new Auto("Austin", 1, "Mini", vehicules);
		Vehicule standard4 = new Auto("Volkswagen", 1, "Coccinelle", vehicules);
		Vehicule standard5 = new Auto("Citroën", 1, "Méhari", vehicules);
		Vehicule standard6 = new Auto("Porsche", 1, "911", vehicules);
		Vehicule standard7 = new Auto("Citroën", 1, "DS", vehicules);
		Vehicule standard8 = new Auto("Triumph", 1, "TR6", vehicules);
		Vehicule standard9 = new Auto("Alpine", 1, "A110", vehicules);
		Vehicule standard10 = new Auto("Volkswagen", 1, "Combi", vehicules);
		Vehicule standard11 = new Auto("Toyota", 1, "Corolla", vehicules);
		Vehicule standard12 = new Auto("Mazda", 1, "Kiyora", vehicules);
		Vehicule standard13 = new Auto("Peugeot", 1, "108", vehicules);
		Vehicule standard14 = new Auto("Peugeot", 1, "Boxer", vehicules);
		Vehicule standard15 = new Auto("Dacia", 1, "Duster", vehicules);


		// Creation des adresses

		Adresse a1 = new Adresse(24, "Rue des iris", 95100, "Argenteuil");
		Adresse a2 = new Adresse(30, "Avenue de la republique", 94800, "VilleJuif");
		Adresse a3 = new Adresse(2, "Rue des ponpadoux", 96400, "Houille");
		Adresse a4 = new Adresse(76, "boulevard des chateaux", 97400, "Cachan");

		// Creation des emprunteurs

		Emprunteur e1 = new Emprunteur("Djomo", "Junior", a1, emprunteurs); 
		Emprunteur e2 = new Emprunteur("junior", "Gatien", a2, emprunteurs); 
		Emprunteur e3 = new Emprunteur("Tonye", "Andre", a3, emprunteurs); 
		Emprunteur e4 = new Emprunteur("Abel", "Andre", a4, emprunteurs); 
		Emprunteur e5 = new Emprunteur("Jerkey", "Jin", a1, emprunteurs); 
		Emprunteur e6 = new Emprunteur("Itadory", "Yuchy", a2, emprunteurs); 
		Emprunteur e7 = new Emprunteur("Kusakabe", "Shinra", a3, emprunteurs); 
		Emprunteur e8 = new Emprunteur("Usumaki", "Naruto", a4, emprunteurs); 
		Emprunteur e9 = new Emprunteur("Uchiwa", "Sasuke", a1, emprunteurs); 
		Emprunteur e10 = new Emprunteur("Namikaze", "Minato", a2, emprunteurs); 
		Emprunteur e11 = new Emprunteur("Elric", "Edward", a3, emprunteurs); 
		Emprunteur e12 = new Emprunteur("Mustang", "Roy", a4, emprunteurs); 
		Emprunteur e13 = new Emprunteur("Sukuna", "Riomen", a1, emprunteurs); 
		Emprunteur e14 = new Emprunteur("Daiki", "Aomine", a2, emprunteurs); 
		Emprunteur e15 = new Emprunteur("Curry", "Steph", a3, emprunteurs); 
		Emprunteur e16 = new Emprunteur("Seijuro", "Akasi", a4, emprunteurs); 
		Emprunteur e17 = new Emprunteur("Tetsuya", "Kuruko", a1, emprunteurs); 
		Emprunteur e18 = new Emprunteur("Allen", "Ray", a2, emprunteurs); 
		Emprunteur e19 = new Emprunteur("Allen", "Iverson", a3, emprunteurs); 
		Emprunteur e20 = new Emprunteur("James", "Lebron", a4, emprunteurs); 


		/**
		 * Creation des exemplaire: Ils seront automatiquement stockés dans la flotte
		 */

		// Moto

		Exemplaire exem1V1 = new Exemplaire(m1, 25000, flotte);
		Exemplaire exem2V1 = new Exemplaire(m1, 10000, flotte);

		Exemplaire exem1V2 = new Exemplaire(m1, 25000, flotte);
		Exemplaire exem2V2 = new Exemplaire(m1, 10000, flotte);

		Exemplaire exem1V3 = new Exemplaire(m1, 25000, flotte);
		Exemplaire exem2V3 = new Exemplaire(m1, 10000, flotte);

		Exemplaire exem1V4 = new Exemplaire(m1, 25000, flotte);
		Exemplaire exem2V4 = new Exemplaire(m1, 10000, flotte);

		Exemplaire exem1V5 = new Exemplaire(m1, 25000, flotte);
		Exemplaire exem2V5 = new Exemplaire(m1, 10000, flotte);

		Exemplaire exem1V6 = new Exemplaire(m1, 25000, flotte);
		Exemplaire exem2V6 = new Exemplaire(m1, 10000, flotte);

		Exemplaire exem1V7 = new Exemplaire(m1, 25000, flotte);
		Exemplaire exem2V7 = new Exemplaire(m1, 10000, flotte);

		Exemplaire exem1V8 = new Exemplaire(m1, 25000, flotte);
		Exemplaire exem2V8 = new Exemplaire(m1, 10000, flotte);

		Exemplaire exem1V9 = new Exemplaire(m1, 25000, flotte);
		Exemplaire exem2V9 = new Exemplaire(m1, 10000, flotte);

		Exemplaire exem1V10 = new Exemplaire(m1, 25000, flotte);
		Exemplaire exem2V10 = new Exemplaire(m1, 10000, flotte);

		Exemplaire exem1V11 = new Exemplaire(m1, 25000, flotte);
		Exemplaire exem2V11 = new Exemplaire(m1, 10000, flotte);

		Exemplaire exem1V12 = new Exemplaire(m1, 25000, flotte);
		Exemplaire exem2V12 = new Exemplaire(m1, 10000, flotte);

		Exemplaire exem1V13 = new Exemplaire(m1, 25000, flotte);
		Exemplaire exem2V13 = new Exemplaire(m1, 10000, flotte);

		Exemplaire exem1V14 = new Exemplaire(m1, 25000, flotte);
		Exemplaire exem2V14 = new Exemplaire(m1, 10000, flotte);

		Exemplaire exem1V15 = new Exemplaire(m1, 25000, flotte);
		Exemplaire exem2V15 = new Exemplaire(m1, 10000, flotte);

		Exemplaire exem1V16 = new Exemplaire(m1, 25000, flotte);
		Exemplaire exem2V16 = new Exemplaire(m1, 10000, flotte);

		Exemplaire exem1V17 = new Exemplaire(m1, 25000, flotte);
		Exemplaire exem2V17 = new Exemplaire(m1, 10000, flotte);

		Exemplaire exem1V18 = new Exemplaire(m1, 25000, flotte);
		Exemplaire exem2V18 = new Exemplaire(m1, 10000, flotte);

		Exemplaire exem2V19 = new Exemplaire(m1, 10000, flotte);
		Exemplaire exem1V19 = new Exemplaire(m1, 25000, flotte);

		Exemplaire exem2V20 = new Exemplaire(m1, 10000, flotte);
		Exemplaire exem1V20 = new Exemplaire(m1, 25000, flotte);

		/**
		 * Voiture de luxe
		 */

		Exemplaire exem2V21 = new Exemplaire(luxe1, 10000, flotte);
		Exemplaire exem1V21 = new Exemplaire(luxe1, 25000, flotte);

		Exemplaire exem2V22 = new Exemplaire(luxe2, 10000, flotte);
		Exemplaire exem1V22 = new Exemplaire(luxe2, 25000, flotte);

		Exemplaire exem2V23 = new Exemplaire(luxe3, 10000, flotte);
		Exemplaire exem1V23 = new Exemplaire(luxe3, 25000, flotte);

		Exemplaire exem2V24 = new Exemplaire(luxe4, 10000, flotte);
		Exemplaire exem1V24 = new Exemplaire(luxe4, 25000, flotte);

		Exemplaire exem2V25 = new Exemplaire(luxe5, 10000, flotte);
		Exemplaire exem1V25 = new Exemplaire(luxe5, 25000, flotte);

		Exemplaire exem2V26 = new Exemplaire(luxe6, 10000, flotte);
		Exemplaire exem1V26 = new Exemplaire(luxe6, 25000, flotte);

		Exemplaire exem2V27 = new Exemplaire(luxe7, 10000, flotte);
		Exemplaire exem1V27 = new Exemplaire(luxe7, 25000, flotte);

		Exemplaire exem2V28 = new Exemplaire(luxe8, 10000, flotte);
		Exemplaire exem1V28 = new Exemplaire(luxe8, 25000, flotte);

		Exemplaire exem2V29 = new Exemplaire(luxe9, 10000, flotte);
		Exemplaire exem1V29 = new Exemplaire(luxe9, 25000, flotte);

		Exemplaire exem2V30 = new Exemplaire(luxe10, 10000, flotte);
		Exemplaire exem1V30 = new Exemplaire(luxe10, 25000, flotte);

		Exemplaire exem2V31 = new Exemplaire(luxe11, 10000, flotte);
		Exemplaire exem1V31 = new Exemplaire(luxe11, 25000, flotte);

		Exemplaire exem2V32 = new Exemplaire(luxe12, 10000, flotte);
		Exemplaire exem1V32 = new Exemplaire(luxe12, 25000, flotte);

		Exemplaire exem2V33 = new Exemplaire(luxe13, 10000, flotte);
		Exemplaire exem1V33 = new Exemplaire(luxe13, 25000, flotte);

		Exemplaire exem2V34 = new Exemplaire(luxe14, 10000, flotte);
		Exemplaire exem1V34 = new Exemplaire(luxe14, 25000, flotte);

		Exemplaire exem2V35 = new Exemplaire(luxe15, 10000, flotte);
		Exemplaire exem1V35 = new Exemplaire(luxe15, 25000, flotte);

		/**
		 * Voiture standard
		 */

		Exemplaire exem2V36 = new Exemplaire(standard1, 10000, flotte);
		Exemplaire exem1V36 = new Exemplaire(standard1, 25000, flotte);

		Exemplaire exem2V37 = new Exemplaire(m1, 10000, flotte);
		Exemplaire exem1V37 = new Exemplaire(m1, 25000, flotte);

		Exemplaire exem2V38 = new Exemplaire(m1, 10000, flotte);
		Exemplaire exem1V38 = new Exemplaire(m1, 25000, flotte);

		Exemplaire exem2V39 = new Exemplaire(m1, 10000, flotte);
		Exemplaire exem1V39 = new Exemplaire(m1, 25000, flotte);

		Exemplaire exem2V40 = new Exemplaire(m1, 10000, flotte);
		Exemplaire exem1V40 = new Exemplaire(m1, 25000, flotte);

		Exemplaire exem2V41 = new Exemplaire(m1, 10000, flotte);
		Exemplaire exem1V41 = new Exemplaire(m1, 25000, flotte);

		Exemplaire exem2V42 = new Exemplaire(m1, 10000, flotte);
		Exemplaire exem1V42 = new Exemplaire(m1, 25000, flotte);

		Exemplaire exem2V43 = new Exemplaire(m1, 10000, flotte);
		Exemplaire exem1V43 = new Exemplaire(m1, 25000, flotte);

		Exemplaire exem2V44 = new Exemplaire(m1, 10000, flotte);
		Exemplaire exem1V44 = new Exemplaire(m1, 25000, flotte);

		Exemplaire exem2V45 = new Exemplaire(m1, 10000, flotte);
		Exemplaire exem1V45 = new Exemplaire(m1, 25000, flotte);

		Exemplaire exem2V46 = new Exemplaire(m1, 10000, flotte);
		Exemplaire exem1V46 = new Exemplaire(m1, 25000, flotte);

		Exemplaire exem2V47 = new Exemplaire(m1, 10000, flotte);
		Exemplaire exem1V47 = new Exemplaire(m1, 25000, flotte);

		Exemplaire exem2V48 = new Exemplaire(m1, 10000, flotte);
		Exemplaire exem1V48 = new Exemplaire(m1, 25000, flotte);

		Exemplaire exem2V49 = new Exemplaire(m1, 10000, flotte);
		Exemplaire exem1V49 = new Exemplaire(m1, 25000, flotte);

		Exemplaire exem2V50 = new Exemplaire(m1, 10000, flotte);
		Exemplaire exem1V50 = new Exemplaire(m1, 25000, flotte);

		/**
		 *  Application et testeCreation des location
		 */

		Location l1 =  new Location();

		Location l2 = new Location();
		Location l3 = new Location();
		Location l4 = new Location();
		Location l5 = new Location();


		/**
		 *  Application et teste
		 */


		System.out.println("			 _ _ _ _ _ _ _ _ _ _ _ _ _ _ _ _ _ _ _ _ _ _ _ _ _ _ _ _ _ _ _ _ _ _ _ _ _ _ _ _ _ _");
		System.out.println("			|    .                .   .......   .       .......  ........  .        .  .......  |");
		System.out.println("			|     .              .    .         .       .        .      .  .  .   . .  .        |");
		System.out.println("			|      .            .     . ...     .       .        .      .  .    .   .  ....     |");
		System.out.println("			|       .     .    .      .         .       .        .      .  .        .  .        |");
		System.out.println("			|        .  .   . .       .         .       .        .      .  .        .  .        |");
		System.out.println("			|         .      .        ........  ....... ........ ........  .        .  ........ |");
		System.out.println("			|_ _ _ _ _ _ _ _ _ _ _ _ _ _ _ _ _ _ _ _ _ _ _ _ _ _ _ _ _ _ _ _ _ _ _ _ _ _ _ _ _ _|");

		System.out.println("			******************************************MENU**************************************");

		int choix = 0;
			
			do {
				Scanner clavier = new Scanner(System.in);
				
				try {

				System.out.println("			1. screenr tous les exemplaires");
				System.out.println("			2. Ajouter au panier");
				System.out.println("			3. Louer vehicule");
				System.out.println("			4. Souscrire à une assurance");
				System.out.println("			5. Ramener vehicule");
				System.out.println("			6. Rechercher dans les locations");
				System.out.println("			7. Supprimer location");
				System.out.println("			8. Modifier location");
				System.out.println("			9. screenr location");
				System.out.println("			10. Rechercher adherent");
				System.out.println("			11. Supprimer adherent");
				System.out.println("			12. Modifier adherent");
				System.out.println("			13. screenr tous les adherent");
				System.out.println("			14. Quitter");


				System.out.print("Que souhaitez vous faire: ");
				choix = clavier.nextInt();
				switch (choix) {
				case 1:
					System.out.println(flotte);
					break;

				case 2:
					e1.addExemplaireToPanier(exem1V50);
					e5.addExemplaireToPanier(exem1V36);
					e10.addExemplaireToPanier(exem2V9);
					e14.addExemplaireToPanier(exem1V45);
					e5.addExemplaireToPanier(exem2V14);
					e18.addExemplaireToPanier(exem1V13);
					e2.addExemplaireToPanier(exem1V23);
					e15.addExemplaireToPanier(exem2V34);
					e7.addExemplaireToPanier(exem1V50);
					e6.addExemplaireToPanier(exem1V17);
					e11.addExemplaireToPanier(exem1V49);
					e16.addExemplaireToPanier(exem1V48);
					e13.addExemplaireToPanier(exem1V48);
					e19.addExemplaireToPanier(exem1V47);
					e17.addExemplaireToPanier(exem2V46);
					e3.addExemplaireToPanier(exem1V41);
					e2.addExemplaireToPanier(exem1V48);
					e4.addExemplaireToPanier(exem1V45);
					e18.addExemplaireToPanier(exem2V37);
					e20.addExemplaireToPanier(exem2V49);
					e13.addExemplaireToPanier(exem2V46);
					e12.addExemplaireToPanier(exem1V48);
					e10.addExemplaireToPanier(exem1V46);
					e12.addExemplaireToPanier(exem1V45);
					e3.addExemplaireToPanier(exem1V50);
					e15.addExemplaireToPanier(exem2V43);
					e8.addExemplaireToPanier(exem1V4);
					e6.addExemplaireToPanier(exem2V4);
					e14.addExemplaireToPanier(exem2V5);
					e4.addExemplaireToPanier(exem1V8);
					e20.addExemplaireToPanier(exem1V1);
					e1.addExemplaireToPanier(exem1V2);
					e2.addExemplaireToPanier(exem1V6);
					e14.addExemplaireToPanier(exem1V36);
					e6.addExemplaireToPanier(exem2V36);
					e11.addExemplaireToPanier(exem1V45);
					e17.addExemplaireToPanier(exem1V24);
					e12.addExemplaireToPanier(exem1V24);
					e10.addExemplaireToPanier(exem2V48);
					e18.addExemplaireToPanier(exem1V47);
					e8.addExemplaireToPanier(exem1V50);
					e3.addExemplaireToPanier(exem2V47);
					e13.addExemplaireToPanier(exem1V44);
					e19.addExemplaireToPanier(exem2V46);
					e4.addExemplaireToPanier(exem1V4);
					e11.addExemplaireToPanier(exem2V50);
					e12.addExemplaireToPanier(exem1V50);
					e13.addExemplaireToPanier(exem1V49);
					e19.addExemplaireToPanier(exem1V45);
					e17.addExemplaireToPanier(exem2V45);
					e3.addExemplaireToPanier(exem1V1);
					e15.addExemplaireToPanier(exem2V50);
					e9.addExemplaireToPanier(exem1V50);
					e14.addExemplaireToPanier(exem1V49);
					e1.addExemplaireToPanier(exem2V46);
					e6.addExemplaireToPanier(exem1V44);
					e6.addExemplaireToPanier(exem1V50);
					e15.addExemplaireToPanier(exem1V41);
					e10.addExemplaireToPanier(exem2V43);
					System.out.println("Success add");
					break;
				case 3:
					l1.set(e1.louer(1, new Date(19, 12, 2021), 30));
					locations.insertLocation(l1);
					l2.set(e14.louer(2, new Date(25, 2, 2021), 10));
					locations.insertLocation(l2);
					l3.set(e20.louer(3, new Date(25, 2, 2021), 60));
					locations.insertLocation(l3);
					l4.set(e10.louer(4, new Date(25, 2, 2021), 15));
					locations.insertLocation(l4);
					l5 = new Location(e3.louer(5, new Date(25, 2, 2021), 7));
					locations.insertLocation(l5);
					break;

				case 4:
					e1.takeOutInsurance(locations);
					e2.takeOutInsurance(locations);
					e3.takeOutInsurance(locations);
					e4.takeOutInsurance(locations);
					e5.takeOutInsurance(locations);
					e6.takeOutInsurance(locations);
					e7.takeOutInsurance(locations);
					e8.takeOutInsurance(locations);
					e9.takeOutInsurance(locations);
					e10.takeOutInsurance(locations);
					e11.takeOutInsurance(locations);
					e12.takeOutInsurance(locations);
					e13.takeOutInsurance(locations);
					e14.takeOutInsurance(locations);
					e15.takeOutInsurance(locations);
					e16.takeOutInsurance(locations);
					e17.takeOutInsurance(locations);
					e18.takeOutInsurance(locations);
					e19.takeOutInsurance(locations);
					e20.takeOutInsurance(locations);
					break;

				case 5:
					e1.ramener(locations, 35, 50, 1);
					e14.ramener(locations, 7, 75, 3);
					e20.ramener(locations, 35, 50, 2);
				
					break;
				case 6:
					System.out.println(locations.rechercherLocation(l5));
					break;
				case 7:
					locations.deleteLocation(l3);
					break;
				case 8:
					locations.updateLocation(l4, e13.louer(6, new Date(23, 12, 2021), 20));
					break;
				case 9:
					locations.screen();
					break;

				case 10:
					System.out.println(emprunteurs.search(e20, luxe12));
					break;

				case 11:
					emprunteurs.deleteEmprunteur(e7);
					emprunteurs.deleteEmprunteur(e15);
					emprunteurs.deleteEmprunteur(e19);
					break;

				case 12:
					emprunteurs.updateEmprunteur(e12, new Emprunteur("Gojo", "Sotori", a4));
					break;

				case 13:
					emprunteurs.screen();
					break;
					
				case 14:
					System.out.println("			 _ _ _ _ _ _ _ _ _ _ _ _ _ _ _ _ _ _ _ _ _ _ _ _ _ _ _ _ _ _ _ _ _ _ _ _ _ _ _ _ _ _ _ _");
					System.out.println("			|	........      .	  .      ........                                               |");
					System.out.println("			|	.       .      . .       .                                                      |");
					System.out.println("			|	.      .        .        ....                                                   |");
					System.out.println("			|	.       .       .        .                                                      |");
					System.out.println("			|	.       .       .        .                                                      |");
					System.out.println("			|	........        .        ........                                               |");
					System.out.println("			|_ _ _ _ _ _ _ _ _ _ _ _ _ _ _ _ _ _ _ _ _ _ _ _ _ _ _ _ _ __ _ _ _ _ _ _ __ _ _ _ _ _ _|");
					break;

				default:
					System.out.println("Mauvais choix, veuillez rééssayer! ");
					break;
				}	
			} catch (Exception e) {
				// TODO: handle exception
				System.out.println("Error: mauvaise saisie veuillez recommencer " + e.toString());
			}
			}while(choix !=14);


			//	System.out.print(m1.toString());

			//	emprunteurs.screen();


	
		
	}

}
