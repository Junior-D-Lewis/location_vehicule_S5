package composants;

import java.util.Objects;

import stockage.Vehicules;

public abstract class Vehicule implements Comparable<Vehicule>{

	protected Vehicule() {
	}

	public Vehicule(String marque, int categorie, Vehicules vehicules) {
		this.marque = marque;
		this.categorie = categorie;
		vehicules.add(this);
	}
	
	public Vehicule(String marque, int categorie) {
		this.marque = marque;
		this.categorie = categorie;
	}

	public Vehicule(final Vehicule vehicule, Vehicules vehicules) {
		if (vehicule instanceof Auto) {
			
		}else {
			if (vehicule instanceof Moto) {
				
			}else {
				this.marque = vehicule.getMarque();
				this.categorie = vehicule.getCategorie();
			}
		}
		vehicules.add(this);
		
	}
	
	public Vehicule(final Vehicule vehicule) {
		if (vehicule instanceof Auto) {
			
		}else {
			if (vehicule instanceof Moto) {
				
			}else {
				this.marque = vehicule.getMarque();
				this.categorie = vehicule.getCategorie();
			}
		}
		
	}
	
	public abstract String getProprieteSpeciale();

	public String getMarque() {
		return marque;
	}

	public void setMarque(String marque) {
		this.marque = marque;
	}

	public int getCategorie() {
		return categorie;
	}

	public void setCategorie(int categorie) {
		this.categorie = categorie;
	}

	@Override
	public int hashCode() {
		return Objects.hash(categorie, marque);
	}

	@Override
	public boolean equals(Object obj) {
		if (this == obj)
			return true;
		if (obj == null)
			return false;
		if (getClass() != obj.getClass())
			return false;
		Vehicule other = (Vehicule) obj;
		return categorie == other.categorie && marque == other.marque;
	}

	@Override
	public String toString() {
		String type = "";
		switch (this.categorie) {
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
		return "Vehicule [" + marque + ", Vehicule" + type + "]";
	}
	
	@Override
	public int compareTo (Vehicule vehicule){
		return this.getMarque().compareTo(vehicule.getMarque());
		}
 
	private String marque; 

	private int categorie;

}