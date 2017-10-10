//Package à importer afin d'utiliser l'objet File
import java.io.*;
import java.util.*;

public class ExerciceTrois {

	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		System.out.println("Veuillez renseigner un répertoire : ");
		String monChemin = sc.nextLine() ;
		File f = new File(monChemin);
		
		String  listeDesFichiers[];
		String 	listeDesExtentions[] = {".txt",".php",".html",".css",".py"} ;
		
		//TODO : Faire le switch pour choisir les extentions et afficher le tableau listeDesExtentions etc ..
		
		listeDesFichiers = f.list();
		
		if(f.isDirectory() && f.exists()){
			
			for(int i = 0; i < listeDesFichiers.length ;i++ ){
				System.out.println(listeDesFichiers[i]);
			}	
			
		}else if(f.isFile() && f.exists()){
			
			System.out.println("Ce n'est pas un répertoire");
			
		}else{
			
			System.out.println("Ce répertoire n'existe pas !");
			
		}
	}
}
