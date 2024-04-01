package iut.bad;

public class Homme extends Humain {

	
	    
	    public Homme() {
	    	 super("", "", 0);
	    }
	    
	    public Homme(String nom, String prenom, int age) {
	        super(nom, prenom, age); 
	    }
	    
	    
	    
	    public static void main(String[] args) {
	        Homme homme = new Homme("Rakoto", "John", 40); 
	        System.out.println(homme.toString());  
	    }
	    
	    @Override
	    public String toString() {
	        return "Homme: Nom: " + nom + ", Prénom: " + prenom + ", Âge: " + age;
	    }
}
