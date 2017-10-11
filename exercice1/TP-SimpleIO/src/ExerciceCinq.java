//Package à importer afin d'utiliser l'objet File
import java.io.*;
import java.nio.file.Files;
import java.util.*;

public class ExerciceCinq {

	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
	
		
		System.out.println("Veuillez renseigner le chemin du fichier a créer : ");
		String monFichierSource = sc.nextLine();
		System.out.println("et celui du nouveau fichier :");
		String monNouveauFichier = sc.nextLine() ;
		
		try {
			InputStream entree = new FileInputStream(monFichierSource);
			OutputStream sortie = new FileOutputStream(monNouveauFichier);
			
			Files.copy(entree, sortie);
		} catch (FileNotFoundException e) {
			e.printStackTrace();
		}

	
	}
}
