package iut.bad;

public class Homme extends Humain {

	
	    
	    public Homme() {
	        // Initialise les champs avec des valeurs par défaut
	        this.nom = "";
	        this.prenom = "";
	        this.age = 0;
	    }
	    
	    public Homme(String nom, String prenom, int age) {
	        this.nom = nom;
	        this.prenom = prenom;
	        this.age = age;
	    }
	    
	    
	    public static void main(String[] args) {
	        Homme homme = new Homme();
	        homme.nom = "Rakoto";
	        homme.prenom = "John";
	        homme.age = 40;
	        homme.toString(); 
	    }
	    
	    @Override
	    public String toString() {
	        return "Homme: Nom: " + nom + ", Prénom: " + prenom + ", Âge: " + age;
	    }
}
