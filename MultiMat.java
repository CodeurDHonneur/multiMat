import java.util.Scanner;
import java.util.Arrays;

public class MultiMat {
    
    public static void main(String[] args) {

        System.out.println("/////////////////////////////////////////////////////////////////////////////////////////////");
        System.out.println("\n");

        System.out.println("Dans les lignes qui vont suivrent, vous serez appelé(e) à définir des lignes et des colonnes, \nafin de former des matrices.  Ces matrices serviront à effectuer une opération : un produit scalaire.\nCette opération obéit à une règle bien précise : le nombre de lignes de la matrice 2,\nest identique au nombre de colonnes de la matrice 1.");
        System.out.println("\n");

        System.out.println("/////////////////////////////////////////////////////////////////////////////////////////////");
        System.out.println("\n");


        Scanner sc = new Scanner(System.in);

        /*
         * déclaration des variables de saisie
         * w nombre de lignes de mat1
         * x nombre de colonnes de mat1
         * y nombre de lignes de mat2
         * nombre de colonnes de mat2
         */
        int w, x, y, z;

        float a, b;

        do {
            System.out.println("Passons à la définition de nos matrices !");

            //mat1
            System.out.println("<=====MAT1=====>");

            //lignes mat1
            System.out.println("Indiquer le nombre de lignes pour mat1");
            w = sc.nextInt();

            //colonnes mat1
            System.out.println("Indiquer le nombre de colonnes pour mat1");
            x = sc.nextInt();

            //mat2
            System.out.println("<=====MAT2=====>");

            //lignes mat2
            System.out.println("Indiquer le nombre de lignes pour mat2");
            y = sc.nextInt();

            //colonnes mat2
            System.out.println("Indiquer le nombre de colonnes pour mat2");
            z = sc.nextInt();

        } while( x != y);


        //déclaration du nombre de lignes et de colonnes et remplissage de la matrice mat1
        //déclaration
        /*System.out.println("Définissons la matrice mat1.");

        //lignes
        System.out.println("Saisissez le nombre de lignes de mat1");
        w = sc.nextInt();

        //colonnes
        System.out.println("Saisissez le nombre de colonnes de mat1");
        x = sc.nextInt();*/

        //remplissage
        
        System.out.println("Procédons au rempissage de MAT1");
        float[][] mat1 = new float[w][x];

        for(int i = 0; i < w; i++) {

            for(int j = 0; j < mat1[i].length; j++) {
                System.out.println("entrez la valeur " + (j+1) + " de la ligne n°" + (i+1));
                a = sc.nextFloat();
                mat1[i][j] = a;
            }
        }

        //affichage du rendu après remplissage
        System.out.println("La matrice MAT1 est la suivante : ");

        for(int i = 0; i < w; i++) {
            //System.out.println(Arrays.toString(mat1));
            System.out.println("composition ligne n°" + (i+1));
            for(int j = 0; j < mat1[i].length; j++) {
                System.out.println( mat1[i][j] + ";");
            }
        }

        System.out.println("<==========================================>");
        System.out.println("\n");

        //déclaration du nombre de lignes et de colonnes et remplissage de la matrice mat2
        //déclaration
        /*System.out.println("Définissons la matrice mat2.");

        //lignes
        System.out.println("Saisissez le nombre de lignes de mat2");
        y = sc.nextInt();

        //colonnes
        System.out.println("Saisissez le nombre de colonnes de mat2");
        z = sc.nextInt();*/


        System.out.println("Procédons au rempissage de MAT2");
        float[][] mat2 = new float[y][z];

        for(int k = 0; k < y; k++) {

            for(int l = 0; l < mat2[k].length; l++) {
                System.out.println("entrez les valeurs " + (l+1) + " de la ligne n°" + (k+1));
                b = sc.nextFloat();
                mat2[k][l] = b;
            }
        }

        //affichage du rendu après remplissage
        System.out.println("La matrice mat2 est la suivante : ");

        for(int i = 0; i < y; i++) {
            System.out.println("composition ligne n°" + (i+1));
            for(int j = 0; j < mat2[i].length; j++) {
                System.out.println( mat2[i][j] + ";");
            }
        }

        System.out.println("<==========================================>");
        System.out.println("\n");

        float[][] multiMat = new float[w][z]; 

        for (int i = 0; i < w; i++) {

            for(int j = 0; j < multiMat[i].length; j++) {
                multiMat[i][j] += mat1[i][j] * mat2[i++][j];
            }
        }

        System.out.println("La matrice multiMat est la suivante : ");

        for(int i = 0; i < w; i++) {
            System.out.println("composition ligne n°" + (i+1));
            for(int j = 0; j < multiMat[i].length; j++) {
                System.out.println( multiMat[i][j] + ";");
            }
        }
    }
}