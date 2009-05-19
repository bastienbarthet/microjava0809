package mjc;

public class TDA extends TDS{

	protected int nbrAttr;
	protected int taille;

	public TDA() {

		super();

		this.nbrAttr = 0;
		this.taille = 2;

	}

	public TDA(TDA parente) {

		super(parente);
		this.nbrAttr = 0;
		this.taille = parente.getTaille();
	}

	public void inserer(INFOAttr attribut) {
		super.inserer(attribut.getNom(), attribut);
		this.nbrAttr = this.nbrAttr + 1;
		this.taille = this.taille + 1;
	}

	public int getNbrAttribut() {
		return this.nbrAttr;
	}

	public int getTaille() {
		return this.taille;
	}

}