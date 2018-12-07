import java.io.*;
import java.util.Scanner;
public class Personne1{
public static void main (String arg[]){
	System.out.println("Bienvenu dans mon application de gestion des extraits de casier judiciare");// instruction d'affichage
	char reponse;// declaration d'une variable de type char
	Personne pn = new Personne();// instanciation
	Scanner scc = new Scanner(System.in);// scanner scc pous les variables de type string
	Scanner sci = new Scanner(System.in);// scanner sci pour les varibles de type int
	System.out.println("Voulez-vous imprimé un extrait ? O/N ");
	reponse=scc.nextLine().charAt(0);
	while( reponse == 'O'){
		System.out.println("Donnez un nom");// instruction d'affichage
		pn.setNom(scc.nextLine());// on recupère le nom saisi
		System.out.println("Donnez un prenom");//instruction d'affichage
		pn.setPrenom(scc.nextLine());// on recupère le prenom saisi
		System.out.println("Donnez la date de naissance");// instruction d'affichage
		pn.setDateDeNaissance(sci.nextInt());// on recupère la date saisi
		System.out.println("Donnez le lieu de naissance");// instruction d'affichage
		pn.setLieuDeNaissance(scc.nextLine());// on recupère le lieu de naissance saisi
		System.out.println("Donnez la profession");// instruction d'affichage
		pn.setProfession(scc.nextLine());// àn recupère la profession saisi
		System.out.println("Donnez le sexe M/F");// instruction d'affichage
		pn.setSexe(scc.nextLine());// on recupère le sexe saisi
		System.out.println("Status matrimoniale");// instruction d'affichage
		pn.setStatusMatrimoniale(scc.nextLine());// on recupère le status matrimoniale saisi
	
	System.out.println("Voulez-vous verifier les informations? O/N ");
	reponse =scc.nextLine().charAt(0);
	}
	System.out.println("Nom : "+" "+pn.getNom());
	System.out.println("Prenom : "+" "+pn.getPrenom());
	System.out.println("Date de Naissance : "+" "+pn.getDateDeNaissance()); // INSTRUCTIONS D'AFFICHAGES
	System.out.println("Lieu de Naissance : "+" "+pn.getLieuDeNaissance());
	System.out.println("Profession : "+" "+pn.getProfession());
	System.out.println("Sexe : "+" "+pn.getSexe());
	System.out.println("Status Matrimoniale : "+" "+pn.getStatusMatrimoniale());
		
		System.out.println("Voulez-vous imprimé? 0/N");
		reponse=scc.nextLine().charAt(0);
		System.out.println("Merci à Bientot");
}
}