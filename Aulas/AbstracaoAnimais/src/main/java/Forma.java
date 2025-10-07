/**
 * Classe abstrata que representa uma forma geométrica
 * Demonstra o conceito de abstração em Java
 * 
 * @author Professor Samuel Novais
 */
public abstract class Forma {
    protected String cor;
    protected double posicaoX;
    protected double posicaoY;
    
    /**
     * Construtor da classe Forma
     * @param cor Cor da forma
     * @param posicaoX Posição X da forma
     * @param posicaoY Posição Y da forma
     */
    public Forma(String cor, double posicaoX, double posicaoY) {
        this.cor = cor;
        this.posicaoX = posicaoX;
        this.posicaoY = posicaoY;
    }
    
    /**
     * Método abstrato para calcular a área da forma
     * Deve ser implementado pelas classes filhas
     * @return Área da forma
     */
    public abstract double calcularArea();
    
    /**
     * Método abstrato para calcular o perímetro da forma
     * Deve ser implementado pelas classes filhas
     * @return Perímetro da forma
     */
    public abstract double calcularPerimetro();
    
    /**
     * Método concreto para mover a forma
     * @param novaX Nova posição X
     * @param novaY Nova posição Y
     */
    public void mover(double novaX, double novaY) {
        this.posicaoX = novaX;
        this.posicaoY = novaY;
        System.out.println("Forma movida para posição (" + novaX + ", " + novaY + ")");
    }
    
    /**
     * Método concreto para alterar a cor da forma
     * @param novaCor Nova cor da forma
     */
    public void alterarCor(String novaCor) {
        this.cor = novaCor;
        System.out.println("Cor alterada para: " + novaCor);
    }
    
    /**
     * Método concreto para exibir informações da forma
     */
    public void exibirInformacoes() {
        System.out.println("Cor: " + cor);
        System.out.println("Posição: (" + posicaoX + ", " + posicaoY + ")");
        System.out.println("Área: " + calcularArea());
        System.out.println("Perímetro: " + calcularPerimetro());
    }
    
    // Getters e Setters
    public String getCor() {
        return cor;
    }
    
    public void setCor(String cor) {
        this.cor = cor;
    }
    
    public double getPosicaoX() {
        return posicaoX;
    }
    
    public void setPosicaoX(double posicaoX) {
        this.posicaoX = posicaoX;
    }
    
    public double getPosicaoY() {
        return posicaoY;
    }
    
    public void setPosicaoY(double posicaoY) {
        this.posicaoY = posicaoY;
    }
}

