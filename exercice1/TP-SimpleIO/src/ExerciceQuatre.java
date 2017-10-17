//Package à importer afin d'utiliser l'objet File
import java.io.*;
import java.util.*;

public class ExerciceQuatre {

	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
	
		
		System.out.println("Que voulez écrire dans votre fichier ?");
		String texte = sc.nextLine() + " | ";

		String adressedufichier = "Nouveau fichier.txt";
	
		//on met try si jamais il y a une exception
		try
		{
			FileWriter fw = new FileWriter(adressedufichier, true);
			
			// le BufferedWriter output auquel on donne comme argument fw
			BufferedWriter output = new BufferedWriter(fw);			
			//on marque dans le fichier qui sert comme tampon
			output.write(texte);
			output.flush();
			//ensuite flush envoie dans le fichier			
			output.close();
			//et on le ferme
			
			System.out.println("done");
		}
		catch(IOException e){
			System.out.println("Erreur : ");
			System.err.println(e.getMessage());
		}
		finally {
		    if(sc!=null)
		        sc.close();
		}
	}
}
