package com.iut.cabinet.metier;
import java.sql.Date;
import java.util.Calendar;
import com.iut.cabinet.util.DateUtil;

public abstract class Personne {
	
	// attributs

	
	protected Integer idPersonne;
	protected String nom, prenom, telephone, portable, email;
	protected Date dateNaissance;
	protected boolean isMale = true;
	protected Adresse adresse;
	protected Personne unAscendant;
	public int getAge;
	public final int AGEMIN = 0; //variable permettant de contr�ler si l'�ge est trop petit (D�faut : 0 )
	public final int AGEMAX = 150; // variable permettant de controler si l'�ge est trop grand (d�faut : 150)

	
//////////////////////////////////////////////////////////////////////////
	
			///////////////////////////
			// 						 //
			// Getteurs et setteurs  //
			//						 //
			///////////////////////////
	
	
//////////////////////////// Num�ro //////////////////////////////////////
	
	/** Permet de retourner le num�ro sous forme de Integer
	 * @return the idPersonne
	 */
	public Integer getIdPersonne() {
		return idPersonne;
	}
	/** Mise � jour du num�ro
	 * @param idPersonne the idPersonne to set
	 */
	public void setIdPersonne(Integer idPersonne) {
		this.idPersonne = idPersonne;
	}
//////////////////////////// Nom //////////////////////////////////////

	/**Permet de retourner le nom sous forme de String
	 * @return the nom
	 */
	public String getNom() {
		return nom;
	}
	/** Mise � jour du nom
	 * @param nom the nom to set
	 */
	public void setNom(String nom) {
		this.nom = nom;
	}
	
//////////////////////////// Pr�nom //////////////////////////////////////

	/**Permet de retourner le pr�nom sous forme de <code>String</code>
	 * @return the prenom
	 */
	public String getPersonne() {
		return prenom;
	}
	/** Mise � jour du pr�nom
	 * @param prenom the prenom to set
	 */
	public void setPersonne(String prenom) {
		this.prenom = prenom;
	}
	
//////////////////////////// Telephone //////////////////////////////////////

	/** Permet de retourner le t�l�phone sous forme de <code>String</code>
	 * @return the telephone
	 */
	public String getTelephone() {
		return telephone;
	}
	/** Mise � jour du t�l�phone
	 * @param telephone the telephone to set
	 */
	public void setTelephone(String telephone) {
		this.telephone = telephone;
	}
	
//////////////////////////// Portable //////////////////////////////////////

	/** Permet de retourner le portable sous forme de <code>String</code>
	 * @return the portable
	 */
	public String getPortable() {
		return portable;
	}
	/** Mise � jour du portable
	 * @param portable the portable to set
	 */
	public void setPortable(String portable) {
		this.portable = portable;
	}
	
//////////////////////////// courriel //////////////////////////////////////

	/** Permet de retourner le m�l sous forme de <code>String</code>
	 * @return the email
	 */
	public String getEmail() {
		return email;
	}
	/** Mise � jour du courriel
	 * @param email the email to set
	 */
	public void setEmail(String email) {
		this.email = email;
	}
//////////////////////////// Date de naissance //////////////////////////////////////

	/** Permet de retourner la date de naissance sous forme de <code>Date</code>
	 * @return the dateNaissance
	 */
	public Date getDateNaissance() {
		return dateNaissance;
	}
	/** Mise � jour de la date de naissance
	 * @param dateNaissance the dateNaissance to set
	 */
	public void setDateNaissance(Date dateNaissance) {
		this.dateNaissance = dateNaissance;
	}
//////////////////////////// sexe //////////////////////////////////////

	/** Permet de retourner le sexe sous forme de <code>Bool�en</code>
	 * @return the isMale
	 */
	public boolean isMale() {
		return isMale;
	}
	/** Mise � jour du sexe
	 * @param isMale the isMale to set
	 */
	public void setMale(boolean isMale) {
		this.isMale = isMale;
	}
//////////////////////////// Adresse //////////////////////////////////////

	/** Permet de retourner l'adresse sous forme de <code>Adresse</code>
	 * @return the adresse
	 */
	public Adresse getAdresse() {
		return adresse;
	}
	/** Mise � jour del'adresse
	 * @param adresse the adresse to set
	 */
	public void setAdresse(Adresse adresse) {
		this.adresse = adresse;
	}
//////////////////////////// Ascendant //////////////////////////////////////

