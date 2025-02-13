package navire;

public class Bateau {
	private String nom;
	private int taille;
	private Element[] elements;
	
	
	public Bateau(String nom, int taille) {
		this.nom = nom;
		this.taille = taille;
		elements = new Element[taille];
	}


}
