import java.util.Scanner;

public class NumberPyramid {
    public static void main(String[] args) {
        Scanner numberScanner = new Scanner(System.in);
        System.out.println("Qual o tamanho da pirâmide?");
        int number = numberScanner.nextInt();

        for (int i=1; i<=number; i++) {
            for (int j = 0; j < i; j++){
                System.out.print(i);
            }
            System.out.println();
        }
    }
}
