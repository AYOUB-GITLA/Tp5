package compte.heritage.tp;

public class Compte {
	private static int cpt = 0;
    private final int numero;
    protected double solde;
	/**
	 * @param solde
	 */
	public Compte(double solde) {
		this.numero=++cpt;
		this.solde = solde;
	}
	public int getNumero() {
		return numero;
	}
	public double getSolde() {
		return solde;
	}
	public void setSolde(double solde) {
		this.solde = solde;
	}
    public void deposer(double montant) {
        if (montant > 0) {
            solde += montant;
            System.out.println("Compte #" + numero + " : dépôt de " + montant);
        }
    }

    public void retirer(double montant) {
        if (montant > 0 && solde >= montant) {
            solde -= montant;
            System.out.println("Compte #" + numero + " : retrait de " + montant);
        } else {
            System.out.println("Compte #" + numero + " : retrait impossible (solde insuffisant)");
        }
    }

    public void afficherDetails() {
        System.out.println("Compte #" + numero + " — solde = " + solde);
    }
    

}
