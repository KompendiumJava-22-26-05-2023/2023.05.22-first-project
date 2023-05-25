public class Zadanie3 {
    public static void main(String[] args) {
        int[][] tab = new int[5][5];
        /*int[] temp = tab[0];
        System.out.println(tab.length);
        System.out.println(temp.length);*/
        for(int row = 0; row < tab.length; row++) {
            for(int col = 0; col < tab[row].length; col++) {
                tab[row][col] = row*col;
                System.out.print(tab[row][col] + " ");
            }
            System.out.println();
        }
    }
}
