import java.util.Scanner;

///Questão 1
public class Soma {
    Scanner scanner = new Scanner(System.in);

    public void calcularSoma() {
        int num;
        int soma = 0;

        for(int i = 0; i < 4; i++){
            System.out.printf("Digite o número (%d/4): ", i + 1);
            num = scanner.nextInt();
            soma += num;
        }

        System.out.printf("\nA soma é de: %d", soma);
    }
}
