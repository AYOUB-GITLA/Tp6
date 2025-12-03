package exercice1;

public class Forme {
	protected String couleur;

	/**
	 * @param couleur
	 */
	public Forme(String couleur) {
		super();
		this.couleur = couleur;
	}
	public void dessiner() {
        System.out.println("Dessiner une forme de couleur " + couleur);
    }

}
