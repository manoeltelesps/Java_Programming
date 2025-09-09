/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ucb.poo.abstracao;

/**
 * Classe de teste para demonstrar o uso de classes abstratas Mostra
 * polimorfismo, herança e implementação de métodos abstratos
 *
 * @author Professor Samuel Novais
 */
public class TesteVeiculosAbstratos {

    public static void main(String[] args) {
        System.out.println("=== DEMONSTRAÇÃO DE CLASSES ABSTRATAS ===\n");

        // Testando a criação de veículos concretos
        testarCriacaoVeiculos();

        // Testando polimorfismo com classes abstratas
        testarPolimorfismo();

        // Testando comportamentos específicos
        testarComportamentosEspecificos();

        // Demonstrando uso prático dos métodos abstratos
        demonstrarUsoMetodosAbstratos();
    }

    /**
     * Testa a criação de veículos concretos
     */
    public static void testarCriacaoVeiculos() {
        System.out.println("=== TESTANDO CRIAÇÃO DE VEÍCULOS ===");

        // Criando um carro
        CarroConcreto carro = new CarroConcreto(
                "Toyota", "Corolla", 2020, 50.0,
                4, "Automático", 144.0
        );

        // Criando uma motocicleta
        MotocicletaConcreta moto = new MotocicletaConcreta(
                "Honda", "CB 600F", 2019, 18.0,
                600, "4 tempos"
        );

        System.out.println("Veículos criados com sucesso!");

        // Exibindo informações
        carro.exibirInformacoes();
        System.out.println();
        moto.exibirInformacoes();

        // Tentativa de instanciar classe abstrata (isso causaria erro de compilação)
        // VeiculoAbstrato veiculo = new VeiculoAbstrato(); // ERRO!
        System.out.println("\nNota: Não é possível instanciar a classe abstrata VeiculoAbstrato diretamente!");
    }

    /**
     * Testa polimorfismo usando a classe abstrata como tipo
     */
    public static void testarPolimorfismo() {
        System.out.println("=== TESTANDO POLIMORFISMO ===");

        // Array de veículos usando polimorfismo
        VeiculoAbstrato[] veiculos = {
            new CarroConcreto("Volkswagen", "Gol", 2018, 55.0, 4, "Manual", 120.0),
            new MotocicletaConcreta("Yamaha", "YBR 125", 2021, 12.0, 125, "4 tempos"),
            new CarroConcreto("Ford", "Ka", 2019, 48.0, 4, "Manual", 85.0),
            new MotocicletaConcreta("Honda", "CG 160", 2020, 16.0, 160, "4 tempos")
        };

        System.out.println("Testando comportamentos polimórficos:");

        for (int i = 0; i < veiculos.length; i++) {
            VeiculoAbstrato veiculo = veiculos[i];

            System.out.println("\n--- Veículo " + (i + 1) + " ---");
            System.out.println("Tipo: " + veiculo.getClass().getSimpleName());
            System.out.println("Marca/Modelo: " + veiculo.getMarca() + " " + veiculo.getModelo());

            // Ligando o veículo
            veiculo.ligar();

            // Testando aceleração (método abstrato implementado diferentemente)
            veiculo.acelerar(30);

            // Testando consumo (método abstrato implementado diferentemente)
            double consumo = veiculo.calcularConsumo(100);
            System.out.println("Consumo para 100km: " + String.format("%.2f", consumo) + "L");

            // Testando tipo de combustível (método abstrato)
            System.out.println("Combustível: " + veiculo.obterTipoCombustivel());

            // Frenando
            veiculo.frear(20);

            // Desligando
            veiculo.desligar();
        }
    }

