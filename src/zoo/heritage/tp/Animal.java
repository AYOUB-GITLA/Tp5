package zoo.heritage.tp;

public class Animal {
	protected int id;
    protected String nom;
    protected int age;
    private static int cpt = 0;
	/**
	 * @param nom
	 * @param age
	 */
	public Animal(String nom, int age) {
		this.id = ++cpt;
		this.nom = nom;
		this.age = age;
	}
	public int getId() {
		return id;
	}
	public String getNom() {
		return nom;
	}
	public int getAge() {
		return age;
	}
	public void setId(int id) {
		this.id = id;
	}
	public void setNom(String nom) {
		this.nom = nom;
	}
	public void setAge(int age) {
		this.age = age;
	}
	public void seDeplacer() {
        System.out.println(nom + " se déplace.");
    }
	@Override
	public String toString() {
		return "Animal [id=" + id + ", nom=" + nom + ", age=" + age + "]";
	}
	
	    
	   
    
    

}
