import java.util.Scanner;

public class SalarioVinteCinco {

    Scanner scanner = new Scanner(System.in);

    public void aumetovintecinco() {
        float salario;
        float aumento = 1.25f; // 100% + 25%

        System.out.print("Digite o salário: ");
        salario = scanner.nextFloat();

        System.out.printf("Seu novo salário é de R$ %.2f", salario * aumento);
    }
}
