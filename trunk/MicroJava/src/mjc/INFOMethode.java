package mjc;

import java.util.ArrayList;
import java.util.HashMap;

public class INFOMethode extends INFO {

	/**
	 * Chaîne de caractère indiquant le type de retour de cette méthode (et
	 * donc sa taille).
	 */
	protected TYPE retour;
	protected int deplacement ;
	protected String etiquette ;
	protected HashMap<String, TYPE> listeParam;

	/**
	 * TDV (Table des Variables) contenant les arguments de cette méthode.
	 */
	protected TDV tdv ;

	public INFOMethode (String nom, int deplacement, String etiquette) {
		super(nom) ;
		this.deplacement=deplacement;
		this.etiquette=etiquette;		
	}

	/**
	 * Retourne le nom du type de cet attribut.
	 * 
	 * @return Nom du type de cet attribut.
	 */
	public String getNomType ( ) {
		return this.nom ;
	}

	/**
	 * Retourne la TDV contenant les arguments de cette méthode.
	 * 
	 * @return TDV contenant les arguments de cette méthode.
	 */
	public TDV getTDV ( ) {

		return this.tdv ;

	}

	public void setDeplacement (int deplacement) {

		this.deplacement = deplacement ;

	}

	public int getDeplacement ( ) {

		return this.deplacement ;

	}

	public void setEtiquette (String etiquette) {

		this.etiquette = etiquette ;

	}

	public String getEtiquette ( ) {

		return this.etiquette ;

	}

	public HashMap<String, TYPE> getListeParam() {
		return listeParam;
	}

	public void ajouterParam(String ident, TYPE t) {
		this.listeParam.put(ident, t);
	}

	
	
	

}
