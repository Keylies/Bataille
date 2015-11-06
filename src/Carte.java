
public class Carte {

	public static String[] couleurs = {"Pique", "Carreau", "Coeur", "Trèfle"};
	public static String[] valeurs = {"2", "3", "4", "5", "6", "7", "8", "9", "10", "Valet", "Dame", "Roi", "As"};
	
	private String couleur;
	private int valeur;
	
	public Carte(String couleur, int valeur) {
		this.couleur = couleur;
		this.valeur = valeur;
	}

	public String getCouleur() {
		return couleur;
	}

	public int getValeur() {
		return valeur;
	}
	
	public int estSuperieure(Carte c2) {
		return (valeur == c2.getValeur() ? 0 : (valeur > c2.getValeur() ? 1 : -1));
	}
	
	public String toString() {
		return Carte.valeurs[valeur] + " de " + couleur;
	}
}
