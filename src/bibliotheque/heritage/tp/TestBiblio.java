package bibliotheque.heritage.tp;
import java.util.*;

public class TestBiblio {

	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);

        System.out.print("Capacité de la bibliothèque : ");
        int n = sc.nextInt();
        sc.nextLine();

        Bibliotheque bib = new Bibliotheque(n);

        bib.ajouter(new Roman("Les Misérables", "Victor Hugo", 800, 150.0));
        bib.ajouter(new Manuel("Mathématiques", "Jean Dupont", 350, "Terminale"));

        int choix;

        do {
      
            System.out.println("\n=== MENU ===");
            System.out.println("1 - Ajouter document");
            System.out.println("2 - Afficher documents");
            System.out.println("3 - Supprimer document");
            System.out.println("4 - Rechercher par numéro");
            System.out.println("5 - Afficher auteurs");
            System.out.println("0 - Quitter");
            System.out.print("Votre choix : ");
            choix = sc.nextInt();
            sc.nextLine();

            switch (choix) {

          
                case 1:
                    System.out.println("\nType de document :");
                    System.out.println("1 - Livre");
                    System.out.println("2 - Revue");
                    System.out.println("3 - Dictionnaire");
                    System.out.print("Votre choix : ");
                    int typeDoc = sc.nextInt();
                    sc.nextLine();

                    if (typeDoc == 1) {

                        System.out.println("\nType de Livre :");
                        System.out.println("1 - Roman");
                        System.out.println("2 - Manuel");
                        System.out.print("Votre choix : ");
                        int typeLivre = sc.nextInt();
                        sc.nextLine();

                        System.out.print("Titre : ");
                        String titre = sc.nextLine();

                        System.out.print("Auteur : ");
                        String auteur = sc.nextLine();

                        System.out.print("Nombre de pages : ");
                        int pages = sc.nextInt();
                        sc.nextLine();

                        if (typeLivre == 1) {
                            System.out.print("Prix : ");
                            double prix = sc.nextDouble();
                            sc.nextLine();

                            bib.ajouter(new Roman(titre, auteur, pages, prix));

                        } else {
                            System.out.print("Niveau : ");
                            String niveau = sc.nextLine();

                            bib.ajouter(new Manuel(titre, auteur, pages, niveau));
                        }
                    }

                    else if (typeDoc == 2) {

                        System.out.print("Titre : ");
                        String titre = sc.nextLine();

                        System.out.print("Mois : ");
                        String mois = sc.nextLine();

                        System.out.print("Année : ");
                        int annee = sc.nextInt();
                        sc.nextLine();

                        bib.ajouter(new Revue(titre, mois, annee));
                    }

                    else if (typeDoc == 3) {

                        System.out.print("Titre : ");
                        String titre = sc.nextLine();

                        System.out.print("Langue : ");
                        String langue = sc.nextLine();

                        bib.ajouter(new Dictionnaire(titre, langue));
                    }

                    break;

            
                case 2:
                    System.out.println("\n=== LISTE DES DOCUMENTS ===");
                    bib.afficherDocuments();
                    break;

                case 3:
                    System.out.print("Numéro d'enregistrement : ");
                    int numSupp = sc.nextInt();
                    sc.nextLine();

                    Document ds = bib.document(numSupp);

                    if (ds != null) bib.supprimer(ds);
                    else System.out.println("Document introuvable !");
                    break;

                case 4:
                    System.out.print("Numéro recherché : ");
                    int numRec = sc.nextInt();
                    sc.nextLine();

                    Document dr = bib.document(numRec);

                    if (dr != null) System.out.println(dr);
                    else System.out.println("Aucun document trouvé.");
                    break;

            
                case 5:
                    System.out.println("\n=== AUTEURS ===");
                    bib.afficherAuteurs();
                    break;

                case 0:
                    System.out.println("Au revoir !");
                    break;

                default:
                    System.out.println("Choix invalide !");
            }

        } while (choix != 0);

        sc.close();
	}

}
