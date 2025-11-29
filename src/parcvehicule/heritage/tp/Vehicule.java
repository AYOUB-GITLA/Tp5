package parcvehicule.heritage.tp;

public class Vehicule {
	private static int compteur = 0;
    private final int id;
    protected String modele;
	/**
	 * @param modele
	 */
	public Vehicule(String modele) {
		this.id=++compteur;
		this.modele = modele;
	}
	@Override
	public String toString() {
		return "Vehicile [id=" + id + ", modele=" + modele + "]";
	}
    

}
