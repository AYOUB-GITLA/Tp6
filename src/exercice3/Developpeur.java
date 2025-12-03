package exercice3;

public class Developpeur extends Personne {

	/**
	 * @param nom
	 * @param salaireBase
	 */
	public Developpeur(String nom, double salaireBase) {
		super(nom, salaireBase);
	}

	@Override
	public double calculerSalaire() {
		return salaireBase*1.10 ;
	}
	

}
