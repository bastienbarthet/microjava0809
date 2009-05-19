package mjc;

public class TDM extends TDS{

	protected int nbrMethodes;
	protected int taille;

	public TDM(){
		super();
		nbrMethodes = 0;
		this.taille = 0;
	}

	public TDM(TDM parente) {
		super(parente);
		nbrMethodes = 0;
		this.taille = 0; // pas pris en compte.

	}

	public void inserer(INFOMethode methode) {

		INFOMethode old_methode = (INFOMethode) super.chercherGlobalement(methode.nom);

		if (old_methode == null) {
			super.inserer(methode.getNom(), methode);

			this.nbrMethodes = this.nbrMethodes + 1;
			this.taille = this.taille + 1;
			
		} else {
			methode.setDeplacement(old_methode.getDeplacement());
			this.remove(old_methode.getDeplacement());
			this.put(methode.getNom(), methode);
		}

	}

	public int getNbrMethodes() {
		return this.nbrMethodes;
	}

	public int getTaille() {
		return this.taille;
	}


}
