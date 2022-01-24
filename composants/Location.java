package composants;

import java.util.List;

import stockage.Locations;

public class Location {
   
    public Location() {
	}

	public Location(int numero, Date dateDebut, int duree, final Emprunteur emprunteur) {
		this.numero = numero;
		this.dateDebut = new Date(dateDebut);
		this.dateFin = getDateDebut().calculDate(duree);
		this.assurance = 0.0;
		this.devis = new Devis(emprunteur, duree);
		this.statut = false;
		this.facture = new Facture();
		System.out.println("--------------Location nouvelement crée-----------");
		System.out.println(this.toString());
	}
    
    
    public Location(final Location location) {
    	this.numero = location.getNumero();
		this.dateDebut = location.getDateDebut();
		this.dateFin = location.getDateFin();
		this.assurance = 0.0;
		this.devis = location.getDevis();
		this.statut = false;
		this.facture = location.getFacture();
    }
    
    public void takeOutInsurance(double assurance) {
    	this.setAssurance(assurance);
    	this.devis.setPrixLocation(this.assurance);
    }
    
    public void editFacture(int dureeEffective, int niveauCarburant, int etat) {
    	double newPrix;
    	final double CARBURANT_PLEIN = 100.0;
    	if(dureeEffective > this.devis.getDuree()) {
    		final int JOUR_EN_PLUS = dureeEffective - this.devis.getDuree();
    		final double MAJORATION = 0.25;
    		newPrix = this.devis.getPrixLocation() + (this.devis.getPrixLocation() * (MAJORATION * JOUR_EN_PLUS));
    	}else {
    		newPrix = this.devis.getPrixLocation();
    	}
    	
    	switch (niveauCarburant) {
    	case 0:
    		newPrix += (CARBURANT_PLEIN - niveauCarburant);
    		break;

    	case 25:
    		newPrix += (CARBURANT_PLEIN - niveauCarburant);
    		break;

    	case 50:
    		newPrix += (CARBURANT_PLEIN - niveauCarburant);
    		break;

    	case 75:
    		newPrix += (CARBURANT_PLEIN - niveauCarburant);
    		break;

    	default:
    		System.out.println("Niveau du carburant incorect");
    		break;
    	}
    	
    	if(this.assurance == 0.0) {
    		final double PRIX_ETAT_MAUVAIS = 300.0; 
    		final double PRIX_ETAT_MOYEN = 150.0; 
    		switch (etat) {
    		case 2:
    			newPrix += PRIX_ETAT_MOYEN;
    			break;

    		case 3:
    			newPrix += PRIX_ETAT_MAUVAIS;
    			break;

    		default:
    			break;
    		}
    	}
    	
    	this.statut = true;

    	this.facture = new Facture(dureeEffective, niveauCarburant, etat, this.devis.getEmprunteur(), newPrix);
    }
    
    public void set(Location l) {
    	this.numero = l.getNumero();
		this.dateDebut = l.getDateDebut();
		this.dateFin = l.getDateFin();
		this.assurance = l.getAssurance();
		this.devis = l.getDevis();
		this.statut = false;
		this.facture = l.getFacture();
    }
    
    @Override
    public String toString() {
    	String statut = "En cours";
    	if(this.statut) 
    		statut = "Terminé ";
    	return "Location numero:" + this.numero + "\n" + this.devis.toString() + "\n" + "De " + this.dateDebut + " à " 
    				+ this.dateFin + "\n" + statut + "\n";
    }
    
	public int getNumero() {
		return numero;
	}

	public void setNumero(int numero) {
		this.numero = numero;
	}

	public Date getDateDebut() {
		return new Date(this.dateDebut);
	}

	public void setDateDebut(Date dateDebut) {
		this.dateDebut = new Date(this.dateDebut);
	}

	public Date getDateFin() {
		return new Date(this.dateFin);
	}

	public void setDateFin(Date dateFin) {
		this.dateFin = new Date(this.dateFin);
	}

	public double getAssurance() {
		return assurance;
	}

	public void setAssurance(double assurance) {
		this.assurance = assurance;
	}

	public Devis getDevis() {
		return new Devis(this.devis);
	}

	public void setDevis(Devis devis) {
		this.devis = new Devis(this.devis);
	}
	
	public void addExemplaireToDevis(Exemplaire e) {
		this.devis.addExemplaireToEmprunteur(e);
	}
	
	public void removeExemplaireToDevis(Exemplaire e) {
		this.devis.removeExemplaireToEmprunteur(e);
	}

	public boolean getStatut() {
		return statut;
	}

	public void setStatut(boolean statut) {
		this.statut = statut;
	}

	public Facture getFacture() {
		return new Facture(this.facture);
	}

	private int numero;

    private Date dateDebut;

    private Date dateFin;
    
    private double assurance;
    
    private Devis devis;
    
    private Facture facture;
    
    private boolean statut;

}