import java.util.Scanner;

/// Questão 2
public class MediaTres {

    Scanner scanner = new Scanner(System.in);

    public void calcularmediatres() {
        float num;
        float media = 0;

        for(int i = 0; i < 3; i++){
            System.out.printf("Digite o número (%d/3): ", i + 1);
            num = scanner.nextFloat();
            media += num;
        }

        media = media/3;

        System.out.printf("\nA média aritmética é de: %.2f", media);
    }
}
