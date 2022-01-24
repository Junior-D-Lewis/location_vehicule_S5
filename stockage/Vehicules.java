package stockage;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import composants.Vehicule;

public class Vehicules implements Iterable<Vehicule> {

	 public Vehicules() {
	    	this.vehicules = new ArrayList<Vehicule>();
	    }
	    
	    public void add(final Vehicule vehicule) {
			this.vehicules.add(vehicule);
		}

	    public Iterator<Vehicule> iterator() {
			return vehicules.iterator();
		}
	    
	    private List<Vehicule> vehicules;


}