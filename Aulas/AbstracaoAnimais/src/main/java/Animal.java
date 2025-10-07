/**
 * Classe abstrata que representa um animal
 * Exercício em sala sobre abstração
 * 
 * @author Professor Samuel Novais
 */
public abstract class Animal {
    protected String nome;
    protected int idade;
    protected String especie;
    protected double peso;
    
    /**
     * Construtor da classe Animal
     * @param nome Nome do animal
     * @param idade Idade do animal
     * @param especie Espécie do animal
     * @param peso Peso do animal em kg
     */
    public Animal(String nome, int idade, String especie, double peso) {
        this.nome = nome;
        this.idade = idade;
        this.especie = especie;
        this.peso = peso;
    }
    
    /**
     * Método abstrato para emitir som
     * Deve ser implementado pelas classes filhas
     */
    public abstract void emitirSom();
    
    /**
     * Método abstrato para mover
     * Deve ser implementado pelas classes filhas
     */
    public abstract void mover();
    
    /**
     * Método concreto para dormir
     */
    public void dormir() {
        System.out.println(nome + " está dormindo... Zzz...");
    }
    
    /**
     * Método concreto para comer
     * @param alimento Tipo de alimento
     */
    public void comer(String alimento) {
        System.out.println(nome + " está comendo " + alimento);
    }
    
    /**
     * Método concreto para crescer (aumentar idade)
     */
    public void crescer() {
        this.idade++;
        System.out.println(nome + " cresceu! Agora tem " + idade + " anos.");
    }
    
    /**
     * Método concreto para exibir informações do animal
     */
    public void exibirInformacoes() {
        System.out.println("=== INFORMAÇÕES DO ANIMAL ===");
        System.out.println("Nome: " + nome);
        System.out.println("Idade: " + idade + " anos");
        System.out.println("Espécie: " + especie);
        System.out.println("Peso: " + peso + " kg");
        System.out.println("=============================");
    }
    
    // Getters e Setters
    public String getNome() {
        return nome;
    }
    
    public void setNome(String nome) {
        this.nome = nome;
    }
    
    public int getIdade() {
        return idade;
    }
    
    public void setIdade(int idade) {
        if (idade >= 0) {
            this.idade = idade;
        } else {
            System.out.println("Erro: A idade não pode ser negativa.");
        }
    }
    
    public String getEspecie() {
        return especie;
    }
    
    public void setEspecie(String especie) {
        this.especie = especie;
    }
    
    public double getPeso() {
        return peso;
    }
    
    public void setPeso(double peso) {
        if (peso > 0) {
            this.peso = peso;
        } else {
            System.out.println("Erro: O peso deve ser maior que zero.");
        }
    }
}

