import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class Fibonacci {
    public static void main(String[] args) throws Exception {
        Scanner numberScanner = new Scanner(System.in);
        List<Integer> array = new ArrayList<>();

        int x = 0;
        int y = 1;

        System.out.println("Escreva o tamanho da sequência Fibonacci: ");

        int number = numberScanner.nextInt();

        for (int i = 0; i<number-1; i++) {
            if (i==0){
                System.out.print(x + " ");
            }
            int newY = x+y;
            array.add(newY);
            x = y;
            y = newY;

            System.out.print(x + " ");
        }
    }
}

