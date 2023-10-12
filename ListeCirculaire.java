import java.util.ArrayList;
import java.util.List;

public class ListeCirculaire <T>{

	private List<T> elements;
	private int curseur;
	
	public ListeCirculaire() {
		this.elements = new ArrayList<>();
		this.curseur = 0;
	}
	
	public void ajouter(T element) {
		this.elements.add(element);
	}

	public T getPremier() throws ListeVide{
		if (this.elements.isEmpty()) {
			throw new ListeVide();
		}
		curseur = 0;
		return this.getElement(curseur);
	}
	
	public T getSuivant() throws ListeVide{
		if (this.elements.isEmpty()) {
			throw new ListeVide();
		}
		T valeur = this.elements.get(this.curseur);
		this.curseur = (this.curseur + 1) % this.elements.size(); // Incrémente le curseur en boucle
        return valeur;
	}
	
	public T getElement(int curseur) {
		return this.elements.get(curseur);
	}
	
}
