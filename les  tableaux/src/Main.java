public class Main {
    public static void main(String[] args) {

        //Les tableaux (1 dimension)
        //cas d'untableau vide
   //new cad un nouveaux tableau
        //premire type de declaration de tableaux cas
      /*tableaux1[0] = 1;
    tableaux1[1] = 0;
    tableaux1[2] = 2;
    tableaux1[3] = 7;
    tableaux1[4] = 5;
    tableaux1[5] = 100;
      //deuxsemes types de declaration de tableaux sans taille
      int tableaux2 [] = {2,4,6,8,10,12};

      //affichage de tableaux1
        //lenght=taille tu fais le nom de tableaux plus .lenght le programme permet de recuper le taille de tableaux
        //for(int i=0;i<6
        for (int i = 0 ;i<tableaux1.length ;i++){
            System.out.println(tableaux1[i]);
        }
        //affichage  de  tableaux2
        for (int i=0;i<tableaux2.length;i++){
            System.out.println(tableaux2[i]);
        }

       */
        //Les tableaux (2dimension)
           //premiere méthode de declaration de tableau1 1(vide )
        int tableau1 [][]=new int [3][3];
        //deuxeme méthode de declaration d'un tableaux
        int tableaux2 [][]= { {  2,4,6},{8,10,12}};
        //affichage de tableaux2
        //parcourir les lignes
        for (int i=0;i<tableaux2.length;i++){//parcourir le tableaux des tableaux2 []//crocher first ligne[]//crocher clonnes
            //parcourir les colonnes
            for (int j=0;j<tableaux2[i].length;j++){
               // System.out.println(tableaux2[i][j]);
                //question de designer
                System.out.print(tableaux2[i][j]+"\t");

            }
            //pour avoir une nouvelle ligne cas souter la lignes
            System.out.println();



        }















    }
}