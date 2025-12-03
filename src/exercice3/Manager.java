package exercice3;

public class Manager extends Personne{

	/**
	 * @param nom
	 * @param salaireBase
	 */
	public Manager(String nom, double salaireBase) {
		super(nom, salaireBase);
	}

	@Override
	public double calculerSalaire() {
		return salaireBase * 1.30 ;
	}
	

}
