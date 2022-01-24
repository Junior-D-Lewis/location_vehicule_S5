package composants;

import java.util.ArrayList;
import java.util.List;
import java.util.Objects;

import stockage.Emprunteurs;
import stockage.Locations;

public class Emprunteur {

	public Emprunteur(final Emprunteur emprunteur) {
		try {
			this.nom = emprunteur.nom;
			this.prenom = emprunteur.getPrenom();
			this.adresse = emprunteur.getAdresse();
			this.panier = emprunteur.getPanier();
		} catch (Exception e) {
			// TODO: handle exception
		}
	}

	public Emprunteur(String nom, String prenom, final Adresse adresse, Emprunteurs emprunteurs) {
		this.nom = nom;
		this.prenom = prenom;
		this.adresse = new Adresse(adresse);
		this.panier = new MesExemplairesLoue();
		emprunteurs.add(this);
	}
	
	public Emprunteur(String nom, String prenom, final Adresse adresse) {
		this.nom = nom;
		this.prenom = prenom;
		this.adresse = new Adresse(adresse);
		this.panier = new MesExemplairesLoue();
	}

	@Override
	public String toString() {
		StringBuilder resultat = new StringBuilder("Exemplaire en cours de location \n ------\n");

		if(!this.panier.isEmpty()) {
			for (Exemplaire e : this.panier) {
				resultat.append(e +"\n");
			}
			resultat.append("------\n");
		}else {
			resultat.append(" Panier vide \n------");
		}
		return "Emprunteur [nom=" + nom + ", prenom=" + prenom + ", adresse=" + adresse + "\n " + resultat;
	}

	public void addExemplaireToPanier(final Exemplaire e) {
		this.panier.add(e);
	}

	public void removeExemplaireToPanier(final Exemplaire e) {
		this.panier.remove(e);
	}

	public void takeOutInsurance(final Locations locations) {
		final double PRIX_ASSURANCE = 100.0;
		for (Location location : locations) {
			if(location.getDevis().getEmprunteur().equals(this)) {
				location.takeOutInsurance(PRIX_ASSURANCE * this.panier.size());
				System.out.println(location.getDevis());
			}
		}
	}

	public String getNom() {
		return nom;
	}

	public void setNom(String nom) {
		this.nom = nom;
	}

	public String getPrenom() {
		return prenom;
	}

	public void setPrenom(String prenom) {
		this.prenom = prenom;
	}

	public Adresse getAdresse() {
		return new Adresse(this.adresse);
	}

	public void setAdresse(Adresse adresse) {
		this.adresse = new Adresse(adresse);
	}

	public MesExemplairesLoue  getPanier() {
		MesExemplairesLoue copyE = new MesExemplairesLoue();

		for(Exemplaire e : this.panier) {
			copyE.add(e);
		}

		return copyE;
	}

	public List<Exemplaire>  getPanierList() {
		List<Exemplaire> copyE = new ArrayList<>();

		for(Exemplaire e : this.panier) {
			copyE.add(e);
		}

		return copyE;
	}

	public void setPanier(MesExemplairesLoue panier) {
		this.panier = panier;
	}

	/**
	 * @param numero
	 * @param dateDebut
	 * @param duree
	 * @param locations
	 * Lorqu'un emprunteur loue un ou plusieur exemplaire, lacation correspondante 
	 * est crée puis ajouter a la liste de location passée en paramettre
	 */
	public Location louer(int numero, Date dateDebut, int duree) {
		try {
			return new Location(numero, dateDebut, duree, this);
		} catch (Exception e) {
			System.out.println(e.getMessage());
		}
		return null;
	}

	/**
	 * @param locations
	 * @param dureeEffective
	 * @param niveauCarburant
	 * @param etat
	 * Lorsque l'emprunteur ramene l'ensemple des exemplaire de sa locotion, une facture est edité
	 */
	public void ramener(final Locations locations, int dureeEffective, int niveauCarburant, int etat) {
		
		for (Location location : locations) {
			if(location.getDevis().getEmprunteur().equals(this)) {
				location.editFacture(dureeEffective, niveauCarburant, etat);
				break;
			}
		}
		System.out.println("----------------------Member has no current rental---------------------------------------------");
	}	

	@Override
	public int hashCode() {
		return Objects.hash(adresse, nom, panier, prenom);
	}

	@Override
	public boolean equals(Object obj) {
		if (this == obj)
			return true;
		if (obj == null)
			return false;
		if (getClass() != obj.getClass())
			return false;
		Emprunteur other = (Emprunteur) obj;
		return other.nom == this.nom && other.prenom == this.prenom && adresse.equals(other.adresse) && panier.equals(other.panier) ;
	}

	private String nom;

	private String prenom;

	private Adresse adresse;

	private MesExemplairesLoue panier;

}