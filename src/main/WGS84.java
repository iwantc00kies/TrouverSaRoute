package main;

/**
 * Classe permettant de gérer les coordonnées GPS au format WGS84
 *
 */
public class WGS84 {

	
	/** utilisation d'un objet Pair permettant de stocker des objets arbitraires a l'aide de la genericite **/
	protected Pair<String, String> p;

	WGS84(){
		p = new Pair<String, String>(new String(), new String());
	}

	public String getX() {
		return p.getX();
	}

	public void setX(String x) {
		this.p.setX(x);
	}

	public String getY() {
		return p.getY();
	}

	public void setY(String y) {
		this.p.setY(y);
	}
	
	@Override
	public String toString() {
		return "X : " + getX() + " Y : " + getY();
	}
}