	/** Permet de retourner l'ascendant sous forme de <code>Ascendant</code>
	 * @return the unAscendant
	 */
	public Personne getUnAscendant() {
		return unAscendant;
	}
	
	/** Mise � jour de l'ascendant 
	 * @param unAscendant the unAscendant to set
	 */
	public void setUnAscendant(Personne unAscendant) {
		this.unAscendant = unAscendant;
	}
	
//////////////////////////// Age //////////////////////////////////////

	/** Permet de retourner l'�ge sous forme de <code>Int</code>
	 * @return the getAge
	 */
	public int getGetAge() {
		return getAge;
	}
	/** Mise � jour de l'age
	 * @param getAge the getAge to set
	 */
	public void setGetAge(int getAge) {
		this.getAge = getAge;
	}
	
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
	public Personne() {
		super();
	}
	
/////////////////// Constructeur � 12 param�tres (tous) ////////////
	/** Constructeur � 12 param�tres (tous)
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
	 */
	public Personne(Integer idPersonne, String nom, String prenom,
			Date dateNaissance, boolean isMale, String telephone,
			String portable, String email, Adresse adresse, Personne unAscendant, int getAge) {
		super();
		this.idPersonne = idPersonne;
		this.nom = nom;
		this.prenom = prenom;
		this.dateNaissance = dateNaissance;
		this.isMale = isMale;
		this.telephone = telephone;
		this.portable = portable;
		this.email = email;
		this.adresse = adresse;
		this.unAscendant = unAscendant;
		this.getAge = getAge;
	}
	

	
/////////////////// Constructeur � 6 param�tres ////////////
	/** Constructeur � 6 param�tres
	 * @param nom
	 * @param prenom
	 * @param dateNaissance
	 * @param isMale
	 * @param adresse
	 * @param unAscendant
	 */
	public Personne(String nom, String prenom, Date dateNaissance,
			boolean isMale, Adresse adresse, Personne unAscendant) {
		this (null, nom, prenom, dateNaissance, isMale, null, null, null, adresse, unAscendant, 0);
	}
/////////////////// Constructeur � 5 param�tres ////////////
	
	/** Constructeur � 5 param�tres
	 * @param nom
	 * @param prenom
	 * @param dateNaissance
	 * @param isMale
	 * @param adresse
	 */
	public Personne(String nom, String prenom, Date dateNaissance,
			boolean isMale, Adresse adresse) {
		this (null, nom, prenom, dateNaissance, isMale, null, null, null, adresse, null, 0);

	}
	


//////////////////////////////////////////////////////////////
	
	
				///////////////////////////
				// 						 //
				//       Hashcode        //
				//						 //
				///////////////////////////
	
	/* (non-Javadoc)
	 * @see java.lang.Object#hashCode()
	 */
	@Override
	public int hashCode() {
		final int prime = 31;
		int result = 1;
		result = prime * result + ((adresse == null) ? 0 : adresse.hashCode());
		result = prime * result
				+ ((dateNaissance == null) ? 0 : dateNaissance.hashCode());
		result = prime * result + ((email == null) ? 0 : email.hashCode());
		result = prime * result + getAge;
		result = prime * result
				+ ((idPersonne == null) ? 0 : idPersonne.hashCode());
		result = prime * result + (isMale ? 1231 : 1237);
		result = prime * result + ((nom == null) ? 0 : nom.hashCode());
		result = prime * result
				+ ((portable == null) ? 0 : portable.hashCode());
		result = prime * result + ((prenom == null) ? 0 : prenom.hashCode());
		result = prime * result
				+ ((telephone == null) ? 0 : telephone.hashCode());
		result = prime * result
				+ ((unAscendant == null) ? 0 : unAscendant.hashCode());
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
		if (obj == null)
			return false;
		if (getClass() != obj.getClass())
			return false;
		Personne other = (Personne) obj;
		if (adresse == null) {
			if (other.adresse != null)
				return false;
		} else if (!adresse.equals(other.adresse))
			return false;
		if (dateNaissance == null) {
			if (other.dateNaissance != null)
				return false;
		} else if (!dateNaissance.equals(other.dateNaissance))
			return false;
		if (email == null) {
			if (other.email != null)
				return false;
		} else if (!email.equals(other.email))
			return false;
		if (getAge != other.getAge)
			return false;
		if (idPersonne == null) {
			if (other.idPersonne != null)
				return false;
		} else if (!idPersonne.equals(other.idPersonne))
			return false;
		if (isMale != other.isMale)
			return false;
		if (nom == null) {
			if (other.nom != null)
				return false;
		} else if (!nom.equals(other.nom))
			return false;
		if (portable == null) {
			if (other.portable != null)
				return false;
		} else if (!portable.equals(other.portable))
			return false;
		if (prenom == null) {
			if (other.prenom != null)
				return false;
		} else if (!prenom.equals(other.prenom))
			return false;
		if (telephone == null) {
			if (other.telephone != null)
				return false;
		} else if (!telephone.equals(other.telephone))
			return false;
		if (unAscendant == null) {
			if (other.unAscendant != null)
				return false;
		} else if (!unAscendant.equals(other.unAscendant))
			return false;
		return true;
	}


////////////////////////////////////////////////////////////////////
	
	
				///////////////////////////
				// 						 //
				//      toString         //
				//						 //
				///////////////////////////
	
