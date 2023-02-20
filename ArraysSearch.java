import java.util.Scanner;


public class ArraysSearch {

    public static void main(String[] args) {
        char tableauCaractere[] = {'a', 'b', 'c', 'd', 'e', 'f', 'g', 'z'};
        int i = 0;
        int emplacement = 0;
    
        char response = ' '; 
        char carac = ' ';

        Scanner sc = new Scanner(System.in);

        do  {

            do {
                i = 0;
                System.out.println("Rentrez une lettre en minuscule, SVP !");

                carac = sc.nextLine().charAt(0);
                while(i < tableauCaractere.length && carac != tableauCaractere[i]) {
                   // System.out.println(" test lettre => " + tableauCaractere[i] + "   valeur de i = " + i);
                    i++;

                }
                

                if(i < tableauCaractere.length)
                System.out.println(" La lettre " + carac + " se trouve bien dans le tableau !");

                else 
                System.out.println(" La lettre " + carac + " ne se trouve pas dans le tableau !");

            } while (i >= tableauCaractere.length);

            do {
                System.out.println("Voulez-vous essayer à nouveau ? (O/N)");
                response = sc.nextLine().charAt(0);
            }while(response != 'N' && response != 'O' && response != 'o');

        }while (response == 'O' || response == 'o');

        System.out.println("Au revoir !");
    }

}