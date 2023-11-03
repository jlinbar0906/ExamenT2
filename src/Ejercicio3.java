import java.util.Scanner;

public class Ejercicio3 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int num;
        int medio;

        num = sc.nextInt();
        medio = num / 2 + 1;


        if (num % 2 != 0) {
            for (int j = 1; j <= num; j++) {
                if (medio == j) {
                    for (int x = 1; x <= num; x++) {
                        System.out.printf("x");
                    }
                } else {
                    for (int i = 1; i <= num; i++) {
                        if (medio == i) {
                            System.out.printf("x");
                        } else {
                            System.out.printf(" ");
                        }
                    }
                }
                System.out.println();
            }
        } else {
            System.out.println("Numero no valido");
        }

    }
}
