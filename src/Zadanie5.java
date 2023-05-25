import java.util.Random;

public class Zadanie5 {
    public static void main(String[] args) {
        int[] tab = new int[10];
        Random losowacz = new Random();

        for (int i = 0; i < tab.length; i++) {
            do {
                int temp = losowacz.nextInt(20);
                boolean flag = false;
                for (int element : tab) {
                    if(element == temp) {
                        flag = true;
                        break;
                    }
                }
                if(!flag) {
                    tab[i] = temp;
                }
            } while (tab[i] == 0);
        }

    }
}
