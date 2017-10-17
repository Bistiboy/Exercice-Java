//Package à importer afin d'utiliser l'objet File
import java.io.*;
import java.util.*;

public class ExerciceCinq {

	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
	
		// Récuperer les adresses des fichier saisie dans la console.
		System.out.println("Veuillez renseigner le chemin du fichier a copier : ");
		String monFichierSource = sc.nextLine();
		System.out.println("et renseigner le nom du fichier a creer :");
		String monNouveauFichier = sc.nextLine() ;
		
		try {
			
			// Création des objets InputStream et OutputStream
			InputStream entree = new FileInputStream(monFichierSource);
			OutputStream sortie = new FileOutputStream(monNouveauFichier + getExtention(monFichierSource));
			
			// Déclaration du buffer dans un tableau de byte
			byte[] buffer = new byte[1024];
			// Récupere la longueur du fichier d'entrée
			int len = entree.read(buffer);
			while (len != -1) {
				
				// Ecrit dans le nouveau fichier
			    sortie.write(buffer, 0, len);
			    len = entree.read(buffer);
			}
			
			// Ferme l'InputStream et l'OutputStream
			entree.close();
			sortie.close();
		} catch (FileNotFoundException e) {
			e.printStackTrace();
		} catch (IOException e) {
			e.printStackTrace();
		} finally {
			sc.close();
		}
	}
	
	// Fonction pour récuperer l'extention du fichier renseigné
	static String getExtention(String fichier){
		String extentionFichier = "";
		int i = fichier.lastIndexOf(".");
		if(i != -1){
			extentionFichier = fichier.substring(i);
		}
		return extentionFichier;
	}
}
