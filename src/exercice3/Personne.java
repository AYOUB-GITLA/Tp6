package exercice3;

public abstract class Personne {
	 protected final String nom;
	    protected final double salaireBase;
		/**
		 * @param nom
		 * @param salaireBase
		 */
		public Personne(String nom, double salaireBase) {
			super();
			this.nom = nom;
			this.salaireBase = salaireBase;
		}
		 public void affiche() {
		        System.out.printf(
		            "Je suis %s, salaire = %.2f%n",
		            nom, calculerSalaire()
		        );
		    }
		 public abstract double calculerSalaire();

}
