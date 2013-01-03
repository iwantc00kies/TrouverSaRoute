package main;

import java.util.LinkedList;

/** algorithme de Djikstra de recherche du plus court chemin */
public class Djikstra {

	/** matrice des arcs orientes **/
	private double[][] arcsOrientes;


	public Djikstra(LinkedList<Arret> mesArrets, LinkedList<Ligne> mesLignes) {
		creerMatriceInitiale(mesArrets, mesLignes);
	}

	/** creer une matrice des des arcs orientés en vue d'appliquer l'algorithme de Djikstra**/
	// refaire en partant des arrets et remplir leurs voisins
	// verifier tests
	void creerMatriceInitiale(LinkedList<Arret> mesArrets, LinkedList<Ligne> mesLignes) {
		// considere future evolution du programme, sinon tableau triangulaire
		arcsOrientes = new double[mesArrets.size()][mesArrets.size()];
		Arret A, B;
		//boolean voisins = false;
		//String P, C;		

		// initialisation de la matrice
		for(int i=0; i<arcsOrientes.length; i++) {
			for(int j=0; j<arcsOrientes.length; j++) {
				if(i == j) {
					arcsOrientes[i][j]= 0;
				}
				else {
					arcsOrientes[i][j]= Double.POSITIVE_INFINITY;
				}
			}
		}

		for(int i=0; i<arcsOrientes.length; i++) {
			for(int j=0; j<arcsOrientes.length; j++) {
				// cherche si les deux arrets A et B sont voisins
				// suppose stations numerotees de 1 a n dans l'ordre dans la liste
				A=mesArrets.get(i);
				B=mesArrets.get(j);

				//ils sont directement relies si ils sont voisins sur une meme ligne
				for(String ligneA : A.lignes) {
					for(String ligneB : B.lignes) {
						if(ligneA.equals(ligneB)) {


							// ils ont une (des) ligne(s) en commun
							// on regarde si ils sont voisins sur cette ligne
							// recupere la ligne commune des arrets
							for(Ligne ligne : mesLignes){
								if (ligne.getNumero().equals(ligneA)) {


									String Precedant, Courant = null;
									for(Arret arret : ligne.getArrets()){
										Precedant = Courant;
										Courant = arret.getNom();
										if(Precedant!=null && Courant !=null ) {
											if ( (A.nom.equals(Precedant) && B.nom.equals(Courant)) ||
													(A.nom.equals(Courant) && B.nom.equals(Precedant)) ) {

												// pas de ponderation
												//arcsOrientes[i][j]=1.0d;
												// calcul distance entre A et B a l'aide de leurs coordonnees
												arcsOrientes[i][j]=A.distance(B);
											}
										}
									}



								}
							}
						}


					}
				}
			}		
		}
	}





	//retourne le plus court chemin d'un point a un autre
	public static LinkedList<Arret> ShortestPath(double[][] matInit) {
		return null;
	}




	public void afficheMatriceArcsOrientes(){
		afficheMatrice( arcsOrientes );
	}

	// affiche la matrice
	private void afficheMatrice( double[][] mat) {
		for(int i=0; i<mat.length; i++) {
			for(int j=0; j<mat.length; j++) {
				System.out.print(mat[i][j] + "  \t");
			}
			System.out.println();
		}
	}




}