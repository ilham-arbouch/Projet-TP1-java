
public class Salarie {
	private int code;
	private String nom;
	private String prenom;
	private String dateembauche;
	
	public Salarie(int code, String nom, String prenom, String dateembauche) {
		super();
		this.code = code;
		this.nom = nom;
		this.prenom = prenom;
		this.dateembauche = dateembauche;
	}
	public int getCode() {
		return code;
	}
	public void setCode(int code) {
		this.code = code;
	}
	public String getNom() {
		return nom;
	}
	public void setNom(String nom) {
		this.nom = nom;
	}
	public String getPrenom() {
		return prenom;
	}
	public void setPrenom(String prenom) {
		this.prenom = prenom;
	}
	public String getDateembauche() {
		return dateembauche;
	}
	public void setDateembauche(String dateembauche) {
		this.dateembauche = dateembauche;
	}
	
	

}
