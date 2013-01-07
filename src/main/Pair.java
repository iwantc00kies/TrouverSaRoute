package main;

/**
 * Classe generique permettant de stocker une paire d'objets
 */
public class Pair<X,Y> {

	protected X x;
	protected Y y;

	public Pair(X x, Y y) {
		this.x = x;
		this.y = y;
	}
	
	public void setX(X x) {
		this.x = x;
	}
	
	public void setY(Y y) {
		this.y = y;
	}
	
	public X getX() {
		return x;
	}
	
	public Y getY() {
		return y;
	}

	@Override
	public int hashCode() {
		return x.hashCode() ^ y.hashCode();
	}

	@Override
	public boolean equals(Object o) {
		if (o == null) return false;
		if (!(o instanceof Pair)) return false;
		@SuppressWarnings("rawtypes")
		Pair pairo = (Pair) o;
		return this.x.equals(pairo.getX()) &&
				this.y.equals(pairo.getY());
	}

}