package mjc;

public class INFOVAR extends INFO {
	
	//type
	private TYPE type;
	
	public TYPE getType() {
		return type;
	}

	public void setType(TYPE type) {
		this.type = type;
	}

	// le deplacement
	private int dep;

	// le registre de base de la variable
	private String reg;

	public int getDep() {
		return dep;
	}

	public String getReg() {
		return reg;
	}

	public INFOVAR(TYPE man, int d, String r) {
		super(man.getNom()); // clark kent ...
		this.type=man;
		dep = d;
		reg = r;
	}

	// affichage
	public String toString() {
		return "; VAR : " + "type=" + type + " dep = " + dep + " reg = " + reg;
	}

}
