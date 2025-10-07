/**
 * Classe que representa um retângulo
 * Herda da classe abstrata Forma
 * 
 * @author Professor Samuel Novais
 */
public class Retangulo extends Forma {
    private double largura;
    private double altura;
    
    /**
     * Construtor da classe Retangulo
     * @param cor Cor do retângulo
     * @param posicaoX Posição X do retângulo
     * @param posicaoY Posição Y do retângulo
     * @param largura Largura do retângulo
     * @param altura Altura do retângulo
     */
    public Retangulo(String cor, double posicaoX, double posicaoY, double largura, double altura) {
        super(cor, posicaoX, posicaoY);
        this.largura = largura;
        this.altura = altura;
    }
    
    /**
     * Implementação do método abstrato calcularArea
     * Fórmula: largura * altura
     * @return Área do retângulo
     */
    @Override
    public double calcularArea() {
        return largura * altura;
    }
    
    /**
     * Implementação do método abstrato calcularPerimetro
     * Fórmula: 2 * (largura + altura)
     * @return Perímetro do retângulo
     */
    @Override
    public double calcularPerimetro() {
        return 2 * (largura + altura);
    }
    
    /**
     * Método específico para verificar se é um quadrado
     * @return true se for quadrado, false caso contrário
     */
    public boolean ehQuadrado() {
        return largura == altura;
    }
    
    /**
     * Método para calcular a diagonal do retângulo
     * Fórmula: √(largura² + altura²)
     * @return Diagonal do retângulo
     */
    public double calcularDiagonal() {
        return Math.sqrt(largura * largura + altura * altura);
    }
    
    /**
     * Método para redimensionar o retângulo
     * @param novaLargura Nova largura do retângulo
     * @param novaAltura Nova altura do retângulo
     */
    public void redimensionar(double novaLargura, double novaAltura) {
        if (novaLargura > 0 && novaAltura > 0) {
            this.largura = novaLargura;
            this.altura = novaAltura;
            System.out.println("Retângulo redimensionado. Nova largura: " + novaLargura + ", Nova altura: " + novaAltura);
        } else {
            System.out.println("Erro: Largura e altura devem ser maiores que zero.");
        }
    }
    
    /**
     * Sobrescrita do método exibirInformacoes para incluir informações específicas do retângulo
     */
    @Override
    public void exibirInformacoes() {
        System.out.println("=== INFORMAÇÕES DO RETÂNGULO ===");
        super.exibirInformacoes();
        System.out.println("Largura: " + largura);
        System.out.println("Altura: " + altura);
        System.out.println("Diagonal: " + calcularDiagonal());
        System.out.println("É quadrado: " + (ehQuadrado() ? "Sim" : "Não"));
        System.out.println("================================");
    }
    
    // Getters e Setters
    public double getLargura() {
        return largura;
    }
    
    public void setLargura(double largura) {
        if (largura > 0) {
            this.largura = largura;
        } else {
            System.out.println("Erro: A largura deve ser maior que zero.");
        }
    }
    
    public double getAltura() {
        return altura;
    }
    
    public void setAltura(double altura) {
        if (altura > 0) {
            this.altura = altura;
        } else {
            System.out.println("Erro: A altura deve ser maior que zero.");
        }
    }
}

