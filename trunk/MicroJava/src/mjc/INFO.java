//--------------------------------------------------
// INFO la classe representant une info de TDS
//--------------------------------------------------
package mjc;

public class INFO {
	// le type

	protected String nom ;
	
	public INFO (String nom) {
		
		this.nom = nom ;
		
	}
	
	
	public String getNom ( ) {
		
		return this.nom ;
		
	}
	
	public String toString ( ) {
		
		return this.toString("") ;
		
	}
	
	public String toString (String prefix) {
		
		return prefix + "INFO:" + this.nom + "\n" ;
		
	}
}