	/** retourne un string qui contient les carat�riqtiques de cette <code> Personne </code>
	 * @see java.lang.Object#equals(java.lang.Object)
	 */
	public String toString() {
		super.toString();
		StringBuilder stringBuilder = new StringBuilder();
		stringBuilder.append("\nNum�ro : ");
		stringBuilder.append(idPersonne);
		stringBuilder.append("");
		stringBuilder.append("\nNom : ");
		stringBuilder.append(nom);
		stringBuilder.append("\nPrenom : ");
		stringBuilder.append(prenom);
		stringBuilder.append("\nDateNaissance : ");
		stringBuilder.append(DateUtil.toString(dateNaissance));
		stringBuilder.append("\nMasculin : ");
		stringBuilder.append(isMale);
		stringBuilder.append("\nTelephone : ");
		stringBuilder.append(telephone);
		stringBuilder.append("\nPortable : ");
		stringBuilder.append(portable);
		stringBuilder.append("\nEmail : ");
		stringBuilder.append(email);
		stringBuilder.append("\nAdresse : ");
		stringBuilder.append(adresse);
		stringBuilder.append("\nAge : ");
		if (getAge < AGEMIN ) { //Si l'�ge est trop petit...
			stringBuilder.append("Erreur, l'�ge est inf�rieur � 0 ! ");
		}
		else {
			if (getAge > AGEMAX){ //Si l'�ge est trop grand ...
				stringBuilder.append("Erreur, l'�ge est trop grand ! ");
			}
			else {
				stringBuilder.append(getAge); 
			}
		}
		stringBuilder.append("\nAscendant : ");
		if (unAscendant == null){
			stringBuilder.append("NON");
		}
		else {
			stringBuilder.append(unAscendant);
		}
		return  stringBuilder.toString();						
	}
////////////////////////////////////////////////////////////////////
	
					///////////////////////////
					// 						 //
					//    	  getAge	     //
					//						 //
					///////////////////////////

	/** Fonction permettant de retourner l'�ge d'une personne
	 * @param JourAnniversaire
	 */
	public static int getAge(java.util.Date JourAnniversaire)
	{
	  Calendar dateActuelle = Calendar.getInstance(); //On obtient une instance de la date actuelle
	  Calendar anniv = Calendar.getInstance(); //On obtient une instance de la date de l'anniversaire
	  anniv.setTime(JourAnniversaire); //On d�finit la date du calendrier � "Jour Anniversaire"
	  int diffAnnee = dateActuelle.get(Calendar.YEAR) - anniv.get(Calendar.YEAR); //On calcule la diff�rence d'ann�e
	  dateActuelle.add(Calendar.YEAR,-diffAnnee); // On "ajoute" � la date actuelle le r�sultat de la diff�rence
	  if(anniv.after(dateActuelle)) //Pour les mois ! 
	  {
	    diffAnnee = diffAnnee - 1;
	  }
	  return diffAnnee;
	}
}	
	

