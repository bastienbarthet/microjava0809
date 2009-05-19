package mjc;

import java.util.HashMap;

public class ListeParam {

	protected HashMap<String, TYPE> listeParam;
	
	public HashMap<String, TYPE> getListeParam() {
		return listeParam;
	}

	public void ajouterParam(String ident, TYPE t) {
		this.listeParam.put(ident, t);
	}

	public ListeParam() {
		listeParam = new HashMap<String, TYPE>();
	}
}
