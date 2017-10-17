//Package � importer afin d'utiliser l'objet File
import java.io.*;
import java.util.*;

public class ExerciceDeux {

	public static void main(String[] args) {
		
		// D�claration du scanner
		Scanner sc = new Scanner(System.in);
		
		// R�cup�ration du chemin du r�pertoire
		System.out.println("Veuillez renseigner un r�pertoire : ");
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
			
		// Sinon on affiche les �rreurs
		}else if(f.isFile() && f.exists()){
			
			System.out.println("Ce n'est pas un r�pertoire");
			
		}else{
			
			System.out.println("Ce r�pertoire n'existe pas !");
			
		}
		
		sc.close();
	}
}
