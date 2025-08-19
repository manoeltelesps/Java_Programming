import java.util.Scanner;

public class SalarioBase {

    Scanner scanner = new Scanner(System.in);

    public void imposto(){
        float salario;
        float imposto = 0.00f;
        boolean gratificacao;

        System.out.print("Digite o salário base: ");
        salario = scanner.nextFloat();

        System.out.print("O funcionário foi gratificado? (true/false): ");
        gratificacao = scanner.nextBoolean();

        if (gratificacao) {
            salario *= 1.05;
        }

        imposto = salario * 0.7f;
        System.out.printf("O salário bruto é de R$ %.2f e o líquido é de R$ %.2f%n", salario, imposto);
    }
}
