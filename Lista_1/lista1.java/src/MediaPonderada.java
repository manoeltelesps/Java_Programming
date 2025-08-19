import java.util.Scanner;

public class MediaPonderada {

    Scanner scanner = new Scanner(System.in);

    public void calcularmediaponderada() {
        float num, peso;
        float guardapeso = 0;
        float media = 0;

        for(int i = 0; i < 3; i++){
            System.out.printf("Digite a nota (%d/3) e seu respectivo peso, espaçados: ", i + 1);
            num = scanner.nextFloat();
            peso = scanner.nextFloat();

            num *= peso;

            guardapeso += peso;
            media += num;
        }

        media = media/guardapeso;

        System.out.printf("\nA média ponderada é de: %.2f", media);
    }
}
