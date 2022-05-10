package peaksoft;
import java.util.Random;
import java.util.Scanner;

public class Main {

    public static void main(String[] args) {

        Random random = new Random();
        Scanner scanner = new Scanner(System.in);
        int a = scanner.nextInt();
        int[] massiv = new int[10];
        for (int i = 0; i < massiv.length; i++) {
            massiv[i] = random.nextInt(10);
            System.out.print(massiv[i] + " ");
        }
        System.out.println();
        int b = 0;
        for (int i = 0; i < massiv.length; i++) {
            if (massiv[i] == a) {
                System.out.println(i + " индексте бар");
                b++;
            }
        }
        if (b > 0) {
        }
        else {
            System.out.println("Мындай сан массивтин ичинде жок");
        }
    }
}
