package mjc;

public class TDC extends TDS {

	public TDC() {
		super();
	}

	public TDC(TDC man) {
		super(man);  //man = tdc parente
	}

	public void inserer(INFOClasse classe) {
		super.inserer(classe.getNom(), classe);
	}

	public int getTaille() {
		int taille = 0;

		for (INFO classe : this.values() ) {
			taille = taille + ((INFOVAR)classe).getType().getTaille();
		}
		return taille;

	}

}