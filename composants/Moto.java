package composants;

import stockage.Vehicules;

public class Moto extends Vehicule {

   
    public Moto() {
    }
    
    public Moto(String marque, int cylindre, Vehicules vehicules) {
    	super(marque, 1, vehicules);
    	this.cylindree = "" + cylindre;
    }
    
    public Moto(String marque, int cylindre) {
    	super(marque, 3);
    	this.cylindree = "" + cylindre ;
    }

    public String getCylindree() {
		return cylindree;
	}

	public void setCylindree(String cylindree) {
		this.cylindree = cylindree;
	}

	@Override
	public String toString() {
		return "Moto [ marque: " + super.getMarque() + " cylindree: " + cylindree + "]";
	}

	@Override
	public String getProprieteSpeciale() {
		return getCylindree();
	}
	
	private String cylindree;

}