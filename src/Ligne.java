import java.util.LinkedList;


public class Ligne {

	private String numero;
	private String nom;
	private String type ;
	private LinkedList <Arret> arrets;


	Ligne(){
		arrets = new LinkedList<Arret>();
	}

	public void Afficher(){
		System.out.println("Numero : " + numero + " \t\tNom : " + nom + " \t\t Type : " + type );
		System.out.println("\t\t\tArrets:");
		for(Arret arret : arrets){
			System.out.println("\t\t\t  " + arret.getNom());
		}
	}

	public void ajoutArret(Arret arret){
		arrets.add(arret);
	}
	
	
	public String getNumero() {
		return numero;
	}

	public void setNumero(String champs) {
		this.numero = champs;
	}

	public String getNom() {
		return nom;
	}

	public void setNom(String nom) {
		this.nom = nom;
	}

	public String getType() {
		return type;
	}

	public void setType(String type) {
		//TODO? verifier types autorises (Bus)
		this.type = type;
	}

	public LinkedList<Arret> getArrets() {
		return arrets;
	}

	public void setArrets(LinkedList<Arret> arrets) {
		this.arrets = arrets;
	}
	
	
}
