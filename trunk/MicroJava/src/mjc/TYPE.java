package mjc;

public class TYPE {

	protected String nom ;
	protected int taille ;
	
	
	
	public TYPE(String nom, int taille) {
		super();
		this.nom = nom;
		this.taille = taille;
	}
	
	public String getNom() {
		return nom;
	}
	public void setNom(String nom) {
		this.nom = nom;
	}
	public int getTaille() {
		return taille;
	}
	public void setTaille(int taille) {
		this.taille = taille;
	}
	
	public boolean compareTo(TYPE autre) {
		return nom.equals(autre.nom);
	}
	
	
}
