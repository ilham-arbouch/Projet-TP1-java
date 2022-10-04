import java.util.HashMap;
import java.util.Map;
import java.util.Map.Entry;
import java.util.Scanner;
import java.util.Set;
import java.util.TreeMap;
import javax.swing.text.html.HTMLDocument.Iterator;

public class Main {
	public static Map<Integer, Salarie> hmap = new HashMap<Integer, Salarie>();
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner console = new Scanner(System.in);
		int i = 0;
		
		while(i != 8) {
			System.out.println("Tapez : "); 
			System.out.println("1 pour ajouter un concepteur");
			System.out.println("2 pour supprimer un concepteur");
			System.out.println("3 pour lister tous les concepteurs");
			System.out.println("4 pour ajouter un analyste");
			System.out.println("5 pour supprimer un analyste");
			System.out.println("6 pour lister tous les concepteurs et les analystes");
			System.out.println("7 pour Afficher la liste des salariés trié");
			System.out.println("8 pour Quitter l'application");
			i  = console.nextInt();
			switch(i) {
				case 1 : //Ajouter un concepteur
					System.out.print("Le Code : "); 
					int code  = console.nextInt();
					System.out.print("Le Nom : "); 
					String name  = console.next();
					System.out.print("Le prénom : "); 
					String prenom  = console.next();
					System.out.print("La date d'embauche : "); 
					String date  = console.next();
					System.out.print("Nombre d'année de developpement : "); 
					int NbAnnéeDev  = console.nextInt();
					
					//Création du concepteur
					Concepteur Conc = new Concepteur(code,name, prenom, date, NbAnnéeDev);
					hmap.put(code, Conc);
	//				Concepteur cmap = hmap.get(code);
	//				System.out.println(cmap);
					break;
					
				case 2 : //Supprimer un concepteur
					System.out.print("Saisissez le Code : "); 
					int codeasupprimer  = console.nextInt();
					if (hmap.get(codeasupprimer) instanceof Concepteur) {
						if(hmap.containsKey(codeasupprimer) == false) {
							System.out.println("Salarié non trouvé dans la liste");
						}else {
							hmap.remove(codeasupprimer);
						}
					}
					break;
					
				case 3 : //Lister 
					for (Integer mapentry : hmap.keySet()) {
						Salarie s = hmap.get(mapentry);
						if (s instanceof Concepteur) {
							System.out.println("Code : "+s.getCode()
											+" | Nom : "+s.getNom()
											+" | Prenom : "+s.getPrenom()
											+" | Date : "+s.getDateembauche());
						}
					}
					break;
					
				case 4 : //Ajouter un analyste
					System.out.print("Le Code : "); 
					int codeAnalyste  = console.nextInt();
					System.out.print("Le Nom : "); 
					String nameAnalyste  = console.next();
					System.out.print("Le prénom : "); 
					String prenomAnalyste  = console.next();
					System.out.print("La date d'embauche : "); 
					String dateAnalyste  = console.next();
					System.out.print("Nombre de déplacement client : "); 
					int NbDeplacementClient  = console.nextInt();
					
					//Création du concepteur
					Analyste Ana = new Analyste(codeAnalyste,nameAnalyste, prenomAnalyste, dateAnalyste, NbDeplacementClient);
					hmap.put(codeAnalyste, Ana);
					break;
					
				case 5 : //Supprimer un analyste
					System.out.print("Saisissez le Code : "); 
					int codeanalysteasupprimer  = console.nextInt();
					if (hmap.get(codeanalysteasupprimer) instanceof Analyste) {
						if(hmap.containsKey(codeanalysteasupprimer) == false) {
							System.out.println("Salarié non trouvé dans la liste");
						}else {
							hmap.remove(codeanalysteasupprimer);
						}
					}
					
					break;
					
				case 6 : 
					for (Integer mapentry : hmap.keySet()) {
						Salarie s = hmap.get(mapentry);
						if (s instanceof Concepteur) {
							System.out.println("Code : "+s.getCode()
							+" | Nom : "+s.getNom()
							+" | Prenom : "+s.getPrenom()
							+" | Date : "+s.getDateembauche()+", Concepteur");
						}else {
							System.out.println("Code : "+s.getCode()
							+" | Nom : "+s.getNom()
							+" | Prenom : "+s.getPrenom()
							+" | Date : "+s.getDateembauche()+", Analyste");
						}
					}
					break;
				case 7 : 
					TreeMap<Integer, Salarie> map1 = new TreeMap<>(hmap);
			        for (Integer s : map1.keySet()) {
			        	Salarie s1 = hmap.get(s);
			        	System.out.println("Code : "+s1.getCode()
						+" | Nom : "+s1.getNom()
						+" | Prenom : "+s1.getPrenom()
						+" | Date : "+s1.getDateembauche());
			        }
					break;
			}
		}
	}
}
