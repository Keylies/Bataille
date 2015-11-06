import java.util.ArrayList;

public class Joueur {

	private ArrayList<Carte> cartes = new ArrayList<Carte>();
	private int points;
	private String nom;
	
	public Joueur(String nom) {
		setPoints(0);
		this.nom = nom;
	}
	
	public void tirerCarte(Carte carte) {
		cartes.add(carte);
	}
	
	public Carte getCartes(int index) {
		return cartes.get(index);
	}

	public int getPoints() {
		return points;
	}

	public void setPoints(int points) {
		this.points = points;
	}

	public String getNom() {
		return nom;
	}
}
