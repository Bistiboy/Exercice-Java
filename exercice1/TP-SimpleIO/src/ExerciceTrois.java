//Package à importer afin d'utiliser l'objet File
import java.io.*;
import java.util.*;

public class ExerciceTrois {

	public static void main(String[] args) {
		
		
		String  listeDesFichiers[];
		String 	listeDesExtentions[] = {".txt",".php",".html",".css",".py"} ;
		
		Scanner sc = new Scanner(System.in);
		System.out.println("Veuillez renseigner un répertoire : ");
		String monChemin = sc.nextLine() ;
		File f = new File(monChemin);
		listeDesFichiers = f.list();
		
		System.out.println("Et choisir une extention parmis la liste :");
		for(int i = 0; i < listeDesExtentions.length; i++){
			System.out.println(" - " + listeDesExtentions[i]);
		}
		String monExt = sc.nextLine();
				
		if(f.isDirectory() && f.exists()){
			
			for(int i = 0; i < listeDesFichiers.length; i++){
				if(listeDesFichiers[i].endsWith(monExt)){
					System.out.println(listeDesFichiers[i]);
				}
			}		
			
		}else if(f.isFile() && f.exists()){
			
			System.out.println("Ce n'est pas un répertoire");
			
		}else{
			
			System.out.println("Ce répertoire n'existe pas !");
			
		}
	}
}
