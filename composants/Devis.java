package composants;

public class Devis {
	
	public Devis() {}
	
	public Devis(final Emprunteur emprunteur, int duree) {
		this.emprunteur = new Emprunteur(emprunteur);
		this.duree = duree;
		this.setPrixLocation(this.calculPrixLocation());
	}
	
	public Devis(final Devis devis) {
		this.emprunteur = devis.getEmprunteur();
		this.duree = devis.getDuree();
		this.prixLocation = devis.getPrixLocation();
	}
	
	public Emprunteur getEmprunteur() {
		return new Emprunteur(this.emprunteur);
	}

	public void setEmprunteur(Emprunteur emprunteur) {
		this.emprunteur = new Emprunteur(emprunteur);
	}
	
	public void addExemplaireToEmprunteur(final Exemplaire e) {
		this.emprunteur.addExemplaireToPanier(e);
	}
	
	public void removeExemplaireToEmprunteur(final Exemplaire e) {
		this.emprunteur.removeExemplaireToPanier(e);
	}

	public int getDuree() {
		return duree;
	}

	public void setDuree(int duree) {
		this.duree = duree;
	}

	public double getPrixLocation() {
		return prixLocation;
	}

	public void setPrixLocation(double assurance) {
		this.prixLocation += assurance;
	}

	private double calculPrixLocation() {
		double prix = 0.0;
		for (Exemplaire exemplaire : this.emprunteur.getPanier()) {
			switch (exemplaire.getVehicule().getCategorie()) {

			case 1:
				prix += (this.PRIX_JOURNALIER * this.duree) + ((this.PRIX_JOURNALIER * this.duree) * this.AJUST_CAT_1);

			case 2:
				prix += (this.PRIX_JOURNALIER * this.duree) + ((this.PRIX_JOURNALIER * this.duree) * this.AJUST_CAT_2);
				
			case 3:
				prix += this.PRIX_JOURNALIER * this.duree;

			default:
				break;
			}
		}
		return prix;
		
	}

	@Override
	public String toString() {
		return " emprunteur: [" + emprunteur + "\n duree = " + duree + ", prixLocation = "
				+ prixLocation;
	}

	private Emprunteur emprunteur;
	
	private int duree;
	
	private double prixLocation;
	
	private final double PRIX_JOURNALIER = 500.00;
	
	private final double AJUST_CAT_2 = 0.75;
	
	private final double AJUST_CAT_1 = 0.13;

}
