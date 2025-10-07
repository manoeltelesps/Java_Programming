/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ucb.poo.abstracao;

/**
 * Classe abstrata que representa um veículo genérico Demonstra conceitos
 * avançados de classes abstratas
 *
 * @author Professor Samuel Novais
 */
public abstract class VeiculoAbstrato {

    // Atributos protegidos - acessíveis pelas subclasses
    protected String marca;
    protected String modelo;
    protected int anoFabricacao;
    protected double velocidadeAtual;
    protected boolean ligado;
    protected double combustivelAtual;
    protected double capacidadeTanque;

    // Constante estática - compartilhada por todas as instâncias
    public static final double VELOCIDADE_MAXIMA_PERMITIDA = 120.0;

    /**
     * Construtor da classe abstrata Pode ser chamado pelas subclasses através
     * de super()
     *
     * @param marca Marca do veículo
     * @param modelo Modelo do veículo
     * @param anoFabricacao Ano de fabricação
     * @param capacidadeTanque Capacidade do tanque de combustível
     */
    public VeiculoAbstrato(String marca, String modelo, int anoFabricacao, double capacidadeTanque) {
        this.marca = marca;
        this.modelo = modelo;
        this.anoFabricacao = anoFabricacao;
        this.capacidadeTanque = capacidadeTanque;
        this.velocidadeAtual = 0.0;
        this.ligado = false;
        this.combustivelAtual = capacidadeTanque; // Inicia com tanque cheio
    }

    // MÉTODOS ABSTRATOS - devem ser implementados pelas subclasses
    /**
     * Método abstrato para acelerar o veículo Cada tipo de veículo acelera de
     * forma diferente
     *
     * @param incremento Incremento de velocidade
     */
    public abstract void acelerar(double incremento);

    /**
     * Método abstrato para frear o veículo Cada tipo de veículo freia de forma
     * diferente
     *
     * @param decremento Decremento de velocidade
     */
    public abstract void frear(double decremento);

    /**
     * Método abstrato para calcular consumo de combustível Cada tipo de veículo
     * tem consumo diferente
     *
     * @param distancia Distância percorrida em km
     * @return Combustível consumido em litros
     */
    public abstract double calcularConsumo(double distancia);

    /**
     * Método abstrato para obter o tipo de combustível Diferentes veículos usam
     * diferentes combustíveis
     *
     * @return Tipo de combustível utilizado
     */
    public abstract String obterTipoCombustivel();

    // MÉTODOS CONCRETOS - implementação compartilhada
    /**
     * Liga o veículo Comportamento comum a todos os veículos
     */
    public void ligar() {
        if (!ligado && combustivelAtual > 0) {
            ligado = true;
            System.out.println(marca + " " + modelo + " foi ligado.");
        } else if (combustivelAtual <= 0) {
            System.out.println("Não é possível ligar: sem combustível!");
        } else {
            System.out.println("O veículo já está ligado.");
        }
    }

    /**
     * Desliga o veículo Comportamento comum a todos os veículos
     */
    public void desligar() {
        if (ligado) {
            if (velocidadeAtual == 0) {
                ligado = false;
                System.out.println(marca + " " + modelo + " foi desligado.");
            } else {
                System.out.println("Não é possível desligar: veículo em movimento!");
            }
        } else {
            System.out.println("O veículo já está desligado.");
        }
    }

    /**
     * Abastece o veículo Comportamento comum a todos os veículos
     *
     * @param litros Quantidade de combustível a ser adicionada
     */
    public void abastecer(double litros) {
        if (litros > 0) {
            double novoNivel = combustivelAtual + litros;
            if (novoNivel <= capacidadeTanque) {
                combustivelAtual = novoNivel;
                System.out.println("Abastecido com " + litros + " litros.");
                System.out.println("Nível atual: " + combustivelAtual + "/" + capacidadeTanque + " litros");
            } else {
                double excesso = novoNivel - capacidadeTanque;
                combustivelAtual = capacidadeTanque;
                System.out.println("Tanque cheio! Excesso de " + excesso + " litros não foi adicionado.");
            }
        } else {
            System.out.println("Quantidade inválida de combustível.");
        }
    }

    /**
     * Verifica se o veículo pode se mover Método auxiliar usado pelas
     * subclasses
     *
     * @return true se pode se mover, false caso contrário
     */
    protected boolean podeSeMovimentar() {
        return ligado && combustivelAtual > 0;
    }

    /**
     * Consome combustível durante o movimento Método auxiliar usado pelas
     * subclasses
     *
     * @param consumo Quantidade de combustível a ser consumida
     */
    protected void consumirCombustivel(double consumo) {
        if (consumo > 0 && combustivelAtual >= consumo) {
            combustivelAtual -= consumo;
            if (combustivelAtual <= 0) {
                combustivelAtual = 0;
                velocidadeAtual = 0;
                ligado = false;
                System.out.println("Combustível esgotado! Veículo parou.");
            }
        }
    }

    /**
     * Exibe informações completas do veículo Método concreto que pode ser
     * sobrescrito pelas subclasses
     */
    public void exibirInformacoes() {
        System.out.println("=== INFORMAÇÕES DO VEÍCULO ===");
        System.out.println("Marca: " + marca);
        System.out.println("Modelo: " + modelo);
        System.out.println("Ano: " + anoFabricacao);
        System.out.println("Velocidade atual: " + velocidadeAtual + " km/h");
        System.out.println("Status: " + (ligado ? "Ligado" : "Desligado"));
        System.out.println("Combustível: " + combustivelAtual + "/" + capacidadeTanque + " litros");
        System.out.println("Tipo de combustível: " + obterTipoCombustivel());
        System.out.println("==============================");
    }

    /**
     * Calcula a idade do veículo Método utilitário
     *
     * @return Idade do veículo em anos
     */
    public int calcularIdade() {
        return java.time.Year.now().getValue() - anoFabricacao;
    }

    /**
     * Verifica se o veículo precisa de revisão Baseado na idade do veículo
     *
     * @return true se precisa de revisão, false caso contrário
     */
    public boolean precisaRevisao() {
        return calcularIdade() >= 5;
    }

    // GETTERS E SETTERS
    public String getMarca() {
        return marca;
    }

    public String getModelo() {
        return modelo;
    }

    public int getAnoFabricacao() {
        return anoFabricacao;
    }

    public double getVelocidadeAtual() {
        return velocidadeAtual;
    }

    public boolean isLigado() {
        return ligado;
    }

    public double getCombustivelAtual() {
        return combustivelAtual;
    }

    public double getCapacidadeTanque() {
        return capacidadeTanque;
    }

    /**
     * Define a velocidade atual (método protegido) Usado pelas subclasses nos
     * métodos acelerar e frear
     *
     * @param velocidade Nova velocidade
     */
    protected void setVelocidadeAtual(double velocidade) {
        if (velocidade >= 0 && velocidade <= VELOCIDADE_MAXIMA_PERMITIDA) {
            this.velocidadeAtual = velocidade;
        } else if (velocidade > VELOCIDADE_MAXIMA_PERMITIDA) {
            this.velocidadeAtual = VELOCIDADE_MAXIMA_PERMITIDA;
            System.out.println("Velocidade limitada ao máximo permitido: " + VELOCIDADE_MAXIMA_PERMITIDA + " km/h");
        } else {
            this.velocidadeAtual = 0;
        }
    }
}
