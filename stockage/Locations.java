package stockage;

import java.util.ArrayList;

import java.util.Iterator;
import java.util.List;
import java.util.Scanner;
import composants.Exemplaire;
import composants.Location;
import composants.Moto;

public class Locations implements Iterable<Location>{
	public Locations() {
		this.locations = new ArrayList<Location>();
	}


	public Iterator<Location> iterator() {
		return locations.iterator();
	}

	public Location rechercherLocation(Location l) {
		Scanner sc = new Scanner(System.in);
		System.out.println("Rechercher selon:");
		System.out.println("1. La marque");
		System.out.println("2. Le kilometrage");
		System.out.println("3. La date de debut");
		System.out.println("4. tous les emprunteurs ayant une location en cours");
		System.out.print("Choisir une option: ");
		int choix = sc.nextInt();
		switch (choix) {
		case 1:
			for(Location location : locations) {
				if (location.getDevis().getEmprunteur().getPanierList().containsAll(l.getDevis().getEmprunteur().getPanierList())) {
					return new Location(location);	
				}
			}
			break;

		case 2:
			for(Location location : locations) {
				for(Exemplaire e : location.getDevis().getEmprunteur().getPanierList()) {
					for(Exemplaire ex : l.getDevis().getEmprunteur().getPanierList()) {
						if(e.compare(e, ex) == 0) 
							return new Location(location);	
					}
				}
			}
			break;

		case 3:
			for(Location location : locations) {
				if(location.getDateDebut().equals(l.getDateDebut())) 
					return new Location(location);	
			}
			break;

		case 4:
			for(Location location : locations) {
				if(location.getStatut()) 
					return new Location(location);	
			}
			break;

		default:
			System.out.println("Mauvais choix ");
			break;
		}
		return null;
	}

	public void insertLocation(final Location location) {
		this.locations.add(location);
	}

	public void deleteLocation(final Location location) {
		if(this.locations.remove(location))
			System.out.println(this);
	}

	public void updateLocation(final Location location, final Location location2) {
		Scanner sc = new Scanner(System.in);
		try {
			this.locations.set(this.locations.indexOf(location), new Location(location2));
		} catch (Exception e) {
			System.out.println(e.toString());

		}

	}

	@Override
	public String toString() {
		StringBuilder resultat = new StringBuilder("\n ------\n");

		if(!this.locations.isEmpty()) {
			for (Location location : this.locations) {
				resultat.append(location +"\n");
			}
			resultat.append("------\n");
		}else {
			resultat.append(" Panier vide \n------");
		}
		return "Locations " + resultat;
	}


	public void screen() {
		Scanner sc = new Scanner(System.in);
		System.out.println("1. Moto");
		System.out.println("2. Voiture standard");
		System.out.println("3. Voiture de luxe");
		System.out.println("4. Toutes les locations");
		System.out.println("5. Tous les adhérents ayant une location");
		System.out.println("6. Devis");
		System.out.println("7. Facture");

		System.out.print("Selectionner l'option d'affichage:");

		int choix = sc.nextInt();

		switch (choix) {
		case 1:
			for(Location location : locations) {
				for(Exemplaire e : location.getDevis().getEmprunteur().getPanierList()) {
					if(e.getVehicule() instanceof Moto) 
						System.out.print(location);
				}
			}
			break;

		case 2:
			final int INDICATIF_STANDARD = 1;
			for(Location location : locations) {
				for(Exemplaire e : location.getDevis().getEmprunteur().getPanierList()) {
					if(e.getVehicule().getCategorie() == INDICATIF_STANDARD) 
						System.out.print(location);
				}
			}
			break;

		case 3:
			final int INDICATIF_LUXE = 2;
			for(Location location : locations) {
				for(Exemplaire e : location.getDevis().getEmprunteur().getPanierList()) {
					if(e.getVehicule().getCategorie() == INDICATIF_LUXE) 
						System.out.print(location);
				}
			}

			break;

		case 4:
			for (Location location : locations) {					
				System.out.print(location);
			}
			break;

		case 5:
			for (Location location : locations) {					
				System.out.print(location.getDevis().getEmprunteur());
			}
			break;

		case 6:
			for (Location location : locations) {					
				System.out.print(location.getDevis());
			}
			break;

		case 7:
			for (Location location : locations) {					
				System.out.print(location.getFacture());
			}
			break;

		default:
			break;
		}
	}

	public void rechercherParNom() {
		Scanner sc = new Scanner(System.in);
		System.out.println("Entrez lz nom de l'emprunteur");

		String nom = sc.nextLine();

		for (Location location : locations) {
			if (location.getDevis().getEmprunteur().getNom() == nom) {
				location.toString();
			}
		}
	}

	public int size() {
		return locations.size();
	}

	private List<Location> locations;

}
