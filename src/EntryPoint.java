import java.util.Scanner;

/**
 * @author Adrien HAUTOT (adrien.hautot@erudo.fr)
 */
public class EntryPoint {

    public static void main(String[] args) {
        // configurez ici votre école :
        // - Instantiation de vos classes (école, enseignants, élèves...)
        // - Le programme est déjà pré écrit, il ne reste qu'à compléter les TODO

        System.out.println("/_\\ Bienvenue sur 3IL manager!");

        // la Console permet de faciliter la récupération d'une saisie de l'utilisateur dans la console
        Console console = new Console();
        int functionToRun = -1;
        do {
            System.out.println("Qu'est-ce que tu veux faire?");
            System.out.println("1 - Lister les élèves");
            System.out.println("2 - Lister les enseignants");
            System.out.println("3 - Donner un cours");
            System.out.println("4 - J'ai fini");

            functionToRun = console.captureInt(1, 4);
                // contrôle de la saisie
                switch(functionToRun) {
                    case 1:
                        // TODO lister les élèves
                        System.out.println("Voici la liste des élèves");
                        break;
                    case 2:
                        // TODO lister les enseignants
                        System.out.println("Voici la liste des enseignants");
                        break;
                    case 3:
                        // TODO Donner un cours
                        System.out.println("C'est parti pour un cours!");
                        break;
                    case 4:
                        System.out.println("A la prochaine!");
                    default:
                        System.err.println("Saisie invalide... tu dois choisir entre 1 et 4");
                }
            System.out.println("###################################################");

        } while(functionToRun != 4);

    }
}
