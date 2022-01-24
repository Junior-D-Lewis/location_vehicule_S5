package composants;

import java.util.Objects;

public class Adresse {

    public Adresse() {
    }
    
    public Adresse(final Adresse adresse) {
    	this.numero = adresse.getNumero();
		this.rue = adresse.getRue();
		this.cp = adresse.getCp();
		this.ville = adresse.getVille();
    }

    public Adresse(int numero, String rue, int cp, String ville) {
		this.numero = numero;
		this.rue = rue;
		this.cp = cp;
		this.ville = ville;
	}
    

	@Override
	public int hashCode() {
		return Objects.hash(cp, numero, rue, ville);
	}

	@Override
	public boolean equals(Object obj) {
		if (this == obj)
			return true;
		if (obj == null)
			return false;
		if (getClass() != obj.getClass())
			return false;
		Adresse other = (Adresse) obj;
		return cp == other.cp && numero == other.numero && rue == other.rue && ville == other.ville;
	}

	@Override
	public String toString() {
		return "Adresse: [" + getNumero() + ": " + getRue() + "," + getCp() + " " + getVille() + "]" ;
	}

	public int getNumero() {
		return numero;
	}

	public void setNumero(int numero) {
		this.numero = numero;
	}

	public String getRue() {
		return rue;
	}

	public void setRue(String rue) {
		this.rue = rue;
	}

	public int getCp() {
		return cp;
	}

	public void setCp(int cp) {
		this.cp = cp;
	}

	public String getVille() {
		return ville;
	}

	public void setVille(String ville) {
		this.ville = ville;
	}

	private int numero;

    private String rue;

    private int cp;

    private String ville;


}