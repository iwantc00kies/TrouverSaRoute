import java.util.LinkedList;


public class main {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		LinkedList<Ligne> mesLignes;
		
		mesLignes = csv.csvCreerLignes("/home/nha/Dropbox/ENSSAT/2A_LSI/JAVA TSR/lignes.csv");
		//mesLignes = csv.csvCreerLignes("/users/elo/nha/Documents/TSR/stations.csv");
		for(Ligne ligne : mesLignes){
			ligne.Afficher();
		}
		
		
		
		LinkedList<Arret> mesArrets;
		mesArrets = csv.csvCreerArrets("/home/nha/Dropbox/ENSSAT/2A_LSI/JAVA TSR/stations.csv");
		for(Arret arret : mesArrets){
			arret.Afficher();
		}

	}

}
