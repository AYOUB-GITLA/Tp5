package zoo.heritage.tp;

public class Zoo {
	private Animal[] animaux;
    private int nbAnimaux;
	/**
	 * @param animaux
	 * @param nbAnimaux
	 */
	public Zoo(Animal[] animaux, int nbAnimaux) {
		this.animaux = animaux;
		this.nbAnimaux = nbAnimaux;
	}
	
	/**
	 * 
	 */
	public Zoo() {
		this.animaux = new Animal[5];  // Exception in thread "main" java.lang.NullPointerException: Cannot read the array length because "this.animaux" is null
	    this.nbAnimaux = 0;
	}

	public Animal[] getAnimaux() {
		return animaux;
	}
	public int getNbAnimaux() {
		return nbAnimaux;
	}
	public void setAnimaux(Animal[] animaux) {
		this.animaux = animaux;
	}
	public void setNbAnimaux(int nbAnimaux) {
		this.nbAnimaux = nbAnimaux;
	}
	public void ajouterAnimal(Animal a) {
        if (nbAnimaux == animaux.length) {
            System.out.println("  Tableau plein ! Agrandissement de " + animaux.length + " à " + (animaux.length * 2) + " cases...");
            Animal[] tmp = new Animal[animaux.length * 2];
            System.arraycopy(animaux, 0, tmp, 0, animaux.length);
            animaux = tmp;
        }
        animaux[nbAnimaux++] = a;
        System.out.println("Cette Animal : " + a.getNom() + " est ajouté au zoo.");
    }
    
    public void afficherTous() {
        System.out.println("\n========== ANIMAUX DU ZOO ==========");
        System.out.println("Le zoo contient " + nbAnimaux + " animaux :");
        for (int i = 0; i < nbAnimaux; i++) {
            System.out.println("  " + (i+1) + ". " + animaux[i]);
        }
        System.out.println("====================================\n");
    }
	
}
