package parcvehicule.heritage.tp;

public class Voiture extends Motorise{
	private int nbPortes;

	/**
	 * @param modele
	 * @param moteur
	 * @param niveauCarburant
	 * @param kmTotal
	 * @param nbPortes
	 */
	public Voiture(String modele, Moteur moteur, double niveauCarburant, double kmTotal, int nbPortes) {
		super(modele, moteur, niveauCarburant, kmTotal);
		this.nbPortes = nbPortes;
	}
	 public void klaxonner() {
	        System.out.println(modele + " klaxonne : « Pouet ! Pouet ! »");
	    }
	 @Override
	 public String toString() {
		return "Voiture [nbPortes=" + nbPortes + "]";
	 }
	 
}
