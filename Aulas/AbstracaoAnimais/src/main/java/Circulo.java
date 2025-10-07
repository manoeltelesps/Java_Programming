/**
 * Classe que representa um círculo
 * Herda da classe abstrata Forma
 * 
 * @author Professor Samuel Novais
 */
public class Circulo extends Forma {
    private double raio;
    
    /**
     * Construtor da classe Circulo
     * @param cor Cor do círculo
     * @param posicaoX Posição X do círculo
     * @param posicaoY Posição Y do círculo
     * @param raio Raio do círculo
     */
    public Circulo(String cor, double posicaoX, double posicaoY, double raio) {
        super(cor, posicaoX, posicaoY);
        this.raio = raio;
    }
    
    /**
     * Implementação do método abstrato calcularArea
     * Fórmula: π * raio²
     * @return Área do círculo
     */
    @Override
    public double calcularArea() {
        return Math.PI * raio * raio;
    }
    
    /**
     * Implementação do método abstrato calcularPerimetro
     * Fórmula: 2 * π * raio
     * @return Perímetro do círculo
     */
    @Override
    public double calcularPerimetro() {
        return 2 * Math.PI * raio;
    }
    
    /**
     * Método específico para calcular o diâmetro
     * @return Diâmetro do círculo
     */
    public double calcularDiametro() {
        return 2 * raio;
    }
    
    /**
     * Método para redimensionar o círculo
     * @param novoRaio Novo raio do círculo
     */
    public void redimensionar(double novoRaio) {
        if (novoRaio > 0) {
            this.raio = novoRaio;
            System.out.println("Círculo redimensionado. Novo raio: " + novoRaio);
        } else {
            System.out.println("Erro: O raio deve ser maior que zero.");
        }
    }
    
    /**
     * Sobrescrita do método exibirInformacoes para incluir informações específicas do círculo
     */
    @Override
    public void exibirInformacoes() {
        System.out.println("=== INFORMAÇÕES DO CÍRCULO ===");
        super.exibirInformacoes();
        System.out.println("Raio: " + raio);
        System.out.println("Diâmetro: " + calcularDiametro());
        System.out.println("===============================");
    }
    
    // Getters e Setters
    public double getRaio() {
        return raio;
    }
    
    public void setRaio(double raio) {
        if (raio > 0) {
            this.raio = raio;
        } else {
            System.out.println("Erro: O raio deve ser maior que zero.");
        }
    }
}

