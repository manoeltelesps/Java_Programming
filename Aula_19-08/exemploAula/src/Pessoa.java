public class Pessoa {
    private String nome;
    private int idade;
    private double altura;
    private String cpf;

    //Construtor com Parametros
    public Pessoa(String p_nome, int p_idade, double p_altura, String p_cpf){
        this.nome = p_nome;
        this.idade = p_idade;
        this.altura = p_altura;
        this.cpf = p_cpf;
    }

    //Construtor padrão
    public Pessoa (){
    }
}
