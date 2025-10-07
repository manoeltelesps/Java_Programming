/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ucb.poo.abstracao;

/**
 * Classe concreta que representa uma motocicleta Herda da classe abstrata
 * VeiculoAbstrato Implementa todos os métodos abstratos de forma específica
 *
 * @author Professor Samuel Novais
 */
public class MotocicletaConcreta extends VeiculoAbstrato {

    private int cilindradas;
    private String tipoMotor; // 2 tempos, 4 tempos
    private boolean temCarenagem;
    private boolean temBagageiro;

    /**
     * Construtor da classe Motocicleta
     *
     * @param marca Marca da motocicleta
     * @param modelo Modelo da motocicleta
     * @param anoFabricacao Ano de fabricação
     * @param capacidadeTanque Capacidade do tanque
     * @param cilindradas Cilindradas do motor
     * @param tipoMotor Tipo do motor (2 tempos ou 4 tempos)
     */
    public MotocicletaConcreta(String marca, String modelo, int anoFabricacao, double capacidadeTanque,
            int cilindradas, String tipoMotor) {
        super(marca, modelo, anoFabricacao, capacidadeTanque);
        this.cilindradas = cilindradas;
        this.tipoMotor = tipoMotor;
        this.temCarenagem = false;
        this.temBagageiro = false;
    }

    /**
     * Implementação do método abstrato acelerar Motocicletas aceleram de forma
     * mais agressiva que carros
     */
    @Override
    public void acelerar(double incremento) {
        if (!podeSeMovimentar()) {
            System.out.println("Não é possível acelerar: motocicleta desligada ou sem combustível!");
            return;
        }

        if (incremento <= 0) {
            System.out.println("Incremento de velocidade deve ser positivo!");
            return;
        }

        // Motocicletas aceleram mais rapidamente
        double aceleracaoReal = incremento * 1.3; // Fator de agilidade

        // Ajuste baseado nas cilindradas
        if (cilindradas >= 600) {
            aceleracaoReal *= 1.2; // Motos grandes aceleram mais
        } else if (cilindradas <= 150) {
            aceleracaoReal *= 0.8; // Motos pequenas aceleram menos
        }

        // Ajuste baseado no tipo de motor
        if (tipoMotor.equals("2 tempos")) {
            aceleracaoReal *= 1.1; // 2 tempos é mais ágil
        }

        double novaVelocidade = velocidadeAtual + aceleracaoReal;
        setVelocidadeAtual(novaVelocidade);

        // Consome combustível baseado na aceleração
        double consumo = aceleracaoReal * 0.015; // Motos consomem menos
        consumirCombustivel(consumo);

        System.out.println("Motocicleta acelerando... Velocidade atual: " + velocidadeAtual + " km/h");

        if (velocidadeAtual > 80) {
            System.out.println("Atenção: Use equipamentos de segurança!");
        }
    }

    /**
     * Implementação do método abstrato frear Motocicletas requerem mais cuidado
     * na frenagem
     */
    @Override
    public void frear(double decremento) {
        if (velocidadeAtual == 0) {
            System.out.println("A motocicleta já está parada!");
            return;
        }

        if (decremento <= 0) {
            System.out.println("Decremento de velocidade deve ser positivo!");
            return;
        }

        // Motocicletas têm frenagem mais sensível
        double frenagem = decremento;

        // Verifica se a frenagem é muito brusca
        if (decremento > velocidadeAtual * 0.7) {
            System.out.println("Atenção: Frenagem muito brusca! Risco de derrapagem!");
            frenagem = velocidadeAtual * 0.7; // Limita a frenagem
        }

        double novaVelocidade = velocidadeAtual - frenagem;
        setVelocidadeAtual(Math.max(0, novaVelocidade));

        System.out.println("Motocicleta freando... Velocidade atual: " + velocidadeAtual + " km/h");

        if (velocidadeAtual == 0) {
            System.out.println("Motocicleta parou. Apoie os pés no chão.");
        }
    }

    /**
     * Implementação do método abstrato calcularConsumo Motocicletas são mais
     * econômicas que carros
     */
    @Override
    public double calcularConsumo(double distancia) {
        if (distancia <= 0) {
            return 0;
        }

        // Consumo base varia com as cilindradas
        double kmPorLitro;
        if (cilindradas <= 150) {
            kmPorLitro = 35.0; // Motos pequenas são muito econômicas
        } else if (cilindradas <= 300) {
            kmPorLitro = 25.0; // Motos médias
        } else if (cilindradas <= 600) {
            kmPorLitro = 18.0; // Motos grandes
        } else {
            kmPorLitro = 12.0; // Motos esportivas
        }

        double consumoBase = distancia / kmPorLitro;

        // Ajustes baseados no tipo de motor
        double fatorMotor = tipoMotor.equals("2 tempos") ? 1.2 : 1.0;

        // Carenagem melhora a aerodinâmica
        double fatorAerodinamica = temCarenagem ? 0.95 : 1.0;

        return consumoBase * fatorMotor * fatorAerodinamica;
    }

