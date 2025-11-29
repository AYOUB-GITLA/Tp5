package compte.heritage.tp;

public class CompteEpargne extends Compte{
	
	private double tauxInteret;

	/**
	 * @param solde
	 * @param tauxInteret
	 */
	public CompteEpargne(double solde, double tauxInteret) {
		super(solde);
		this.tauxInteret = tauxInteret;
	}
    public void appliquerInterets() {
        double interets = solde * tauxInteret / 100.0;
        solde += interets;
        System.out.println("CompteEpargne #" + getNumero()
            + " : intérêts de " + interets);
    }

    @Override
    public void afficherDetails() {
        System.out.println("CompteEpargne #" + getNumero()
            + " — solde = " + solde
            + ", taux = " + tauxInteret + "%");
    }
	
}
