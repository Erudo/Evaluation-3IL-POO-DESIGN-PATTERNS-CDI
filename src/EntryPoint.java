/**
 * @author Adrien HAUTOT (adrien.hautot@erudo.fr)
 */
public class EntryPoint {

    public static void main(String[] args) {
        // configurez ici votre CDI :
        // - Instantiation de vos classes (CDI, livres, élèves...)
        // - Le programme est déjà pré écrit, il ne reste qu'à compléter les TODO

        System.out.println("/_\\ Bienvenue sur 3IL CDI manager!");

        // la Console permet de faciliter la récupération d'une saisie de l'utilisateur dans la console
        Console console = new Console();
        int functionToRun = -1;
        do {
            System.out.println("Qu'est-ce que tu veux faire?");
            System.out.println("1 - Lister les élèves");
            System.out.println("2 - Lister les livres non rendus");
            System.out.println("3 - Emprunter un livre");
            System.out.println("4 - J'ai fini");

            functionToRun = console.captureInt(1, 4);
                // contrôle de la saisie
                switch(functionToRun) {
                    case 1:
                        // TODO FS1 : lister les élèves
                        System.out.println("Voici la liste des élèves");
                        break;
                    case 2:
                        // TODO FS2 :lister les livres non rendus
                        System.out.println("Voici la liste des livres non rendus");
                        break;
                    case 3:
                        // TODO FP1 : Emprunter un livre
                        System.out.println("C'est parti pour la lecture!");
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
