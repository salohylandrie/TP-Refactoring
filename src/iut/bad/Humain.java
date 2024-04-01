package iut.bad;

public class Humain {
	 protected String nom;
	    protected String prenom;
	    protected int age;
	    
	    @Override
	    public String toString() {
	        return "Nom: " + nom + ", Prénom: " + prenom + ", Âge: " + age;
	    }
}
