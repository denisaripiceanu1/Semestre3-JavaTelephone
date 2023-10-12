
public class ToucheTelephone {

	ListeCirculaire<Character> caracteres;
	
	public ToucheTelephone(String chaine) {
        if (chaine == null) {
            throw new IllegalArgumentException("La chaîne ne peut pas être null.");
        }

        this.caracteres = new ListeCirculaire<>();

        for (char c : chaine.toCharArray()) {
            this.caracteres.ajouter(c);
        }
		
		/* OU
		 * for(int i=0; i < chaine.length(); i++){
		 * this.caracteres.ajouter(chaine.charAt(i)); }
		 */
	}
	
	public char getCaractere(int nbAppuis) throws ListeVide {
		char c = this.caracteres.getPremier();
		for (int i = 1; i <= nbAppuis; i++) {
			c = this.caracteres.getSuivant();
		}
		return c;
	}
	
	/* OU
	 * public char getCaractere(int nbAppuis) throws ListeVide { 
	 * 		char resultat = ''; 
	 *		try { caracteres.getPremier(); // Positionne le curseur au début de la liste
	 *  		for (int i = 0; i < nbAppuis; i++) { resultat =
	 * 				caracteres.getSuivant(); 
	 * 			} 
	 * 		} catch (ListeVide e) {
	 * 			System.out.println("Erreur : Liste vide."); 
	 * 		} return resultat; 
	 * 		}
	 */
	
	
}
