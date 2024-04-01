package iut.bad;

public class Humain implements Consommation{
	 protected String nom;
	    protected String prenom;
	    protected int age;
	  
	    

	    public void manger() {
	        System.out.println("L'humain mange.");
	  }
	    
	    
	    public void boire() {
	        System.out.println("L'humain boit.");
	       
	    }
}
