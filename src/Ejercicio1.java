import java.util.Scanner;

public class Ejercicio1 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int num;
        num = sc.nextInt();
        if(num%2==0){
            for (int i=10;i<num;i=i+5){
                System.out.println(i);
            }
        }else{
            for (int i=10;i<num;i=i+3){
                System.out.println(i);
            }
        }


    }
}

