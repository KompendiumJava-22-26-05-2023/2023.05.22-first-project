import java.util.Random;

public class Zadanie4 {
    public static void main(String[] args) {
        int[] tab = new int[100];
        int x = 17;
        Random losowacz = new Random();
        for(int i = 0; i < tab.length; i++) {
            tab[i] = losowacz.nextInt(1001);
            System.out.print(tab[i] + " ");
        }
        System.out.println();
        int counter = 0;
        for(int element : tab) {
           if(element == x) {
               counter++;
           }
        }

        if(counter > 0) {
            System.out.println("TAK ilosc wystapien: " + counter);
        } else {
            System.out.println("NIE");
        }
    }
}
