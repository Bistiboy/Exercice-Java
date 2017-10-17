//Package à importer afin d'utiliser l'objet File
import java.io.*;
import java.util.*;

public class ExerciceTrois {

	public static void main(String[] args) {
		
		// Déclaration et initalisation des tableau
		String  listeDesFichiers[];
		String 	listeDesExtentions[] = {".txt",".php",".html",".css",".py"} ;
		
		// Récupération du chemin du repertoire
		Scanner sc = new Scanner(System.in);
		System.out.println("Veuillez renseigner un répertoire : ");
		String monChemin = sc.nextLine() ;
		File f = new File(monChemin);
		listeDesFichiers = f.list();
		
		// Affichage et Récuperation de l'extention choisi parmis la listes
		System.out.println("Et choisir une extention parmis la liste :");
		for(int i = 0; i < listeDesExtentions.length; i++){
			System.out.println(" - " + listeDesExtentions[i]);
		}
		String monExt = sc.nextLine();
				
		// Si c'est un repertoire et si il existe
		if(f.isDirectory() && f.exists()){
			
			// On affiche chaque fichier en fonction de leur extention
			for(int i = 0; i < listeDesFichiers.length; i++){
				if(listeDesFichiers[i].endsWith(monExt)){
					System.out.println(listeDesFichiers[i]);
				}
			}		
			
		// Sinon on affiche les erreurs
		}else if(f.isFile() && f.exists()){
			
			System.out.println("Ce n'est pas un répertoire");
			
		}else{
			
			System.out.println("Ce répertoire n'existe pas !");
			
		}
		
		// Fermeture du scanner
		sc.close();
	}
}
