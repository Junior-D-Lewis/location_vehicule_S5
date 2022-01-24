package stockage;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import composants.Exemplaire;

public class Flotte implements Iterable<Exemplaire>{

    public Flotte() {
    	this.exemplaires = new ArrayList<Exemplaire>();
    }
    
    public void add(final Exemplaire exemplaire) {
		this.exemplaires.add(exemplaire);
	}
    
    @Override
	public String toString() {
StringBuilder resultat = new StringBuilder("Exemplaire en cours de location \n ------\n");
		
		if(!this.exemplaires.isEmpty()) {
			for (Exemplaire e : this.exemplaires) {
				resultat.append(e +"\n");
			}
			resultat.append("------");
		}else {
			resultat.append(" Panier vide \n------");
		}
		return ""+resultat;
	}

	public Iterator<Exemplaire> iterator() {
		return exemplaires.iterator();
	}
    
    private List<Exemplaire> exemplaires;

}