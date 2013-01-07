package main;

/**
 * Classe permettant de gérer les coordonnées GPS au format WGS84
 *
 */
public class WGS84 {

	protected String x;
	protected String y;
	
	WGS84(){
	}

	public double getDoubleX() {
		return Double.parseDouble(x);
	}
	
	public double getDoubleY() {
		return Double.parseDouble(y);
	}
	
	@Override public String toString() {
		return "X : " + x + " Y : " + y; 
		
	}

	/// getters and setters ///
	
	public String getX() {
		return x;
	}

	public void setX(String x) {
		this.x = x;
	}

	public String getY() {
		return y;
	}

	public void setY(String y) {
		this.y = y;
	}
 

	
}
