/**
 * Interface que define o comportamento de um instrumento musical
 * Exercício avançado sobre abstração com interfaces
 * 
 * @author Professor Samuel Novais
 */
public interface InstrumentoMusical {
    
    /**
     * Método abstrato para tocar o instrumento
     */
    void tocar();
    
    /**
     * Método abstrato para afinar o instrumento
     */
    void afinar();
    
    /**
     * Método abstrato para parar de tocar
     */
    void pararDeTocar();
    
    /**
     * Método default para exibir informações básicas
     * Disponível a partir do Java 8
     */
    default void exibirTipo() {
        System.out.println("Este é um instrumento musical.");
    }
    
    /**
     * Método estático para criar uma melodia simples
     * Disponível a partir do Java 8
     */
    static void criarMelodia() {
        System.out.println("Criando uma melodia simples: Dó, Ré, Mi, Fá, Sol, Lá, Si, Dó");
    }
}

