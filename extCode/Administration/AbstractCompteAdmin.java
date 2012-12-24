package Administration;

public abstract class AbstractCompteAdmin {

		  protected String id;   
		  protected String hashedPassword;
		  
		  
		  public abstract String getId();
		  public abstract void setId(String id);
		  
		  public abstract String getHashedPassword();
		  public abstract void setHashedPassword(String hashedPassword) ;
		  
		  public abstract boolean doTheyMatch(String id, String password); 
  
}
