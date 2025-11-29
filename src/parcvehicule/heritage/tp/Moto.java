package parcvehicule.heritage.tp;

public class Moto extends Motorise{
	private double cylindree;

	public Moto(String modele, Moteur moteur, double niveauCarburant, double cylindree) {
	    super(modele, moteur, niveauCarburant, 0); 
	    this.cylindree = cylindree;
	}
	/**
	 * @param modele
	 * @param moteur
	 * @param niveauCarburant
	 * @param kmTotal
	 * @param cylindree
	 */
	public Moto(String modele, Moteur moteur, double niveauCarburant, double kmTotal, double cylindree) {
		super(modele, moteur, niveauCarburant, kmTotal);
		this.cylindree = cylindree;
	}
	public void faireWheelie() {
        System.out.println(modele + " fait un wheelie !");
    }
	@Override
	public String toString() {
		return "Moto [cylindree=" + cylindree + "]";
	}
	
}
