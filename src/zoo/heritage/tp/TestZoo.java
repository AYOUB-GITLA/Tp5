package zoo.heritage.tp;

public class TestZoo {

	public static void main(String[] args) {
	     // Création du zoo (capacité initiale: 5)
        Zoo monZoo = new Zoo();
        
        System.out.println("========== AJOUT DES ANIMAUX ==========\n");
        
        // Ajout de 6 animaux pour forcer l'agrandissement
        Mammifere lion = new Mammifere("Lion", 5, "Dorée");
        monZoo.ajouterAnimal(lion);
        
        Mammifere elephant = new Mammifere("Elephant", 10, "Gris");
        monZoo.ajouterAnimal(elephant);
        
        Oiseau aigle = new Oiseau("Aigle Royal", 3, 2.5);
        monZoo.ajouterAnimal(aigle);
        
        Oiseau perroquet = new Oiseau("Perroquet", 2, 0.5);
        monZoo.ajouterAnimal(perroquet);
        
        Reptile serpent = new Reptile("Python", 4, "Lisses");
        monZoo.ajouterAnimal(serpent);
        
        // 6ème animal : force l'agrandissement du tableau
        Reptile crocodile = new Reptile("Croco", 8, "Rugueuses");
        monZoo.ajouterAnimal(crocodile);
        
        Mammifere tigre = new Mammifere("Tigrou", 6, "Rayé orange et noire");
        monZoo.ajouterAnimal(tigre);
        
        monZoo.afficherTous();
        
        System.out.println("========== MÉTHODES SPÉCIFIQUES ==========\n");
        
        System.out.println("--- Mammifères ---");
        lion.seDeplacer();
        lion.allaiter();
        elephant.allaiter();
        System.out.println();
        
        System.out.println("--- Oiseaux ---");
        aigle.seDeplacer();
        aigle.voler();
        perroquet.voler();
        System.out.println();
        
        System.out.println("--- Reptiles ---");
        serpent.seDeplacer();
        serpent.seChauffer();
        crocodile.seChauffer();
        System.out.println();
        
        System.out.println("==========================================");
    }
	

}
