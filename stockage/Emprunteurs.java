package stockage;

import java.util.ArrayList;
import java.util.Comparator;
import java.util.Iterator;
import java.util.List;
import java.util.Scanner;

import composants.Emprunteur;
import composants.Exemplaire;
import composants.Location;
import composants.Vehicule;

public class Emprunteurs implements Iterable<Emprunteur>, Comparator<Emprunteur> {

	public Emprunteurs() {
		this.emprunteurs = new ArrayList<Emprunteur>();
	}

	public void add(final Emprunteur emprunteur) {
		this.emprunteurs.add(emprunteur);
	}

	public void insertEmprunteur(final Emprunteur emprunteur) {
		this.emprunteurs.add(emprunteur);
	}

	public void deleteEmprunteur(final Emprunteur emprunteur) {
		if(this.emprunteurs.remove(emprunteur))
			System.out.println("Success delete");
	}

	public void updateEmprunteur(final Emprunteur emprunteur, final Emprunteur emprunteur2) {

		try {
			this.emprunteurs.set(this.emprunteurs.indexOf(emprunteur), new Emprunteur(emprunteur2));
			System.out.println("Success update");
		} catch (Exception e) {
			//System.out.println("Location inexistante!");
			e.toString();
		}
	}

	public Emprunteur search(final Emprunteur emprunteur, final Vehicule vehicule) {
		Scanner clavier = new Scanner(System.in);
		int choix = 0;

		System.out.println("1. Selon le nom");
		System.out.println("2. Selon un vehicule particulier");
		System.out.print("Faite votre choix");

		choix = clavier.nextInt();

		switch (choix) {
		case 1:
			for(Emprunteur e : this.emprunteurs) {
				if(compare(emprunteur, e) == 0) {
					return new Emprunteur(e);
				}
			}
			break;

		case 2:
			for(Emprunteur e : this.emprunteurs) {
				for(Exemplaire ex : e.getPanier()) {
					if(ex.getVehicule().equals(vehicule)) {
						return new Emprunteur(e);
					}
				}
			}
			break;

		default:
			break;
		}
		return null;
	}

	public void screen() {
		for (Emprunteur emprunteur : emprunteurs) {
			System.out.println(emprunteur);
		}
	}

	@Override
	public Iterator<Emprunteur> iterator() {
		return emprunteurs.iterator();
	}

	@Override
	public int compare(Emprunteur emprunteur1, Emprunteur emprunteur2) {
		String emprunteur1Nom = emprunteur1.getNom();
		String emprunteur2Nom = emprunteur2.getNom();
		return emprunteur1Nom.compareTo(emprunteur2Nom);
	}

	private List<Emprunteur> emprunteurs;

}