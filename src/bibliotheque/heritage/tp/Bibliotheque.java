package bibliotheque.heritage.tp;

public class Bibliotheque {
	private Document[] docs;
	private int compteur = 0;

	/**
	 * 
	 */
	public Bibliotheque(int taille) {
		this.docs = new Document[taille];
	}

	public boolean ajouter(Document doc) {
		if (compteur >= docs.length) {
			System.out.println("Bibliothèque pleine !");
			return false;
		}
		docs[compteur] = doc;
		compteur++;
		System.out.println("Document ajouté !");
		return true;
	}

	public boolean supprimer(Document doc) {
		for (int i = 0; i < compteur; i++) {
			if (docs[i].equals(doc)) {

				for (int j = i; j < compteur - 1; j++) {
					docs[j] = docs[j + 1];
				}

				docs[compteur - 1] = null;
				compteur--;
				System.out.println("Document supprimé !");
				return true;
			}
		}
		System.out.println("Document introuvable !");
		return false;
	}

	public Document document(int numEnreg) {
		for (int i = 0; i < compteur; i++) {
			if (docs[i].getNumEnreg() == numEnreg) {
				return docs[i];
			}
		}
		return null;
	}

	public void afficherDocuments() {
		if (compteur == 0) {
			System.out.println("Aucun document !");
			return;
		}
		for (int i = 0; i < compteur; i++) {
			System.out.println(docs[i]);
		}
	}

	public void afficherAuteurs() {
		for (int i = 0; i < compteur; i++) {
			if (docs[i] instanceof Livre) {
				Livre l = (Livre) docs[i];
				System.out.println("- " + l.getAuteur());
			}
		}
	}

}
