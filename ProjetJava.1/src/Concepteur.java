import java.util.Date;

public class Concepteur extends Salarie{
	private int nombreannéedev;

	public Concepteur(int code, String nom, String prenom, String dateembauche, int nombreannéedev) {
		super(code, nom, prenom, dateembauche);
		this.nombreannéedev = nombreannéedev;
	}

	public int getNombreannéedev() {
		return nombreannéedev;
	}

	public void setNombreannéedev(int nombreannéedev) {
		this.nombreannéedev = nombreannéedev;
	}
	@Override
    public String toString() {
        return "code : " + this.getCode() + " nom : " + this.getNom() + " prenom : " + this.getPrenom() + " Date d'embauche : " + this.getDateembauche() + " Année de développement : " + this.getNombreannéedev();
    }
}
