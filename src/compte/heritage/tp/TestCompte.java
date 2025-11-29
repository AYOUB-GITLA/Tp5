package compte.heritage.tp;

public class TestCompte {

	public static void main(String[] args) {
		// Initialisation des comptes bancaires
	    Compte compteSimple = new Compte(2500.0);
	    CompteEpargne epargne = new CompteEpargne(1500.0, 2.5);
	    CompteCourant courant = new CompteCourant(800.0, 500.0);

	    // Test du compte simple
	    System.out.println("=== Compte Simple ===");
	    compteSimple.afficherDetails();
	    compteSimple.deposer(500);
	    compteSimple.afficherDetails();
	    compteSimple.retirer(3500); 
	    compteSimple.retirer(1000);
	    compteSimple.afficherDetails();
	    System.out.println();

	    // Test du compte épargne
	    System.out.println("=== Compte Épargne ===");
	    epargne.afficherDetails();
	    epargne.deposer(300);
	    epargne.appliquerInterets();
	    epargne.afficherDetails();
	    epargne.retirer(200);
	    epargne.afficherDetails();
	    System.out.println();

	    // Test du compte courant avec découvert
	    System.out.println("=== Compte Courant ===");
	    courant.afficherDetails();
	    courant.deposer(150);
	    courant.afficherDetails();
	    courant.retirer(1100);  
	    courant.afficherDetails();
	    courant.retirer(500);  
	    courant.afficherDetails();
	    System.out.println();

	    System.out.println("=== Polymorphisme ===");
	    Compte monCompte = new CompteEpargne(750, 4.0);
	    monCompte.afficherDetails();
	    monCompte = new CompteCourant(600, 400);
	    monCompte.afficherDetails();
	}

}
