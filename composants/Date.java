package composants;

public class Date {

    protected Date() {
    }

    public Date(int jour, int mois, int annee) {
		this.jour = jour;
		this.mois = mois;
		this.annee = annee;
	}
    
    public Date(final Date d) {
    	try {
    		this.jour = d.getJour();
    		this.mois = d.getMois();
    		this.annee = d.getAnnee();
		} catch (Exception e) {
			// TODO: handle exception
		}
		
	}
    
    public Date calculDate(int duree) {
    	int jour =this.getJour() + duree; 
    	if(this.mois == 1 || this.mois == 3 || this.mois == 5 || this.mois == 7 || this.mois == 8 || this.mois == 10 || this.mois == 12 ) {
    		if(this.mois == 12) {
    			if(jour > 31) {
    				jour -= 31;
    				return new Date(jour, 1,  this.getAnnee()+1);
    			}else {
    				return new Date(jour, this.getMois(),  this.getAnnee());
    			}
    		}else {
    			if(jour > 31) {
    				jour -= 31;
    				return new Date(jour, this.getMois()+1, this.getAnnee()+1);
    			}else {
    				return new Date(jour, this.getMois(), this.annee);
    			}
    		}
    	}else {
    		if(this.mois == 2) {
    			if(jour > 28) {
    				jour -= 28;
    				return new Date(jour, this.getMois()+1, this.annee);
    			}else {
    				return new Date(jour, this.getMois(), this.annee);
    			}
    		}else {
    			if(jour > 30) {
    				jour -= 30;
    				return new Date(jour, this.getMois()+1, this.annee);
    			}else {
    				return new Date(jour, this.getMois(), this.annee);
    			}
			}
    	}
   
    }

	@Override
	public String toString() {
		return jour + "/" + mois + "/" + annee + " ";
	}

	public int getJour() {
		return this.jour;
	}

	public void setJour(int jour) {
		this.jour = jour;
	}

	public int getMois() {
		return this.mois;
	}

	public void setMois(int mois) {
		this.mois = mois;
	}

	public int getAnnee() {
		return this.annee;
	}

	public void setAnnee(int annee) {
		this.annee = annee;
	}

	private int jour;

    private int mois;

    private int annee;

}