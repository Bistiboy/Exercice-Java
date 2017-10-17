package service;

import java.util.Scanner;
import service.Personnel;
import domain.*;

public class Menu{

    private static Scanner sc = new Scanner(System.in);

    // Le menu de cr�ation d'employ�
    public void mainMenu(Personnel personnel){

        String choice = "";

        // Le menu s'affiche tant que l'utilisateur ne d�cide pas de quitter
        while(!choice.equals("quit")){
            // On affiche le menu
            System.out.println("\nProgramme de gestion :");
            System.out.println("--------------------------");
            System.out.println("s/S : nouvel employ�");
            System.out.println("c/C : calcul des salaires");
            System.out.println("quit : fin programme");
            System.out.println("--------------------------\n");

            // On lit le choix
            choice = sc.nextLine();
            // On r�duit la casse du choix
            choice = choice.toLowerCase();

            switch (choice){
                // nouvel employ�
                case "s" :
                    employeeCreation(personnel);
                    break;

                // calcul des salaires
                case "c" :
                    personnel.afficherSalaires();
                    personnel.salaireMoyen();
                    break;
            }
        }
    }

    // Le constructeur qui prend en compte la classe de l'employ�
    public void employeeCreation(Personnel personnel){
        String type = employeeCreationType();
        String firstname = employeeCreationFirstname();
        String lastname = employeeCreationLastname();
        int age = employeeCreationAge();
        String entryYear = employeeCreationEntryYear();
        double unity = employeeCreationUnity();

        employeeBuild(type, firstname, lastname, age, entryYear, unity, personnel);
    }

    public void employeeBuild(String type, String firstname, String lastname, int age, String entryYear, double unity, Personnel personnel){

        switch (type){
            case "vendeur" :
                personnel.ajouterEmploye(new Vendeur(firstname,lastname,age,entryYear,unity));
                break;

            case "repr�sentant" :
                personnel.ajouterEmploye(new Representant(firstname,lastname,age,entryYear,unity));
                break;

            case "manutentionnaire" :
                personnel.ajouterEmploye(new Manutentionnaire(firstname,lastname,age,entryYear,unity));
                break;

            case "manutentionnaire � risque" :
                personnel.ajouterEmploye(new ManutARisque(firstname,lastname,age,entryYear,unity));
                break;

            case "technicien" :
                personnel.ajouterEmploye(new Technicien(firstname,lastname,age,entryYear,unity));
                break;

            case "technicien � risque" :
                personnel.ajouterEmploye(new TechnARisque(firstname,lastname,age,entryYear,unity));
                break;
        }
        System.out.println("employ� ajout� au personnel");
    }

    // Menu du choix du type d'employ�
    public String employeeCreationType(){

        String type = "";

        while(type.equals("")){
            System.out.println("Type  d'employ� :");
            System.out.println("--------------------------");
            System.out.println("v/V : vendeur");
            System.out.println("r/R : repr�sentant");
            System.out.println("m/M : manutentionnaire");
            System.out.println("mar/MAR : manutentionnaire � risque");
            System.out.println("t/T : technicien");
            System.out.println("tar/TAR : technicien � risque");
            System.out.println("--------------------------");

            // On lit le choix
            String choice = sc.nextLine();
            // On r�duit la casse du choix
            choice = choice.toLowerCase();

            switch (choice){
                case "v" :
                    type ="vendeur";
                    break;

                case "r" :
                    type ="repr�sentant";
                    break;

                case "m" :
                    type ="manutentionnaire";
                    break;

                case "mar" :
                    type ="manutentionnaire a risque";
                    break;

                case "t" :
                    type ="technicien";
                    break;

                case "tar" :
                    type ="technicien a risque";
                    break;
            }
        }
        return type;
    }

    // Choix du pr�nom
    public String employeeCreationFirstname(){
        System.out.println("Pr�nom de l'employ� :");
        return sc.nextLine();
    }

    // Choix du nom
    public String employeeCreationLastname(){
        System.out.println("Nom de l'employ� :");
        return sc.nextLine();
    }

    // Choix de l'�ge
    public int employeeCreationAge(){
        int age = 0;
        while(age == 0){
            System.out.println("Age de l'employ� :");
            try {
                age = Integer.parseInt(sc.nextLine());
            } catch (NumberFormatException e) {
                System.out.println("/!\\ Age incorrect, veuillez r�essayer /!\\ \n");
            }
        }
        return age;
    }

    // Choix de l'ann�e d'entr�e
    public String employeeCreationEntryYear(){
        System.out.println("Ann�e d'entr�e :");
        return sc.nextLine();
    }

    // Choix de l'unit�
    public double employeeCreationUnity(){
        double unity = 0;
        while(unity == 0){
            System.out.println("Unit� de l'employ� :");
            try {
                unity = Double.parseDouble(sc.nextLine());
            } catch (NumberFormatException e) {
                System.out.println("/!\\ Unit� incorrecte, veuillez r�essayer /!\\ \n");
            }
        }
        return unity;
    }
}
