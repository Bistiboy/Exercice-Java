//Package à importer afin d'utiliser l'objet File
import java.io.*;
import java.util.*;

public class ExerciceDeux {

	public static void main(String[] args) {
		
		// Déclaration du scanner
		Scanner sc = new Scanner(System.in);
		
		// Récupération du chemin du répertoire
		System.out.println("Veuillez renseigner un répertoire : ");
		String monChemin = sc.nextLine() ;
		File f = new File(monChemin);
		
		// Initialisation du tableau qui va lister les fichier
		String [] listeDesFichiers;		
		listeDesFichiers = f.list();
		
		// Si c'est un repertoire et si il existe, on affiche la liste des fichier qu'il contient.
		if(f.isDirectory() && f.exists()){
			
			for(int i = 0; i < listeDesFichiers.length ;i++ ){
				System.out.println(listeDesFichiers[i]);
			}	
			
		// Sinon on affiche les érreurs
		}else if(f.isFile() && f.exists()){
			
			System.out.println("Ce n'est pas un répertoire");
			
		}else{
			
			System.out.println("Ce répertoire n'existe pas !");
			
		}
		
		sc.close();
	}
}
