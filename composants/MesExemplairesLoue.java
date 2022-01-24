package composants;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import java.util.Objects;

public class MesExemplairesLoue implements Iterable<Exemplaire>{

	public MesExemplairesLoue () {
		this.mesExemplaire = new ArrayList<>();
	}
	
	public void add(final Exemplaire e) {
		this.mesExemplaire.add(e);
	}
	
	public void remove(final Exemplaire e) {
		this.mesExemplaire.remove(e);
	}
	
	public boolean contains(final Exemplaire e) {
		return this.mesExemplaire.contains(e);
	}
	
	public int size() {
		return this.mesExemplaire.size();
	}
	
	@Override
	public int hashCode() {
		return Objects.hash(mesExemplaire);
	}

	@Override
	public boolean equals(Object obj) {
		if (this == obj)
			return true;
		if (obj == null)
			return false;
		if (getClass() != obj.getClass())
			return false;
		MesExemplairesLoue other = (MesExemplairesLoue) obj;
		
		return this.mesExemplaire.equals(other.mesExemplaire);
	}

	public boolean containsAll(final List<Exemplaire> e) {
		return this.mesExemplaire.contains(e);
	}
	
	public boolean isEmpty() {
		return this.mesExemplaire.isEmpty();
		}
	
	private List<Exemplaire> mesExemplaire;

	@Override
	public Iterator<Exemplaire> iterator() {
		return mesExemplaire.iterator();
	}

}
