import java.util.ArrayList;
import java.util.Collections;

public class Paquet {
	
	private ArrayList<Carte> paquet;

	public Paquet() {
		paquet = new ArrayList<Carte>();
		initPaquet();
	}

	private void initPaquet() {
		int i = 0;
		
		while ( i < 52 ) {
			for ( int j = 0; j < Carte.couleurs.length; j++ ) {
				for ( int k = 0; k < Carte.valeurs.length; k++ ) {
					paquet.add(new Carte(Carte.couleurs[j], k));
					i++;
				}
			}
		}
		
		Collections.shuffle(paquet);
	}
	
	public void affichPaquet() {
		for ( int i = 0; i < 52; i++ ) {
			System.out.println( paquet.get(i).toString() );
		}
	}
	
	public int size() {
		return paquet.size();
	}
	
	public Carte getCarte(int index) {
		return paquet.get(index);
	}
}
