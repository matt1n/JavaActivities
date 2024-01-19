import java.util.Scanner;

public class MultiplicaAí {
    public static void main(String[] args) {
        Scanner numberScanner = new Scanner(System.in);

        System.out.println("De qual número você quer conferir a tabela de multiplicação?");

        int number = numberScanner.nextInt();

        for (int i = 1; i<=10; i++){
            System.out.println("5 x " + i + " = " + number*i);
        }

    }
}
