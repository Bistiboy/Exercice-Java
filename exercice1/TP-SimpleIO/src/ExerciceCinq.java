//Package � importer afin d'utiliser l'objet File
import java.io.*;
import java.util.*;

public class ExerciceCinq {

	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
	
		// R�cuperer les adresses des fichier saisie dans la console.
		System.out.println("Veuillez renseigner le chemin du fichier a copier : ");
		String monFichierSource = sc.nextLine();
		System.out.println("et renseigner le nom du fichier a creer :");
		String monNouveauFichier = sc.nextLine() ;
		
		try {
			
			// Cr�ation des objets InputStream et OutputStream
			InputStream entree = new FileInputStream(monFichierSource);
			OutputStream sortie = new FileOutputStream(monNouveauFichier + getExtention(monFichierSource));
			
			// D�claration du buffer dans un tableau de byte
			byte[] buffer = new byte[1024];
			// R�cupere la longueur du fichier d'entr�e
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
	
	// Fonction pour r�cuperer l'extention du fichier renseign�
	static String getExtention(String fichier){
		String extentionFichier = "";
		int i = fichier.lastIndexOf(".");
		if(i != -1){
			extentionFichier = fichier.substring(i);
		}
		return extentionFichier;
	}
}
