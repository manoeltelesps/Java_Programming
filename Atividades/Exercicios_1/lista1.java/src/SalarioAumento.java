import java.util.Scanner;

public class SalarioAumento {

    Scanner scanner = new Scanner(System.in);

    public void aumentovariavel(){

        float aumento = 0, salario;
        float percentual;

        System.out.print("Digite o seu salário: ");
        salario = scanner.nextFloat();

        System.out.print("Digite o percentual de aumento: ");
        percentual = scanner.nextFloat();

        aumento = salario * percentual/100;
        salario += aumento;


        System.out.printf("Seu sálario teve um aumento de R$ %.2f e foi para R$ %.2f", aumento, salario);

    }
}
