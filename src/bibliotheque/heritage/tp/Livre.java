package bibliotheque.heritage.tp;

public class Livre extends Document {
	private String auteur;
    private int nbrPages;
	/**
	 * @param titre
	 * @param auteur
	 * @param nbrPages
	 */
	public Livre(String titre, String auteur, int nbrPages) {
		super(titre);
		this.auteur = auteur;
		this.nbrPages = nbrPages;
	}
	public String getAuteur() {
		return auteur;
	}
	public int getNbrPages() {
		return nbrPages;
	}
	public void setAuteur(String auteur) {
		this.auteur = auteur;
	}
	public void setNbrPages(int nbrPages) {
		this.nbrPages = nbrPages;
	}
	@Override
	public String toString() {
		return "Livre [auteur=" + auteur + ", nbrPages=" + nbrPages + "]";
	}
    

}
