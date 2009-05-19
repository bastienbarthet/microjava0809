package mjc;

public class INFOAttr extends INFO {

	/**
	 * Chaîne de caractère indiquant le type de cet attribut (et donc sa
	 * taille).
	 */
	protected TYPE type;
	protected int deplacement ;

	public INFOAttr (String nom, TYPE type, int deplacement) {

		super(nom) ;
		this.type = type ;
		//TODO this.taille = GenTAM.getTaille(nom_type) ;
		this.deplacement = deplacement ;

	}

	/**
	 * Retourne le nom du type de cet attribut.
	 * 
	 * @return Nom du type de cet attribut.
	 */
	public TYPE getType ( ) {

		return this.type ;

	}

	public int getTaille ( ) {

		return this.type.getTaille() ;

	}

	public int getDeplacement ( ) {

		return this.deplacement ;

	}

	public String toString ( ) {

		return this.toString("") ;

	}

	public String toString (String prefix) {

		return prefix + "INFO_ATTRIBUT:" + this.nom + "(type:" + this.type + "(" + this.type.getTaille() + "), deplacement:" + this.deplacement + ")" + "\n" ;

	}

}