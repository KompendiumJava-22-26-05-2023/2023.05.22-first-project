import java.util.Random;

public class Zadanie1 {
    public static void main(String[] args) {
        int[] tab = new int[100];
        Random random = new Random();
        /*for(int i = 0; i < 100; i++) {
            tab[i] = random.nextInt(1001);
        }

        for(int element : tab) {
            System.out.println(element);
        }

        int min = 1001;
        for(int element : tab) {
            if(element < min) {
                min = element;
            }
        }

        System.out.println(min);*/

        int min = 1001;
        for(int i = 0; i < 100; i++) {
            tab[i] = random.nextInt(1001);
            System.out.println(tab[i]);
            if(tab[i] < min) {
                min = tab[i];
            }
        }

        System.out.println(min);
    }
}
