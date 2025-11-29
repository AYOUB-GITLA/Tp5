package zoo.heritage.tp;

public class Reptile extends Animal{
    private String typeEcailles;

	/**
	 * @param nom
	 * @param age
	 * @param typeEcailles
	 */
	public Reptile(String nom, int age, String typeEcailles) {
		super(nom, age);
		this.typeEcailles = typeEcailles;
	}

	public String getTypeEcailles() {
		return typeEcailles;
	}

	public void setTypeEcailles(String typeEcailles) {
		this.typeEcailles = typeEcailles;
	}
	 public void seChauffer() {
	        System.out.println(nom + " se chauffe au soleil.");
	    }
	    
	    @Override
	    public void seDeplacer() {
	        System.out.println(nom + " rampe sur le sol.");
	    }
	    
	    @Override
	    public String toString() {
	        return "Reptile [id=" + getId() + ", nom=" + nom + ", age=" + age + ", typeEcailles=" + typeEcailles + "]";
	    }
}
