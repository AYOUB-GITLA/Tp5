package zoo.heritage.tp;

public class Oiseau extends Animal {
	private double envergure;

	/**
	 * @param nom
	 * @param age
	 * @param envergure
	 */
	public Oiseau(String nom, int age, double envergure) {
		super(nom, age);
		this.envergure = envergure;
	}

	public double getEnvergure() {
		return envergure;
	}

	public void setEnvergure(double envergure) {
		this.envergure = envergure;
	}
	public void voler() {
        System.out.println(nom + " vole avec une envergure de " + envergure + " mètres.");
    }
    
    @Override
    public void seDeplacer() {
        System.out.println(nom + " vole dans le ciel.");
    }
    
    @Override
    public String toString() {
        return "Oiseau [id=" + getId() + ", nom=" + nom + ", age=" + age + ", envergure=" + envergure + "m]";
    }
	

}
