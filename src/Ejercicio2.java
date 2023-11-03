import java.util.Scanner;

public class Ejercicio2 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);


        double nota;
        double notafinal = 0;
        int aprov = 0, susp = 0;
        int examenes = 0;
        do {
            nota = sc.nextDouble();
            if (nota >= 0) {
                notafinal += nota;
                if (nota >= 5) {
                    aprov++;
                } else {
                    susp++;
                }
                examenes++;
            } else if(nota<0&&examenes==0){
                System.out.println("No se han introducido valores");
            }
        } while (nota >= 0);

        if (notafinal > 0) {
            System.out.printf("La nota media es %.02f\n", notafinal / examenes);
            System.out.printf("Aprobados: %d - Suspensos: %d", aprov, susp);
        }
    }
}
