import java.util.ArrayList;
import java.util.Collections;


public class Bataille {

	public static void main(String[] args) {
		
		Joueur j1 = new Joueur("J1");
		Joueur j2 = new Joueur("J2");

		ArrayList<Carte> paquet = initPaquet();
			
		for ( int i = 0; i < paquet.size(); i += 2 ) {
			j1.tirerCarte(paquet.get(i));
			j2.tirerCarte(paquet.get(i + 1));
		}
		
		for ( int i = 0; i < (paquet.size() / 2); i++ ) {
			
			System.out.println(j1.getNom() + " joue " + j1.getCartes(i).toString());
			System.out.println(j2.getNom() + " joue " + j2.getCartes(i).toString());
			
			if ( j1.getCartes(i).estSuperieure(j2.getCartes(i)) == 1 ) {
				j1.setPoints((j1.getPoints() + 1));
				System.out.println(j1.getNom() + " l'emporte !");
			}
			else if ( j1.getCartes(i).estSuperieure(j2.getCartes(i)) == -1 ) {
				j2.setPoints((j2.getPoints() + 1));
				System.out.println(j2.getNom() + " l'emporte !");
			}
			else
				System.out.println("Match nul");

			System.out.println(j1.getNom() + " : " + j1.getPoints() + " | " + j2.getNom() + " : " + j2.getPoints());
			System.out.println();
			
			if ( i == (paquet.size() / 2 - 1) ) {
				if ( j1.getPoints() > j2.getPoints() )
					System.out.println(j1.getNom() + " gagne la partie !");
				else if ( j1.getPoints() < j2.getPoints() )
					System.out.println(j2.getNom() + " gagne la partie !");
				else
					System.out.println("Match nul !");
			}

		}
	}
	
	public static ArrayList<Carte> initPaquet() {
		
		ArrayList<Carte> paquet = new ArrayList<Carte>();
		
		int i = 0;
		
		while ( i < 52) {
			for(int j = 0; j < Carte.couleurs.length; j++) {
				for(int k = 0; k < Carte.valeurs.length; k++) {
					paquet.add(new Carte(Carte.couleurs[j], k));
					i++;
				}
			}
		}
		
		Collections.shuffle(paquet);
		
		return paquet;
	}

}
