/**
 * Classe que representa um violão
 * Implementa a interface InstrumentoMusical
 * Exercício avançado sobre abstração com interfaces
 * 
 * @author Professor Samuel Novais
 */
public class Violao implements InstrumentoMusical {
    private String marca;
    private String tipo; // Clássico, Folk, Elétrico
    private int numeroCordas;
    private boolean afinado;
    private boolean tocando;
    
    /**
     * Construtor da classe Violao
     * @param marca Marca do violão
     * @param tipo Tipo do violão (Clássico, Folk, Elétrico)
     */
    public Violao(String marca, String tipo) {
        this.marca = marca;
        this.tipo = tipo;
        this.numeroCordas = 6; // Violão padrão tem 6 cordas
        this.afinado = false;
        this.tocando = false;
    }
    
    /**
     * Implementação do método tocar da interface
     */
    @Override
    public void tocar() {
        if (afinado) {
            tocando = true;
            System.out.println("♪ Tocando o violão " + marca + " ♪");
            System.out.println("Som melodioso das " + numeroCordas + " cordas...");
        } else {
            System.out.println("O violão precisa ser afinado antes de tocar!");
        }
    }
    
    /**
     * Implementação do método afinar da interface
     */
    @Override
    public void afinar() {
        System.out.println("Afinando o violão " + marca + "...");
        System.out.println("Ajustando as cordas: Mi, Lá, Ré, Sol, Si, Mi");
        this.afinado = true;
        System.out.println("Violão afinado com sucesso!");
    }
    
    /**
     * Implementação do método pararDeTocar da interface
     */
    @Override
    public void pararDeTocar() {
        if (tocando) {
            tocando = false;
            System.out.println("Parando de tocar o violão. Silêncio...");
        } else {
            System.out.println("O violão já estava em silêncio.");
        }
    }
    
    /**
     * Método específico para tocar acorde
     * @param acorde Nome do acorde a ser tocado
     */
    public void tocarAcorde(String acorde) {
        if (afinado) {
            System.out.println("Tocando o acorde de " + acorde + " no violão");
        } else {
            System.out.println("Afine o violão antes de tocar acordes!");
        }
    }
    
    /**
     * Método específico para fazer dedilhado
     */
    public void fazerDedilhado() {
        if (afinado) {
            System.out.println("Fazendo um belo dedilhado no violão " + tipo);
        } else {
            System.out.println("Afine o violão antes de fazer dedilhado!");
        }
    }
    
    /**
     * Método específico para trocar cordas
     * @param numeroCorda Número da corda a ser trocada (1-6)
     */
    public void trocarCorda(int numeroCorda) {
        if (numeroCorda >= 1 && numeroCorda <= 6) {
            System.out.println("Trocando a " + numeroCorda + "ª corda do violão");
            this.afinado = false; // Precisa afinar novamente após trocar corda
            System.out.println("Violão precisa ser afinado novamente.");
        } else {
            System.out.println("Número de corda inválido. Use números de 1 a 6.");
        }
    }
    
    /**
     * Sobrescrita do método exibirTipo da interface
     */
    @Override
    public void exibirTipo() {
        System.out.println("Este é um violão " + tipo + " da marca " + marca);
    }
    
    /**
     * Método para exibir informações completas do violão
     */
    public void exibirInformacoes() {
        System.out.println("=== INFORMAÇÕES DO VIOLÃO ===");
        System.out.println("Marca: " + marca);
        System.out.println("Tipo: " + tipo);
        System.out.println("Número de cordas: " + numeroCordas);
        System.out.println("Afinado: " + (afinado ? "Sim" : "Não"));
        System.out.println("Tocando: " + (tocando ? "Sim" : "Não"));
        System.out.println("=============================");
    }
    
    // Getters e Setters
    public String getMarca() {
        return marca;
    }
    
    public void setMarca(String marca) {
        this.marca = marca;
    }
    
    public String getTipo() {
        return tipo;
    }
    
    public void setTipo(String tipo) {
        this.tipo = tipo;
    }
    
    public int getNumeroCordas() {
        return numeroCordas;
    }
    
    public boolean isAfinado() {
        return afinado;
    }
    
    public boolean isTocando() {
        return tocando;
    }
}

