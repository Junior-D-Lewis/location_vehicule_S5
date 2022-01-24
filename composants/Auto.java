package composants;

import stockage.Vehicules;

public class Auto extends Vehicule {

    protected Auto() {
    }

    public Auto(String marque, int categorie, String modele, Vehicules vehicules) {
		super(marque, categorie, vehicules);
		this.modele = modele;
	}
    
    public Auto(String marque, int categorie, String modele) {
		super(marque, categorie);
		this.modele = modele;
	}

	public Auto(Vehicule vehicule, String modele, Vehicules vehicules) {
		super(vehicule, vehicules);
		this.modele = modele;
	}
	
	public Auto(Auto auto, Vehicules vehicules) {
		super(auto, vehicules);
		this.modele = auto.getModele();
	}

	@Override
	public String toString() {
		String type = "";
		switch (super.getCategorie()) {
		case 1:
			type = "Standard";
			break;

		case 2:
			type = "de Luxe";
			break;

		default:
			type = "Standard";
			break;
		}
		return "Auto " + super.getMarque() + " " + modele + " Vehicule " + type;
	}

	public String getModele() {
		return modele;
	}

	public void setModele(String modele) {
		this.modele = modele;
	}

	@Override
	public String getProprieteSpeciale() {
		return getModele();
	}

    private String modele;

}