package parcvehicule.heritage.tp;

public class Camion extends Motorise{
	private double capaciteCharge;

	/**
	 * @param modele
	 * @param moteur
	 * @param niveauCarburant
	 * @param kmTotal
	 * @param capaciteCharge
	 */
	public Camion(String modele, Moteur moteur, double niveauCarburant, double kmTotal, double capaciteCharge) {
		super(modele, moteur, niveauCarburant, kmTotal);
		this.capaciteCharge = capaciteCharge;
	}
	  public void charger(double poids) {
	        System.out.println(modele + " charge " 
	            + poids + " t (max " + capaciteCharge + " t)");
	    }
	  @Override
	  public String toString() {
		return "Camion [capaciteCharge=" + capaciteCharge + "]";
	  }
	  
}
