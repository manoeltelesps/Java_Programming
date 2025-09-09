/**
 * Classe que representa um gato
 * Herda da classe abstrata Animal
 * Exercício em sala sobre abstração
 * 
 * @author Professor Samuel Novais
 */
public class Gato extends Animal {
    private String corPelo;
    private boolean castrado;
    
    /**
     * Construtor da classe Gato
     * @param nome Nome do gato
     * @param idade Idade do gato
     * @param peso Peso do gato em kg
     * @param corPelo Cor do pelo do gato
     */
    public Gato(String nome, int idade, double peso, String corPelo) {
        super(nome, idade, "Gato", peso);
        this.corPelo = corPelo;
        this.castrado = false;
    }
    
    /**
     * Implementação do método abstrato emitirSom
     */
    @Override
    public void emitirSom() {
        System.out.println(nome + " faz: Miau miau!");
    }
    
    /**
     * Implementação do método abstrato mover
     */
    @Override
    public void mover() {
        System.out.println(nome + " está caminhando silenciosamente com suas patinhas macias.");
    }
    
    /**
     * Método específico para miar
     */
    public void miar() {
        System.out.println(nome + " está miando: Miau miau miau!");
    }
    
    /**
     * Método específico para ronronar
     */
    public void ronronar() {
        System.out.println(nome + " está ronronando de contentamento: Purr purr purr...");
    }
    
    /**
     * Método específico para arranhar
     * @param objeto Objeto a ser arranhado
     */
    public void arranhar(String objeto) {
        System.out.println(nome + " está arranhando " + objeto + " para afiar as unhas.");
    }
    
    /**
     * Método específico para caçar
     * @param presa Tipo de presa
     */
    public void cacar(String presa) {
        System.out.println(nome + " está caçando " + presa + " com seus instintos felinos!");
    }
    
    /**
     * Método específico para subir em lugares altos
     */
    public void subirAlto() {
        System.out.println(nome + " subiu em um lugar alto para observar o ambiente.");
    }
    
    /**
     * Método para castrar o gato
     */
    public void castrar() {
        this.castrado = true;
        System.out.println(nome + " foi castrado.");
    }
    
    /**
     * Método específico para se limpar
     */
    public void seLimpar() {
        System.out.println(nome + " está se limpando com a língua, como todo gato faz.");
    }
    
    /**
     * Sobrescrita do método exibirInformacoes para incluir informações específicas do gato
     */
    @Override
    public void exibirInformacoes() {
        System.out.println("=== INFORMAÇÕES DO GATO ===");
        System.out.println("Nome: " + nome);
        System.out.println("Idade: " + idade + " anos");
        System.out.println("Espécie: " + especie);
        System.out.println("Peso: " + peso + " kg");
        System.out.println("Cor do pelo: " + corPelo);
        System.out.println("Castrado: " + (castrado ? "Sim" : "Não"));
        System.out.println("===========================");
    }
    
    // Getters e Setters
    public String getCorPelo() {
        return corPelo;
    }
    
    public void setCorPelo(String corPelo) {
        this.corPelo = corPelo;
    }
    
    public boolean isCastrado() {
        return castrado;
    }
    
    public void setCastrado(boolean castrado) {
        this.castrado = castrado;
    }
}

