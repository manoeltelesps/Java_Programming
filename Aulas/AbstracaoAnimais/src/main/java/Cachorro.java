/**
 * Classe que representa um cachorro
 * Herda da classe abstrata Animal
 * Exercício em sala sobre abstração
 * 
 * @author Professor Samuel Novais
 */
public class Cachorro extends Animal {
    private String raca;
    private boolean adestrado;
    
    /**
     * Construtor da classe Cachorro
     * @param nome Nome do cachorro
     * @param idade Idade do cachorro
     * @param peso Peso do cachorro em kg
     * @param raca Raça do cachorro
     */
    public Cachorro(String nome, int idade, double peso, String raca) {
        super(nome, idade, "Cachorro", peso);
        this.raca = raca;
        this.adestrado = false;
    }
    
    /**
     * Implementação do método abstrato emitirSom
     */
    @Override
    public void emitirSom() {
        System.out.println(nome + " faz: Au au au!");
    }
    
    /**
     * Implementação do método abstrato mover
     */
    @Override
    public void mover() {
        System.out.println(nome + " está correndo e balançando o rabo!");
    }
    
    /**
     * Método específico para latir
     */
    public void latir() {
        System.out.println(nome + " está latindo: Au au au au!");
    }
    
    /**
     * Método específico para buscar objeto
     * @param objeto Objeto a ser buscado
     */
    public void buscarObjeto(String objeto) {
        System.out.println(nome + " foi buscar o " + objeto + " e trouxe de volta!");
    }
    
    /**
     * Método específico para dar a pata
     */
    public void darPata() {
        if (adestrado) {
            System.out.println(nome + " deu a patinha!");
        } else {
            System.out.println(nome + " ainda não sabe dar a pata. Precisa ser adestrado.");
        }
    }
    
    /**
     * Método para adestrar o cachorro
     */
    public void adestrar() {
        this.adestrado = true;
        System.out.println(nome + " foi adestrado com sucesso!");
    }
    
    /**
     * Método específico para brincar
     * @param brinquedo Tipo de brinquedo
     */
    public void brincar(String brinquedo) {
        System.out.println(nome + " está brincando com " + brinquedo + " e se divertindo muito!");
    }
    
    /**
     * Sobrescrita do método exibirInformacoes para incluir informações específicas do cachorro
     */
    @Override
    public void exibirInformacoes() {
        System.out.println("=== INFORMAÇÕES DO CACHORRO ===");
        System.out.println("Nome: " + nome);
        System.out.println("Idade: " + idade + " anos");
        System.out.println("Espécie: " + especie);
        System.out.println("Peso: " + peso + " kg");
        System.out.println("Raça: " + raca);
        System.out.println("Adestrado: " + (adestrado ? "Sim" : "Não"));
        System.out.println("===============================");
    }
    
    // Getters e Setters
    public String getRaca() {
        return raca;
    }
    
    public void setRaca(String raca) {
        this.raca = raca;
    }
    
    public boolean isAdestrado() {
        return adestrado;
    }
    
    public void setAdestrado(boolean adestrado) {
        this.adestrado = adestrado;
    }
}

