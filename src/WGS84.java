import java.math.RoundingMode;
import java.text.DecimalFormat;
import java.text.NumberFormat;


public class WGS84 {
	//TODO decimal ? String ?
	//http://stackoverflow.com/questions/433958/java-decimal-string-format

	protected String x;
	protected String y;
	//protected NumberFormat df;
	
	WGS84(){
	}

	@Override public String toString() {
		return "X : " + x + " Y : " + y; 
		
	}

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
