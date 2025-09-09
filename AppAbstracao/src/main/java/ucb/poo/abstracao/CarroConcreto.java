/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ucb.poo.abstracao;

/**
 * Classe concreta que representa um carro Herda da classe abstrata
 * VeiculoAbstrato Implementa todos os métodos abstratos
 *
 * @author Professor Samuel Novais
 */
public class CarroConcreto extends VeiculoAbstrato {

    private int numeroPortas;
    private String tipoCambio; // Manual, Automático, CVT
    private boolean arCondicionado;
    private double potenciaMotor; // em cavalos (cv)

    /**
     * Construtor da classe Carro
     *
     * @param marca Marca do carro
     * @param modelo Modelo do carro
     * @param anoFabricacao Ano de fabricação
     * @param capacidadeTanque Capacidade do tanque
     * @param numeroPortas Número de portas
     * @param tipoCambio Tipo de câmbio
     * @param potenciaMotor Potência do motor em cv
     */
    public CarroConcreto(String marca, String modelo, int anoFabricacao, double capacidadeTanque,
            int numeroPortas, String tipoCambio, double potenciaMotor) {
        super(marca, modelo, anoFabricacao, capacidadeTanque);
        this.numeroPortas = numeroPortas;
        this.tipoCambio = tipoCambio;
        this.potenciaMotor = potenciaMotor;
        this.arCondicionado = false; // Padrão desligado
    }

    /**
     * Implementação do método abstrato acelerar Carros aceleram de forma suave
     * e controlada
     */
    @Override
    public void acelerar(double incremento) {
        if (!podeSeMovimentar()) {
            System.out.println("Não é possível acelerar: veículo desligado ou sem combustível!");
            return;
        }

        if (incremento <= 0) {
            System.out.println("Incremento de velocidade deve ser positivo!");
            return;
        }

        // Carros aceleram de forma mais suave
        double aceleracaoReal = incremento * 0.8; // Fator de suavidade

        // Ajuste baseado no tipo de câmbio
        if (tipoCambio.equals("Manual")) {
            aceleracaoReal *= 0.9; // Câmbio manual é menos eficiente
        } else if (tipoCambio.equals("CVT")) {
            aceleracaoReal *= 1.1; // CVT é mais eficiente
        }

        double novaVelocidade = velocidadeAtual + aceleracaoReal;
        setVelocidadeAtual(novaVelocidade);

        // Consome combustível baseado na aceleração
        double consumo = aceleracaoReal * 0.02; // 0.02L por km/h de aceleração
        consumirCombustivel(consumo);

        System.out.println("Carro acelerando... Velocidade atual: " + velocidadeAtual + " km/h");
    }

    /**
     * Implementação do método abstrato frear Carros freiam de forma eficiente
     */
    @Override
    public void frear(double decremento) {
        if (velocidadeAtual == 0) {
            System.out.println("O carro já está parado!");
            return;
        }

        if (decremento <= 0) {
            System.out.println("Decremento de velocidade deve ser positivo!");
            return;
        }

        // Carros têm boa capacidade de frenagem
        double frenagem = decremento * 1.2; // Fator de eficiência da frenagem

        double novaVelocidade = velocidadeAtual - frenagem;
        setVelocidadeAtual(Math.max(0, novaVelocidade)); // Não pode ser negativa

        System.out.println("Carro freando... Velocidade atual: " + velocidadeAtual + " km/h");

        if (velocidadeAtual == 0) {
            System.out.println("Carro parou completamente.");
        }
    }

    /**
     * Implementação do método abstrato calcularConsumo Carros têm consumo
     * baseado na eficiência do motor
     */
    @Override
    public double calcularConsumo(double distancia) {
        if (distancia <= 0) {
            return 0;
        }

        // Consumo base: 10 km/L (eficiente)
        double consumoBase = distancia / 10.0;

        // Ajustes baseados nas características do carro
        double fatorPotencia = potenciaMotor / 100.0; // Motores mais potentes consomem mais
        double fatorCambio = tipoCambio.equals("CVT") ? 0.9
                : tipoCambio.equals("Automático") ? 1.0 : 1.1;
        double fatorArCondicionado = arCondicionado ? 1.15 : 1.0;

        return consumoBase * fatorPotencia * fatorCambio * fatorArCondicionado;
    }

