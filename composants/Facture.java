package composants;

public class Facture {

	public Facture() {
	
	}
	
	public Facture(final Facture facture) {
		this.dureeEffective = facture.getDureeEffective();
		this.niveauCarburant = facture.getNiveauCarburant();
		this.etat = facture.getEtat();
		this.emprunteur = new Emprunteur(facture.getEmprunteur());
		this.prix = facture.getPrix();
	}
	
	public Facture(int dureeEffective, int niveauCarburant, int etat, final Emprunteur emprunteur, double prix) {
		this.dureeEffective = dureeEffective;
		this.niveauCarburant = niveauCarburant;
		this.etat = etat;
		this.emprunteur = new Emprunteur(emprunteur);
		this.prix = prix;
		System.out.println("------------------ Voici ci dessous votre facture ----------------------");
		System.out.println(this.toString());
	}

	@Override
	public String toString() {
		
		return "Facture [dureeEffective=" + dureeEffective + ", niveauCarburant=" + niveauCarburant + ", etat=" + etat
				+ ",\n emprunteur=" + emprunteur +  "\n Prix=" + prix + "]";
	}

	public int getDureeEffective() {
		return dureeEffective;
	}

	public void setDureeEffective(int dureeEffective) {
		this.dureeEffective = dureeEffective;
	}

	public int getNiveauCarburant() {
		return niveauCarburant;
	}

	public void setNiveauCarburant(int niveauCarburant) {
		this.niveauCarburant = niveauCarburant;
	}

	public int getEtat() {
		return etat;
	}

	public void setEtat(int etat) {
		this.etat = etat;
	}

	public double getPrix() {
		return prix;
	}

	public void setPrix(double prix) {
		this.prix = prix;
	}
	
	public Emprunteur getEmprunteur() {
		return new Emprunteur(this.emprunteur);
	}

	public void setEmprunteur(Emprunteur emprunteur) {
		this.emprunteur = new Emprunteur(emprunteur);
	}


	private int dureeEffective;
	private int niveauCarburant;
	private int etat;
	private Emprunteur emprunteur;
	private double prix;

}
