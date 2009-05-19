package mjc;

import java.util.Vector;


public class INFOClasse extends INFO {
	

	/**
	 * Classe dont la cette classe hérite.
	 */
	protected INFOClasse parente ;
	
	/**
	 * TDA (Table des Attributs) contenant les attributs de cette classe.
	 */
	protected TDA tda ;
	
	/**
	 * TDM (Table des Methodes) contenant les méthodes de cette classe.
	 */
	protected TDM tdm ;
	
	protected int deplacement ;
	
	public INFOClasse (String nom, int deplacement) {
		
		super(nom) ;
		
		this.parente = null ;
		this.tda = new TDA() ;
		this.tdm = new TDM() ;
		
		this.deplacement = deplacement ;
		
	}
	
	public INFOClasse (String nom, int deplacement, INFOClasse parente) {
		
		super(nom) ;
		
		this.parente = parente ;
		
		// Recopie de la table des attributs de la classe parente.
		this.tda = new TDA() ;
		this.tda.nbrAttr = parente.tda.getNbrAttribut();
		this.tda.taille = parente.tda.getTaille() ;
		this.tda = (TDA) parente.tda.clone() ;
		
		// Recopie de la table des methodes de la classe parente.
		this.tdm = new TDM() ;
		this.tdm.nbrMethodes = parente.tdm.getNbrMethodes();
		this.tdm.taille = parente.tdm.getTaille();
		this.tdm = (TDM) parente.tdm.clone() ;
		
		this.deplacement = deplacement ;
		
	}
	
	/**
	 * Retourne la TDA contenant les attributs de cette classe.
	 * 
	 * @return TDA contenant les attributs de cette classe.
	 */
	public TDA getTDA ( ) {
		return this.tda ;
	}
	
	/**
	 * Retourne la TDM contenant les méthodes de cette classe.
	 * 
	 * @return TDM contenant les attributs de cette classe.
	 */
	public TDM getTDM ( ) {
		return this.tdm ;		
	}
	
	public int getDeplacement ( ) {
		return this.deplacement ;		
	}

	
}
