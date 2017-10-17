//Package � importer afin d'utiliser l'objet File
import java.io.*;
import java.util.*;

public class ExerciceUn {

	public static void main(String[] args) {
		// D�claration du scanner
		Scanner sc = new Scanner(System.in);
		
		// R�cup�ration du chemin du fichier
		System.out.println("Veuillez renseigner un fichier : ");
		String monChemin = sc.nextLine() ;
		File f = new File(monChemin);
		
		// Affiche le nom du fichier et si il existe, si c'est un r�pertoire ou un fichier
		System.out.println("Nom du fichier : " + f.getName());
		System.out.println("Est-ce qu'il existe ? ");
		if(f.exists()){
			System.out.println("Oui, il existe");
			if(f.isDirectory() && !f.isFile()){
				System.out.println("C'est un r�pertoire !");
			}else{
				System.out.println("C'est un fichier !");
			}
		}else{
			System.out.println("Non, il n'existe pas");
		}
		
		// Ferme le scnaner
		sc.close();
	}
}
