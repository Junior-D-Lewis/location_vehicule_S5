package composants;


import java.util.Comparator;

import stockage.Flotte;
import stockage.Locations;

public class Exemplaire implements Comparator<Exemplaire>{

	public Exemplaire(final Exemplaire exemplaire, Flotte flotte) {
		if (exemplaire.getVehicule() instanceof Auto) {
			this.vehicule = new Auto(exemplaire.getVehicule().getMarque(), exemplaire.getVehicule().getCategorie(), exemplaire.getVehicule().getProprieteSpeciale());
		}else {
			if (exemplaire.getVehicule() instanceof Moto) {
				this.vehicule = new Moto(exemplaire.getVehicule().getMarque(), Integer.parseInt(exemplaire.getVehicule().getProprieteSpeciale())); 
			}
		}
		this.kilometres = exemplaire.getKilometres();
		Exemplaire.nb_exemplaire++;
		this.numero = nb_exemplaire;
		flotte.add(this);
	}

	public Exemplaire(final Vehicule vehicule, int kilometres, Flotte flotte) {
		if (vehicule instanceof Auto) {
			this.vehicule = new Auto(vehicule.getMarque(), vehicule.getCategorie(), vehicule.getProprieteSpeciale());
		}else {
			if (vehicule instanceof Moto) {
				this.vehicule = new Moto(vehicule.getMarque(), Integer.parseInt(vehicule.getProprieteSpeciale()));
			}
		}
		this.kilometres = kilometres;
		Exemplaire.nb_exemplaire++;
		this.numero = nb_exemplaire;
		flotte.add(this);
	}

	@Override
	public String toString() {
		return "Exemplaire [numero=" + numero + ", kilometres=" + kilometres + ", vehicule=" + vehicule + "]";
	}

	public int getNumero() {
		return numero;
	}

	public void setNumero(int numero) {
		this.numero = numero;
	}

	public int getKilometres() {
		return kilometres;
	}

	public void setKilometres(int kilometres) {
		this.kilometres = kilometres;
	}

	public Vehicule getVehicule() {
		if (this.vehicule instanceof Auto) {
			return new Auto(this.vehicule.getMarque(), this.vehicule.getCategorie(), this.vehicule.getProprieteSpeciale());
		}else {
			if (this.vehicule instanceof Moto) {
				return new Moto(this.vehicule.getMarque(), Integer.parseInt(this.vehicule.getProprieteSpeciale()));
			}
		}
		return null;
	}

	public void setVehicule(Vehicule vehicule) {
		this.vehicule.setMarque(vehicule.getMarque());
	}

	public static int getNb_exemplaire() {
		return nb_exemplaire;
	}

	public static void setNb_exemplaire(int nb_exemplaire) {
		Exemplaire.nb_exemplaire = nb_exemplaire;
	}

	public void louer(final Locations locations, final Emprunteur emprunteur) {
		int x = 0;
		for (Location location : locations) {
			if(location.getDevis().getEmprunteur().equals(emprunteur)) {
				location.addExemplaireToDevis(this);
			}else {
				x++;
			}
		}
		if(x == locations.size())
			emprunteur.addExemplaireToPanier(this);
		
	}

	public void ramener(final Locations locations, int dureeEffective, int niveauCarburant, int etat) {
		for (Location location : locations) {
			if(location.getDevis().getEmprunteur().getPanier().contains(this)) {
				location.removeExemplaireToDevis(this);
			}
		}
	}

	@Override
	public int compare(Exemplaire exemplaire1, Exemplaire exemplaire2) {
		int exemplaire1Kilometrage = exemplaire1.getKilometres();
		int exemplaire2Kilometrage = exemplaire1.getKilometres();
		if(exemplaire1Kilometrage > exemplaire2Kilometrage)
			return 1;
		if(exemplaire1Kilometrage < exemplaire2Kilometrage)
			return -1;
		return 0;  
	}

	private int numero;

	private int kilometres;

	private Vehicule vehicule;

	private static int nb_exemplaire;

}

class KilometrageComparator implements Comparator<Exemplaire> {

	@Override
	public int compare(Exemplaire exemplaire1, Exemplaire exemplaire2) {
		System.out.print("olxcckxockxock");
		int exemplaire1Kilometrage = exemplaire1.getKilometres();
		int exemplaire2Kilometrage = exemplaire1.getKilometres();
		if(exemplaire1Kilometrage > exemplaire2Kilometrage)
			return 1;
		if(exemplaire1Kilometrage < exemplaire2Kilometrage)
			return -1;
		return 0;  
	}
}