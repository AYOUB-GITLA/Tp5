package bibliotheque.heritage.tp;

public class Document {
	private static int cpt = 0; 
    private int numEnreg;
    private String titre;
	/**
	 * @param numEnreg
	 * @param titre
	 */
	public Document(String titre) {
		this.numEnreg = ++cpt;
		this.titre = titre;
	}
	public int getNumEnreg() {
		return numEnreg;
	}
	public String getTitre() {
		return titre;
	}
	public void setTitre(String titre) {
		this.titre = titre;
	}
	@Override
	public String toString() {
		return "Document [numEnreg=" + numEnreg + ", titre=" + titre + "]";
	}
	
    
}
