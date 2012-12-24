package com.iut.cabinet.metier;
import java.sql.Date;


//On cr�e la classe fille Patient

public class Patient extends Personne {
	private String nir;
	private String medecinTraitant;
	
//////////////////////////////////////////////////////////////////////////

	
	///////////////////////////
	// 						 //
	//     Constructeurs     //
	//						 //
	///////////////////////////

/////////////////// Constructeur par d�faut ////////////	
	
	/** Constructeur par d�faut
	 * 
	 */
	public Patient() {
		super();
	}

/////////////////// Constructeurs avec tous les param�tres. ////////////		

	
	/** Constructeurs avec tous les param�tres.
	 * @param idPersonne
	 * @param nom
	 * @param prenom
	 * @param dateNaissance
	 * @param isMale
	 * @param telephone
	 * @param portable
	 * @param email
	 * @param adresse
	 * @param unAscendant
	 * @param getAge
	 * @param nir
	 * @param medecinTraitant
	 */
	public Patient(Integer idPersonne, String nom, String prenom,
			Date dateNaissance, boolean isMale, String telephone,
			String portable, String email, Adresse adresse,
			Personne unAscendant, int getAge, String nir, String medecinTraitant) {
		super(idPersonne, nom, prenom, dateNaissance, isMale, telephone,
				portable, email, adresse, unAscendant, getAge);
		this.nir = nir;
		this.medecinTraitant = medecinTraitant;
	}
	

/////////////////// Constructeurs avec 7 param�tres (avec l'ascendant) ////////////	
	/** Constructeurs avec 7 param�tres (avec l'ascendant)
	 * @param nom
	 * @param prenom
	 * @param dateNaissance
	 * @param isMale
	 * @param adresse
	 * @param unAscendant
	 * @param nir
	 */
	public Patient (String nom, String prenom, Date dateNaissance, boolean isMale, Adresse adresse, Personne ascendant, String nir) {
		this (null, nom, prenom, dateNaissance, isMale, null, null, null, adresse, ascendant , 0 , nir, null);		
	}

/////////////////// Constructeurs avec 6 param�tres (sans l'ascendant) ////////////	
	
	/** Constructeurs avec 6 param�tres (sans l'ascendant)
	 * @param nom
	 * @param prenom
	 * @param dateNaissance
	 * @param isMale
	 * @param adresse
	 * @param nir
	 */
	public Patient (String nom, String prenom, Date dateNaissance, boolean isMale, Adresse adresse, String nir) {
		this (null, nom, prenom, dateNaissance, isMale, null, null, null, adresse, null , 0 , nir, null);		
	}
	
	
//////////////////////////////////////////////////////////////////////////
					
					///////////////////////////
					// 						 //
					// Getteurs et setteurs  //
					//						 //
					///////////////////////////


////////////////////////////Num�ro de s�curit� sociale //////////////////////////////////////	
	

	/** Permet de retourner le num�ro de s�curit� sociale sous forme de <code>String</code>
	 * @return the nir
	 */
	public String getNir() {
		return nir;
	}

	/** Mise � jour du num�ro de s�curit� sociale
	 * @param nir the nir to set
	 */
	public void setNir(String nir) {
		this.nir = nir;
	}
	
//////////////////////////// M�decin traitant //////////////////////////////////////	


	/** Permet de retourner le medecin traitant sous forme de <code>String</code>
	 * @return the medecinTraitant
	 */
	public String getMedecinTraitant() {
		return medecinTraitant;
	}

	/** Mise � jour du num�ro du m�decin traitant
	 * @param medecinTraitant the medecinTraitant to set
	 */
	public void setMedecinTraitant(String medecinTraitant) {
		this.medecinTraitant = medecinTraitant;
	}
	
	
	

////////////////////////////////////////////////////////////////////
	
	
		///////////////////////////
		// 						 //
		//        HashCode       //
		//						 //
		///////////////////////////

	/* (non-Javadoc)
	* @see java.lang.Object#hashCode()
	*/
	@Override
	public int hashCode() {
		final int prime = 31;
		int result = super.hashCode();
		result = prime * result
				+ ((medecinTraitant == null) ? 0 : medecinTraitant.hashCode());
		result = prime * result + ((nir == null) ? 0 : nir.hashCode());
		return result;
	}

////////////////////////////////////////////////////////////////////
	
	
		///////////////////////////
		// 						 //
		//        equals         //
		//						 //
		///////////////////////////
	
	/* (non-Javadoc)
	* @see java.lang.Object#equals(java.lang.Object)
	*/
	@Override
	public boolean equals(Object obj) {
		if (this == obj)
			return true;
		if (!super.equals(obj))
			return false;
		if (getClass() != obj.getClass())
			return false;
		Patient other = (Patient) obj;
		if (medecinTraitant == null) {
			if (other.medecinTraitant != null)
				return false;
		} else if (!medecinTraitant.equals(other.medecinTraitant))
			return false;
		if (nir == null) {
			if (other.nir != null)
				return false;
		} else if (!nir.equals(other.nir))
			return false;
		return true;
	}
////////////////////////////////////////////////////////////////////
	
	
	///////////////////////////
	// 						 //
	//      toString         //
	//						 //
	///////////////////////////

/** retourne un string qui contient les carat�riqtiques de cet <code> Patient </code>
* @see java.lang.Object#equals(java.lang.Object)
*/
	public String toString(){
		StringBuilder stringBuilder = new StringBuilder();
		stringBuilder.append(super.toString());
		stringBuilder.append("\n");
		stringBuilder.append("nir : ");
		stringBuilder.append(nir);
		stringBuilder.append("\n");
		stringBuilder.append("M�decin traitant : ");
		stringBuilder.append(medecinTraitant);
		return stringBuilder.toString() ;
	}

///////////////////////Fin de la classe Patient /////////////////// 	
}