import java.util.Date;

public class Analyste extends Salarie{
	
	private int nombredeplacementclient;

	public Analyste(int code, String nom, String prenom, String dateembauche, int nombredeplacementclient) {
		super(code, nom, prenom, dateembauche);
		this.nombredeplacementclient = nombredeplacementclient;
	}

	public int getNombredeplacementclient() {
		return nombredeplacementclient;
	}

	public void setNombredeplacementclient(int nombredeplacementclient) {
		this.nombredeplacementclient = nombredeplacementclient;
	}
	
	
}
