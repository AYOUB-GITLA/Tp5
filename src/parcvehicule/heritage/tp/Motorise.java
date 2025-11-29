package parcvehicule.heritage.tp;

public class Motorise extends Vehicule{
	protected Moteur moteur;
    protected double niveauCarburant;
    protected double kmTotal = 0;
	/**
	 * @param modele
	 * @param moteur
	 * @param niveauCarburant
	 * @param kmTotal
	 */
	public Motorise(String modele, Moteur moteur, double niveauCarburant, double kmTotal) {
		super(modele);
		this.moteur = moteur;
		this.niveauCarburant = niveauCarburant;
		this.kmTotal = kmTotal;
	}
	
	  /**
	 * @param modele
	 */
	public Motorise(String modele) {
		super(modele);
	}

	  public void demarrer() {
	        System.out.println(toString() + " démarre avec " 
	            + niveauCarburant + " unités et moteur " + moteur);
	    }

	    public void rouler(double km) {
	        double conso = km * 0.1; 
	        if (niveauCarburant >= conso) {
	            niveauCarburant -= conso;
	            kmTotal += km;
	            System.out.println(modele + " a roulé " 
	                + km + " km, reste " + niveauCarburant + " unités");
	        } else {
	            System.out.println("Carburant insuffisant pour " 
	                + km + " km sur " + modele + " (reste : " 
	                + niveauCarburant + " unités)");
	        }
	    }

	    public void refuel(double quantite) {
	        niveauCarburant += quantite;
	        System.out.println(modele + " ravitaillé de " 
	            + quantite + " unités (nouveau niveau : " 
	            + niveauCarburant + ")");
	    }
		@Override
		public String toString() {
			return "Motorise [moteur=" + moteur + ", niveauCarburant=" + niveauCarburant + ", kmTotal=" + kmTotal + "]";
		}

}
