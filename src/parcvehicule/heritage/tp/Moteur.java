package parcvehicule.heritage.tp;

public class Moteur {
	private String type;
    private int puissance;
	/**
	 * @param type
	 * @param puissance
	 */
	public Moteur(String type, int puissance) {
		super();
		this.type = type;
		this.puissance = puissance;
	}
	@Override
	public String toString() {
		return "Moteur [type=" + type + ", puissance=" + puissance + "]";
	}
    

}
