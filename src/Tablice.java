public class Tablice {
    public static void main(String[] args) {
        String s = "Mateusz";
        String x, y, z;

        int[] liczby = new int[10];
        liczby[0] = 5;
        liczby[1] = 8;
        liczby[2] = 10;
        int[] temp = new int[20];
        temp[0] = liczby[0];
        temp[1] = liczby[1];
        temp[2] = liczby[2];
        liczby = temp;

        System.out.println(liczby[1]);
        System.out.println(liczby[5]);

        char[] znaki = new char[10];
        System.out.println(znaki[0]);

        String[] stringi = new String[10];
        System.out.println(stringi[0]);

        stringi = new String[50];

        System.out.println(stringi[20]);

        /*int i;
        System.out.println(i);*/

        int i;
        int[] noweLiczby = {1,2,3,4,5,6,7};
        String[] slowa = {"cos", "innego", "jest", "dobrze", "bo", "dziala"};

        int[][] tablica2D = new int[10][10];
        tablica2D[4][6] = 40;
        tablica2D[2][5] = 100;

        System.out.println(tablica2D[2][5]);

        int[][][] tablica3D = new int[3][3][3];

        tablica3D[0][1][2] = 5;


    }
}
