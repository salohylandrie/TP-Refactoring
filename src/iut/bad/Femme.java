package iut.bad;

public class Femme extends Humain {

	
	
	    
	    
	    public Femme() {
	       
	    	super("", "", 0);
	    }
	    
	    public Femme(String nom, String prenom, int age) {
	    	super(nom, prenom, age);
	    }
	    
	    public static void main(String[] args) {
	    	Femme femme = new Femme("Rasoa", "Jeanne", 50); 
	        System.out.println(femme.toString()); 
	    }
	    
	    @Override
	    public String toString() {
	        return "Homme: Nom: " + nom + ", Prénom: " + prenom + ", Âge: " + age;
	    }
}
