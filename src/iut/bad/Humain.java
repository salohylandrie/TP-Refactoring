package iut.bad;
import java.util.ArrayList;
import java.util.List;

public class Humain implements Consommation{
	 protected String nom;
	    protected String prenom;
	    protected int age;
	    protected List<Humain> amis;
	    

	    
	    public Humain(String nom, String prenom, int age) {
	        this.nom = nom;
	        this.prenom = prenom;
	        this.age = age;
	        this.amis = new ArrayList<>();
	    }
	    
	    public void ami(Humain ami) {
	        if (ami != null && !amis.contains(ami)) {
	            amis.add(ami);
	            System.out.println(this.nom + " est maintenant ami avec " + ami.getNom());
	            ami.amiDe(this); 
	        }
	    }
	    
	    
	    
	    private void amiDe(Humain ami) {
	        if (ami != null && !amis.contains(ami)) {
	            amis.add(ami);
	            System.out.println(ami.getNom() + " est maintenant ami avec " + this.nom);
	        }
	    }
	    
	    public String getNom() {
	        return nom;
	    }
	    
	    public void manger() {
	        System.out.println("L'humain mange.");
	  }
	    
	    
	    public void boire() {
	        System.out.println("L'humain boit.");
	       
	    }
}
