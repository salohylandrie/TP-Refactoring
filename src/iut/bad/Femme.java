package iut.bad;

public class Femme extends Humain {

	
	
	    
	    
	    public Femme() {
	       
	        this.nom = "";
	        this.prenom = "";
	        this.age = 0;
	    }
	    
	    public Femme(String nom, String prenom, int age) {
	        this.nom = nom;
	        this.prenom = prenom;
	        this.age = age;
	    }
	    
	    public static void main(String[] args) {
	        Femme femme= new Femme();
	       femme.nom = "Rasoa";
	       femme.prenom = "Jeanne";
	        femme.age = 50;
	       femme.toString(); 
	    }
	    
	    @Override
	    public String toString() {
	        return "Homme: Nom: " + nom + ", Prénom: " + prenom + ", Âge: " + age;
	    }
}
