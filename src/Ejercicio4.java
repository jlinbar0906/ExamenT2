import java.util.Scanner;

public class Ejercicio4 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int piso;
        int aux;
        int cambio = 0;

        piso = sc.nextInt();
        aux = piso;

        do {
            piso = sc.nextInt();

            if(piso>=0) {
                if (piso > aux) {
                    cambio += piso - aux;
                } else if (piso < aux) {
                    cambio += aux - piso;
                }
                aux = piso;
            }
        } while (piso >= 0);
        System.out.println(cambio);

    }
}