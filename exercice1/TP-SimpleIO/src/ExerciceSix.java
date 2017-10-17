//Package à importer afin d'utiliser l'objet File
import java.io.*;
import java.util.*;
import java.net.*;

public class ExerciceSix {

	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
	
		// Récuperer les adresses des fichier saisie dans la console.
		System.out.println("Veuillez renseigner l'URL de l'image a copier : ");
		String monURL = sc.nextLine();
		System.out.println("et celui du nouveau fichier :");
		String monNouveauFichier = sc.nextLine();
		
		// Création de l'objet URLConnection
		URLConnection urlConnection;
		
		
		try {
			
			URL fichierUrl = new URL(monURL);
			urlConnection = fichierUrl.openConnection();
			// Création des objets InputStream et OutputStream
			InputStream entree = urlConnection.getInputStream() ;
			OutputStream sortie = new FileOutputStream(monNouveauFichier);
			
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
}