    /**
     * Testa comportamentos específicos de cada tipo de veículo
     */
    public static void testarComportamentosEspecificos() {
        System.out.println("=== TESTANDO COMPORTAMENTOS ESPECÍFICOS ===");

        // Testando carro
        System.out.println("--- Testando Carro ---");
        CarroConcreto carro = new CarroConcreto(
                "Honda", "Civic", 2021, 47.0,
                4, "CVT", 155.0
        );

        carro.ligar();
        carro.buzinar();
        carro.alternarArCondicionado();
        carro.acelerar(50);
        carro.fazerViagem(150);
        carro.estacionar();

        System.out.println("\n--- Testando Motocicleta ---");
        MotocicletaConcreta moto = new MotocicletaConcreta(
                "Kawasaki", "Ninja 300", 2020, 17.0,
                300, "4 tempos"
        );

        moto.verificarSeguranca();
        moto.ligar();
        moto.buzinar();
        moto.acelerar(40);
        moto.empinar();
        moto.instalarCarenagem();
        moto.instalarBagageiro();
        moto.fazerManutencao();
        moto.frear(40);
        moto.desligar();
    }

    /**
     * Demonstra o uso prático dos métodos abstratos
     */
    public static void demonstrarUsoMetodosAbstratos() {
        System.out.println("=== DEMONSTRAÇÃO DE MÉTODOS ABSTRATOS ===");

        // Criando diferentes tipos de veículos
        VeiculoAbstrato carroEconomico = new CarroConcreto(
                "Chevrolet", "Onix", 2022, 44.0,
                4, "Manual", 82.0
        );

        VeiculoAbstrato motoEsportiva = new MotocicletaConcreta(
                "Suzuki", "GSX-R 750", 2021, 17.0,
                750, "4 tempos"
        );

        // Comparando consumos para a mesma distância
        double distancia = 200; // km

        System.out.println("Comparação de consumo para " + distancia + "km:");

        double consumoCarro = carroEconomico.calcularConsumo(distancia);
        double consumoMoto = motoEsportiva.calcularConsumo(distancia);

        System.out.println("Carro econômico: " + String.format("%.2f", consumoCarro) + "L");
        System.out.println("Moto esportiva: " + String.format("%.2f", consumoMoto) + "L");
        System.out.println("Diferença: " + String.format("%.2f", Math.abs(consumoCarro - consumoMoto)) + "L");

        // Testando diferentes tipos de combustível
        System.out.println("\nTipos de combustível:");
        System.out.println("Carro: " + carroEconomico.obterTipoCombustivel());
        System.out.println("Moto: " + motoEsportiva.obterTipoCombustivel());

        // Testando comportamentos de aceleração
        System.out.println("\nTestando aceleração:");

        carroEconomico.ligar();
        motoEsportiva.ligar();

        System.out.println("Acelerando carro:");
        carroEconomico.acelerar(25);

        System.out.println("Acelerando moto:");
        motoEsportiva.acelerar(25);

        // Demonstrando que métodos concretos funcionam igual para todos
        System.out.println("\nMétodos concretos (comportamento comum):");
        System.out.println("Idade do carro: " + carroEconomico.calcularIdade() + " anos");
        System.out.println("Idade da moto: " + motoEsportiva.calcularIdade() + " anos");
        System.out.println("Carro precisa revisão: " + carroEconomico.precisaRevisao());
        System.out.println("Moto precisa revisão: " + motoEsportiva.precisaRevisao());
    }

    /**
     * Método utilitário para demonstrar conceitos de abstração
     */
    public static void demonstrarConceitosAbstracao() {
        System.out.println("=== CONCEITOS DE ABSTRAÇÃO DEMONSTRADOS ===");
        System.out.println("1. Classes abstratas não podem ser instanciadas");
        System.out.println("2. Métodos abstratos devem ser implementados pelas subclasses");
        System.out.println("3. Métodos concretos são herdados e podem ser sobrescritos");
        System.out.println("4. Polimorfismo permite tratar objetos diferentes de forma uniforme");
        System.out.println("5. Cada subclasse implementa comportamentos específicos");
        System.out.println("6. A classe abstrata define a estrutura comum");
    }
}
