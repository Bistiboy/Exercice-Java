//Package � importer afin d'utiliser l'objet File
import java.io.*;
import java.util.*;

public class ExerciceQuatre {

	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		System.out.println("Veuillez renseigner un r�pertoire : ");
		String monChemin = sc.nextLine() ;
		File f = new File(monChemin);
		
		String [] listeDesFichiers;
		
		listeDesFichiers = f.list();
		
		if(f.isDirectory() && f.exists()){
			
			for(int i = 0; i < listeDesFichiers.length ;i++ ){
				System.out.println(listeDesFichiers[i]);
			}	
			
		}else if(f.isFile() && f.exists()){
			
			System.out.println("Ce n'est pas un r�pertoire");
			
		}else{
			
			System.out.println("Ce r�pertoire n'existe pas !");
			
		}
	}
}
