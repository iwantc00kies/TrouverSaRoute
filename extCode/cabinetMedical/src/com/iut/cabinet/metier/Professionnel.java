package com.iut.cabinet.metier;

import java.sql.Date;

public class Professionnel extends Personne {
		private String immatriculation;
		private String specialite;
		
		
//////////////////////////// Immatriculation //////////////////////////////////////	
		/** Permet de retourner l'immatriculation sous forme de <code>String</code>.
		 * @return the immatriculation
		 */
		public String getImmatriculation() {
			return immatriculation;
		}
		/** Mise à jour de l'immatriculation
		 * @param immatriculation the immatriculation to set
		 */
		public void setImmatriculation(String immatriculation) {
			this.immatriculation = immatriculation;
		}
//////////////////////////// Spécialité //////////////////////////////////////
		/**Permet de retourner la spécialité sous forme de <code>String</code>.
		 * @return the specialite
		 */
		public String getSpecialite() {
			return specialite;
		}
		/** Mise à jour de la spécialité.
		 * @param specialite the specialite to set
		 */
		public void setSpecialite(String specialite) {
			this.specialite = specialite;
		}
		
//////////////////////////////////////////////////////////////////////////

		
		///////////////////////////
		// 						 //
		//     Constructeurs     //
		//						 //
		///////////////////////////

/////////////////// Constructeur par défaut ////////////	
		/** Constructeur par défaut
		 * 
		 */
		public Professionnel() {
			super();
		}

/////////////////// Constructeur avec tout les paramêtres ////////////		
		/** Constructeur avec tout les paramêtres 
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
		 * @param immatriculation
		 * @param specialite
		 */
		public Professionnel(Integer idPersonne, String nom, String prenom,
				Date dateNaissance, boolean isMale, String telephone,
				String portable, String email, Adresse adresse,
				Personne unAscendant, int getAge, String immatriculation,
				String specialite) {
			super(idPersonne, nom, prenom, dateNaissance, isMale, telephone,
					portable, email, adresse, unAscendant, getAge);
			this.immatriculation = immatriculation;
			this.specialite = specialite;
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
			result = prime
					* result
					+ ((immatriculation == null) ? 0 : immatriculation
							.hashCode());
			result = prime * result
					+ ((specialite == null) ? 0 : specialite.hashCode());
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
			Professionnel other = (Professionnel) obj;
			if (immatriculation == null) {
				if (other.immatriculation != null)
					return false;
			} else if (!immatriculation.equals(other.immatriculation))
				return false;
			if (specialite == null) {
				if (other.specialite != null)
					return false;
			} else if (!specialite.equals(other.specialite))
				return false;
			return true;
		}
////////////////////////////////////////////////////////////////////
		
		
		///////////////////////////
		// 						 //
		//      toString         //
		//						 //
		///////////////////////////

	/** retourne un string qui contient les caratériqtiques de ce <code> Professionnel </code>
	* @see java.lang.Object#equals(java.lang.Object)
	*/
		@Override
		public String toString() {
			StringBuilder stringBuilder = new StringBuilder();
			stringBuilder.append(super.toString());
			stringBuilder.append("\nimmatriculation : ");
			stringBuilder.append(immatriculation);
			stringBuilder.append("\nspecialite : ");
			stringBuilder.append(specialite);
			return stringBuilder.toString();
		}
		
}
