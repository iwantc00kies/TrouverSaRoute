package com.iut.cabinet.essai;
import com.iut.cabinet.metier.Adresse;
import com.iut.cabinet.metier.Patient;
import com.iut.cabinet.metier.Personne;
import com.iut.cabinet.util.DateUtil;

public class EssaiCabMed_v2 {
	public static void main(String[] args) {		
			
			Adresse uneAdresse, uneAdresse1;
			Patient julie, toto;
			
			System.out.println("--------------- Affichage de la première personne-----------");
			uneAdresse = new Adresse("15","Avenue jean jaures",null,null,"87000","Limoges","France"); // Créer une instance de "Adresse" qui sera utilisée dans "Personne"
			julie = new Patient(1, "DUPONT", "Julie", DateUtil.toDate("21/05/1960", DateUtil.FRENCH_DEFAUT), false, "0555454530", "0606060606", "dupond.julie@tralala.fr", uneAdresse, null, Personne.getAge(DateUtil.toDate("21 Mai 1960", DateUtil.FORMAT_ENTIER)), "260058700112367","LEDOC Paul" ); // Instanciation de la classe "personne"
			System.out.println(julie); // Affichage de la première personne
			
			System.out.println("\n--------------- Affichage de la deuxième personne-----------");
			uneAdresse1 = new Adresse("185","avenue Albert Thomas",null,"Residence La Borie","87065","Limoges","France");						
			toto = new Patient(2, "DUPONT", "Toto", DateUtil.toDate("25/12/1991", DateUtil.FRENCH_DEFAUT), true, "0555434355", "0605040302", "toto.dupont@etu.unilim.fr", uneAdresse1, julie, Personne.getAge(DateUtil.toDate("25 Décembre 1991", DateUtil.FORMAT_ENTIER)), "260058700112367", "LEDOC Paul");
			System.out.println(toto); //Affichage de la deuxième personne

	}

}
