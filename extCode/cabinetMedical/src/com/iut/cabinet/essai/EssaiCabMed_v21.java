package com.iut.cabinet.essai;
import com.iut.cabinet.metier.Adresse;
import com.iut.cabinet.metier.Personne;
import com.iut.cabinet.metier.Professionnel;
import com.iut.cabinet.util.DateUtil;

public class EssaiCabMed_v21 {
	public static void main(String[] args) {
	
	//variables 
	Adresse uneAdresse, uneAdresse1;
	Professionnel paul, rose;
	
	//affichage de Paul
	
	System.out.println("--------------- Affichage du premier professionnel -----------");	
	uneAdresse = new Adresse("3","rue de Limoges",null,null,"87170","Isle",null); // Créer une instance de "Adresse" qui sera utilisée dans "Personne"
	paul = new Professionnel(1, "LEDOC", "Paul", DateUtil.toDate("10/07/1976", DateUtil.FRENCH_DEFAUT), true, "0555434343", "0612345678", "paul.ledoc@lesmedecins.fr", uneAdresse, null, Personne.getAge(DateUtil.toDate("10 Juillet 1976", DateUtil.FORMAT_ENTIER)), "871255358","généraliste" ); // Instanciation de la classe professionnel
	System.out.println(paul);
	
	//affichage de Rose
	
	System.out.println("--------------- Affichage du deuxième professionnel -----------");	
	uneAdresse1 = new Adresse("10","avenue de la gare",null, null,"87000","Limoges",null);				
	rose = new Professionnel(2, "CHILDREN", "Rose", DateUtil.toDate("16/02/1970", DateUtil.FRENCH_DEFAUT), false, "0555434343", "0687654321", "rose.children@lesmedecins.fr", uneAdresse1, null,  Personne.getAge(DateUtil.toDate("16 Février 1970", DateUtil.FORMAT_ENTIER)), "312444555", "pédiatrie");
	System.out.println(rose);

	}
}
