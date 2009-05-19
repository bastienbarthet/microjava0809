package mjc;

public class TDV extends TDS {

	protected int nbVar;
	protected int taille;

	public TDV() {
		super();
		this.nbVar = 0;
		this.taille = 2; // enregistrement d'activation.

	}

	public TDV(TDV parente) {

		super(parente);
		this.nbVar = 0;
		this.taille = parente.getTaille();

	}

	public void inserer(INFOVAR variable) {

		super.inserer(variable.getNom(),variable);

		this.nbVar = this.nbVar + 1;
		this.taille = this.taille + 1;

	}

	public int getNbrVar() {
		return this.nbVar;
	}

	public int getTaille() {
		return this.taille;
	}


}
