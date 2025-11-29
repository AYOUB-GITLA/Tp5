package zoo.heritage.tp;

public class Mammifere extends Animal{
	private String couleurFourrure;

	/**
	 * @param nom
	 * @param age
	 * @param couleurFourrure
	 */
	public Mammifere(String nom, int age, String couleurFourrure) {
		super(nom, age);
		this.couleurFourrure = couleurFourrure;
	}

	public String getCouleurFourrure() {
		return couleurFourrure;
	}

	public void setCouleurFourrure(String couleurFourrure) {
		this.couleurFourrure = couleurFourrure;
	}
	 public void allaiter() {
	        System.out.println(nom + " allaite ses petits.");
	    }
	    
	    @Override
	    public void seDeplacer() {
	        System.out.println(nom + " marche sur ses pattes.");
	    }
	    
	    @Override
	    public String toString() {
	        return "Mammifere [id=" + getId() + ", nom=" + nom + ", age=" + age + ", couleurFourrure=" + couleurFourrure + "]";
	    }

}
