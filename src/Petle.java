public class Petle {
    public static void main(String[] args) {
        int[] tab = new int[10];
        for(int i = 0; i < 10; i++) {
            tab[i] = i + 10;
        }

        for(int element : tab) {
            System.out.println(element);
        }
        int x = 100;
        while(x < 15) {
            System.out.println(x);
            x++;
        }

        do {
            System.out.println(x);
            x++;
        } while (x < 15);

        System.out.println("Koniec programu !!!");
    }
}