    /**
     * Implementação do método abstrato obterTipoCombustivel
     */
    @Override
    public String obterTipoCombustivel() {
        return "Gasolina";
    }

    /**
     * Método específico para ligar/desligar ar condicionado
     */
    public void alternarArCondicionado() {
        if (ligado) {
            arCondicionado = !arCondicionado;
            String status = arCondicionado ? "ligado" : "desligado";
            System.out.println("Ar condicionado " + status + ".");
        } else {
            System.out.println("Ligue o carro primeiro para usar o ar condicionado!");
        }
    }

    /**
     * Método específico para buzinar
     */
    public void buzinar() {
        if (ligado) {
            System.out.println("Bi bi! *buzina do carro*");
        } else {
            System.out.println("Ligue o carro primeiro para buzinar!");
        }
    }

    /**
     * Método específico para estacionar
     */
    public void estacionar() {
        if (velocidadeAtual == 0) {
            System.out.println("Carro estacionado com segurança.");
            if (tipoCambio.equals("Manual")) {
                System.out.println("Não esqueça de puxar o freio de mão!");
            }
        } else {
            System.out.println("Pare o carro antes de estacionar!");
        }
    }

    /**
     * Método para simular uma viagem Demonstra o uso dos métodos abstratos
     * implementados
     */
    public void fazerViagem(double distancia) {
        if (!podeSeMovimentar()) {
            System.out.println("Não é possível fazer a viagem: veículo não está pronto!");
            return;
        }

        double combustivelNecessario = calcularConsumo(distancia);

        if (combustivelAtual < combustivelNecessario) {
            System.out.println("Combustível insuficiente para a viagem!");
            System.out.println("Necessário: " + combustivelNecessario + "L, Disponível: " + combustivelAtual + "L");
            return;
        }

        System.out.println("Iniciando viagem de " + distancia + " km...");

        // Acelera até velocidade de cruzeiro
        acelerar(80);

        // Simula o consumo da viagem
        consumirCombustivel(combustivelNecessario);

        System.out.println("Viagem concluída!");
        System.out.println("Combustível consumido: " + combustivelNecessario + "L");

        // Para o carro ao final da viagem
        frear(velocidadeAtual);
    }

    /**
     * Sobrescrita do método exibirInformacoes Adiciona informações específicas
     * do carro
     */
    @Override
    public void exibirInformacoes() {
        System.out.println("=== INFORMAÇÕES DO CARRO ===");
        System.out.println("Marca: " + marca);
        System.out.println("Modelo: " + modelo);
        System.out.println("Ano: " + anoFabricacao);
        System.out.println("Número de portas: " + numeroPortas);
        System.out.println("Tipo de câmbio: " + tipoCambio);
        System.out.println("Potência do motor: " + potenciaMotor + " cv");
        System.out.println("Velocidade atual: " + velocidadeAtual + " km/h");
        System.out.println("Status: " + (ligado ? "Ligado" : "Desligado"));
        System.out.println("Ar condicionado: " + (arCondicionado ? "Ligado" : "Desligado"));
        System.out.println("Combustível: " + combustivelAtual + "/" + capacidadeTanque + " litros");
        System.out.println("Tipo de combustível: " + obterTipoCombustivel());
        System.out.println("Idade: " + calcularIdade() + " anos");
        System.out.println("Precisa revisão: " + (precisaRevisao() ? "Sim" : "Não"));
        System.out.println("============================");
    }

    // Getters específicos do carro
    public int getNumeroPortas() {
        return numeroPortas;
    }

    public String getTipoCambio() {
        return tipoCambio;
    }

    public boolean isArCondicionado() {
        return arCondicionado;
    }

    public double getPotenciaMotor() {
        return potenciaMotor;
    }
}