    /**
     * Implementação do método abstrato obterTipoCombustivel
     */
    @Override
    public String obterTipoCombustivel() {
        if (tipoMotor.equals("2 tempos")) {
            return "Gasolina + Óleo 2T";
        } else {
            return "Gasolina";
        }
    }

    /**
     * Método específico para empinar Comportamento exclusivo de motocicletas
     */
    public void empinar() {
        if (!ligado) {
            System.out.println("Ligue a motocicleta primeiro!");
            return;
        }

        if (velocidadeAtual < 20) {
            System.out.println("Velocidade insuficiente para empinar!");
            return;
        }

        if (cilindradas < 250) {
            System.out.println("Esta motocicleta não tem potência suficiente para empinar com segurança!");
            return;
        }

        System.out.println("Empinando a motocicleta! Cuidado com a segurança!");
        System.out.println("Lembre-se: Use sempre equipamentos de proteção!");
    }

    /**
     * Método específico para buzinar Som característico de motocicleta
     */
    public void buzinar() {
        if (ligado) {
            System.out.println("Beep beep! *buzina da motocicleta*");
        } else {
            System.out.println("Ligue a motocicleta primeiro para buzinar!");
        }
    }

    /**
     * Método para verificar equipamentos de segurança
     */
    public void verificarSeguranca() {
        System.out.println("=== VERIFICAÇÃO DE SEGURANÇA ===");
        System.out.println(" Capacete obrigatório");
        System.out.println(" Luvas recomendadas");
        System.out.println(" Jaqueta de proteção recomendada");
        System.out.println(" Calça comprida obrigatória");
        System.out.println(" Calçado fechado obrigatório");
        System.out.println(" Verificar freios e pneus");
        System.out.println("===============================");
    }

    /**
     * Método para instalar carenagem
     */
    public void instalarCarenagem() {
        if (!temCarenagem) {
            temCarenagem = true;
            System.out.println("Carenagem instalada! Melhora aerodinâmica e proteção.");
        } else {
            System.out.println("A motocicleta já possui carenagem.");
        }
    }

    /**
     * Método para instalar bagageiro
     */
    public void instalarBagageiro() {
        if (!temBagageiro) {
            temBagageiro = true;
            System.out.println("Bagageiro instalado! Agora você pode carregar mais itens.");
        } else {
            System.out.println("A motocicleta já possui bagageiro.");
        }
    }

    /**
     * Método para fazer manutenção específica de motocicleta
     */
    public void fazerManutencao() {
        System.out.println("=== MANUTENÇÃO DA MOTOCICLETA ===");
        System.out.println(" Verificando corrente e coroa");
        System.out.println(" Checando tensão da corrente");
        System.out.println(" Verificando pressão dos pneus");
        System.out.println(" Checando freios dianteiro e traseiro");
        System.out.println(" Verificando nível do óleo do motor");

        if (tipoMotor.equals("2 tempos")) {
            System.out.println("• Verificando mistura de óleo 2T");
        }

        System.out.println("• Checando funcionamento das luzes");
        System.out.println("Manutenção concluída!");
        System.out.println("================================");
    }

    /**
     * Sobrescrita do método exibirInformacoes Adiciona informações específicas
     * da motocicleta
     */
    @Override
    public void exibirInformacoes() {
        System.out.println("=== INFORMAÇÕES DA MOTOCICLETA ===");
        System.out.println("Marca: " + marca);
        System.out.println("Modelo: " + modelo);
        System.out.println("Ano: " + anoFabricacao);
        System.out.println("Cilindradas: " + cilindradas + "cc");
        System.out.println("Tipo de motor: " + tipoMotor);
        System.out.println("Velocidade atual: " + velocidadeAtual + " km/h");
        System.out.println("Status: " + (ligado ? "Ligada" : "Desligada"));
        System.out.println("Carenagem: " + (temCarenagem ? "Sim" : "Não"));
        System.out.println("Bagageiro: " + (temBagageiro ? "Sim" : "Não"));
        System.out.println("Combustível: " + combustivelAtual + "/" + capacidadeTanque + " litros");
        System.out.println("Tipo de combustível: " + obterTipoCombustivel());
        System.out.println("Idade: " + calcularIdade() + " anos");
        System.out.println("Precisa revisão: " + (precisaRevisao() ? "Sim" : "Não"));
        System.out.println("==================================");
    }

    // Getters específicos da motocicleta
    public int getCilindradas() {
        return cilindradas;
    }

    public String getTipoMotor() {
        return tipoMotor;
    }

    public boolean isTemCarenagem() {
        return temCarenagem;
    }

    public boolean isTemBagageiro() {
        return temBagageiro;
    }
}
