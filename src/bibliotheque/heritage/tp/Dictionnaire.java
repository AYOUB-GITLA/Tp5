package bibliotheque.heritage.tp;

public class Dictionnaire extends Document{
	private String langue;

	/**
	 * @param titre
	 * @param langue
	 */
	public Dictionnaire(String titre, String langue) {
		super(titre);
		this.langue = langue;
	}

	public String getLangue() {
		return langue;
	}

	public void setLangue(String langue) {
		this.langue = langue;
	}

	@Override
	public String toString() {
		return "Dictionnaire [langue=" + langue + "]";
	}
	

}
